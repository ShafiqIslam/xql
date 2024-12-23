// Generated from XqlParser.g4 by ANTLR 4.12.0

    package com.shafiqistaken.xql.grammer;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class XqlParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUAL_OPERATOR=1, GREATER_OR_EQUAL_OPERATOR=2, GREATER_THAN_OPERATOR=3, 
		LESS_OR_EQUAL_OPERATOR=4, LESS_THAN_OPERATOR=5, NOT_EQUAL_OPERATOR=6, 
		PLUS_OPERATOR=7, MINUS_OPERATOR=8, MULT_OPERATOR=9, DIV_OPERATOR=10, MOD_OPERATOR=11, 
		COMMA_SYMBOL=12, OPEN_PAR_SYMBOL=13, CLOSE_PAR_SYMBOL=14, DOT_SYMBOL=15, 
		BACK_TICK_QUOTED_ID=16, SELECT_SYMBOL=17, ALL_SYMBOL=18, DISTINCT_SYMBOL=19, 
		FROM_SYMBOL=20, WHERE_SYMBOL=21, IS_SYMBOL=22, NOT_SYMBOL=23, TRUE_SYMBOL=24, 
		FALSE_SYMBOL=25, NULL_SYMBOL=26, AND_SYMBOL=27, OR_SYMBOL=28, BETWEEN_SYMBOL=29, 
		LIKE_SYMBOL=30, DATE_SYMBOL=31, AVG_SYMBOL=32, COUNT_SYMBOL=33, MIN_SYMBOL=34, 
		MAX_SYMBOL=35, STDDEV_SYMBOL=36, SUM_SYMBOL=37, INT_NUMBER=38, DECIMAL_NUMBER=39, 
		FLOAT_NUMBER=40, DOUBLE_QUOTED_TEXT=41, SINGLE_QUOTED_TEXT=42;
	public static final int
		RULE_selectStatement = 0, RULE_selectItemList = 1, RULE_selectItem = 2, 
		RULE_fromClause = 3, RULE_whereClause = 4, RULE_expr = 5, RULE_boolPrimaryExpression = 6, 
		RULE_compOp = 7, RULE_predicate = 8, RULE_predicateOperations = 9, RULE_bitExpr = 10, 
		RULE_simpleExpr = 11, RULE_columnRef = 12, RULE_functionCall = 13, RULE_exprWithParentheses = 14, 
		RULE_sumExpr = 15, RULE_literal = 16, RULE_textLiteral = 17, RULE_numLiteral = 18, 
		RULE_boolLiteral = 19, RULE_nullLiteral = 20, RULE_sheetName = 21, RULE_identifier = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"selectStatement", "selectItemList", "selectItem", "fromClause", "whereClause", 
			"expr", "boolPrimaryExpression", "compOp", "predicate", "predicateOperations", 
			"bitExpr", "simpleExpr", "columnRef", "functionCall", "exprWithParentheses", 
			"sumExpr", "literal", "textLiteral", "numLiteral", "boolLiteral", "nullLiteral", 
			"sheetName", "identifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'>='", "'>'", "'<='", "'<'", "'!='", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "','", "'('", "')'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "EQUAL_OPERATOR", "GREATER_OR_EQUAL_OPERATOR", "GREATER_THAN_OPERATOR", 
			"LESS_OR_EQUAL_OPERATOR", "LESS_THAN_OPERATOR", "NOT_EQUAL_OPERATOR", 
			"PLUS_OPERATOR", "MINUS_OPERATOR", "MULT_OPERATOR", "DIV_OPERATOR", "MOD_OPERATOR", 
			"COMMA_SYMBOL", "OPEN_PAR_SYMBOL", "CLOSE_PAR_SYMBOL", "DOT_SYMBOL", 
			"BACK_TICK_QUOTED_ID", "SELECT_SYMBOL", "ALL_SYMBOL", "DISTINCT_SYMBOL", 
			"FROM_SYMBOL", "WHERE_SYMBOL", "IS_SYMBOL", "NOT_SYMBOL", "TRUE_SYMBOL", 
			"FALSE_SYMBOL", "NULL_SYMBOL", "AND_SYMBOL", "OR_SYMBOL", "BETWEEN_SYMBOL", 
			"LIKE_SYMBOL", "DATE_SYMBOL", "AVG_SYMBOL", "COUNT_SYMBOL", "MIN_SYMBOL", 
			"MAX_SYMBOL", "STDDEV_SYMBOL", "SUM_SYMBOL", "INT_NUMBER", "DECIMAL_NUMBER", 
			"FLOAT_NUMBER", "DOUBLE_QUOTED_TEXT", "SINGLE_QUOTED_TEXT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "XqlParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public XqlParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public TerminalNode SELECT_SYMBOL() { return getToken(XqlParserParser.SELECT_SYMBOL, 0); }
		public SelectItemListContext selectItemList() {
			return getRuleContext(SelectItemListContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSelectStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSelectStatement(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_selectStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(SELECT_SYMBOL);
			setState(47);
			selectItemList();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FROM_SYMBOL) {
				{
				setState(48);
				fromClause();
				}
			}

			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE_SYMBOL) {
				{
				setState(51);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectItemListContext extends ParserRuleContext {
		public TerminalNode ALL_SYMBOL() { return getToken(XqlParserParser.ALL_SYMBOL, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public List<TerminalNode> COMMA_SYMBOL() { return getTokens(XqlParserParser.COMMA_SYMBOL); }
		public TerminalNode COMMA_SYMBOL(int i) {
			return getToken(XqlParserParser.COMMA_SYMBOL, i);
		}
		public TerminalNode DISTINCT_SYMBOL() { return getToken(XqlParserParser.DISTINCT_SYMBOL, 0); }
		public SelectItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSelectItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSelectItemList(this);
		}
	}

	public final SelectItemListContext selectItemList() throws RecognitionException {
		SelectItemListContext _localctx = new SelectItemListContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectItemList);
		int _la;
		try {
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL_SYMBOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				match(ALL_SYMBOL);
				}
				break;
			case BACK_TICK_QUOTED_ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				selectItem();
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_SYMBOL) {
					{
					{
					setState(56);
					match(COMMA_SYMBOL);
					setState(57);
					selectItem();
					}
					}
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DISTINCT_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				match(DISTINCT_SYMBOL);
				setState(64);
				selectItem();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectItemContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSelectItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSelectItem(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_selectItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM_SYMBOL() { return getToken(XqlParserParser.FROM_SYMBOL, 0); }
		public SheetNameContext sheetName() {
			return getRuleContext(SheetNameContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fromClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(FROM_SYMBOL);
			setState(70);
			sheetName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE_SYMBOL() { return getToken(XqlParserParser.WHERE_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(WHERE_SYMBOL);
			setState(73);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprOrContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OR_SYMBOL() { return getToken(XqlParserParser.OR_SYMBOL, 0); }
		public ExprOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterExprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitExprOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIsContext extends ExprContext {
		public Token type;
		public BoolPrimaryExpressionContext boolPrimaryExpression() {
			return getRuleContext(BoolPrimaryExpressionContext.class,0);
		}
		public TerminalNode IS_SYMBOL() { return getToken(XqlParserParser.IS_SYMBOL, 0); }
		public TerminalNode TRUE_SYMBOL() { return getToken(XqlParserParser.TRUE_SYMBOL, 0); }
		public TerminalNode FALSE_SYMBOL() { return getToken(XqlParserParser.FALSE_SYMBOL, 0); }
		public TerminalNode NOT_SYMBOL() { return getToken(XqlParserParser.NOT_SYMBOL, 0); }
		public ExprIsContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterExprIs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitExprIs(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAndContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND_SYMBOL() { return getToken(XqlParserParser.AND_SYMBOL, 0); }
		public ExprAndContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterExprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitExprAnd(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new ExprIsContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(76);
			boolPrimaryExpression(0);
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(77);
				match(IS_SYMBOL);
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_SYMBOL) {
					{
					setState(78);
					match(NOT_SYMBOL);
					}
				}

				setState(81);
				((ExprIsContext)_localctx).type = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TRUE_SYMBOL || _la==FALSE_SYMBOL) ) {
					((ExprIsContext)_localctx).type = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(90);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExprAndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(84);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(85);
						((ExprAndContext)_localctx).op = match(AND_SYMBOL);
						setState(86);
						expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ExprOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(88);
						((ExprOrContext)_localctx).op = match(OR_SYMBOL);
						setState(89);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(94);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolPrimaryExpressionContext extends ParserRuleContext {
		public BoolPrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolPrimaryExpression; }
	 
		public BoolPrimaryExpressionContext() { }
		public void copyFrom(BoolPrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprPredicateContext extends BoolPrimaryExpressionContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PrimaryExprPredicateContext(BoolPrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterPrimaryExprPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitPrimaryExprPredicate(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprCompareContext extends BoolPrimaryExpressionContext {
		public BoolPrimaryExpressionContext boolPrimaryExpression() {
			return getRuleContext(BoolPrimaryExpressionContext.class,0);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PrimaryExprCompareContext(BoolPrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterPrimaryExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitPrimaryExprCompare(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExprIsNullContext extends BoolPrimaryExpressionContext {
		public BoolPrimaryExpressionContext boolPrimaryExpression() {
			return getRuleContext(BoolPrimaryExpressionContext.class,0);
		}
		public TerminalNode IS_SYMBOL() { return getToken(XqlParserParser.IS_SYMBOL, 0); }
		public TerminalNode NULL_SYMBOL() { return getToken(XqlParserParser.NULL_SYMBOL, 0); }
		public TerminalNode NOT_SYMBOL() { return getToken(XqlParserParser.NOT_SYMBOL, 0); }
		public PrimaryExprIsNullContext(BoolPrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterPrimaryExprIsNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitPrimaryExprIsNull(this);
		}
	}

	public final BoolPrimaryExpressionContext boolPrimaryExpression() throws RecognitionException {
		return boolPrimaryExpression(0);
	}

	private BoolPrimaryExpressionContext boolPrimaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolPrimaryExpressionContext _localctx = new BoolPrimaryExpressionContext(_ctx, _parentState);
		BoolPrimaryExpressionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_boolPrimaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryExprPredicateContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(96);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(110);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(108);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new PrimaryExprIsNullContext(new BoolPrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolPrimaryExpression);
						setState(98);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(99);
						match(IS_SYMBOL);
						setState(101);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT_SYMBOL) {
							{
							setState(100);
							match(NOT_SYMBOL);
							}
						}

						setState(103);
						match(NULL_SYMBOL);
						}
						break;
					case 2:
						{
						_localctx = new PrimaryExprCompareContext(new BoolPrimaryExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_boolPrimaryExpression);
						setState(104);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(105);
						compOp();
						setState(106);
						predicate();
						}
						break;
					}
					} 
				}
				setState(112);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode EQUAL_OPERATOR() { return getToken(XqlParserParser.EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_OR_EQUAL_OPERATOR() { return getToken(XqlParserParser.GREATER_OR_EQUAL_OPERATOR, 0); }
		public TerminalNode GREATER_THAN_OPERATOR() { return getToken(XqlParserParser.GREATER_THAN_OPERATOR, 0); }
		public TerminalNode LESS_OR_EQUAL_OPERATOR() { return getToken(XqlParserParser.LESS_OR_EQUAL_OPERATOR, 0); }
		public TerminalNode LESS_THAN_OPERATOR() { return getToken(XqlParserParser.LESS_THAN_OPERATOR, 0); }
		public TerminalNode NOT_EQUAL_OPERATOR() { return getToken(XqlParserParser.NOT_EQUAL_OPERATOR, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitCompOp(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 126L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public PredicateOperationsContext predicateOperations() {
			return getRuleContext(PredicateOperationsContext.class,0);
		}
		public TerminalNode NOT_SYMBOL() { return getToken(XqlParserParser.NOT_SYMBOL, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_predicate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			bitExpr(0);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT_SYMBOL) {
					{
					setState(116);
					match(NOT_SYMBOL);
					}
				}

				setState(119);
				predicateOperations();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateOperationsContext extends ParserRuleContext {
		public PredicateOperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperations; }
	 
		public PredicateOperationsContext() { }
		public void copyFrom(PredicateOperationsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicateExprBetweenContext extends PredicateOperationsContext {
		public TerminalNode BETWEEN_SYMBOL() { return getToken(XqlParserParser.BETWEEN_SYMBOL, 0); }
		public BitExprContext bitExpr() {
			return getRuleContext(BitExprContext.class,0);
		}
		public TerminalNode AND_SYMBOL() { return getToken(XqlParserParser.AND_SYMBOL, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateExprBetweenContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterPredicateExprBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitPredicateExprBetween(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicateExprLikeContext extends PredicateOperationsContext {
		public TerminalNode LIKE_SYMBOL() { return getToken(XqlParserParser.LIKE_SYMBOL, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public PredicateExprLikeContext(PredicateOperationsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterPredicateExprLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitPredicateExprLike(this);
		}
	}

	public final PredicateOperationsContext predicateOperations() throws RecognitionException {
		PredicateOperationsContext _localctx = new PredicateOperationsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_predicateOperations);
		try {
			setState(129);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BETWEEN_SYMBOL:
				_localctx = new PredicateExprBetweenContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				match(BETWEEN_SYMBOL);
				setState(123);
				bitExpr(0);
				setState(124);
				match(AND_SYMBOL);
				setState(125);
				predicate();
				}
				break;
			case LIKE_SYMBOL:
				_localctx = new PredicateExprLikeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				match(LIKE_SYMBOL);
				setState(128);
				simpleExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitExprContext extends ParserRuleContext {
		public Token op;
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode MULT_OPERATOR() { return getToken(XqlParserParser.MULT_OPERATOR, 0); }
		public TerminalNode DIV_OPERATOR() { return getToken(XqlParserParser.DIV_OPERATOR, 0); }
		public TerminalNode MOD_OPERATOR() { return getToken(XqlParserParser.MOD_OPERATOR, 0); }
		public TerminalNode PLUS_OPERATOR() { return getToken(XqlParserParser.PLUS_OPERATOR, 0); }
		public TerminalNode MINUS_OPERATOR() { return getToken(XqlParserParser.MINUS_OPERATOR, 0); }
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterBitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitBitExpr(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_bitExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(132);
			simpleExpr();
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(140);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(134);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(135);
						((BitExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
							((BitExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(136);
						bitExpr(3);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(137);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(138);
						((BitExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
							((BitExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(139);
						bitExpr(2);
						}
						break;
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprContext extends ParserRuleContext {
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
	 
		public SimpleExprContext() { }
		public void copyFrom(SimpleExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprRuntimeFunctionContext extends SimpleExprContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public SimpleExprRuntimeFunctionContext(SimpleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSimpleExprRuntimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSimpleExprRuntimeFunction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprColumnRefContext extends SimpleExprContext {
		public ColumnRefContext columnRef() {
			return getRuleContext(ColumnRefContext.class,0);
		}
		public SimpleExprColumnRefContext(SimpleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSimpleExprColumnRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSimpleExprColumnRef(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprSumContext extends SimpleExprContext {
		public SumExprContext sumExpr() {
			return getRuleContext(SumExprContext.class,0);
		}
		public SimpleExprSumContext(SimpleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSimpleExprSum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSimpleExprSum(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprUnaryContext extends SimpleExprContext {
		public Token op;
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public TerminalNode PLUS_OPERATOR() { return getToken(XqlParserParser.PLUS_OPERATOR, 0); }
		public TerminalNode MINUS_OPERATOR() { return getToken(XqlParserParser.MINUS_OPERATOR, 0); }
		public SimpleExprUnaryContext(SimpleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSimpleExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSimpleExprUnary(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprLiteralContext extends SimpleExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public SimpleExprLiteralContext(SimpleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSimpleExprLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSimpleExprLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprNotContext extends SimpleExprContext {
		public TerminalNode NOT_SYMBOL() { return getToken(XqlParserParser.NOT_SYMBOL, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public SimpleExprNotContext(SimpleExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSimpleExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSimpleExprNot(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_simpleExpr);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BACK_TICK_QUOTED_ID:
				_localctx = new SimpleExprColumnRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				columnRef();
				}
				break;
			case DATE_SYMBOL:
				_localctx = new SimpleExprRuntimeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				functionCall();
				}
				break;
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
			case NULL_SYMBOL:
			case INT_NUMBER:
			case DECIMAL_NUMBER:
			case FLOAT_NUMBER:
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
				_localctx = new SimpleExprLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				literal();
				}
				break;
			case AVG_SYMBOL:
			case COUNT_SYMBOL:
			case MIN_SYMBOL:
			case MAX_SYMBOL:
			case STDDEV_SYMBOL:
			case SUM_SYMBOL:
				_localctx = new SimpleExprSumContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(148);
				sumExpr();
				}
				break;
			case PLUS_OPERATOR:
			case MINUS_OPERATOR:
				_localctx = new SimpleExprUnaryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				((SimpleExprUnaryContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS_OPERATOR || _la==MINUS_OPERATOR) ) {
					((SimpleExprUnaryContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(150);
				simpleExpr();
				}
				break;
			case NOT_SYMBOL:
				_localctx = new SimpleExprNotContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				match(NOT_SYMBOL);
				setState(152);
				simpleExpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnRefContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterColumnRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitColumnRef(this);
		}
	}

	public final ColumnRefContext columnRef() throws RecognitionException {
		ColumnRefContext _localctx = new ColumnRefContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_columnRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode DATE_SYMBOL() { return getToken(XqlParserParser.DATE_SYMBOL, 0); }
		public ExprWithParenthesesContext exprWithParentheses() {
			return getRuleContext(ExprWithParenthesesContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(DATE_SYMBOL);
			setState(158);
			exprWithParentheses();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprWithParenthesesContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(XqlParserParser.OPEN_PAR_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(XqlParserParser.CLOSE_PAR_SYMBOL, 0); }
		public ExprWithParenthesesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprWithParentheses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterExprWithParentheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitExprWithParentheses(this);
		}
	}

	public final ExprWithParenthesesContext exprWithParentheses() throws RecognitionException {
		ExprWithParenthesesContext _localctx = new ExprWithParenthesesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprWithParentheses);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(OPEN_PAR_SYMBOL);
			setState(161);
			expr(0);
			setState(162);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SumExprContext extends ParserRuleContext {
		public Token name;
		public TerminalNode OPEN_PAR_SYMBOL() { return getToken(XqlParserParser.OPEN_PAR_SYMBOL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR_SYMBOL() { return getToken(XqlParserParser.CLOSE_PAR_SYMBOL, 0); }
		public TerminalNode AVG_SYMBOL() { return getToken(XqlParserParser.AVG_SYMBOL, 0); }
		public TerminalNode COUNT_SYMBOL() { return getToken(XqlParserParser.COUNT_SYMBOL, 0); }
		public TerminalNode MIN_SYMBOL() { return getToken(XqlParserParser.MIN_SYMBOL, 0); }
		public TerminalNode MAX_SYMBOL() { return getToken(XqlParserParser.MAX_SYMBOL, 0); }
		public TerminalNode STDDEV_SYMBOL() { return getToken(XqlParserParser.STDDEV_SYMBOL, 0); }
		public TerminalNode SUM_SYMBOL() { return getToken(XqlParserParser.SUM_SYMBOL, 0); }
		public TerminalNode DISTINCT_SYMBOL() { return getToken(XqlParserParser.DISTINCT_SYMBOL, 0); }
		public TerminalNode ALL_SYMBOL() { return getToken(XqlParserParser.ALL_SYMBOL, 0); }
		public SumExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSumExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSumExpr(this);
		}
	}

	public final SumExprContext sumExpr() throws RecognitionException {
		SumExprContext _localctx = new SumExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_sumExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((SumExprContext)_localctx).name = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
				((SumExprContext)_localctx).name = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(165);
			match(OPEN_PAR_SYMBOL);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT_SYMBOL) {
				{
				setState(166);
				match(DISTINCT_SYMBOL);
				}
			}

			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL_SYMBOL) {
				{
				setState(169);
				match(ALL_SYMBOL);
				}
			}

			setState(172);
			expr(0);
			setState(173);
			match(CLOSE_PAR_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TextLiteralContext textLiteral() {
			return getRuleContext(TextLiteralContext.class,0);
		}
		public NumLiteralContext numLiteral() {
			return getRuleContext(NumLiteralContext.class,0);
		}
		public NullLiteralContext nullLiteral() {
			return getRuleContext(NullLiteralContext.class,0);
		}
		public BoolLiteralContext boolLiteral() {
			return getRuleContext(BoolLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_literal);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOUBLE_QUOTED_TEXT:
			case SINGLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				textLiteral();
				}
				break;
			case INT_NUMBER:
			case DECIMAL_NUMBER:
			case FLOAT_NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				numLiteral();
				}
				break;
			case NULL_SYMBOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(177);
				nullLiteral();
				}
				break;
			case TRUE_SYMBOL:
			case FALSE_SYMBOL:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				boolLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextLiteralContext extends ParserRuleContext {
		public Token value;
		public TerminalNode SINGLE_QUOTED_TEXT() { return getToken(XqlParserParser.SINGLE_QUOTED_TEXT, 0); }
		public TerminalNode DOUBLE_QUOTED_TEXT() { return getToken(XqlParserParser.DOUBLE_QUOTED_TEXT, 0); }
		public TextLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterTextLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitTextLiteral(this);
		}
	}

	public final TextLiteralContext textLiteral() throws RecognitionException {
		TextLiteralContext _localctx = new TextLiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_textLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			((TextLiteralContext)_localctx).value = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==DOUBLE_QUOTED_TEXT || _la==SINGLE_QUOTED_TEXT) ) {
				((TextLiteralContext)_localctx).value = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumLiteralContext extends ParserRuleContext {
		public TerminalNode INT_NUMBER() { return getToken(XqlParserParser.INT_NUMBER, 0); }
		public TerminalNode DECIMAL_NUMBER() { return getToken(XqlParserParser.DECIMAL_NUMBER, 0); }
		public TerminalNode FLOAT_NUMBER() { return getToken(XqlParserParser.FLOAT_NUMBER, 0); }
		public NumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterNumLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitNumLiteral(this);
		}
	}

	public final NumLiteralContext numLiteral() throws RecognitionException {
		NumLiteralContext _localctx = new NumLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_numLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1924145348608L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BoolLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE_SYMBOL() { return getToken(XqlParserParser.TRUE_SYMBOL, 0); }
		public TerminalNode FALSE_SYMBOL() { return getToken(XqlParserParser.FALSE_SYMBOL, 0); }
		public BoolLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterBoolLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitBoolLiteral(this);
		}
	}

	public final BoolLiteralContext boolLiteral() throws RecognitionException {
		BoolLiteralContext _localctx = new BoolLiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_boolLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_la = _input.LA(1);
			if ( !(_la==TRUE_SYMBOL || _la==FALSE_SYMBOL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullLiteralContext extends ParserRuleContext {
		public TerminalNode NULL_SYMBOL() { return getToken(XqlParserParser.NULL_SYMBOL, 0); }
		public NullLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitNullLiteral(this);
		}
	}

	public final NullLiteralContext nullLiteral() throws RecognitionException {
		NullLiteralContext _localctx = new NullLiteralContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_nullLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(NULL_SYMBOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SheetNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SheetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sheetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterSheetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitSheetName(this);
		}
	}

	public final SheetNameContext sheetName() throws RecognitionException {
		SheetNameContext _localctx = new SheetNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sheetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode BACK_TICK_QUOTED_ID() { return getToken(XqlParserParser.BACK_TICK_QUOTED_ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof XqlParserListener ) ((XqlParserListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(BACK_TICK_QUOTED_ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 6:
			return boolPrimaryExpression_sempred((BoolPrimaryExpressionContext)_localctx, predIndex);
		case 10:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean boolPrimaryExpression_sempred(BoolPrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00c2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000"+
		"2\b\u0000\u0001\u0000\u0003\u00005\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001;\b\u0001\n\u0001\f\u0001>\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001B\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005P\b\u0005\u0001"+
		"\u0005\u0003\u0005S\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005[\b\u0005\n\u0005\f\u0005^\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006f\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006m\b\u0006\n\u0006\f\u0006p\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\bv\b\b\u0001\b\u0003\by\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0082\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u008d\b\n\n\n\f\n\u0090\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u009a"+
		"\b\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u00a8\b\u000f\u0001\u000f\u0003\u000f\u00ab\b\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u00b4\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0000\u0003\n\f\u0014\u0017\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,\u0000\u0007\u0001\u0000\u0018\u0019\u0001\u0000\u0001\u0006\u0001"+
		"\u0000\t\u000b\u0001\u0000\u0007\b\u0001\u0000 %\u0001\u0000)*\u0001\u0000"+
		"&(\u00c5\u0000.\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000"+
		"\u0004C\u0001\u0000\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\bH\u0001"+
		"\u0000\u0000\u0000\nK\u0001\u0000\u0000\u0000\f_\u0001\u0000\u0000\u0000"+
		"\u000eq\u0001\u0000\u0000\u0000\u0010s\u0001\u0000\u0000\u0000\u0012\u0081"+
		"\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u0099"+
		"\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a\u009d"+
		"\u0001\u0000\u0000\u0000\u001c\u00a0\u0001\u0000\u0000\u0000\u001e\u00a4"+
		"\u0001\u0000\u0000\u0000 \u00b3\u0001\u0000\u0000\u0000\"\u00b5\u0001"+
		"\u0000\u0000\u0000$\u00b7\u0001\u0000\u0000\u0000&\u00b9\u0001\u0000\u0000"+
		"\u0000(\u00bb\u0001\u0000\u0000\u0000*\u00bd\u0001\u0000\u0000\u0000,"+
		"\u00bf\u0001\u0000\u0000\u0000./\u0005\u0011\u0000\u0000/1\u0003\u0002"+
		"\u0001\u000002\u0003\u0006\u0003\u000010\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u000024\u0001\u0000\u0000\u000035\u0003\b\u0004\u000043\u0001"+
		"\u0000\u0000\u000045\u0001\u0000\u0000\u00005\u0001\u0001\u0000\u0000"+
		"\u00006B\u0005\u0012\u0000\u00007<\u0003\u0004\u0002\u000089\u0005\f\u0000"+
		"\u00009;\u0003\u0004\u0002\u0000:8\u0001\u0000\u0000\u0000;>\u0001\u0000"+
		"\u0000\u0000<:\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=B\u0001"+
		"\u0000\u0000\u0000><\u0001\u0000\u0000\u0000?@\u0005\u0013\u0000\u0000"+
		"@B\u0003\u0004\u0002\u0000A6\u0001\u0000\u0000\u0000A7\u0001\u0000\u0000"+
		"\u0000A?\u0001\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CD\u0003"+
		",\u0016\u0000D\u0005\u0001\u0000\u0000\u0000EF\u0005\u0014\u0000\u0000"+
		"FG\u0003*\u0015\u0000G\u0007\u0001\u0000\u0000\u0000HI\u0005\u0015\u0000"+
		"\u0000IJ\u0003\n\u0005\u0000J\t\u0001\u0000\u0000\u0000KL\u0006\u0005"+
		"\uffff\uffff\u0000LR\u0003\f\u0006\u0000MO\u0005\u0016\u0000\u0000NP\u0005"+
		"\u0017\u0000\u0000ON\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PQ\u0001\u0000\u0000\u0000QS\u0007\u0000\u0000\u0000RM\u0001\u0000\u0000"+
		"\u0000RS\u0001\u0000\u0000\u0000S\\\u0001\u0000\u0000\u0000TU\n\u0002"+
		"\u0000\u0000UV\u0005\u001b\u0000\u0000V[\u0003\n\u0005\u0003WX\n\u0001"+
		"\u0000\u0000XY\u0005\u001c\u0000\u0000Y[\u0003\n\u0005\u0002ZT\u0001\u0000"+
		"\u0000\u0000ZW\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u000b\u0001\u0000\u0000"+
		"\u0000^\\\u0001\u0000\u0000\u0000_`\u0006\u0006\uffff\uffff\u0000`a\u0003"+
		"\u0010\b\u0000an\u0001\u0000\u0000\u0000bc\n\u0002\u0000\u0000ce\u0005"+
		"\u0016\u0000\u0000df\u0005\u0017\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"ef\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gm\u0005\u001a\u0000"+
		"\u0000hi\n\u0001\u0000\u0000ij\u0003\u000e\u0007\u0000jk\u0003\u0010\b"+
		"\u0000km\u0001\u0000\u0000\u0000lb\u0001\u0000\u0000\u0000lh\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000o\r\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0007\u0001\u0000\u0000r\u000f\u0001\u0000\u0000\u0000sx\u0003\u0014"+
		"\n\u0000tv\u0005\u0017\u0000\u0000ut\u0001\u0000\u0000\u0000uv\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0003\u0012\t\u0000xu\u0001\u0000"+
		"\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0011\u0001\u0000\u0000\u0000"+
		"z{\u0005\u001d\u0000\u0000{|\u0003\u0014\n\u0000|}\u0005\u001b\u0000\u0000"+
		"}~\u0003\u0010\b\u0000~\u0082\u0001\u0000\u0000\u0000\u007f\u0080\u0005"+
		"\u001e\u0000\u0000\u0080\u0082\u0003\u0016\u000b\u0000\u0081z\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0013\u0001\u0000"+
		"\u0000\u0000\u0083\u0084\u0006\n\uffff\uffff\u0000\u0084\u0085\u0003\u0016"+
		"\u000b\u0000\u0085\u008e\u0001\u0000\u0000\u0000\u0086\u0087\n\u0002\u0000"+
		"\u0000\u0087\u0088\u0007\u0002\u0000\u0000\u0088\u008d\u0003\u0014\n\u0003"+
		"\u0089\u008a\n\u0001\u0000\u0000\u008a\u008b\u0007\u0003\u0000\u0000\u008b"+
		"\u008d\u0003\u0014\n\u0002\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u0089"+
		"\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000\u0000\u0000\u008e\u008c"+
		"\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000\u0000\u0000\u008f\u0015"+
		"\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0091\u009a"+
		"\u0003\u0018\f\u0000\u0092\u009a\u0003\u001a\r\u0000\u0093\u009a\u0003"+
		" \u0010\u0000\u0094\u009a\u0003\u001e\u000f\u0000\u0095\u0096\u0007\u0003"+
		"\u0000\u0000\u0096\u009a\u0003\u0016\u000b\u0000\u0097\u0098\u0005\u0017"+
		"\u0000\u0000\u0098\u009a\u0003\u0016\u000b\u0000\u0099\u0091\u0001\u0000"+
		"\u0000\u0000\u0099\u0092\u0001\u0000\u0000\u0000\u0099\u0093\u0001\u0000"+
		"\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0095\u0001\u0000"+
		"\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u0017\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u0003,\u0016\u0000\u009c\u0019\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u001f\u0000\u0000\u009e\u009f\u0003\u001c\u000e"+
		"\u0000\u009f\u001b\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\r\u0000\u0000"+
		"\u00a1\u00a2\u0003\n\u0005\u0000\u00a2\u00a3\u0005\u000e\u0000\u0000\u00a3"+
		"\u001d\u0001\u0000\u0000\u0000\u00a4\u00a5\u0007\u0004\u0000\u0000\u00a5"+
		"\u00a7\u0005\r\u0000\u0000\u00a6\u00a8\u0005\u0013\u0000\u0000\u00a7\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0005\u0012\u0000\u0000\u00aa\u00a9"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0003\n\u0005\u0000\u00ad\u00ae\u0005"+
		"\u000e\u0000\u0000\u00ae\u001f\u0001\u0000\u0000\u0000\u00af\u00b4\u0003"+
		"\"\u0011\u0000\u00b0\u00b4\u0003$\u0012\u0000\u00b1\u00b4\u0003(\u0014"+
		"\u0000\u00b2\u00b4\u0003&\u0013\u0000\u00b3\u00af\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b0\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0007\u0005\u0000\u0000\u00b6#\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0007\u0006\u0000\u0000\u00b8%\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007"+
		"\u0000\u0000\u0000\u00ba\'\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u001a"+
		"\u0000\u0000\u00bc)\u0001\u0000\u0000\u0000\u00bd\u00be\u0003,\u0016\u0000"+
		"\u00be+\u0001\u0000\u0000\u0000\u00bf\u00c0\u0005\u0010\u0000\u0000\u00c0"+
		"-\u0001\u0000\u0000\u0000\u001414<AORZ\\elnux\u0081\u008c\u008e\u0099"+
		"\u00a7\u00aa\u00b3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}