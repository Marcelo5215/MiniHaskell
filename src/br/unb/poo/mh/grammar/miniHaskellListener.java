// Generated from miniHaskell.g4 by ANTLR 4.5.3
package br.unb.poo.mh.grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniHaskellParser}.
 */
public interface miniHaskellListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniHaskellParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(miniHaskellParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniHaskellParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(miniHaskellParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniHaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(miniHaskellParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniHaskellParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(miniHaskellParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniHaskellParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(miniHaskellParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniHaskellParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(miniHaskellParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniHaskellParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(miniHaskellParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniHaskellParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(miniHaskellParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniHaskellParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(miniHaskellParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniHaskellParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(miniHaskellParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniHaskellParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miniHaskellParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniHaskellParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miniHaskellParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniHaskellParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(miniHaskellParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniHaskellParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(miniHaskellParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniHaskellParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(miniHaskellParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniHaskellParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(miniHaskellParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniHaskellParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(miniHaskellParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniHaskellParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(miniHaskellParser.ExprListContext ctx);
}