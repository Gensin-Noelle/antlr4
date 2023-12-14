package main;

import Genshin.GenshinBaseVisitor;
import Genshin.GenshinParser;

/**
 * 基于访问者模式的简单四则运算实现
 */
public class CalcVisitor extends GenshinBaseVisitor<Double> {
    @Override
    public Double visitExpress(GenshinParser.ExpressContext ctx) {
        String str = visit(ctx.expr()).toString();
        int num = toInteger(str);
        if (visit(ctx.expr()) != num) System.out.println(ctx.expr().getText() + "=" + visit(ctx.expr()));
        else System.out.println(ctx.expr().getText() + "=" + num);
        return null;
    }

    private int toInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '.') {
                str = str.substring(0, i);
                break;
            }
        }
        return Integer.parseInt(str);
    }

    @Override
    public Double visitAddSub(GenshinParser.AddSubContext ctx) {
        return ctx.op.getText().equals("+") ? visit(ctx.le) + visit(ctx.re) : visit(ctx.le) - visit(ctx.re);
    }

    @Override
    public Double visitParens(GenshinParser.ParensContext ctx) {
        return visit(ctx.expr());
    }

    @Override
    public Double visitInt(GenshinParser.IntContext ctx) {
        return ctx.op == null ? Double.parseDouble(ctx.INT().getText()) : Double.parseDouble("-" + ctx.INT().getText());
    }

    @Override
    public Double visitFloat(GenshinParser.FloatContext ctx) {
        return ctx.op == null ? Double.parseDouble(ctx.FLOAT().getText()) : Double.parseDouble("-" + ctx.FLOAT().getText());
    }

    @Override
    public Double visitPower(GenshinParser.PowerContext ctx) {
        return Math.pow(visit(ctx.le), visit(ctx.re));
    }

    @Override
    public Double visitMultDiv(GenshinParser.MultDivContext ctx) {
        return ctx.op.getText().equals("*") ? visit(ctx.le) * visit(ctx.re) : visit(ctx.le) / visit(ctx.re);
    }
}
