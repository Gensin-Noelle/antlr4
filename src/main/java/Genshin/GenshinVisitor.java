// Generated from F:/JAVA/CompilingExam/src/main/java/main/Genshin.g4 by ANTLR 4.13.1
package Genshin;

    import java.util.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GenshinParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GenshinVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GenshinParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(GenshinParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenshinParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GenshinParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenshinParser#vars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVars(GenshinParser.VarsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenshinParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(GenshinParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenshinParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(GenshinParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenshinParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GenshinParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FacBlock}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFacBlock(GenshinParser.FacBlockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Var}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(GenshinParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Express}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpress(GenshinParser.ExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(GenshinParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IF}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIF(GenshinParser.IFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code For}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(GenshinParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Return}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(GenshinParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LOOP}
	 * labeled alternative in {@link GenshinParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLOOP(GenshinParser.LOOPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STR}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTR(GenshinParser.STRContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Call}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(GenshinParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Float}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloat(GenshinParser.FloatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(GenshinParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(GenshinParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(GenshinParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Logic}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic(GenshinParser.LogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(GenshinParser.IntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(GenshinParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MultDiv}
	 * labeled alternative in {@link GenshinParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(GenshinParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenshinParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(GenshinParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenshinParser#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParams(GenshinParser.FormalParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GenshinParser#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParam(GenshinParser.FormalParamContext ctx);
}