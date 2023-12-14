package main;

import Genshin.GenshinBaseListener;
import Genshin.GenshinParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

/**
 * 基于监听者模式的简单类（开发中，不稳定，目前到函数的递归调用，卡住了）
 * 这个类实现了简单的函数，包括简单的函数嵌套，if语句和print语句
 */
public class CalcListener extends GenshinBaseListener {
    private final Map<String, Object> values = new HashMap<>();
    private final Map<String, ParseTree> second = new HashMap<>(); //存放函数与语法树的映射
    private final Map<String, List<Object>> act = new HashMap<>(); //实参
    private final Map<String, List<String>> ill = new HashMap<>(); //形参
    private final LinkedList<Double> funRet = new LinkedList<>(); //存放函数返回值,模拟队列效果
    private static final CalcListener cl = new CalcListener();
    private final MyWalker walk = new MyWalker();

    private CalcListener() {
    }

    public static CalcListener getCl() {
        return cl;
    }

    @Override
    public void enterFunctionDecl(GenshinParser.FunctionDeclContext ctx) {
        second.put(ctx.ID().getText(), ctx.getChild(5));
    }

    @Override
    public void exitVars(GenshinParser.VarsContext ctx) {
        String str = ctx.getChild(0).getText();
        String str2 = ctx.expr.getChild(0).getText();
        if (ctx.expr != null) { //变量为赋值状态
            if (second.get(str2) != null) {
                values.put(str, funRet.getLast());
            } else values.put(str, values.get(ctx.getChild(2).getText())); //值为普通表达式状态
        }
    }

    @Override
    public void exitCall(GenshinParser.CallContext ctx) {
        if (ctx.ID().getText().equals("print")) {
            String str = ctx.getChild(2).getChild(0).getText();
            String str2 = ctx.getChild(2).getChild(0).getChild(0).getText();
            if (second.get(str2) != null) {
                //函数
                String string = funRet.getLast().toString();
                int temp = toInteger(string);
                double temp2 = funRet.getLast();
                if (temp2 == temp) {
                    System.out.println(str + "=" + temp);
                } else System.out.println(str + "=" + temp2);
            } else if (values.get(str) instanceof String) System.out.println(values.get(str)); //字符串
            else {
                String string = values.get(str).toString();
                int temp = toInteger(string);
                if ((double) values.get(str) == temp) {
                    System.out.println(str + "=" + temp);
                } else System.out.println(str + "=" + values.get(str));
            }
        } else {
            int i = 0;
            for (Object o : act.get(ctx.ID().getText())) {
                values.put(ill.get(ctx.ID().getText()).get(i), o); //将实参映射到形参
                i++;
            }
            ParseTree temp = second.get(ctx.ID().getText());
            walk.walk(cl, temp); //二次遍历
        }
    }

    private int toInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') str = str.substring(0, i);
        }
        return Integer.parseInt(str);
    }

    @Override
    public void exitAssign(GenshinParser.AssignContext ctx) {
        if (second.get(ctx.children.get(2).getChild(0).getText()) != null) {
            //能进来说明是函数
            values.put(ctx.ID().getText(), funRet.getLast());
        } else values.put(ctx.le.getText(), values.get(ctx.re.getText()));
    }

    @Override
    public void enterIF(GenshinParser.IFContext ctx) {
        List<ParseTree> children = ctx.children;
        walk.walk(cl, children.get(2)); //提前遍历形参，得到形参对应的实参
        double l, r;
        String op;
        try {
            l = (double) values.get(children.get(2).getChild(0).getText());
            r = (double) values.get(children.get(2).getChild(2).getText());
            op = children.get(2).getChild(1).getText();
        } catch (Exception e) {
            l = 0;
            r = 0;
            op = ">";
        }
        if (op.equals(">")) {
            MyWalker.decide = l > r;
        } else MyWalker.decide = l < r;
    }

    @Override
    public void enterFor(GenshinParser.ForContext ctx) {
        walk.walk(cl, ctx.getChild(2)); //表达式1
        walk.walk(cl, ctx.getChild(4)); //表达式2
        walk.walk(cl, ctx.getChild(6)); //表达式3
        double le, limit;
        String op, varI;
        try {
            le = (double) values.get(ctx.le.getChild(1).getChild(2).getText());
            varI = ctx.le.getChild(1).getChild(0).getText();
            op = ctx.mid.getChild(1).getText();
            limit = (double) values.get(ctx.mid.getChild(2).getText());
        } catch (Exception e) {
            le = 0;
            varI = "i";
            op = ">";
            limit = 0;
        }
        double step = (double) values.get(ctx.re.getText());
        if (op.equals("<")) {
            for (double i = le; i < limit; i += step) {
                values.put(varI, i); //更新变量
                walk.walk(cl, ctx.getChild(8));
            }
        } else {
            for (double i = le; i > limit; i += step) {
                values.put(varI, i); //更新
                walk.walk(cl, ctx.getChild(8));
            }
        }
    }

    /**
     *return语句的功能是将结果返回并结束函数执行，暂未想到好的实现方法
     * 只能先用赋值模拟其返回结果的功能
     */
    @Override
    public void exitReturn(GenshinParser.ReturnContext ctx) {
        funRet.addLast((Double) values.get(ctx.expr().getText()));//模拟入队
//        MyWalker.decide = false; //中断
    }

    @Override
    public void exitParens(GenshinParser.ParensContext ctx) {
        values.put(ctx.getText(), values.get(ctx.expr().getText()));
    }

    @Override
    public void exitExprList(GenshinParser.ExprListContext ctx) {
        RuleContext parent = ctx.parent;
        List<Object> actList = new ArrayList<>();
        List<ParseTree> list = ctx.children;
        String funStr = parent.getChild(0).getText();
        //要判断表达式为ID，数字和函数调用
        for (int i = 0; i < list.size(); i += 2) {
            String str = list.get(i).getText();
            if (second.get(str) != null) {
                actList.add(funRet.getLast());//函数
            } else {
                actList.add(values.get(str));//ID,数字
            }
        }
        act.put(funStr, actList);
    }

    @Override
    public void exitFormalParams(GenshinParser.FormalParamsContext ctx) {
        RuleContext parent = ctx.parent;
        List<String> illList = new ArrayList<>();
        List<ParseTree> list = ctx.children;
        String str = parent.getChild(1).getText();
        for (int i = 0; i < list.size(); i += 2) {
            illList.add(list.get(i).getChild(1).getText());
        }
        ill.put(str, illList);
        MyWalker.decide = false; //只遍历形参，不遍历函数体
    }

    @Override
    public void exitFloat(GenshinParser.FloatContext ctx) {
        String str;
        if (ctx.op != null) {
            str = "-" + ctx.FLOAT().getText();
        } else str = ctx.FLOAT().getText();
        values.put(str, Double.parseDouble(str));
    }

    /**
     * 无论是int还是double，再整个程序中都将以double的形式进行运算
     * 这样就省去了类型判断和类型转换，有概率能提高程序的效率
     * 只需要在用户调用print方法时再进行判断，以double或Integer的形式输出
     * 就能在形式上达到double，int分开的效果
     */
    @Override
    public void exitInt(GenshinParser.IntContext ctx) {
        String str;
        if (ctx.op != null) {
            str = "-" + ctx.INT().getText();
        } else str = ctx.INT().getText();
        values.put(str, Double.parseDouble(str));
    }

    @Override
    public void exitSTR(GenshinParser.STRContext ctx) {
        String str = ctx.getText();
        values.put(str, str.substring(1, str.length() - 1));
    }

    @Override
    public void exitAddSub(GenshinParser.AddSubContext ctx) {
        double lvalue, rvalue;
        try {
            lvalue = (double) values.get(ctx.le.getText());
        }catch (Exception e){
            lvalue = funRet.getFirst();
            funRet.removeFirst();
        }
        try {
            rvalue = (double) values.get(ctx.re.getText());
        }catch (Exception e2){
            rvalue = funRet.getFirst();
        }
        if (ctx.op.getText().equals("+")) {
            values.put(ctx.getText(), lvalue + rvalue);
        } else {
            values.put(ctx.getText(), lvalue - rvalue);
        }
    }

    @Override
    public void exitPower(GenshinParser.PowerContext ctx) {
        if (values.get(ctx.le.getText()) instanceof Double) {
            double lvalue, rvalue;
            lvalue = (double) values.get(ctx.le.getText());
            rvalue = (double) values.get(ctx.re.getText());
            values.put(ctx.getText(), Math.pow(lvalue, rvalue));
        } else values.put(ctx.getText(), null);
    }

    @Override
    public void exitMultDiv(GenshinParser.MultDivContext ctx) {
        double lvalue, rvalue;
        try {
            lvalue = (double) values.get(ctx.le.getText());
        }catch (Exception e){
                lvalue = funRet.getFirst(); //表达式为函数
                funRet.removeFirst();
        }
        try {
            rvalue = (double) values.get(ctx.re.getText());
        }catch (Exception e2){
                rvalue = funRet.getFirst(); //表达式为函数
        }
        if (ctx.op.getText().equals("*")) {
            values.put(ctx.getText(), lvalue * rvalue);
        } else {
            values.put(ctx.getText(), lvalue / rvalue);
        }
    }

    public static class MyWalker extends ParseTreeWalker {
        static boolean decide = true;

        public MyWalker() {
            super();
        }

        @Override
        public void walk(ParseTreeListener listener, ParseTree t) {
            if (t instanceof ErrorNode) {
                listener.visitErrorNode((ErrorNode) t);
            } else if (t instanceof TerminalNode) {
                listener.visitTerminal((TerminalNode) t);
            } else {
                RuleNode r = (RuleNode) t;
                this.enterRule(listener, r);
                int n = r.getChildCount();

                if (!decide) {
                    if (n > 5 && r.getChild(0).getText().equals("if")) {
                        //if语句else部分
                        decide = true;
                        for (int i = 5; i < n; i++) this.walk(listener, r.getChild(i));
                    }
                    decide = true;
                } else {
                    if (n == 7 && r.getChild(0).getText().equals("if")) {
                        //if语句if部分
                        for (int i = 0; i < 5; i++) this.walk(listener, r.getChild(i));
                    } else if (n == 9 && r.getChild(0).getText().equals("for")) {
                        //for语句
                        this.walk(listener, r.getChild(1));
                        // 无作用，意思意思,但有必要，要是当常规语句就会多执行一次
                    } else for (int i = 0; i < n; ++i) this.walk(listener, r.getChild(i));
                    //常规语句
                }
                this.exitRule(listener, r);
            }
        }
    }
}
