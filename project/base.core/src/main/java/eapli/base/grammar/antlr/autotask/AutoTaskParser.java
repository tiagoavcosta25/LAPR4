// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\AutoTask.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.autotask;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutoTaskParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTO_TASK=1, FILE_SEARCH_LABEL=2, SEND_EMAIL_LABEL=3, HELPDESK=4, IF_LABEL=5, 
		ELSE=6, XML=7, NUM=8, LOWERCASE=9, UPPERCASE=10, PLUS=11, HYPHEN=12, TIMES=13, 
		BLOCK_START=14, BLOCK_END=15, STMT_START=16, STMT_END=17, AT=18, DOT=19, 
		EQUAL=20, PERC=21, DOLLAR=22, FOWARD_SLASH=23, COMP_EQUAL=24, DIFF=25, 
		BIGGER=26, LESSER=27, BE=28, LE=29, AND=30, OR=31, COLON=32, COMMA=33, 
		HASHTAG=34, UNDERSCORE=35, QUOTATION_MARKS=36, END=37, WS=38;
	public static final int
		RULE_start = 0, RULE_statements = 1, RULE_statement = 2, RULE_header = 3, 
		RULE_type = 4, RULE_function = 5, RULE_sendEmail = 6, RULE_fileSearch = 7, 
		RULE_if_func = 8, RULE_conditions = 9, RULE_condition = 10, RULE_comp = 11, 
		RULE_conjunction = 12, RULE_assign = 13, RULE_variable = 14, RULE_op = 15, 
		RULE_object = 16, RULE_sign = 17, RULE_path = 18, RULE_port = 19, RULE_folder = 20, 
		RULE_file = 21, RULE_email = 22, RULE_keyword = 23, RULE_subject = 24, 
		RULE_body = 25, RULE_var_label = 26, RULE_alphanumeric = 27, RULE_system_name = 28, 
		RULE_alpha = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statements", "statement", "header", "type", "function", "sendEmail", 
			"fileSearch", "if_func", "conditions", "condition", "comp", "conjunction", 
			"assign", "variable", "op", "object", "sign", "path", "port", "folder", 
			"file", "email", "keyword", "subject", "body", "var_label", "alphanumeric", 
			"system_name", "alpha"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'autoTask'", "'fileSearch'", "'sendEmail'", "'helpdesk'", "'if'", 
			"'else'", "'xml'", null, null, null, "'+'", "'-'", "'*'", "'{'", "'}'", 
			"'('", "')'", "'@'", "'.'", "'='", "'%'", "'$'", "'/'", "'=='", "'!='", 
			"'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "':'", "','", "'#'", "'_'", 
			"'\"'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AUTO_TASK", "FILE_SEARCH_LABEL", "SEND_EMAIL_LABEL", "HELPDESK", 
			"IF_LABEL", "ELSE", "XML", "NUM", "LOWERCASE", "UPPERCASE", "PLUS", "HYPHEN", 
			"TIMES", "BLOCK_START", "BLOCK_END", "STMT_START", "STMT_END", "AT", 
			"DOT", "EQUAL", "PERC", "DOLLAR", "FOWARD_SLASH", "COMP_EQUAL", "DIFF", 
			"BIGGER", "LESSER", "BE", "LE", "AND", "OR", "COLON", "COMMA", "HASHTAG", 
			"UNDERSCORE", "QUOTATION_MARKS", "END", "WS"
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
	public String getGrammarFileName() { return "AutoTask.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AutoTaskParser(TokenStream input) {
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
		public TerminalNode BLOCK_START() { return getToken(AutoTaskParser.BLOCK_START, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(AutoTaskParser.BLOCK_END, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			header();
			setState(61);
			type();
			setState(62);
			match(BLOCK_START);
			setState(63);
			statements();
			setState(64);
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
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(66);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(69); 
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

	public static class StatementContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			function();
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
		public TerminalNode HASHTAG() { return getToken(AutoTaskParser.HASHTAG, 0); }
		public TerminalNode HELPDESK() { return getToken(AutoTaskParser.HELPDESK, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(HASHTAG);
			setState(74);
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
		public TerminalNode AUTO_TASK() { return getToken(AutoTaskParser.AUTO_TASK, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(AUTO_TASK);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode HASHTAG() { return getToken(AutoTaskParser.HASHTAG, 0); }
		public SendEmailContext sendEmail() {
			return getRuleContext(SendEmailContext.class,0);
		}
		public TerminalNode END() { return getToken(AutoTaskParser.END, 0); }
		public FileSearchContext fileSearch() {
			return getRuleContext(FileSearchContext.class,0);
		}
		public If_funcContext if_func() {
			return getRuleContext(If_funcContext.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(HASHTAG);
				setState(79);
				sendEmail();
				setState(80);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				match(HASHTAG);
				setState(83);
				fileSearch();
				setState(84);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(HASHTAG);
				setState(87);
				if_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
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

	public static class SendEmailContext extends ParserRuleContext {
		public TerminalNode SEND_EMAIL_LABEL() { return getToken(AutoTaskParser.SEND_EMAIL_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(AutoTaskParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(AutoTaskParser.QUOTATION_MARKS, i);
		}
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(AutoTaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutoTaskParser.COMMA, i);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public SendEmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendEmail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSendEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSendEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSendEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SendEmailContext sendEmail() throws RecognitionException {
		SendEmailContext _localctx = new SendEmailContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sendEmail);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(SEND_EMAIL_LABEL);
			setState(94);
			match(STMT_START);
			setState(95);
			match(QUOTATION_MARKS);
			setState(96);
			email();
			setState(97);
			match(QUOTATION_MARKS);
			setState(98);
			match(COMMA);
			setState(99);
			match(QUOTATION_MARKS);
			setState(100);
			subject();
			setState(101);
			match(QUOTATION_MARKS);
			setState(102);
			match(COMMA);
			setState(103);
			match(QUOTATION_MARKS);
			setState(104);
			body();
			setState(105);
			match(QUOTATION_MARKS);
			setState(106);
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

	public static class FileSearchContext extends ParserRuleContext {
		public TerminalNode FILE_SEARCH_LABEL() { return getToken(AutoTaskParser.FILE_SEARCH_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(AutoTaskParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(AutoTaskParser.QUOTATION_MARKS, i);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(AutoTaskParser.COMMA, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public FileSearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileSearch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterFileSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitFileSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitFileSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileSearchContext fileSearch() throws RecognitionException {
		FileSearchContext _localctx = new FileSearchContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fileSearch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(FILE_SEARCH_LABEL);
			setState(109);
			match(STMT_START);
			setState(110);
			match(QUOTATION_MARKS);
			setState(111);
			path();
			setState(112);
			match(QUOTATION_MARKS);
			setState(113);
			match(COMMA);
			setState(114);
			match(QUOTATION_MARKS);
			setState(115);
			keyword();
			setState(116);
			match(QUOTATION_MARKS);
			setState(117);
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

	public static class If_funcContext extends ParserRuleContext {
		public TerminalNode IF_LABEL() { return getToken(AutoTaskParser.IF_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public List<TerminalNode> BLOCK_START() { return getTokens(AutoTaskParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(AutoTaskParser.BLOCK_START, i);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> BLOCK_END() { return getTokens(AutoTaskParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(AutoTaskParser.BLOCK_END, i);
		}
		public TerminalNode ELSE() { return getToken(AutoTaskParser.ELSE, 0); }
		public If_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_func; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterIf_func(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitIf_func(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitIf_func(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_funcContext if_func() throws RecognitionException {
		If_funcContext _localctx = new If_funcContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_if_func);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(IF_LABEL);
				setState(120);
				match(STMT_START);
				setState(121);
				conditions();
				setState(122);
				match(STMT_END);
				setState(123);
				match(BLOCK_START);
				setState(124);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(IF_LABEL);
				setState(127);
				match(STMT_START);
				setState(128);
				conditions();
				setState(129);
				match(STMT_END);
				setState(130);
				match(BLOCK_START);
				setState(131);
				statements();
				setState(132);
				match(BLOCK_END);
				setState(133);
				match(ELSE);
				setState(134);
				match(BLOCK_START);
				setState(135);
				statements();
				setState(136);
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
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ConjunctionContext conjunction() {
			return getRuleContext(ConjunctionContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_conditions);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				condition();
				setState(141);
				conjunction();
				setState(142);
				conditions();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				condition();
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
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			object();
			setState(148);
			comp();
			setState(149);
			object();
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
		public TerminalNode COMP_EQUAL() { return getToken(AutoTaskParser.COMP_EQUAL, 0); }
		public TerminalNode DIFF() { return getToken(AutoTaskParser.DIFF, 0); }
		public TerminalNode BIGGER() { return getToken(AutoTaskParser.BIGGER, 0); }
		public TerminalNode LESSER() { return getToken(AutoTaskParser.LESSER, 0); }
		public TerminalNode BE() { return getToken(AutoTaskParser.BE, 0); }
		public TerminalNode LE() { return getToken(AutoTaskParser.LE, 0); }
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
		public TerminalNode AND() { return getToken(AutoTaskParser.AND, 0); }
		public TerminalNode OR() { return getToken(AutoTaskParser.OR, 0); }
		public ConjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterConjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitConjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitConjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConjunctionContext conjunction() throws RecognitionException {
		ConjunctionContext _localctx = new ConjunctionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(AutoTaskParser.EQUAL, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			variable();
			setState(156);
			match(EQUAL);
			setState(157);
			op();
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
		public TerminalNode DOLLAR() { return getToken(AutoTaskParser.DOLLAR, 0); }
		public Var_labelContext var_label() {
			return getRuleContext(Var_labelContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(DOLLAR);
			setState(160);
			var_label();
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
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public SignContext sign() {
			return getRuleContext(SignContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_op);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				object();
				setState(163);
				sign();
				setState(164);
				op();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				object();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				match(STMT_START);
				setState(168);
				op();
				setState(169);
				match(STMT_END);
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

	public static class ObjectContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<TerminalNode> NUM() { return getTokens(AutoTaskParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(AutoTaskParser.NUM, i);
		}
		public TerminalNode HASHTAG() { return getToken(AutoTaskParser.HASHTAG, 0); }
		public FileSearchContext fileSearch() {
			return getRuleContext(FileSearchContext.class,0);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_object);
		int _la;
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				variable();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(174);
					match(NUM);
					}
					}
					setState(177); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				}
				break;
			case HASHTAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(HASHTAG);
				setState(180);
				fileSearch();
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

	public static class SignContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(AutoTaskParser.PLUS, 0); }
		public TerminalNode HYPHEN() { return getToken(AutoTaskParser.HYPHEN, 0); }
		public TerminalNode TIMES() { return getToken(AutoTaskParser.TIMES, 0); }
		public TerminalNode FOWARD_SLASH() { return getToken(AutoTaskParser.FOWARD_SLASH, 0); }
		public SignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SignContext sign() throws RecognitionException {
		SignContext _localctx = new SignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << HYPHEN) | (1L << TIMES) | (1L << FOWARD_SLASH))) != 0)) ) {
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

	public static class PathContext extends ParserRuleContext {
		public FileContext file() {
			return getRuleContext(FileContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public List<FolderContext> folder() {
			return getRuleContexts(FolderContext.class);
		}
		public FolderContext folder(int i) {
			return getRuleContext(FolderContext.class,i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(185);
				port();
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOWARD_SLASH) {
				{
				{
				setState(188);
				folder();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			file();
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

	public static class PortContext extends ParserRuleContext {
		public TerminalNode COLON() { return getToken(AutoTaskParser.COLON, 0); }
		public List<AlphaContext> alpha() {
			return getRuleContexts(AlphaContext.class);
		}
		public AlphaContext alpha(int i) {
			return getRuleContext(AlphaContext.class,i);
		}
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitPort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_port);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				alpha();
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LOWERCASE || _la==UPPERCASE );
			setState(201);
			match(COLON);
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

	public static class FolderContext extends ParserRuleContext {
		public List<TerminalNode> FOWARD_SLASH() { return getTokens(AutoTaskParser.FOWARD_SLASH); }
		public TerminalNode FOWARD_SLASH(int i) {
			return getToken(AutoTaskParser.FOWARD_SLASH, i);
		}
		public List<System_nameContext> system_name() {
			return getRuleContexts(System_nameContext.class);
		}
		public System_nameContext system_name(int i) {
			return getRuleContext(System_nameContext.class,i);
		}
		public FolderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_folder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterFolder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitFolder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitFolder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FolderContext folder() throws RecognitionException {
		FolderContext _localctx = new FolderContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_folder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(FOWARD_SLASH);
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				system_name();
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << HYPHEN) | (1L << DOT) | (1L << UNDERSCORE))) != 0) );
			setState(209);
			match(FOWARD_SLASH);
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

	public static class FileContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(AutoTaskParser.DOT, 0); }
		public TerminalNode XML() { return getToken(AutoTaskParser.XML, 0); }
		public List<System_nameContext> system_name() {
			return getRuleContexts(System_nameContext.class);
		}
		public System_nameContext system_name(int i) {
			return getRuleContext(System_nameContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_file);
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
					system_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(214); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(216);
			match(DOT);
			setState(217);
			match(XML);
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

	public static class EmailContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(AutoTaskParser.AT, 0); }
		public TerminalNode DOT() { return getToken(AutoTaskParser.DOT, 0); }
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public EmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EmailContext email() throws RecognitionException {
		EmailContext _localctx = new EmailContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_email);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(219);
				alphanumeric();
				}
				}
				setState(222); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(224);
			match(AT);
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				alphanumeric();
				}
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(230);
			match(DOT);
			setState(232); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(231);
				alphanumeric();
				}
				}
				setState(234); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
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

	public static class KeywordContext extends ParserRuleContext {
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				alphanumeric();
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
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

	public static class SubjectContext extends ParserRuleContext {
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subject);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(241);
				alphanumeric();
				}
				}
				setState(244); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
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

	public static class BodyContext extends ParserRuleContext {
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(246);
				alphanumeric();
				}
				}
				setState(249); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
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
		public TerminalNode LOWERCASE() { return getToken(AutoTaskParser.LOWERCASE, 0); }
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
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterVar_label(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitVar_label(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitVar_label(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_labelContext var_label() throws RecognitionException {
		Var_labelContext _localctx = new Var_labelContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_var_label);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(LOWERCASE);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) {
				{
				{
				setState(252);
				alphanumeric();
				}
				}
				setState(257);
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

	public static class AlphanumericContext extends ParserRuleContext {
		public TerminalNode LOWERCASE() { return getToken(AutoTaskParser.LOWERCASE, 0); }
		public TerminalNode UPPERCASE() { return getToken(AutoTaskParser.UPPERCASE, 0); }
		public TerminalNode NUM() { return getToken(AutoTaskParser.NUM, 0); }
		public AlphanumericContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alphanumeric; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterAlphanumeric(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitAlphanumeric(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitAlphanumeric(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphanumericContext alphanumeric() throws RecognitionException {
		AlphanumericContext _localctx = new AlphanumericContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_alphanumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
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

	public static class System_nameContext extends ParserRuleContext {
		public AlphanumericContext alphanumeric() {
			return getRuleContext(AlphanumericContext.class,0);
		}
		public TerminalNode DOT() { return getToken(AutoTaskParser.DOT, 0); }
		public TerminalNode UNDERSCORE() { return getToken(AutoTaskParser.UNDERSCORE, 0); }
		public TerminalNode HYPHEN() { return getToken(AutoTaskParser.HYPHEN, 0); }
		public System_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_system_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSystem_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSystem_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSystem_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final System_nameContext system_name() throws RecognitionException {
		System_nameContext _localctx = new System_nameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_system_name);
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case LOWERCASE:
			case UPPERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				alphanumeric();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				match(DOT);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				match(UNDERSCORE);
				}
				break;
			case HYPHEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				match(HYPHEN);
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

	public static class AlphaContext extends ParserRuleContext {
		public TerminalNode LOWERCASE() { return getToken(AutoTaskParser.LOWERCASE, 0); }
		public TerminalNode UPPERCASE() { return getToken(AutoTaskParser.UPPERCASE, 0); }
		public AlphaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alpha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterAlpha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitAlpha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitAlpha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlphaContext alpha() throws RecognitionException {
		AlphaContext _localctx = new AlphaContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u010f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\6\3F\n\3\r\3\16\3G\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7^\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13\3\13\3\13\5"+
		"\13\u0094\n\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ae"+
		"\n\21\3\22\3\22\6\22\u00b2\n\22\r\22\16\22\u00b3\3\22\3\22\5\22\u00b8"+
		"\n\22\3\23\3\23\3\24\5\24\u00bd\n\24\3\24\7\24\u00c0\n\24\f\24\16\24\u00c3"+
		"\13\24\3\24\3\24\3\25\6\25\u00c8\n\25\r\25\16\25\u00c9\3\25\3\25\3\26"+
		"\3\26\6\26\u00d0\n\26\r\26\16\26\u00d1\3\26\3\26\3\27\6\27\u00d7\n\27"+
		"\r\27\16\27\u00d8\3\27\3\27\3\27\3\30\6\30\u00df\n\30\r\30\16\30\u00e0"+
		"\3\30\3\30\6\30\u00e5\n\30\r\30\16\30\u00e6\3\30\3\30\6\30\u00eb\n\30"+
		"\r\30\16\30\u00ec\3\31\6\31\u00f0\n\31\r\31\16\31\u00f1\3\32\6\32\u00f5"+
		"\n\32\r\32\16\32\u00f6\3\33\6\33\u00fa\n\33\r\33\16\33\u00fb\3\34\3\34"+
		"\7\34\u0100\n\34\f\34\16\34\u0103\13\34\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\5\36\u010b\n\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<\2\7\3\2\32\37\3\2 !\4\2\r\17\31\31\3\2"+
		"\n\f\3\2\13\f\2\u010a\2>\3\2\2\2\4E\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2\nN\3"+
		"\2\2\2\f]\3\2\2\2\16_\3\2\2\2\20n\3\2\2\2\22\u008c\3\2\2\2\24\u0093\3"+
		"\2\2\2\26\u0095\3\2\2\2\30\u0099\3\2\2\2\32\u009b\3\2\2\2\34\u009d\3\2"+
		"\2\2\36\u00a1\3\2\2\2 \u00ad\3\2\2\2\"\u00b7\3\2\2\2$\u00b9\3\2\2\2&\u00bc"+
		"\3\2\2\2(\u00c7\3\2\2\2*\u00cd\3\2\2\2,\u00d6\3\2\2\2.\u00de\3\2\2\2\60"+
		"\u00ef\3\2\2\2\62\u00f4\3\2\2\2\64\u00f9\3\2\2\2\66\u00fd\3\2\2\28\u0104"+
		"\3\2\2\2:\u010a\3\2\2\2<\u010c\3\2\2\2>?\5\b\5\2?@\5\n\6\2@A\7\20\2\2"+
		"AB\5\4\3\2BC\7\21\2\2C\3\3\2\2\2DF\5\6\4\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2"+
		"\2GH\3\2\2\2H\5\3\2\2\2IJ\5\f\7\2J\7\3\2\2\2KL\7$\2\2LM\7\6\2\2M\t\3\2"+
		"\2\2NO\7\3\2\2O\13\3\2\2\2PQ\7$\2\2QR\5\16\b\2RS\7\'\2\2S^\3\2\2\2TU\7"+
		"$\2\2UV\5\20\t\2VW\7\'\2\2W^\3\2\2\2XY\7$\2\2Y^\5\22\n\2Z[\5\34\17\2["+
		"\\\7\'\2\2\\^\3\2\2\2]P\3\2\2\2]T\3\2\2\2]X\3\2\2\2]Z\3\2\2\2^\r\3\2\2"+
		"\2_`\7\5\2\2`a\7\22\2\2ab\7&\2\2bc\5.\30\2cd\7&\2\2de\7#\2\2ef\7&\2\2"+
		"fg\5\62\32\2gh\7&\2\2hi\7#\2\2ij\7&\2\2jk\5\64\33\2kl\7&\2\2lm\7\23\2"+
		"\2m\17\3\2\2\2no\7\4\2\2op\7\22\2\2pq\7&\2\2qr\5&\24\2rs\7&\2\2st\7#\2"+
		"\2tu\7&\2\2uv\5\60\31\2vw\7&\2\2wx\7\23\2\2x\21\3\2\2\2yz\7\7\2\2z{\7"+
		"\22\2\2{|\5\24\13\2|}\7\23\2\2}~\7\20\2\2~\177\5\4\3\2\177\u008d\3\2\2"+
		"\2\u0080\u0081\7\7\2\2\u0081\u0082\7\22\2\2\u0082\u0083\5\24\13\2\u0083"+
		"\u0084\7\23\2\2\u0084\u0085\7\20\2\2\u0085\u0086\5\4\3\2\u0086\u0087\7"+
		"\21\2\2\u0087\u0088\7\b\2\2\u0088\u0089\7\20\2\2\u0089\u008a\5\4\3\2\u008a"+
		"\u008b\7\21\2\2\u008b\u008d\3\2\2\2\u008cy\3\2\2\2\u008c\u0080\3\2\2\2"+
		"\u008d\23\3\2\2\2\u008e\u008f\5\26\f\2\u008f\u0090\5\32\16\2\u0090\u0091"+
		"\5\24\13\2\u0091\u0094\3\2\2\2\u0092\u0094\5\26\f\2\u0093\u008e\3\2\2"+
		"\2\u0093\u0092\3\2\2\2\u0094\25\3\2\2\2\u0095\u0096\5\"\22\2\u0096\u0097"+
		"\5\30\r\2\u0097\u0098\5\"\22\2\u0098\27\3\2\2\2\u0099\u009a\t\2\2\2\u009a"+
		"\31\3\2\2\2\u009b\u009c\t\3\2\2\u009c\33\3\2\2\2\u009d\u009e\5\36\20\2"+
		"\u009e\u009f\7\26\2\2\u009f\u00a0\5 \21\2\u00a0\35\3\2\2\2\u00a1\u00a2"+
		"\7\30\2\2\u00a2\u00a3\5\66\34\2\u00a3\37\3\2\2\2\u00a4\u00a5\5\"\22\2"+
		"\u00a5\u00a6\5$\23\2\u00a6\u00a7\5 \21\2\u00a7\u00ae\3\2\2\2\u00a8\u00ae"+
		"\5\"\22\2\u00a9\u00aa\7\22\2\2\u00aa\u00ab\5 \21\2\u00ab\u00ac\7\23\2"+
		"\2\u00ac\u00ae\3\2\2\2\u00ad\u00a4\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9"+
		"\3\2\2\2\u00ae!\3\2\2\2\u00af\u00b8\5\36\20\2\u00b0\u00b2\7\n\2\2\u00b1"+
		"\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b8\3\2\2\2\u00b5\u00b6\7$\2\2\u00b6\u00b8\5\20\t\2\u00b7"+
		"\u00af\3\2\2\2\u00b7\u00b1\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8#\3\2\2\2"+
		"\u00b9\u00ba\t\4\2\2\u00ba%\3\2\2\2\u00bb\u00bd\5(\25\2\u00bc\u00bb\3"+
		"\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c1\3\2\2\2\u00be\u00c0\5*\26\2\u00bf"+
		"\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2"+
		"\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\5,\27\2\u00c5"+
		"\'\3\2\2\2\u00c6\u00c8\5<\37\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2"+
		"\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc"+
		"\7\"\2\2\u00cc)\3\2\2\2\u00cd\u00cf\7\31\2\2\u00ce\u00d0\5:\36\2\u00cf"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\31\2\2\u00d4+\3\2\2\2\u00d5\u00d7"+
		"\5:\36\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\7\25\2\2\u00db\u00dc\7"+
		"\t\2\2\u00dc-\3\2\2\2\u00dd\u00df\58\35\2\u00de\u00dd\3\2\2\2\u00df\u00e0"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e4\7\24\2\2\u00e3\u00e5\58\35\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3"+
		"\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00ea\7\25\2\2\u00e9\u00eb\58\35\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3"+
		"\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed/\3\2\2\2\u00ee\u00f0"+
		"\58\35\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\61\3\2\2\2\u00f3\u00f5\58\35\2\u00f4\u00f3\3\2\2"+
		"\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\63"+
		"\3\2\2\2\u00f8\u00fa\58\35\2\u00f9\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\65\3\2\2\2\u00fd\u0101\7\13\2"+
		"\2\u00fe\u0100\58\35\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\67\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0105\t\5\2\2\u01059\3\2\2\2\u0106\u010b\58\35\2\u0107\u010b\7\25\2\2"+
		"\u0108\u010b\7%\2\2\u0109\u010b\7\16\2\2\u010a\u0106\3\2\2\2\u010a\u0107"+
		"\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u0109\3\2\2\2\u010b;\3\2\2\2\u010c"+
		"\u010d\t\6\2\2\u010d=\3\2\2\2\26G]\u008c\u0093\u00ad\u00b3\u00b7\u00bc"+
		"\u00c1\u00c9\u00d1\u00d8\u00e0\u00e6\u00ec\u00f1\u00f6\u00fb\u0101\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}