package main;

import Genshin.GenshinBaseVisitor;
import Genshin.GenshinParser;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.PointerPointer;
import org.bytedeco.llvm.LLVM.*;
import org.bytedeco.llvm.global.LLVM;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.bytedeco.llvm.global.LLVM.*;

/**
 * 基于访问者模式的中间代码生成器，能生成简单的四则运算，函数调用的中间代码
 * 关于if语句部分存在很多问题
 */
public class IRVisitor extends GenshinBaseVisitor<LLVMValueRef> {
    LLVMBuilderRef mBuilder = LLVMCreateBuilder();
    LLVMModuleRef mModule = LLVMModuleCreateWithName("moduleTest");
    LLVMTypeRef int32Type = LLVMInt32Type();
    Map<String, LLVMValueRef> map = new HashMap<>();
    LLVMValueRef function;
    int count = 0;//用于形参计数

    @Override
    public LLVMValueRef visitR(GenshinParser.RContext ctx) {
        BytePointer error = new BytePointer();
        for (int i = 0; i < ctx.getChildCount(); i++) visit(ctx.getChild(i));
        //验证module是否有效
        int verificationResult = LLVMVerifyModule(mModule, LLVMPrintMessageAction, (PointerPointer<BytePointer>) null);
        if (verificationResult == 0) {
            LLVMDumpModule(mModule);
            LLVMPrintModuleToFile(mModule, "src/main/java/MyFile/test.ll", error);
        }
        //释放资源
        LLVMDisposeModule(mModule);
        LLVMDisposeBuilder(mBuilder);
        return null;
    }

    @Override
    public LLVMValueRef visitFunctionDecl(GenshinParser.FunctionDeclContext ctx) {
        int paramNum = 0;
        List<LLVMTypeRef> list = new ArrayList<>();
        if (ctx.getChildCount() > 5) {
            for (int i = 0; i < ctx.getChild(3).getChildCount(); i += 2) {
                paramNum++;
                list.add(int32Type);
            }
        }
        LLVMTypeRef[] paramTypes = list.toArray(new LLVMTypeRef[0]);
        LLVMTypeRef retType = LLVMFunctionType(int32Type, new PointerPointer<>(paramTypes), paramNum, 0);
        function = LLVMAddFunction(mModule, ctx.ID().getText(), retType);
        LLVMBasicBlockRef entry = LLVMAppendBasicBlock(function, "entry");
        LLVMPositionBuilderAtEnd(mBuilder, entry);

        map.put(ctx.ID().getText(), function);

        return super.visitFunctionDecl(ctx);
    }

    @Override
    public LLVMValueRef visitAssign(GenshinParser.AssignContext ctx) {
        LLVMValueRef intRef = visit(ctx.expr());
        LLVMValueRef i = LLVMBuildAlloca(mBuilder, int32Type, ctx.ID().getText());
        LLVMBuildStore(mBuilder, intRef, i);

        LLVMValueRef loadI = LLVMBuildLoad(mBuilder, i, "load");
        map.put(ctx.ID().getText(), loadI);
        return loadI;
    }

    @Override
    public LLVMValueRef visitIF(GenshinParser.IFContext ctx) {
        LLVMValueRef le = visit(ctx.getChild(2).getChild(0));
        String op = ctx.getChild(2).getChild(1).getText();
        LLVMValueRef re = visit(ctx.getChild(2).getChild(2));
        int symbol;
        if (op.equals(">")) symbol = LLVMIntSGT;
        else symbol = LLVMIntSLT;

        LLVMValueRef condition = LLVMBuildICmp(mBuilder, symbol, le, re, "compare");
        //生成then模块
        LLVMBasicBlockRef thenBlock = LLVMAppendBasicBlock(function, "then");


        if (ctx.getChildCount() <= 5) {
            //处理if型
            LLVMBasicBlockRef endBlock = LLVMAppendBasicBlock(function, "end");

            LLVMBuildCondBr(mBuilder, condition, thenBlock, endBlock);

            //then模块
            LLVMPositionBuilderAtEnd(mBuilder, thenBlock);
            LLVMValueRef thenValue = ifWalk(ctx);
            LLVMBuildBr(mBuilder, endBlock);

            //merge模块
            LLVMPositionBuilderAtEnd(mBuilder, endBlock);
            LLVMValueRef end = LLVMBuildAdd(mBuilder, thenValue, LLVMConstInt(int32Type, 0, 0), "end");
            //返回
            LLVMBuildRet(mBuilder, end);
        }
        else {
            //处理if-else型

            LLVMBasicBlockRef elseBlock = LLVMAppendBasicBlock(function, "else");
            LLVMBasicBlockRef mergeBlock = LLVMAppendBasicBlock(function, "merge");

            LLVMBuildCondBr(mBuilder, condition, thenBlock, elseBlock);

            //then模块
            LLVMPositionBuilderAtEnd(mBuilder, thenBlock);
            LLVMValueRef thenValue = ifWalk(ctx);
            LLVMBuildBr(mBuilder, mergeBlock);

            // 生成 else 块
            LLVMPositionBuilderAtEnd(mBuilder, elseBlock);
            LLVMValueRef elseValue;
            if (ctx.getChild(6).getChild(1).getChild(0).getText().equals("return")) {
                elseValue = visit(ctx.getChild(6).getChild(1).getChild(1));
            } else elseValue = visit(ctx.getChild(6).getChild(1));
            LLVMBuildBr(mBuilder, mergeBlock);
            // 生成 merge 块
            LLVMPositionBuilderAtEnd(mBuilder, mergeBlock);
            LLVMValueRef phiNode = LLVMBuildPhi(mBuilder, int32Type, "result");
            LLVMValueRef[] incomingValues = {thenValue, elseValue};
            LLVMBasicBlockRef[] incomingBlocks = {thenBlock, elseBlock};
            LLVMAddIncoming(phiNode, new PointerPointer<>(incomingValues), new PointerPointer<>(incomingBlocks), 2);

            // 返回结果(理论上不应该在这里面返回)
            LLVMBuildRet(mBuilder, phiNode);
        }
        return null;
    }

    private LLVMValueRef ifWalk(ParseTree ctx){
        LLVMValueRef value = null;
        for (int i = 1; i < ctx.getChild(4).getChildCount() - 1; i++) {
            if (i == ctx.getChild(4).getChildCount() - 2) value = visit(ctx.getChild(4).getChild(i));
            else visit(ctx.getChild(4).getChild(i));
        }
        return value;
    }

    @Override
    public LLVMValueRef visitReturn(GenshinParser.ReturnContext ctx) {
        String str =  ctx.parent.parent.getChild(0).getText();
        LLVMValueRef res = visit(ctx.expr());
        if (str.equals("if") || str.equals("else")){
            return res;
        }else {
            LLVMBuildRet(mBuilder, res);
            return null;
        }
    }

    @Override
    public LLVMValueRef visitCall(GenshinParser.CallContext ctx) {
        List<LLVMValueRef> list = new ArrayList<>();
        int count = 0;
        String minorCall = ctx.getChild(0).getText();
        for (int i = 0; i < ctx.getChild(2).getChildCount(); i += 2) {
            count++;
            list.add(visit(ctx.getChild(2).getChild(i)));
        }
        LLVMValueRef[] argsArray = list.toArray(new LLVMValueRef[0]);
        return LLVMBuildCall(mBuilder, map.get(minorCall), new PointerPointer<>(argsArray), count, minorCall + "Result");
    }

    @Override
    public LLVMValueRef visitAddSub(GenshinParser.AddSubContext ctx) {
        RuleContext parent = ctx.parent;
        String str = "TEMP" + parent.getChild(0).getText();
        LLVMValueRef l, r;
        l = visit(ctx.le);
        r = visit(ctx.re);
        if (ctx.op.getText().equals("+")) return LLVMBuildAdd(mBuilder, l, r, str);
        else return LLVMBuildSub(mBuilder, l, r, str);
    }

    @Override
    public LLVMValueRef visitMultDiv(GenshinParser.MultDivContext ctx) {
        RuleContext parent = ctx.parent;
        String str = "TEMP" + parent.getChild(0).getText();
        LLVMValueRef l, r;
        l = visit(ctx.le);
        r = visit(ctx.re);
        if (ctx.op.getText().equals("*")) return LLVMBuildMul(mBuilder, l, r, str);
        else return LLVMBuildFDiv(mBuilder, l, r, str);
    }

    @Override
    public LLVMValueRef visitId(GenshinParser.IdContext ctx) {
        return map.get(ctx.ID().getText());
    }

    @Override
    public LLVMValueRef visitInt(GenshinParser.IntContext ctx) {
        return LLVMConstInt(int32Type, Integer.parseInt(ctx.INT().getText()), 0);
    }

    @Override
    public LLVMValueRef visitFormalParams(GenshinParser.FormalParamsContext ctx) {
        String str;
        for (int i = 0; i < ctx.getChildCount(); i += 2) {
            str = ctx.getChild(i).getChild(1).getText();
            LLVMValueRef param = LLVM.LLVMGetParam(function, count);
            LLVMSetValueName2(param, str, 1);
            count++;
            map.put(str, param);

        }
        return null;
    }
}
