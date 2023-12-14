// Generated from F:/JAVA/CompilingExam/src/main/java/main/Genshin.g4 by ANTLR 4.13.1
package Genshin;

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GenshinParser}.
 */
public interface GenshinListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GenshinParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(GenshinParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenshinParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(GenshinParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenshinParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GenshinParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenshinParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GenshinParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenshinParser#vars}.
	 * @param ctx the parse tree
	 */
	void enterVars(GenshinParser.VarsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenshinParser#vars}.
	 * @param ctx the parse tree
	 */
	void exitVars(GenshinParser.VarsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenshinParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(GenshinParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenshinParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(GenshinParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenshinParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(GenshinParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenshinParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(GenshinParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenshinParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GenshinParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenshinParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GenshinParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FacBlock}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFacBlock(GenshinParser.FacBlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FacBlock}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFacBlock(GenshinParser.FacBlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Var}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVar(GenshinParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVar(GenshinParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Express}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExpress(GenshinParser.ExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Express}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExpress(GenshinParser.ExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(GenshinParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(GenshinParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IF}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIF(GenshinParser.IFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIF(GenshinParser.IFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code For}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFor(GenshinParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code For}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFor(GenshinParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Return}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturn(GenshinParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturn(GenshinParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LOOP}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterLOOP(GenshinParser.LOOPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LOOP}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitLOOP(GenshinParser.LOOPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STR}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSTR(GenshinParser.STRContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STR}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSTR(GenshinParser.STRContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Call}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCall(GenshinParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCall(GenshinParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Float}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFloat(GenshinParser.FloatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFloat(GenshinParser.FloatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(GenshinParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(GenshinParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(GenshinParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(GenshinParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(GenshinParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(GenshinParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLogic(GenshinParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLogic(GenshinParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(GenshinParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(GenshinParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPower(GenshinParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPower(GenshinParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(GenshinParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(GenshinParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenshinParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(GenshinParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenshinParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(GenshinParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenshinParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParams(GenshinParser.FormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenshinParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParams(GenshinParser.FormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GenshinParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(GenshinParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link GenshinParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(GenshinParser.FormalParamContext ctx);
}