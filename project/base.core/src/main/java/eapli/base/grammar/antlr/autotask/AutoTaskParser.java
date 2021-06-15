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
		RULE_start = 0, RULE_statements = 1, RULE_header = 2, RULE_type = 3, RULE_statement = 4, 
		RULE_sendEmail = 5, RULE_fileSearch = 6, RULE_if_func = 7, RULE_conditions = 8, 
		RULE_condition = 9, RULE_comp = 10, RULE_conjunction = 11, RULE_assign = 12, 
		RULE_variable = 13, RULE_op = 14, RULE_object = 15, RULE_sign_td = 16, 
		RULE_sign_pm = 17, RULE_path = 18, RULE_port = 19, RULE_folder = 20, RULE_file = 21, 
		RULE_email = 22, RULE_keyword = 23, RULE_subject = 24, RULE_body = 25, 
		RULE_var_label = 26, RULE_alphanumeric = 27, RULE_system_name = 28, RULE_alpha = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statements", "header", "type", "statement", "sendEmail", "fileSearch", 
			"if_func", "conditions", "condition", "comp", "conjunction", "assign", 
			"variable", "op", "object", "sign_td", "sign_pm", "path", "port", "folder", 
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
		enterRule(_localctx, 4, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(HASHTAG);
			setState(72);
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
		enterRule(_localctx, 6, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
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

	public static class StatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 8, RULE_statement);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(HASHTAG);
				setState(77);
				sendEmail();
				setState(78);
				match(END);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				match(HASHTAG);
				setState(81);
				fileSearch();
				setState(82);
				match(END);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(84);
				match(HASHTAG);
				setState(85);
				if_func();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				assign();
				setState(87);
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
		public SendEmailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sendEmail; }
	 
		public SendEmailContext() { }
		public void copyFrom(SendEmailContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecSendEmailContext extends SendEmailContext {
		public EmailContext em;
		public SubjectContext sub;
		public BodyContext email_body;
		public TerminalNode SEND_EMAIL_LABEL() { return getToken(AutoTaskParser.SEND_EMAIL_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(AutoTaskParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(AutoTaskParser.QUOTATION_MARKS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AutoTaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutoTaskParser.COMMA, i);
		}
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public EmailContext email() {
			return getRuleContext(EmailContext.class,0);
		}
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExecSendEmailContext(SendEmailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecSendEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecSendEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecSendEmail(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SendEmailContext sendEmail() throws RecognitionException {
		SendEmailContext _localctx = new SendEmailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sendEmail);
		try {
			_localctx = new ExecSendEmailContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(SEND_EMAIL_LABEL);
			setState(92);
			match(STMT_START);
			setState(93);
			match(QUOTATION_MARKS);
			setState(94);
			((ExecSendEmailContext)_localctx).em = email();
			setState(95);
			match(QUOTATION_MARKS);
			setState(96);
			match(COMMA);
			setState(97);
			match(QUOTATION_MARKS);
			setState(98);
			((ExecSendEmailContext)_localctx).sub = subject();
			setState(99);
			match(QUOTATION_MARKS);
			setState(100);
			match(COMMA);
			setState(101);
			match(QUOTATION_MARKS);
			setState(102);
			((ExecSendEmailContext)_localctx).email_body = body();
			setState(103);
			match(QUOTATION_MARKS);
			setState(104);
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
		public FileSearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileSearch; }
	 
		public FileSearchContext() { }
		public void copyFrom(FileSearchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecFileSearchContext extends FileSearchContext {
		public PathContext fp;
		public KeywordContext key;
		public TerminalNode FILE_SEARCH_LABEL() { return getToken(AutoTaskParser.FILE_SEARCH_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(AutoTaskParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(AutoTaskParser.QUOTATION_MARKS, i);
		}
		public TerminalNode COMMA() { return getToken(AutoTaskParser.COMMA, 0); }
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ExecFileSearchContext(FileSearchContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecFileSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecFileSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecFileSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileSearchContext fileSearch() throws RecognitionException {
		FileSearchContext _localctx = new FileSearchContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_fileSearch);
		try {
			_localctx = new ExecFileSearchContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(FILE_SEARCH_LABEL);
			setState(107);
			match(STMT_START);
			setState(108);
			match(QUOTATION_MARKS);
			setState(109);
			((ExecFileSearchContext)_localctx).fp = path();
			setState(110);
			match(QUOTATION_MARKS);
			setState(111);
			match(COMMA);
			setState(112);
			match(QUOTATION_MARKS);
			setState(113);
			((ExecFileSearchContext)_localctx).key = keyword();
			setState(114);
			match(QUOTATION_MARKS);
			setState(115);
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
		public If_funcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_func; }
	 
		public If_funcContext() { }
		public void copyFrom(If_funcContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Only_ifContext extends If_funcContext {
		public ConditionsContext if_cond;
		public StatementsContext stmt_if;
		public TerminalNode IF_LABEL() { return getToken(AutoTaskParser.IF_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public TerminalNode BLOCK_START() { return getToken(AutoTaskParser.BLOCK_START, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Only_ifContext(If_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterOnly_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitOnly_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitOnly_if(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_elseContext extends If_funcContext {
		public ConditionsContext if_cond;
		public StatementsContext stmt_if;
		public StatementsContext stmt_else;
		public TerminalNode IF_LABEL() { return getToken(AutoTaskParser.IF_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public List<TerminalNode> BLOCK_START() { return getTokens(AutoTaskParser.BLOCK_START); }
		public TerminalNode BLOCK_START(int i) {
			return getToken(AutoTaskParser.BLOCK_START, i);
		}
		public List<TerminalNode> BLOCK_END() { return getTokens(AutoTaskParser.BLOCK_END); }
		public TerminalNode BLOCK_END(int i) {
			return getToken(AutoTaskParser.BLOCK_END, i);
		}
		public TerminalNode ELSE() { return getToken(AutoTaskParser.ELSE, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public If_elseContext(If_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_funcContext if_func() throws RecognitionException {
		If_funcContext _localctx = new If_funcContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_func);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new Only_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(IF_LABEL);
				setState(118);
				match(STMT_START);
				setState(119);
				((Only_ifContext)_localctx).if_cond = conditions();
				setState(120);
				match(STMT_END);
				setState(121);
				match(BLOCK_START);
				setState(122);
				((Only_ifContext)_localctx).stmt_if = statements();
				}
				break;
			case 2:
				_localctx = new If_elseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(IF_LABEL);
				setState(125);
				match(STMT_START);
				setState(126);
				((If_elseContext)_localctx).if_cond = conditions();
				setState(127);
				match(STMT_END);
				setState(128);
				match(BLOCK_START);
				setState(129);
				((If_elseContext)_localctx).stmt_if = statements();
				setState(130);
				match(BLOCK_END);
				setState(131);
				match(ELSE);
				setState(132);
				match(BLOCK_START);
				setState(133);
				((If_elseContext)_localctx).stmt_else = statements();
				setState(134);
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
	public static class Multiple_conditionsContext extends ConditionsContext {
		public ConditionContext right;
		public ConjunctionContext conj_sign;
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
		public Multiple_conditionsContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterMultiple_conditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitMultiple_conditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitMultiple_conditions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Single_conditionsContext extends ConditionsContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public Single_conditionsContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSingle_conditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSingle_conditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSingle_conditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_conditions);
		try {
			setState(143);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new Multiple_conditionsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				((Multiple_conditionsContext)_localctx).right = condition();
				setState(139);
				((Multiple_conditionsContext)_localctx).conj_sign = conjunction();
				setState(140);
				((Multiple_conditionsContext)_localctx).left = conditions();
				}
				break;
			case 2:
				_localctx = new Single_conditionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
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
		public CompContext comp_sign;
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
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_condition);
		try {
			_localctx = new CondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			((CondContext)_localctx).left = object();
			setState(146);
			((CondContext)_localctx).comp_sign = comp();
			setState(147);
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
		enterRule(_localctx, 20, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
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
		enterRule(_localctx, 22, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
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
	public static class Exec_assignContext extends AssignContext {
		public VariableContext var;
		public OpContext res;
		public TerminalNode EQUAL() { return getToken(AutoTaskParser.EQUAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Exec_assignContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExec_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExec_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExec_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assign);
		try {
			_localctx = new Exec_assignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			((Exec_assignContext)_localctx).var = variable();
			setState(154);
			match(EQUAL);
			setState(155);
			((Exec_assignContext)_localctx).res = op();
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
	public static class Exec_varContext extends VariableContext {
		public Var_labelContext label;
		public TerminalNode DOLLAR() { return getToken(AutoTaskParser.DOLLAR, 0); }
		public Var_labelContext var_label() {
			return getRuleContext(Var_labelContext.class,0);
		}
		public Exec_varContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExec_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExec_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExec_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variable);
		try {
			_localctx = new Exec_varContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(DOLLAR);
			setState(158);
			((Exec_varContext)_localctx).label = var_label();
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
	public static class Exec_op_times_divisionContext extends OpContext {
		public ObjectContext left;
		public OpContext right;
		public Sign_tdContext sign_td() {
			return getRuleContext(Sign_tdContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Exec_op_times_divisionContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExec_op_times_division(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExec_op_times_division(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExec_op_times_division(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exec_op_atomContext extends OpContext {
		public ObjectContext atom;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public Exec_op_atomContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExec_op_atom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExec_op_atom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExec_op_atom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exec_op_plus_minusContext extends OpContext {
		public ObjectContext left;
		public OpContext right;
		public Sign_pmContext sign_pm() {
			return getRuleContext(Sign_pmContext.class,0);
		}
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Exec_op_plus_minusContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExec_op_plus_minus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExec_op_plus_minus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExec_op_plus_minus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Exec_op_parenthesisContext extends OpContext {
		public OpContext result;
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public Exec_op_parenthesisContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExec_op_parenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExec_op_parenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExec_op_parenthesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_op);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new Exec_op_times_divisionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				((Exec_op_times_divisionContext)_localctx).left = object();
				setState(161);
				sign_td();
				setState(162);
				((Exec_op_times_divisionContext)_localctx).right = op();
				}
				break;
			case 2:
				_localctx = new Exec_op_plus_minusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				((Exec_op_plus_minusContext)_localctx).left = object();
				setState(165);
				sign_pm();
				setState(166);
				((Exec_op_plus_minusContext)_localctx).right = op();
				}
				break;
			case 3:
				_localctx = new Exec_op_atomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				((Exec_op_atomContext)_localctx).atom = object();
				}
				break;
			case 4:
				_localctx = new Exec_op_parenthesisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				match(STMT_START);
				setState(170);
				((Exec_op_parenthesisContext)_localctx).result = op();
				setState(171);
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
		enterRule(_localctx, 30, RULE_object);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(175);
				variable();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(177); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(176);
					match(NUM);
					}
					}
					setState(179); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				}
				break;
			case HASHTAG:
				enterOuterAlt(_localctx, 3);
				{
				setState(181);
				match(HASHTAG);
				setState(182);
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

	public static class Sign_tdContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(AutoTaskParser.TIMES, 0); }
		public TerminalNode FOWARD_SLASH() { return getToken(AutoTaskParser.FOWARD_SLASH, 0); }
		public Sign_tdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign_td; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSign_td(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSign_td(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSign_td(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sign_tdContext sign_td() throws RecognitionException {
		Sign_tdContext _localctx = new Sign_tdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sign_td);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		public TerminalNode PLUS() { return getToken(AutoTaskParser.PLUS, 0); }
		public TerminalNode HYPHEN() { return getToken(AutoTaskParser.HYPHEN, 0); }
		public Sign_pmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sign_pm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSign_pm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSign_pm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSign_pm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sign_pmContext sign_pm() throws RecognitionException {
		Sign_pmContext _localctx = new Sign_pmContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sign_pm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(189);
				port();
				}
				break;
			}
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FOWARD_SLASH) {
				{
				{
				setState(192);
				folder();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
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
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				alpha();
				}
				}
				setState(203); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LOWERCASE || _la==UPPERCASE );
			setState(205);
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
			setState(207);
			match(FOWARD_SLASH);
			setState(209); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(208);
				system_name();
				}
				}
				setState(211); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << HYPHEN) | (1L << DOT) | (1L << UNDERSCORE))) != 0) );
			setState(213);
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
			setState(216); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(215);
					system_name();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(218); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(220);
			match(DOT);
			setState(221);
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
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				alphanumeric();
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(228);
			match(AT);
			setState(230); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(229);
				alphanumeric();
				}
				}
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(234);
			match(DOT);
			setState(236); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(235);
				alphanumeric();
				}
				}
				setState(238); 
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
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(240);
				alphanumeric();
				}
				}
				setState(243); 
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
			setState(246); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(245);
				alphanumeric();
				}
				}
				setState(248); 
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
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				alphanumeric();
				}
				}
				setState(253); 
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
			setState(255);
			match(LOWERCASE);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0)) {
				{
				{
				setState(256);
				alphanumeric();
				}
				}
				setState(261);
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
			setState(262);
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
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case LOWERCASE:
			case UPPERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				alphanumeric();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(DOT);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(UNDERSCORE);
				}
				break;
			case HYPHEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(267);
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
			setState(270);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0113\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\6\3F\n\3\r\3\16\3G\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u008b\n\t\3\n\3\n\3\n\3\n\3\n\5\n\u0092\n\n\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00b0\n\20\3\21\3\21\6\21\u00b4\n\21\r\21\16\21\u00b5\3\21\3\21\5\21"+
		"\u00ba\n\21\3\22\3\22\3\23\3\23\3\24\5\24\u00c1\n\24\3\24\7\24\u00c4\n"+
		"\24\f\24\16\24\u00c7\13\24\3\24\3\24\3\25\6\25\u00cc\n\25\r\25\16\25\u00cd"+
		"\3\25\3\25\3\26\3\26\6\26\u00d4\n\26\r\26\16\26\u00d5\3\26\3\26\3\27\6"+
		"\27\u00db\n\27\r\27\16\27\u00dc\3\27\3\27\3\27\3\30\6\30\u00e3\n\30\r"+
		"\30\16\30\u00e4\3\30\3\30\6\30\u00e9\n\30\r\30\16\30\u00ea\3\30\3\30\6"+
		"\30\u00ef\n\30\r\30\16\30\u00f0\3\31\6\31\u00f4\n\31\r\31\16\31\u00f5"+
		"\3\32\6\32\u00f9\n\32\r\32\16\32\u00fa\3\33\6\33\u00fe\n\33\r\33\16\33"+
		"\u00ff\3\34\3\34\7\34\u0104\n\34\f\34\16\34\u0107\13\34\3\35\3\35\3\36"+
		"\3\36\3\36\3\36\5\36\u010f\n\36\3\37\3\37\3\37\2\2 \2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2\b\3\2\32\37\3\2 !\4\2"+
		"\17\17\31\31\3\2\r\16\3\2\n\f\3\2\13\f\2\u010f\2>\3\2\2\2\4E\3\2\2\2\6"+
		"I\3\2\2\2\bL\3\2\2\2\n[\3\2\2\2\f]\3\2\2\2\16l\3\2\2\2\20\u008a\3\2\2"+
		"\2\22\u0091\3\2\2\2\24\u0093\3\2\2\2\26\u0097\3\2\2\2\30\u0099\3\2\2\2"+
		"\32\u009b\3\2\2\2\34\u009f\3\2\2\2\36\u00af\3\2\2\2 \u00b9\3\2\2\2\"\u00bb"+
		"\3\2\2\2$\u00bd\3\2\2\2&\u00c0\3\2\2\2(\u00cb\3\2\2\2*\u00d1\3\2\2\2,"+
		"\u00da\3\2\2\2.\u00e2\3\2\2\2\60\u00f3\3\2\2\2\62\u00f8\3\2\2\2\64\u00fd"+
		"\3\2\2\2\66\u0101\3\2\2\28\u0108\3\2\2\2:\u010e\3\2\2\2<\u0110\3\2\2\2"+
		">?\5\6\4\2?@\5\b\5\2@A\7\20\2\2AB\5\4\3\2BC\7\21\2\2C\3\3\2\2\2DF\5\n"+
		"\6\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2H\5\3\2\2\2IJ\7$\2\2JK\7\6"+
		"\2\2K\7\3\2\2\2LM\7\3\2\2M\t\3\2\2\2NO\7$\2\2OP\5\f\7\2PQ\7\'\2\2Q\\\3"+
		"\2\2\2RS\7$\2\2ST\5\16\b\2TU\7\'\2\2U\\\3\2\2\2VW\7$\2\2W\\\5\20\t\2X"+
		"Y\5\32\16\2YZ\7\'\2\2Z\\\3\2\2\2[N\3\2\2\2[R\3\2\2\2[V\3\2\2\2[X\3\2\2"+
		"\2\\\13\3\2\2\2]^\7\5\2\2^_\7\22\2\2_`\7&\2\2`a\5.\30\2ab\7&\2\2bc\7#"+
		"\2\2cd\7&\2\2de\5\62\32\2ef\7&\2\2fg\7#\2\2gh\7&\2\2hi\5\64\33\2ij\7&"+
		"\2\2jk\7\23\2\2k\r\3\2\2\2lm\7\4\2\2mn\7\22\2\2no\7&\2\2op\5&\24\2pq\7"+
		"&\2\2qr\7#\2\2rs\7&\2\2st\5\60\31\2tu\7&\2\2uv\7\23\2\2v\17\3\2\2\2wx"+
		"\7\7\2\2xy\7\22\2\2yz\5\22\n\2z{\7\23\2\2{|\7\20\2\2|}\5\4\3\2}\u008b"+
		"\3\2\2\2~\177\7\7\2\2\177\u0080\7\22\2\2\u0080\u0081\5\22\n\2\u0081\u0082"+
		"\7\23\2\2\u0082\u0083\7\20\2\2\u0083\u0084\5\4\3\2\u0084\u0085\7\21\2"+
		"\2\u0085\u0086\7\b\2\2\u0086\u0087\7\20\2\2\u0087\u0088\5\4\3\2\u0088"+
		"\u0089\7\21\2\2\u0089\u008b\3\2\2\2\u008aw\3\2\2\2\u008a~\3\2\2\2\u008b"+
		"\21\3\2\2\2\u008c\u008d\5\24\13\2\u008d\u008e\5\30\r\2\u008e\u008f\5\22"+
		"\n\2\u008f\u0092\3\2\2\2\u0090\u0092\5\24\13\2\u0091\u008c\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\23\3\2\2\2\u0093\u0094\5 \21\2\u0094\u0095\5\26\f"+
		"\2\u0095\u0096\5 \21\2\u0096\25\3\2\2\2\u0097\u0098\t\2\2\2\u0098\27\3"+
		"\2\2\2\u0099\u009a\t\3\2\2\u009a\31\3\2\2\2\u009b\u009c\5\34\17\2\u009c"+
		"\u009d\7\26\2\2\u009d\u009e\5\36\20\2\u009e\33\3\2\2\2\u009f\u00a0\7\30"+
		"\2\2\u00a0\u00a1\5\66\34\2\u00a1\35\3\2\2\2\u00a2\u00a3\5 \21\2\u00a3"+
		"\u00a4\5\"\22\2\u00a4\u00a5\5\36\20\2\u00a5\u00b0\3\2\2\2\u00a6\u00a7"+
		"\5 \21\2\u00a7\u00a8\5$\23\2\u00a8\u00a9\5\36\20\2\u00a9\u00b0\3\2\2\2"+
		"\u00aa\u00b0\5 \21\2\u00ab\u00ac\7\22\2\2\u00ac\u00ad\5\36\20\2\u00ad"+
		"\u00ae\7\23\2\2\u00ae\u00b0\3\2\2\2\u00af\u00a2\3\2\2\2\u00af\u00a6\3"+
		"\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00ab\3\2\2\2\u00b0\37\3\2\2\2\u00b1"+
		"\u00ba\5\34\17\2\u00b2\u00b4\7\n\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3"+
		"\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00ba\3\2\2\2\u00b7"+
		"\u00b8\7$\2\2\u00b8\u00ba\5\16\b\2\u00b9\u00b1\3\2\2\2\u00b9\u00b3\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00ba!\3\2\2\2\u00bb\u00bc\t\4\2\2\u00bc#\3\2"+
		"\2\2\u00bd\u00be\t\5\2\2\u00be%\3\2\2\2\u00bf\u00c1\5(\25\2\u00c0\u00bf"+
		"\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c5\3\2\2\2\u00c2\u00c4\5*\26\2\u00c3"+
		"\u00c2\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2"+
		"\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5,\27\2\u00c9"+
		"\'\3\2\2\2\u00ca\u00cc\5<\37\2\u00cb\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2"+
		"\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0"+
		"\7\"\2\2\u00d0)\3\2\2\2\u00d1\u00d3\7\31\2\2\u00d2\u00d4\5:\36\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\31\2\2\u00d8+\3\2\2\2\u00d9\u00db"+
		"\5:\36\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\7\25\2\2\u00df\u00e0\7"+
		"\t\2\2\u00e0-\3\2\2\2\u00e1\u00e3\58\35\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4"+
		"\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e8\7\24\2\2\u00e7\u00e9\58\35\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3"+
		"\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec"+
		"\u00ee\7\25\2\2\u00ed\u00ef\58\35\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3"+
		"\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1/\3\2\2\2\u00f2\u00f4"+
		"\58\35\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\61\3\2\2\2\u00f7\u00f9\58\35\2\u00f8\u00f7\3\2\2"+
		"\2\u00f9\u00fa\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\63"+
		"\3\2\2\2\u00fc\u00fe\58\35\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\65\3\2\2\2\u0101\u0105\7\13\2"+
		"\2\u0102\u0104\58\35\2\u0103\u0102\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103"+
		"\3\2\2\2\u0105\u0106\3\2\2\2\u0106\67\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u0109\t\6\2\2\u01099\3\2\2\2\u010a\u010f\58\35\2\u010b\u010f\7\25\2\2"+
		"\u010c\u010f\7%\2\2\u010d\u010f\7\16\2\2\u010e\u010a\3\2\2\2\u010e\u010b"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010d\3\2\2\2\u010f;\3\2\2\2\u0110"+
		"\u0111\t\7\2\2\u0111=\3\2\2\2\26G[\u008a\u0091\u00af\u00b5\u00b9\u00c0"+
		"\u00c5\u00cd\u00d5\u00dc\u00e4\u00ea\u00f0\u00f5\u00fa\u00ff\u0105\u010e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}