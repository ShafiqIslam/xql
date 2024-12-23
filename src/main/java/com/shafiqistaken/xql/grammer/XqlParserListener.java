// Generated from XqlParser.g4 by ANTLR 4.12.0

    package com.shafiqistaken.xql.grammer;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link XqlParserParser}.
 */
public interface XqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStatement(XqlParserParser.SelectStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStatement(XqlParserParser.SelectStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#selectItemList}.
	 * @param ctx the parse tree
	 */
	void enterSelectItemList(XqlParserParser.SelectItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#selectItemList}.
	 * @param ctx the parse tree
	 */
	void exitSelectItemList(XqlParserParser.SelectItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectItem(XqlParserParser.SelectItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectItem(XqlParserParser.SelectItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(XqlParserParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(XqlParserParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(XqlParserParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(XqlParserParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link XqlParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(XqlParserParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprOr}
	 * labeled alternative in {@link XqlParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(XqlParserParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprIs}
	 * labeled alternative in {@link XqlParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIs(XqlParserParser.ExprIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprIs}
	 * labeled alternative in {@link XqlParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIs(XqlParserParser.ExprIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link XqlParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(XqlParserParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAnd}
	 * labeled alternative in {@link XqlParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(XqlParserParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExprPredicate}
	 * labeled alternative in {@link XqlParserParser#boolPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExprPredicate(XqlParserParser.PrimaryExprPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExprPredicate}
	 * labeled alternative in {@link XqlParserParser#boolPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExprPredicate(XqlParserParser.PrimaryExprPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExprCompare}
	 * labeled alternative in {@link XqlParserParser#boolPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExprCompare(XqlParserParser.PrimaryExprCompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExprCompare}
	 * labeled alternative in {@link XqlParserParser#boolPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExprCompare(XqlParserParser.PrimaryExprCompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExprIsNull}
	 * labeled alternative in {@link XqlParserParser#boolPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExprIsNull(XqlParserParser.PrimaryExprIsNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExprIsNull}
	 * labeled alternative in {@link XqlParserParser#boolPrimaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExprIsNull(XqlParserParser.PrimaryExprIsNullContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#compOp}.
	 * @param ctx the parse tree
	 */
	void enterCompOp(XqlParserParser.CompOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#compOp}.
	 * @param ctx the parse tree
	 */
	void exitCompOp(XqlParserParser.CompOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(XqlParserParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(XqlParserParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExprBetween}
	 * labeled alternative in {@link XqlParserParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExprBetween(XqlParserParser.PredicateExprBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExprBetween}
	 * labeled alternative in {@link XqlParserParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExprBetween(XqlParserParser.PredicateExprBetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExprLike}
	 * labeled alternative in {@link XqlParserParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExprLike(XqlParserParser.PredicateExprLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExprLike}
	 * labeled alternative in {@link XqlParserParser#predicateOperations}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExprLike(XqlParserParser.PredicateExprLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(XqlParserParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(XqlParserParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExprColumnRef}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprColumnRef(XqlParserParser.SimpleExprColumnRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExprColumnRef}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprColumnRef(XqlParserParser.SimpleExprColumnRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExprRuntimeFunction}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprRuntimeFunction(XqlParserParser.SimpleExprRuntimeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExprRuntimeFunction}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprRuntimeFunction(XqlParserParser.SimpleExprRuntimeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExprLiteral}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprLiteral(XqlParserParser.SimpleExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExprLiteral}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprLiteral(XqlParserParser.SimpleExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExprSum}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprSum(XqlParserParser.SimpleExprSumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExprSum}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprSum(XqlParserParser.SimpleExprSumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExprUnary}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprUnary(XqlParserParser.SimpleExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExprUnary}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprUnary(XqlParserParser.SimpleExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleExprNot}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExprNot(XqlParserParser.SimpleExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleExprNot}
	 * labeled alternative in {@link XqlParserParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExprNot(XqlParserParser.SimpleExprNotContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void enterColumnRef(XqlParserParser.ColumnRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void exitColumnRef(XqlParserParser.ColumnRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(XqlParserParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(XqlParserParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#exprWithParentheses}.
	 * @param ctx the parse tree
	 */
	void enterExprWithParentheses(XqlParserParser.ExprWithParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#exprWithParentheses}.
	 * @param ctx the parse tree
	 */
	void exitExprWithParentheses(XqlParserParser.ExprWithParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#sumExpr}.
	 * @param ctx the parse tree
	 */
	void enterSumExpr(XqlParserParser.SumExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#sumExpr}.
	 * @param ctx the parse tree
	 */
	void exitSumExpr(XqlParserParser.SumExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(XqlParserParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(XqlParserParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTextLiteral(XqlParserParser.TextLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#textLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTextLiteral(XqlParserParser.TextLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#numLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumLiteral(XqlParserParser.NumLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#numLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumLiteral(XqlParserParser.NumLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBoolLiteral(XqlParserParser.BoolLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#boolLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBoolLiteral(XqlParserParser.BoolLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(XqlParserParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#nullLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(XqlParserParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#sheetName}.
	 * @param ctx the parse tree
	 */
	void enterSheetName(XqlParserParser.SheetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#sheetName}.
	 * @param ctx the parse tree
	 */
	void exitSheetName(XqlParserParser.SheetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link XqlParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(XqlParserParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link XqlParserParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(XqlParserParser.IdentifierContext ctx);
}