// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\ValidateForm.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.validateform;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValidateFormParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VALIDATE_FORM=1, MANDATORY_LABEL=2, REGEX_LABEL=3, ASSERT_LABEL=4, GET_ATTRIBUTE_LABEL=5, 
		HELPDESK=6, IF_LABEL=7, ELSE=8, NUM=9, LOWERCASE=10, UPPERCASE=11, PLUS=12, 
		HYPHEN=13, TIMES=14, BLOCK_START=15, BLOCK_END=16, STMT_START=17, STMT_END=18, 
		AT=19, DOT=20, EQUAL=21, PERC=22, DOLLAR=23, FOWARD_SLASH=24, COMP_EQUAL=25, 
		DIFF=26, BIGGER=27, LESSER=28, BE=29, LE=30, AND=31, OR=32, COLON=33, 
		COMMA=34, HASHTAG=35, UNDERSCORE=36, PARENTHESIS_OPEN=37, PARENTHESIS_CLOSE=38, 
		QUOTATION_MARKS=39, END=40, WS=41;
	public static final int
		RULE_start = 0, RULE_statements = 1, RULE_header = 2, RULE_type = 3, RULE_statement = 4, 
		RULE_mandatory = 5, RULE_regex = 6, RULE_assert_func = 7, RULE_get_attribute = 8, 
		RULE_nums = 9, RULE_if_func = 10, RULE_conditions = 11, RULE_condition = 12, 
		RULE_comp = 13, RULE_conjunction = 14, RULE_assign = 15, RULE_variable = 16, 
		RULE_op = 17, RULE_object = 18, RULE_sign_td = 19, RULE_sign_pm = 20, 
		RULE_num = 21, RULE_var_label = 22, RULE_alphanumeric = 23, RULE_alpha = 24, 
		RULE_string = 25, RULE_character = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statements", "header", "type", "statement", "mandatory", "regex", 
			"assert_func", "get_attribute", "nums", "if_func", "conditions", "condition", 
			"comp", "conjunction", "assign", "variable", "op", "object", "sign_td", 
			"sign_pm", "num", "var_label", "alphanumeric", "alpha", "string", "character"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'validateForm'", "'mandatory'", "'regex'", "'assert'", "'getAttribute'", 
			"'helpdesk'", "'if'", "'else'", null, null, null, "'+'", "'-'", "'*'", 
			"'{'", "'}'", "'('", "')'", "'@'", "'.'", "'='", "'%'", "'$'", "'/'", 
			"'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "':'", 
			"','", "'#'", "'_'", "'['", "']'", "'\"'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VALIDATE_FORM", "MANDATORY_LABEL", "REGEX_LABEL", "ASSERT_LABEL", 
			"GET_ATTRIBUTE_LABEL", "HELPDESK", "IF_LABEL", "ELSE", "NUM", "LOWERCASE", 
			"UPPERCASE", "PLUS", "HYPHEN", "TIMES", "BLOCK_START", "BLOCK_END", "STMT_START", 
			"STMT_END", "AT", "DOT", "EQUAL", "PERC", "DOLLAR", "FOWARD_SLASH", "COMP_EQUAL", 
			"DIFF", "BIGGER", "LESSER", "BE", "LE", "AND", "OR", "COLON", "COMMA", 
			"HASHTAG", "UNDERSCORE", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "QUOTATION_MARKS", 
			"END", "WS"
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
	public String getGrammarFileName() { return "ValidateForm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ValidateFormParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode BLOCK_START() { return getToken(ValidateFormParser.BLOCK_START, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(ValidateFormParser.BLOCK_END, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			header();
			setState(55);
			type();
			setState(56);
			match(BLOCK_START);
			setState(57);
			statements();
			setState(58);
			match(BLOCK_END);
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

	public static class StatementsContext extends ParserRuleContext {
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	 
		public StatementsContext() { }
		public void copyFrom(StatementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecStatementsContext extends StatementsContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExecStatementsContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			int _alt;
			_localctx = new ExecStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(60);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(63); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
		public TerminalNode HELPDESK() { return getToken(ValidateFormParser.HELPDESK, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(HASHTAG);
			setState(66);
			match(HELPDESK);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VALIDATE_FORM() { return getToken(ValidateFormParser.VALIDATE_FORM, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(VALIDATE_FORM);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtAssertContext extends StatementContext {
		public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
		public Assert_funcContext assert_func() {
			return getRuleContext(Assert_funcContext.class,0);
		}
		public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
		public StmtAssertContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterStmtAssert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitStmtAssert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitStmtAssert(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtIfContext extends StatementContext {
		public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
		public If_funcContext if_func() {
			return getRuleContext(If_funcContext.class,0);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtMandatoryContext extends StatementContext {
		public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
		public MandatoryContext mandatory() {
			return getRuleContext(MandatoryContext.class,0);
		}
		public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
		public StmtMandatoryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterStmtMandatory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitStmtMandatory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitStmtMandatory(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAttributeContext extends StatementContext {
		public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
		public Get_attributeContext get_attribute() {
			return getRuleContext(Get_attributeContext.class,0);
		}
		public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
		public StmtAttributeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterStmtAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitStmtAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitStmtAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtRegexContext extends StatementContext {
		public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
		public RegexContext regex() {
			return getRuleContext(RegexContext.class,0);
		}
		public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
		public StmtRegexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterStmtRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitStmtRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitStmtRegex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAssignContext extends StatementContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
		public StmtAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterStmtAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitStmtAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitStmtAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new StmtMandatoryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				match(HASHTAG);
				setState(71);
				mandatory();
				setState(72);
				match(END);
				}
				break;
			case 2:
				_localctx = new StmtRegexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				match(HASHTAG);
				setState(75);
				regex();
				setState(76);
				match(END);
				}
				break;
			case 3:
				_localctx = new StmtAssertContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				match(HASHTAG);
				setState(79);
				assert_func();
				setState(80);
				match(END);
				}
				break;
			case 4:
				_localctx = new StmtAttributeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				match(HASHTAG);
				setState(83);
				get_attribute();
				setState(84);
				match(END);
				}
				break;
			case 5:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(86);
				match(HASHTAG);
				setState(87);
				if_func();
				}
				break;
			case 6:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				assign();
				setState(89);
				match(END);
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

	public static class MandatoryContext extends ParserRuleContext {
		public MandatoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mandatory; }
	 
		public MandatoryContext() { }
		public void copyFrom(MandatoryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecMandatoryContext extends MandatoryContext {
		public NumsContext agr;
		public TerminalNode MANDATORY_LABEL() { return getToken(ValidateFormParser.MANDATORY_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
		public NumsContext nums() {
			return getRuleContext(NumsContext.class,0);
		}
		public ExecMandatoryContext(MandatoryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecMandatory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecMandatory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecMandatory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MandatoryContext mandatory() throws RecognitionException {
		MandatoryContext _localctx = new MandatoryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mandatory);
		try {
			_localctx = new ExecMandatoryContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(MANDATORY_LABEL);
			setState(94);
			match(STMT_START);
			setState(95);
			((ExecMandatoryContext)_localctx).agr = nums();
			setState(96);
			match(STMT_END);
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

	public static class RegexContext extends ParserRuleContext {
		public RegexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regex; }
	 
		public RegexContext() { }
		public void copyFrom(RegexContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecRegexContext extends RegexContext {
		public Token agr;
		public StringContext re;
		public TerminalNode REGEX_LABEL() { return getToken(ValidateFormParser.REGEX_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
		public TerminalNode COMMA() { return getToken(ValidateFormParser.COMMA, 0); }
		public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<TerminalNode> NUM() { return getTokens(ValidateFormParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ValidateFormParser.NUM, i);
		}
		public ExecRegexContext(RegexContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecRegex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecRegex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecRegex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexContext regex() throws RecognitionException {
		RegexContext _localctx = new RegexContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_regex);
		int _la;
		try {
			_localctx = new ExecRegexContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(REGEX_LABEL);
			setState(99);
			match(STMT_START);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				((ExecRegexContext)_localctx).agr = match(NUM);
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM );
			setState(105);
			match(COMMA);
			setState(106);
			((ExecRegexContext)_localctx).re = string();
			setState(107);
			match(STMT_END);
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

	public static class Assert_funcContext extends ParserRuleContext {
		public Assert_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assert_func; }
	 
		public Assert_funcContext() { }
		public void copyFrom(Assert_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecAssertContext extends Assert_funcContext {
		public ConditionsContext cond;
		public TerminalNode ASSERT_LABEL() { return getToken(ValidateFormParser.ASSERT_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ExecAssertContext(Assert_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecAssert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecAssert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecAssert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Assert_funcContext assert_func() throws RecognitionException {
		Assert_funcContext _localctx = new Assert_funcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assert_func);
		try {
			_localctx = new ExecAssertContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ASSERT_LABEL);
			setState(110);
			match(STMT_START);
			setState(111);
			((ExecAssertContext)_localctx).cond = conditions();
			setState(112);
			match(STMT_END);
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

	public static class Get_attributeContext extends ParserRuleContext {
		public Get_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_attribute; }
	 
		public Get_attributeContext() { }
		public void copyFrom(Get_attributeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecGetAttributeContext extends Get_attributeContext {
		public Token attribute;
		public TerminalNode GET_ATTRIBUTE_LABEL() { return getToken(ValidateFormParser.GET_ATTRIBUTE_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
		public List<TerminalNode> NUM() { return getTokens(ValidateFormParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ValidateFormParser.NUM, i);
		}
		public ExecGetAttributeContext(Get_attributeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecGetAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecGetAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecGetAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_attributeContext get_attribute() throws RecognitionException {
		Get_attributeContext _localctx = new Get_attributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_get_attribute);
		int _la;
		try {
			_localctx = new ExecGetAttributeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(GET_ATTRIBUTE_LABEL);
			setState(115);
			match(STMT_START);
			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				((ExecGetAttributeContext)_localctx).attribute = match(NUM);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NUM );
			setState(121);
			match(STMT_END);
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

	public static class NumsContext extends ParserRuleContext {
		public NumsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nums; }
	 
		public NumsContext() { }
		public void copyFrom(NumsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecMultipleNumbersContext extends NumsContext {
		public Token number;
		public NumsContext multipleNumbers;
		public TerminalNode COMMA() { return getToken(ValidateFormParser.COMMA, 0); }
		public NumsContext nums() {
			return getRuleContext(NumsContext.class,0);
		}
		public List<TerminalNode> NUM() { return getTokens(ValidateFormParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ValidateFormParser.NUM, i);
		}
		public ExecMultipleNumbersContext(NumsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecMultipleNumbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecMultipleNumbers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecMultipleNumbers(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecNumContext extends NumsContext {
		public Token number;
		public List<TerminalNode> NUM() { return getTokens(ValidateFormParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ValidateFormParser.NUM, i);
		}
		public ExecNumContext(NumsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumsContext nums() throws RecognitionException {
		NumsContext _localctx = new NumsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_nums);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ExecMultipleNumbersContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(124); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(123);
					((ExecMultipleNumbersContext)_localctx).number = match(NUM);
					}
					}
					setState(126); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				setState(128);
				match(COMMA);
				setState(129);
				((ExecMultipleNumbersContext)_localctx).multipleNumbers = nums();
				}
				break;
			case 2:
				_localctx = new ExecNumContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					((ExecNumContext)_localctx).number = match(NUM);
					}
					}
					setState(133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
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

	public static class If_funcContext extends ParserRuleContext {
		public If_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_func; }
	 
		public If_funcContext() { }
		public void copyFrom(If_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OnlyIfContext extends If_funcContext {
		public ConditionsContext if_cond;
		public StatementsContext stmt_if;
		public TerminalNode IF_LABEL() { return getToken(ValidateFormParser.IF_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
		public TerminalNode BLOCK_START() { return getToken(ValidateFormParser.BLOCK_START, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public OnlyIfContext(If_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterOnlyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitOnlyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitOnlyIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseContext extends If_funcContext {
		public ConditionsContext if_cond;
		public StatementsContext stmt_if;
		public StatementsContext stmt_else;
		public TerminalNode IF_LABEL() { return getToken(ValidateFormParser.IF_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
		public List<TerminalNode> BLOCK_START() { return getTokens(ValidateFormParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(ValidateFormParser.BLOCK_START, i);
		}
		public List<TerminalNode> BLOCK_END() { return getTokens(ValidateFormParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(ValidateFormParser.BLOCK_END, i);
		}
		public TerminalNode ELSE() { return getToken(ValidateFormParser.ELSE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfElseContext(If_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_funcContext if_func() throws RecognitionException {
		If_funcContext _localctx = new If_funcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_if_func);
		try {
			setState(156);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new OnlyIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(IF_LABEL);
				setState(138);
				match(STMT_START);
				setState(139);
				((OnlyIfContext)_localctx).if_cond = conditions();
				setState(140);
				match(STMT_END);
				setState(141);
				match(BLOCK_START);
				setState(142);
				((OnlyIfContext)_localctx).stmt_if = statements();
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(IF_LABEL);
				setState(145);
				match(STMT_START);
				setState(146);
				((IfElseContext)_localctx).if_cond = conditions();
				setState(147);
				match(STMT_END);
				setState(148);
				match(BLOCK_START);
				setState(149);
				((IfElseContext)_localctx).stmt_if = statements();
				setState(150);
				match(BLOCK_END);
				setState(151);
				match(ELSE);
				setState(152);
				match(BLOCK_START);
				setState(153);
				((IfElseContext)_localctx).stmt_else = statements();
				setState(154);
				match(BLOCK_END);
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

	public static class ConditionsContext extends ParserRuleContext {
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
	 
		public ConditionsContext() { }
		public void copyFrom(ConditionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleConditionsContext extends ConditionsContext {
		public ConditionContext right;
		public ConjunctionContext conjSign;
		public ConditionsContext left;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public MultipleConditionsContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterMultipleConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitMultipleConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitMultipleConditions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleConditionsContext extends ConditionsContext {
		public ConditionContext cond;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public SingleConditionsContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterSingleConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitSingleConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitSingleConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditions);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new MultipleConditionsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(158);
				((MultipleConditionsContext)_localctx).right = condition();
				setState(159);
				((MultipleConditionsContext)_localctx).conjSign = conjunction();
				setState(160);
				((MultipleConditionsContext)_localctx).left = conditions();
				}
				break;
			case 2:
				_localctx = new SingleConditionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				((SingleConditionsContext)_localctx).cond = condition();
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CondContext extends ConditionContext {
		public ObjectContext left;
		public CompContext compSign;
		public ObjectContext right;
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CondContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_condition);
		try {
			_localctx = new CondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			((CondContext)_localctx).left = object();
			setState(166);
			((CondContext)_localctx).compSign = comp();
			setState(167);
			((CondContext)_localctx).right = object();
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

	public static class CompContext extends ParserRuleContext {
		public TerminalNode COMP_EQUAL() { return getToken(ValidateFormParser.COMP_EQUAL, 0); }
		public TerminalNode DIFF() { return getToken(ValidateFormParser.DIFF, 0); }
		public TerminalNode BIGGER() { return getToken(ValidateFormParser.BIGGER, 0); }
		public TerminalNode LESSER() { return getToken(ValidateFormParser.LESSER, 0); }
		public TerminalNode BE() { return getToken(ValidateFormParser.BE, 0); }
		public TerminalNode LE() { return getToken(ValidateFormParser.LE, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COMP_EQUAL) | (1L << DIFF) | (1L << BIGGER) | (1L << LESSER) | (1L << BE) | (1L << LE))) != 0)) ) {
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

	public static class ConjunctionContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ValidateFormParser.AND, 0); }
		public TerminalNode OR() { return getToken(ValidateFormParser.OR, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	 
		public AssignContext() { }
		public void copyFrom(AssignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecAssignContext extends AssignContext {
		public VariableContext var;
		public OpContext res;
		public TerminalNode EQUAL() { return getToken(ValidateFormParser.EQUAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExecAssignContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_assign);
		try {
			_localctx = new ExecAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			((ExecAssignContext)_localctx).var = variable();
			setState(174);
			match(EQUAL);
			setState(175);
			((ExecAssignContext)_localctx).res = op(0);
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

	public static class VariableContext extends ParserRuleContext {
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
	 
		public VariableContext() { }
		public void copyFrom(VariableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecVarContext extends VariableContext {
		public Var_labelContext label;
		public TerminalNode DOLLAR() { return getToken(ValidateFormParser.DOLLAR, 0); }
		public Var_labelContext var_label() {
			return getRuleContext(Var_labelContext.class,0);
		}
		public ExecVarContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_variable);
		try {
			_localctx = new ExecVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(DOLLAR);
			setState(178);
			((ExecVarContext)_localctx).label = var_label();
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

	public static class OpContext extends ParserRuleContext {
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
	 
		public OpContext() { }
		public void copyFrom(OpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecOpTimesDivisionContext extends OpContext {
		public OpContext left;
		public Sign_tdContext sign;
		public OpContext right;
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public Sign_tdContext sign_td() {
			return getRuleContext(Sign_tdContext.class,0);
		}
		public ExecOpTimesDivisionContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecOpTimesDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecOpTimesDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecOpTimesDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecOpParenthesisContext extends OpContext {
		public OpContext result;
		public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExecOpParenthesisContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecOpParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecOpParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecOpParenthesis(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecOpPlusMinusContext extends OpContext {
		public OpContext left;
		public Sign_pmContext sign;
		public OpContext right;
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public Sign_pmContext sign_pm() {
			return getRuleContext(Sign_pmContext.class,0);
		}
		public ExecOpPlusMinusContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecOpPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecOpPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecOpPlusMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecOpAtomContext extends OpContext {
		public ObjectContext atom;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ExecOpAtomContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecOpAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecOpAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecOpAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		return op(0);
	}

	private OpContext op(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		OpContext _localctx = new OpContext(_ctx, _parentState);
		OpContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_op, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case DOLLAR:
			case HASHTAG:
				{
				_localctx = new ExecOpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(181);
				((ExecOpAtomContext)_localctx).atom = object();
				}
				break;
			case STMT_START:
				{
				_localctx = new ExecOpParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(182);
				match(STMT_START);
				setState(183);
				((ExecOpParenthesisContext)_localctx).result = op(0);
				setState(184);
				match(STMT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExecOpTimesDivisionContext(new OpContext(_parentctx, _parentState));
						((ExecOpTimesDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_op);
						setState(188);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(189);
						((ExecOpTimesDivisionContext)_localctx).sign = sign_td();
						setState(190);
						((ExecOpTimesDivisionContext)_localctx).right = op(5);
						}
						break;
					case 2:
						{
						_localctx = new ExecOpPlusMinusContext(new OpContext(_parentctx, _parentState));
						((ExecOpPlusMinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_op);
						setState(192);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(193);
						((ExecOpPlusMinusContext)_localctx).sign = sign_pm();
						setState(194);
						((ExecOpPlusMinusContext)_localctx).right = op(4);
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class ObjectContext extends ParserRuleContext {
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
	 
		public ObjectContext() { }
		public void copyFrom(ObjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjectNumberContext extends ObjectContext {
		public NumContext objNumber;
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public ObjectNumberContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterObjectNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitObjectNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitObjectNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectAttributeContext extends ObjectContext {
		public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
		public Get_attributeContext get_attribute() {
			return getRuleContext(Get_attributeContext.class,0);
		}
		public ObjectAttributeContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterObjectAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitObjectAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitObjectAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectVariableContext extends ObjectContext {
		public VariableContext var;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ObjectVariableContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterObjectVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitObjectVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitObjectVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_object);
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				_localctx = new ObjectVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((ObjectVariableContext)_localctx).var = variable();
				}
				break;
			case NUM:
				_localctx = new ObjectNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				((ObjectNumberContext)_localctx).objNumber = num();
				}
				break;
			case HASHTAG:
				_localctx = new ObjectAttributeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(HASHTAG);
				setState(204);
				get_attribute();
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

	public static class Sign_tdContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(ValidateFormParser.TIMES, 0); }
		public TerminalNode FOWARD_SLASH() { return getToken(ValidateFormParser.FOWARD_SLASH, 0); }
		public Sign_tdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign_td; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterSign_td(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitSign_td(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitSign_td(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sign_tdContext sign_td() throws RecognitionException {
		Sign_tdContext _localctx = new Sign_tdContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sign_td);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==FOWARD_SLASH) ) {
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

	public static class Sign_pmContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(ValidateFormParser.PLUS, 0); }
		public TerminalNode HYPHEN() { return getToken(ValidateFormParser.HYPHEN, 0); }
		public Sign_pmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign_pm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterSign_pm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitSign_pm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitSign_pm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sign_pmContext sign_pm() throws RecognitionException {
		Sign_pmContext _localctx = new Sign_pmContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sign_pm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==HYPHEN) ) {
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

	public static class NumContext extends ParserRuleContext {
		public List<TerminalNode> NUM() { return getTokens(ValidateFormParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ValidateFormParser.NUM, i);
		}
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_num);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(211);
					match(NUM);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(214); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class Var_labelContext extends ParserRuleContext {
		public TerminalNode LOWERCASE() { return getToken(ValidateFormParser.LOWERCASE, 0); }
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public Var_labelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_label; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterVar_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitVar_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitVar_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_labelContext var_label() throws RecognitionException {
		Var_labelContext _localctx = new Var_labelContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_var_label);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(LOWERCASE);
			setState(220);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					alphanumeric();
					}
					} 
				}
				setState(222);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class AlphanumericContext extends ParserRuleContext {
		public TerminalNode LOWERCASE() { return getToken(ValidateFormParser.LOWERCASE, 0); }
		public TerminalNode UPPERCASE() { return getToken(ValidateFormParser.UPPERCASE, 0); }
		public TerminalNode NUM() { return getToken(ValidateFormParser.NUM, 0); }
		public AlphanumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterAlphanumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitAlphanumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitAlphanumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphanumericContext alphanumeric() throws RecognitionException {
		AlphanumericContext _localctx = new AlphanumericContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_alphanumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) ) {
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

	public static class AlphaContext extends ParserRuleContext {
		public TerminalNode LOWERCASE() { return getToken(ValidateFormParser.LOWERCASE, 0); }
		public TerminalNode UPPERCASE() { return getToken(ValidateFormParser.UPPERCASE, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitAlpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==LOWERCASE || _la==UPPERCASE) ) {
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

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecStringContext extends StringContext {
		public CharacterContext str;
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(ValidateFormParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(ValidateFormParser.QUOTATION_MARKS, i);
		}
		public List<CharacterContext> character() {
			return getRuleContexts(CharacterContext.class);
		}
		public CharacterContext character(int i) {
			return getRuleContext(CharacterContext.class,i);
		}
		public ExecStringContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_string);
		int _la;
		try {
			_localctx = new ExecStringContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(QUOTATION_MARKS);
			setState(229); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(228);
				((ExecStringContext)_localctx).str = character();
				}
				}
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << HYPHEN) | (1L << PARENTHESIS_OPEN) | (1L << PARENTHESIS_CLOSE))) != 0) );
			setState(233);
			match(QUOTATION_MARKS);
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

	public static class CharacterContext extends ParserRuleContext {
		public TerminalNode LOWERCASE() { return getToken(ValidateFormParser.LOWERCASE, 0); }
		public TerminalNode UPPERCASE() { return getToken(ValidateFormParser.UPPERCASE, 0); }
		public TerminalNode PARENTHESIS_OPEN() { return getToken(ValidateFormParser.PARENTHESIS_OPEN, 0); }
		public TerminalNode PARENTHESIS_CLOSE() { return getToken(ValidateFormParser.PARENTHESIS_CLOSE, 0); }
		public TerminalNode HYPHEN() { return getToken(ValidateFormParser.HYPHEN, 0); }
		public TerminalNode NUM() { return getToken(ValidateFormParser.NUM, 0); }
		public CharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_character; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitCharacter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitCharacter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterContext character() throws RecognitionException {
		CharacterContext _localctx = new CharacterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_character);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << HYPHEN) | (1L << PARENTHESIS_OPEN) | (1L << PARENTHESIS_CLOSE))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 17:
			return op_sempred((OpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean op_sempred(OpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00f0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3@\n\3\r"+
		"\3\16\3A\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6^\n\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\b\3\b\3\b\6\bh\n\b\r\b\16\bi\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\6\nx\n\n\r\n\16\ny\3\n\3\n\3\13\6\13\177\n\13\r\13\16\13"+
		"\u0080\3\13\3\13\3\13\6\13\u0086\n\13\r\13\16\13\u0087\5\13\u008a\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\5\f\u009f\n\f\3\r\3\r\3\r\3\r\3\r\5\r\u00a6\n\r\3\16\3\16\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00bd\n\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\7\23\u00c7\n\23\f\23\16\23\u00ca\13\23\3\24\3\24\3\24\3\24\5\24"+
		"\u00d0\n\24\3\25\3\25\3\26\3\26\3\27\6\27\u00d7\n\27\r\27\16\27\u00d8"+
		"\3\30\3\30\7\30\u00dd\n\30\f\30\16\30\u00e0\13\30\3\31\3\31\3\32\3\32"+
		"\3\33\3\33\6\33\u00e8\n\33\r\33\16\33\u00e9\3\33\3\33\3\34\3\34\3\34\2"+
		"\3$\35\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\t"+
		"\3\2\33 \3\2!\"\4\2\20\20\32\32\3\2\16\17\3\2\13\r\3\2\f\r\5\2\13\r\17"+
		"\17\'(\2\u00e9\28\3\2\2\2\4?\3\2\2\2\6C\3\2\2\2\bF\3\2\2\2\n]\3\2\2\2"+
		"\f_\3\2\2\2\16d\3\2\2\2\20o\3\2\2\2\22t\3\2\2\2\24\u0089\3\2\2\2\26\u009e"+
		"\3\2\2\2\30\u00a5\3\2\2\2\32\u00a7\3\2\2\2\34\u00ab\3\2\2\2\36\u00ad\3"+
		"\2\2\2 \u00af\3\2\2\2\"\u00b3\3\2\2\2$\u00bc\3\2\2\2&\u00cf\3\2\2\2(\u00d1"+
		"\3\2\2\2*\u00d3\3\2\2\2,\u00d6\3\2\2\2.\u00da\3\2\2\2\60\u00e1\3\2\2\2"+
		"\62\u00e3\3\2\2\2\64\u00e5\3\2\2\2\66\u00ed\3\2\2\289\5\6\4\29:\5\b\5"+
		"\2:;\7\21\2\2;<\5\4\3\2<=\7\22\2\2=\3\3\2\2\2>@\5\n\6\2?>\3\2\2\2@A\3"+
		"\2\2\2A?\3\2\2\2AB\3\2\2\2B\5\3\2\2\2CD\7%\2\2DE\7\b\2\2E\7\3\2\2\2FG"+
		"\7\3\2\2G\t\3\2\2\2HI\7%\2\2IJ\5\f\7\2JK\7*\2\2K^\3\2\2\2LM\7%\2\2MN\5"+
		"\16\b\2NO\7*\2\2O^\3\2\2\2PQ\7%\2\2QR\5\20\t\2RS\7*\2\2S^\3\2\2\2TU\7"+
		"%\2\2UV\5\22\n\2VW\7*\2\2W^\3\2\2\2XY\7%\2\2Y^\5\26\f\2Z[\5 \21\2[\\\7"+
		"*\2\2\\^\3\2\2\2]H\3\2\2\2]L\3\2\2\2]P\3\2\2\2]T\3\2\2\2]X\3\2\2\2]Z\3"+
		"\2\2\2^\13\3\2\2\2_`\7\4\2\2`a\7\23\2\2ab\5\24\13\2bc\7\24\2\2c\r\3\2"+
		"\2\2de\7\5\2\2eg\7\23\2\2fh\7\13\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2jk\3\2\2\2kl\7$\2\2lm\5\64\33\2mn\7\24\2\2n\17\3\2\2\2op\7\6\2\2"+
		"pq\7\23\2\2qr\5\30\r\2rs\7\24\2\2s\21\3\2\2\2tu\7\7\2\2uw\7\23\2\2vx\7"+
		"\13\2\2wv\3\2\2\2xy\3\2\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2{|\7\24\2\2|"+
		"\23\3\2\2\2}\177\7\13\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080"+
		"\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\7$\2\2\u0083\u008a\5\24"+
		"\13\2\u0084\u0086\7\13\2\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089~\3\2\2\2"+
		"\u0089\u0085\3\2\2\2\u008a\25\3\2\2\2\u008b\u008c\7\t\2\2\u008c\u008d"+
		"\7\23\2\2\u008d\u008e\5\30\r\2\u008e\u008f\7\24\2\2\u008f\u0090\7\21\2"+
		"\2\u0090\u0091\5\4\3\2\u0091\u009f\3\2\2\2\u0092\u0093\7\t\2\2\u0093\u0094"+
		"\7\23\2\2\u0094\u0095\5\30\r\2\u0095\u0096\7\24\2\2\u0096\u0097\7\21\2"+
		"\2\u0097\u0098\5\4\3\2\u0098\u0099\7\22\2\2\u0099\u009a\7\n\2\2\u009a"+
		"\u009b\7\21\2\2\u009b\u009c\5\4\3\2\u009c\u009d\7\22\2\2\u009d\u009f\3"+
		"\2\2\2\u009e\u008b\3\2\2\2\u009e\u0092\3\2\2\2\u009f\27\3\2\2\2\u00a0"+
		"\u00a1\5\32\16\2\u00a1\u00a2\5\36\20\2\u00a2\u00a3\5\30\r\2\u00a3\u00a6"+
		"\3\2\2\2\u00a4\u00a6\5\32\16\2\u00a5\u00a0\3\2\2\2\u00a5\u00a4\3\2\2\2"+
		"\u00a6\31\3\2\2\2\u00a7\u00a8\5&\24\2\u00a8\u00a9\5\34\17\2\u00a9\u00aa"+
		"\5&\24\2\u00aa\33\3\2\2\2\u00ab\u00ac\t\2\2\2\u00ac\35\3\2\2\2\u00ad\u00ae"+
		"\t\3\2\2\u00ae\37\3\2\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\7\27\2\2\u00b1"+
		"\u00b2\5$\23\2\u00b2!\3\2\2\2\u00b3\u00b4\7\31\2\2\u00b4\u00b5\5.\30\2"+
		"\u00b5#\3\2\2\2\u00b6\u00b7\b\23\1\2\u00b7\u00bd\5&\24\2\u00b8\u00b9\7"+
		"\23\2\2\u00b9\u00ba\5$\23\2\u00ba\u00bb\7\24\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00b6\3\2\2\2\u00bc\u00b8\3\2\2\2\u00bd\u00c8\3\2\2\2\u00be\u00bf\f\6"+
		"\2\2\u00bf\u00c0\5(\25\2\u00c0\u00c1\5$\23\7\u00c1\u00c7\3\2\2\2\u00c2"+
		"\u00c3\f\5\2\2\u00c3\u00c4\5*\26\2\u00c4\u00c5\5$\23\6\u00c5\u00c7\3\2"+
		"\2\2\u00c6\u00be\3\2\2\2\u00c6\u00c2\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9%\3\2\2\2\u00ca\u00c8\3\2\2\2"+
		"\u00cb\u00d0\5\"\22\2\u00cc\u00d0\5,\27\2\u00cd\u00ce\7%\2\2\u00ce\u00d0"+
		"\5\22\n\2\u00cf\u00cb\3\2\2\2\u00cf\u00cc\3\2\2\2\u00cf\u00cd\3\2\2\2"+
		"\u00d0\'\3\2\2\2\u00d1\u00d2\t\4\2\2\u00d2)\3\2\2\2\u00d3\u00d4\t\5\2"+
		"\2\u00d4+\3\2\2\2\u00d5\u00d7\7\13\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9-\3\2\2\2\u00da"+
		"\u00de\7\f\2\2\u00db\u00dd\5\60\31\2\u00dc\u00db\3\2\2\2\u00dd\u00e0\3"+
		"\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df/\3\2\2\2\u00e0\u00de"+
		"\3\2\2\2\u00e1\u00e2\t\6\2\2\u00e2\61\3\2\2\2\u00e3\u00e4\t\7\2\2\u00e4"+
		"\63\3\2\2\2\u00e5\u00e7\7)\2\2\u00e6\u00e8\5\66\34\2\u00e7\u00e6\3\2\2"+
		"\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb"+
		"\3\2\2\2\u00eb\u00ec\7)\2\2\u00ec\65\3\2\2\2\u00ed\u00ee\t\b\2\2\u00ee"+
		"\67\3\2\2\2\22A]iy\u0080\u0087\u0089\u009e\u00a5\u00bc\u00c6\u00c8\u00cf"+
		"\u00d8\u00de\u00e9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}