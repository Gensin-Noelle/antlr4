// Generated from F:/JAVA/CompilingExam/src/main/java/main/Genshin.g4 by ANTLR 4.13.1
package Genshin;

    import java.util.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GenshinParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, STRING=23, INT=24, FLOAT=25, 
		ID=26, WS=27, SL_COMMENT=28, ML_COMMENT=29, DOC_COMMENT=30;
	public static final int
		RULE_r = 0, RULE_type = 1, RULE_vars = 2, RULE_varDecl = 3, RULE_functionDecl = 4, 
		RULE_block = 5, RULE_stat = 6, RULE_expr = 7, RULE_exprList = 8, RULE_formalParams = 9, 
		RULE_formalParam = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"r", "type", "vars", "varDecl", "functionDecl", "block", "stat", "expr", 
			"exprList", "formalParams", "formalParam"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'float'", "'void'", "'='", "','", "';'", "'('", "')'", 
			"'{'", "'}'", "'if'", "'else'", "'for'", "'return'", "'loop'", "'*'", 
			"'/'", "'+'", "'-'", "'>'", "'<'", "'^'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "STRING", 
			"INT", "FLOAT", "ID", "WS", "SL_COMMENT", "ML_COMMENT", "DOC_COMMENT"
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
	public String getGrammarFileName() { return "Genshin.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    Map<String, Double> memory = new HashMap<>();
	    double arith(double l, double r, String op) {
	            switch (op) {
	                case "+":
	                    return l + r;
	                case "-":
	                    return l - r;
	                case "*":
	                    return l * r;
	                case "/":
	                    return l / r;
	                default:
	                    return Math.pow(l, r);
	            }
	        }

	public GenshinParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(GenshinParser.EOF, 0); }
		public List<VarDeclContext> varDecl() {
			return getRuleContexts(VarDeclContext.class);
		}
		public VarDeclContext varDecl(int i) {
			return getRuleContext(VarDeclContext.class,i);
		}
		public List<FunctionDeclContext> functionDecl() {
			return getRuleContexts(FunctionDeclContext.class);
		}
		public FunctionDeclContext functionDecl(int i) {
			return getRuleContext(FunctionDeclContext.class,i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitR(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		RContext _localctx = new RContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_r);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126413454L) != 0)) {
				{
				setState(25);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(22);
					varDecl();
					}
					break;
				case 2:
					{
					setState(23);
					functionDecl();
					}
					break;
				case 3:
					{
					setState(24);
					stat();
					}
					break;
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			match(EOF);
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
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) ) {
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
	public static class VarsContext extends ParserRuleContext {
		public String typeStr;
		public Token ID;
		public ExprContext expr;
		public List<TerminalNode> ID() { return getTokens(GenshinParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(GenshinParser.ID, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VarsContext(ParserRuleContext parent, int invokingState, String typeStr) {
			super(parent, invokingState);
			this.typeStr = typeStr;
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitVars(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitVars(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarsContext vars(String typeStr) throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState(), typeStr);
		enterRule(_localctx, 4, RULE_vars);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((VarsContext)_localctx).ID = match(ID);
			System.out.println((((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null) + ":" + _localctx.typeStr);
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(36);
					match(T__3);
					setState(37);
					((VarsContext)_localctx).expr = expr(0);
					}
				}

				if ((((VarsContext)_localctx).expr!=null?_input.getText(((VarsContext)_localctx).expr.start,((VarsContext)_localctx).expr.stop):null) != null){memory.put((((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null), ((VarsContext)_localctx).expr.val);}
				}
				break;
			case 2:
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(41);
					match(T__4);
					setState(42);
					((VarsContext)_localctx).ID = match(ID);
					System.out.println((((VarsContext)_localctx).ID!=null?((VarsContext)_localctx).ID.getText():null) + ":" + _localctx.typeStr);
					}
					}
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class VarDeclContext extends ParserRuleContext {
		public TypeContext type;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			((VarDeclContext)_localctx).type = type();
			setState(52);
			vars((((VarDeclContext)_localctx).type!=null?_input.getText(((VarDeclContext)_localctx).type.start,((VarDeclContext)_localctx).type.stop):null));
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(53);
				match(T__5);
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
	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GenshinParser.ID, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FormalParamsContext formalParams() {
			return getRuleContext(FormalParamsContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			type();
			setState(57);
			match(ID);
			setState(58);
			match(T__6);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14L) != 0)) {
				{
				setState(59);
				formalParams();
				}
			}

			setState(62);
			match(T__7);
			setState(63);
			block();
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(T__8);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126413454L) != 0)) {
				{
				{
				setState(66);
				stat();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72);
			match(T__9);
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
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressContext extends StatContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpressContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitExpress(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FacBlockContext extends StatContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FacBlockContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterFacBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitFacBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitFacBlock(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarContext extends StatContext {
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public VarContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LOOPContext extends StatContext {
		public Token INT;
		public ExprContext expr;
		public TerminalNode INT() { return getToken(GenshinParser.INT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LOOPContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterLOOP(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitLOOP(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitLOOP(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends StatContext {
		public VarDeclContext le;
		public ExprContext mid;
		public ExprContext re;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ForContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends StatContext {
		public Token le;
		public ExprContext re;
		public ExprContext expr;
		public TerminalNode ID() { return getToken(GenshinParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IFContext extends StatContext {
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IFContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterIF(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitIF(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitIF(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stat);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new FacBlockContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				block();
				}
				break;
			case 2:
				_localctx = new VarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				varDecl();
				}
				break;
			case 3:
				_localctx = new ExpressContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				((ExpressContext)_localctx).expr = expr(0);
				setState(77);
				match(T__5);
				System.out.println((((ExpressContext)_localctx).expr!=null?_input.getText(((ExpressContext)_localctx).expr.start,((ExpressContext)_localctx).expr.stop):null) + "=" + ((ExpressContext)_localctx).expr.val);
				        
				}
				break;
			case 4:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				((AssignContext)_localctx).le = match(ID);
				setState(81);
				match(T__3);
				setState(82);
				((AssignContext)_localctx).re = ((AssignContext)_localctx).expr = expr(0);
				setState(83);
				match(T__5);

				        memory.put((((AssignContext)_localctx).le!=null?((AssignContext)_localctx).le.getText():null), ((AssignContext)_localctx).expr.val);
				}
				break;
			case 5:
				_localctx = new IFContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(T__10);
				setState(87);
				match(T__6);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126353536L) != 0)) {
					{
					setState(88);
					expr(0);
					}
				}

				setState(91);
				match(T__7);
				setState(92);
				block();
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__11) {
					{
					setState(93);
					match(T__11);
					setState(94);
					block();
					}
				}

				}
				break;
			case 6:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(97);
				match(T__12);
				setState(98);
				match(T__6);
				setState(99);
				((ForContext)_localctx).le = varDecl();
				setState(100);
				match(T__5);
				setState(101);
				((ForContext)_localctx).mid = expr(0);
				setState(102);
				match(T__5);
				setState(103);
				((ForContext)_localctx).re = expr(0);
				setState(104);
				match(T__7);
				setState(105);
				block();
				}
				break;
			case 7:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				match(T__13);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126353536L) != 0)) {
					{
					setState(108);
					expr(0);
					}
				}

				setState(111);
				match(T__5);
				}
				break;
			case 8:
				_localctx = new LOOPContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(112);
				match(T__14);
				setState(113);
				match(T__6);
				setState(114);
				((LOOPContext)_localctx).INT = match(INT);
				setState(115);
				match(T__7);
				setState(116);
				match(T__8);
				setState(117);
				((LOOPContext)_localctx).expr = expr(0);
				setState(118);
				match(T__5);
				setState(119);
				match(T__9);

				           int i = 0;
				           while (i < (((LOOPContext)_localctx).INT!=null?Integer.valueOf(((LOOPContext)_localctx).INT.getText()):0)){
				                 System.out.println((((LOOPContext)_localctx).expr!=null?_input.getText(((LOOPContext)_localctx).expr.start,((LOOPContext)_localctx).expr.stop):null) + "=" + ((LOOPContext)_localctx).expr.val);
				                 i++;
				           }
				      
				}
				break;
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
		public double val;
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
			this.val = ctx.val;
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class STRContext extends ExprContext {
		public TerminalNode STRING() { return getToken(GenshinParser.STRING, 0); }
		public STRContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterSTR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitSTR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitSTR(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ExprContext {
		public TerminalNode ID() { return getToken(GenshinParser.ID, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public CallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExprContext {
		public Token op;
		public Token FLOAT;
		public TerminalNode FLOAT() { return getToken(GenshinParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterFloat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitFloat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitFloat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public ExprContext le;
		public Token op;
		public ExprContext re;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitParens(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(GenshinParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicContext extends ExprContext {
		public ExprContext le;
		public Token op;
		public ExprContext re;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitLogic(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public Token op;
		public Token INT;
		public TerminalNode INT() { return getToken(GenshinParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowerContext extends ExprContext {
		public ExprContext le;
		public ExprContext re;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultDivContext extends ExprContext {
		public ExprContext le;
		public Token op;
		public ExprContext re;
		public ExprContext expr;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitMultDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitMultDiv(this);
			else return visitor.visitChildren(this);
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new CallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(125);
				match(ID);
				setState(126);
				match(T__6);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 126353536L) != 0)) {
					{
					setState(127);
					exprList();
					}
				}

				setState(130);
				match(T__7);
				}
				break;
			case 2:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__6);
				setState(132);
				((ParensContext)_localctx).expr = expr(0);
				setState(133);
				match(T__7);
				((ParensContext)_localctx).val =  ((ParensContext)_localctx).expr.val;
				}
				break;
			case 3:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				match(ID);
				}
				break;
			case 4:
				{
				_localctx = new STRContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(137);
				match(STRING);
				}
				break;
			case 5:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(138);
					((IntContext)_localctx).op = match(T__18);
					}
				}

				setState(141);
				((IntContext)_localctx).INT = match(INT);

					 if (((IntContext)_localctx).op != null) ((IntContext)_localctx).val =  Double.parseDouble("-" + (((IntContext)_localctx).INT!=null?((IntContext)_localctx).INT.getText():null));
				         else ((IntContext)_localctx).val =  (((IntContext)_localctx).INT!=null?Integer.valueOf(((IntContext)_localctx).INT.getText()):0);
				}
				break;
			case 6:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(144);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__18) {
					{
					setState(143);
					((FloatContext)_localctx).op = match(T__18);
					}
				}

				setState(146);
				((FloatContext)_localctx).FLOAT = match(FLOAT);

					 if (((FloatContext)_localctx).op != null) ((FloatContext)_localctx).val =  Double.parseDouble("-" + (((FloatContext)_localctx).FLOAT!=null?((FloatContext)_localctx).FLOAT.getText():null));
				         else ((FloatContext)_localctx).val =  Double.parseDouble((((FloatContext)_localctx).FLOAT!=null?((FloatContext)_localctx).FLOAT.getText():null));
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(168);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivContext(new ExprContext(_parentctx, _parentState));
						((MultDivContext)_localctx).le = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(151);
						((MultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((MultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(152);
						((MultDivContext)_localctx).re = ((MultDivContext)_localctx).expr = expr(10);

						          	    ((MultDivContext)_localctx).val =  arith(((MultDivContext)_localctx).le.val, ((MultDivContext)_localctx).re.val, ((MultDivContext)_localctx).op.getText());
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						((AddSubContext)_localctx).le = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(155);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(156);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__18) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(157);
						((AddSubContext)_localctx).re = ((AddSubContext)_localctx).expr = expr(9);

						                  ((AddSubContext)_localctx).val =  arith(((AddSubContext)_localctx).le.val, ((AddSubContext)_localctx).re.val, ((AddSubContext)_localctx).op.getText());
						}
						break;
					case 3:
						{
						_localctx = new LogicContext(new ExprContext(_parentctx, _parentState));
						((LogicContext)_localctx).le = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(160);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(161);
						((LogicContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__19 || _la==T__20) ) {
							((LogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(162);
						((LogicContext)_localctx).re = ((LogicContext)_localctx).expr = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new PowerContext(new ExprContext(_parentctx, _parentState));
						((PowerContext)_localctx).le = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(164);
						match(T__21);
						setState(165);
						((PowerContext)_localctx).re = ((PowerContext)_localctx).expr = expr(2);

						          	 ((PowerContext)_localctx).val =  arith(((PowerContext)_localctx).le.val, ((PowerContext)_localctx).re.val, "^");
						}
						break;
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			expr(0);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(174);
				match(T__4);
				setState(175);
				expr(0);
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FormalParamsContext extends ParserRuleContext {
		public List<FormalParamContext> formalParam() {
			return getRuleContexts(FormalParamContext.class);
		}
		public FormalParamContext formalParam(int i) {
			return getRuleContext(FormalParamContext.class,i);
		}
		public FormalParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterFormalParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitFormalParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitFormalParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamsContext formalParams() throws RecognitionException {
		FormalParamsContext _localctx = new FormalParamsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_formalParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			formalParam();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__4) {
				{
				{
				setState(182);
				match(T__4);
				setState(183);
				formalParam();
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FormalParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(GenshinParser.ID, 0); }
		public FormalParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParam; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).enterFormalParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GenshinListener ) ((GenshinListener)listener).exitFormalParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GenshinVisitor ) return ((GenshinVisitor<? extends T>)visitor).visitFormalParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParamContext formalParam() throws RecognitionException {
		FormalParamContext _localctx = new FormalParamContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_formalParam);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			type();
			setState(190);
			match(ID);
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001e\u00c1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0005\u0002-\b\u0002\n\u0002\f\u00020\t\u0002\u0003"+
		"\u00022\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u00037\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004=\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005"+
		"D\b\u0005\n\u0005\f\u0005G\t\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006Z\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006`\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"{\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u0081\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u008c\b\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u0091\b\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0095\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00a9\b\u0007\n\u0007"+
		"\f\u0007\u00ac\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00b1\b\b\n\b\f"+
		"\b\u00b4\t\b\u0001\t\u0001\t\u0001\t\u0005\t\u00b9\b\t\n\t\f\t\u00bc\t"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0000\u0001\u000e\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0004\u0001\u0000\u0001"+
		"\u0003\u0001\u0000\u0010\u0011\u0001\u0000\u0012\u0013\u0001\u0000\u0014"+
		"\u0015\u00d6\u0000\u001b\u0001\u0000\u0000\u0000\u0002 \u0001\u0000\u0000"+
		"\u0000\u0004\"\u0001\u0000\u0000\u0000\u00063\u0001\u0000\u0000\u0000"+
		"\b8\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000\fz\u0001\u0000"+
		"\u0000\u0000\u000e\u0094\u0001\u0000\u0000\u0000\u0010\u00ad\u0001\u0000"+
		"\u0000\u0000\u0012\u00b5\u0001\u0000\u0000\u0000\u0014\u00bd\u0001\u0000"+
		"\u0000\u0000\u0016\u001a\u0003\u0006\u0003\u0000\u0017\u001a\u0003\b\u0004"+
		"\u0000\u0018\u001a\u0003\f\u0006\u0000\u0019\u0016\u0001\u0000\u0000\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001e\u0001\u0000\u0000\u0000"+
		"\u001d\u001b\u0001\u0000\u0000\u0000\u001e\u001f\u0005\u0000\u0000\u0001"+
		"\u001f\u0001\u0001\u0000\u0000\u0000 !\u0007\u0000\u0000\u0000!\u0003"+
		"\u0001\u0000\u0000\u0000\"#\u0005\u001a\u0000\u0000#1\u0006\u0002\uffff"+
		"\uffff\u0000$%\u0005\u0004\u0000\u0000%\'\u0003\u000e\u0007\u0000&$\u0001"+
		"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000"+
		"(2\u0006\u0002\uffff\uffff\u0000)*\u0005\u0005\u0000\u0000*+\u0005\u001a"+
		"\u0000\u0000+-\u0006\u0002\uffff\uffff\u0000,)\u0001\u0000\u0000\u0000"+
		"-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000"+
		"\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00001&\u0001\u0000"+
		"\u0000\u00001.\u0001\u0000\u0000\u00002\u0005\u0001\u0000\u0000\u0000"+
		"34\u0003\u0002\u0001\u000046\u0003\u0004\u0002\u000057\u0005\u0006\u0000"+
		"\u000065\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u00007\u0007\u0001"+
		"\u0000\u0000\u000089\u0003\u0002\u0001\u00009:\u0005\u001a\u0000\u0000"+
		":<\u0005\u0007\u0000\u0000;=\u0003\u0012\t\u0000<;\u0001\u0000\u0000\u0000"+
		"<=\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0005\b\u0000\u0000"+
		"?@\u0003\n\u0005\u0000@\t\u0001\u0000\u0000\u0000AE\u0005\t\u0000\u0000"+
		"BD\u0003\f\u0006\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HI\u0005\n\u0000\u0000I\u000b\u0001\u0000"+
		"\u0000\u0000J{\u0003\n\u0005\u0000K{\u0003\u0006\u0003\u0000LM\u0003\u000e"+
		"\u0007\u0000MN\u0005\u0006\u0000\u0000NO\u0006\u0006\uffff\uffff\u0000"+
		"O{\u0001\u0000\u0000\u0000PQ\u0005\u001a\u0000\u0000QR\u0005\u0004\u0000"+
		"\u0000RS\u0003\u000e\u0007\u0000ST\u0005\u0006\u0000\u0000TU\u0006\u0006"+
		"\uffff\uffff\u0000U{\u0001\u0000\u0000\u0000VW\u0005\u000b\u0000\u0000"+
		"WY\u0005\u0007\u0000\u0000XZ\u0003\u000e\u0007\u0000YX\u0001\u0000\u0000"+
		"\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\\\u0005\b"+
		"\u0000\u0000\\_\u0003\n\u0005\u0000]^\u0005\f\u0000\u0000^`\u0003\n\u0005"+
		"\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`{\u0001\u0000"+
		"\u0000\u0000ab\u0005\r\u0000\u0000bc\u0005\u0007\u0000\u0000cd\u0003\u0006"+
		"\u0003\u0000de\u0005\u0006\u0000\u0000ef\u0003\u000e\u0007\u0000fg\u0005"+
		"\u0006\u0000\u0000gh\u0003\u000e\u0007\u0000hi\u0005\b\u0000\u0000ij\u0003"+
		"\n\u0005\u0000j{\u0001\u0000\u0000\u0000km\u0005\u000e\u0000\u0000ln\u0003"+
		"\u000e\u0007\u0000ml\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000\u0000"+
		"no\u0001\u0000\u0000\u0000o{\u0005\u0006\u0000\u0000pq\u0005\u000f\u0000"+
		"\u0000qr\u0005\u0007\u0000\u0000rs\u0005\u0018\u0000\u0000st\u0005\b\u0000"+
		"\u0000tu\u0005\t\u0000\u0000uv\u0003\u000e\u0007\u0000vw\u0005\u0006\u0000"+
		"\u0000wx\u0005\n\u0000\u0000xy\u0006\u0006\uffff\uffff\u0000y{\u0001\u0000"+
		"\u0000\u0000zJ\u0001\u0000\u0000\u0000zK\u0001\u0000\u0000\u0000zL\u0001"+
		"\u0000\u0000\u0000zP\u0001\u0000\u0000\u0000zV\u0001\u0000\u0000\u0000"+
		"za\u0001\u0000\u0000\u0000zk\u0001\u0000\u0000\u0000zp\u0001\u0000\u0000"+
		"\u0000{\r\u0001\u0000\u0000\u0000|}\u0006\u0007\uffff\uffff\u0000}~\u0005"+
		"\u001a\u0000\u0000~\u0080\u0005\u0007\u0000\u0000\u007f\u0081\u0003\u0010"+
		"\b\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0095\u0005\b\u0000\u0000"+
		"\u0083\u0084\u0005\u0007\u0000\u0000\u0084\u0085\u0003\u000e\u0007\u0000"+
		"\u0085\u0086\u0005\b\u0000\u0000\u0086\u0087\u0006\u0007\uffff\uffff\u0000"+
		"\u0087\u0095\u0001\u0000\u0000\u0000\u0088\u0095\u0005\u001a\u0000\u0000"+
		"\u0089\u0095\u0005\u0017\u0000\u0000\u008a\u008c\u0005\u0013\u0000\u0000"+
		"\u008b\u008a\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000\u0000"+
		"\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u008e\u0005\u0018\u0000\u0000"+
		"\u008e\u0095\u0006\u0007\uffff\uffff\u0000\u008f\u0091\u0005\u0013\u0000"+
		"\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0019\u0000"+
		"\u0000\u0093\u0095\u0006\u0007\uffff\uffff\u0000\u0094|\u0001\u0000\u0000"+
		"\u0000\u0094\u0083\u0001\u0000\u0000\u0000\u0094\u0088\u0001\u0000\u0000"+
		"\u0000\u0094\u0089\u0001\u0000\u0000\u0000\u0094\u008b\u0001\u0000\u0000"+
		"\u0000\u0094\u0090\u0001\u0000\u0000\u0000\u0095\u00aa\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\n\t\u0000\u0000\u0097\u0098\u0007\u0001\u0000\u0000"+
		"\u0098\u0099\u0003\u000e\u0007\n\u0099\u009a\u0006\u0007\uffff\uffff\u0000"+
		"\u009a\u00a9\u0001\u0000\u0000\u0000\u009b\u009c\n\b\u0000\u0000\u009c"+
		"\u009d\u0007\u0002\u0000\u0000\u009d\u009e\u0003\u000e\u0007\t\u009e\u009f"+
		"\u0006\u0007\uffff\uffff\u0000\u009f\u00a9\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a1\n\u0007\u0000\u0000\u00a1\u00a2\u0007\u0003\u0000\u0000\u00a2\u00a9"+
		"\u0003\u000e\u0007\b\u00a3\u00a4\n\u0001\u0000\u0000\u00a4\u00a5\u0005"+
		"\u0016\u0000\u0000\u00a5\u00a6\u0003\u000e\u0007\u0002\u00a6\u00a7\u0006"+
		"\u0007\uffff\uffff\u0000\u00a7\u00a9\u0001\u0000\u0000\u0000\u00a8\u0096"+
		"\u0001\u0000\u0000\u0000\u00a8\u009b\u0001\u0000\u0000\u0000\u00a8\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a9\u00ac"+
		"\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ab\u000f\u0001\u0000\u0000\u0000\u00ac\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ad\u00b2\u0003\u000e\u0007\u0000\u00ae\u00af"+
		"\u0005\u0005\u0000\u0000\u00af\u00b1\u0003\u000e\u0007\u0000\u00b0\u00ae"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u0011"+
		"\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00ba"+
		"\u0003\u0014\n\u0000\u00b6\u00b7\u0005\u0005\u0000\u0000\u00b7\u00b9\u0003"+
		"\u0014\n\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000"+
		"\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u0013\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000"+
		"\u0000\u0000\u00bd\u00be\u0003\u0002\u0001\u0000\u00be\u00bf\u0005\u001a"+
		"\u0000\u0000\u00bf\u0015\u0001\u0000\u0000\u0000\u0014\u0019\u001b&.1"+
		"6<EY_mz\u0080\u008b\u0090\u0094\u00a8\u00aa\u00b2\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}