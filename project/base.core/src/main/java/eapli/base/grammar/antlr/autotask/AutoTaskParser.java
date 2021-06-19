// Generated from D:/Universidade/2/2/LAPR/lei20_21_s4_2di_03/project/base.core/src/main/java/eapli/base/grammar\AutoTask.g4 by ANTLR 4.9.1
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
		AUTO_TASK=1, FILE_SEARCH_LABEL=2, SEND_EMAIL_LABEL=3, GET_VALUE_LABEL=4, 
		HELPDESK=5, IF_LABEL=6, ELSE=7, XML_FILE=8, NUM=9, LOWERCASE=10, UPPERCASE=11, 
		EUR=12, PLUS=13, HYPHEN=14, TIMES=15, BLOCK_START=16, BLOCK_END=17, STMT_START=18, 
		STMT_END=19, AT=20, DOT=21, EQUAL=22, PERC=23, DOLLAR=24, FORWARD_SLASH=25, 
		COMP_EQUAL=26, DIFF=27, BIGGER=28, LESSER=29, BE=30, LE=31, AND=32, OR=33, 
		COLON=34, COMMA=35, HASHTAG=36, UNDERSCORE=37, QUOTATION_MARKS=38, END=39, 
		SPACE=40, WS=41;
	public static final int
		RULE_start = 0, RULE_statements = 1, RULE_header = 2, RULE_type = 3, RULE_statement = 4, 
		RULE_sendEmail = 5, RULE_fileSearch = 6, RULE_searchInFile = 7, RULE_value = 8, 
		RULE_if_func = 9, RULE_end_if = 10, RULE_start_else = 11, RULE_conditions = 12, 
		RULE_condition = 13, RULE_comp = 14, RULE_conjunction = 15, RULE_get_value = 16, 
		RULE_assign = 17, RULE_variable = 18, RULE_op = 19, RULE_object = 20, 
		RULE_sign_td = 21, RULE_sign_pm = 22, RULE_num = 23, RULE_string = 24, 
		RULE_characters = 25, RULE_email = 26, RULE_keyword = 27, RULE_subject = 28, 
		RULE_body = 29, RULE_email_text = 30, RULE_var_label = 31, RULE_alphanumeric = 32, 
		RULE_system_name = 33, RULE_alpha = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statements", "header", "type", "statement", "sendEmail", "fileSearch", 
			"searchInFile", "value", "if_func", "end_if", "start_else", "conditions", 
			"condition", "comp", "conjunction", "get_value", "assign", "variable", 
			"op", "object", "sign_td", "sign_pm", "num", "string", "characters", 
			"email", "keyword", "subject", "body", "email_text", "var_label", "alphanumeric", 
			"system_name", "alpha"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'autoTask'", "'fileSearch'", "'sendEmail'", "'getAttribute'", 
			"'helpdesk'", "'if'", "'else'", "'.xml'", null, null, null, "'\u00E2\u201A\u00AC'", 
			"'+'", "'-'", "'*'", "'{'", "'}'", "'('", "')'", "'@'", "'.'", "'='", 
			"'%'", "'$'", "'/'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", 
			"'||'", "':'", "','", "'#'", "'_'", "'\"'", "';'", "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AUTO_TASK", "FILE_SEARCH_LABEL", "SEND_EMAIL_LABEL", "GET_VALUE_LABEL", 
			"HELPDESK", "IF_LABEL", "ELSE", "XML_FILE", "NUM", "LOWERCASE", "UPPERCASE", 
			"EUR", "PLUS", "HYPHEN", "TIMES", "BLOCK_START", "BLOCK_END", "STMT_START", 
			"STMT_END", "AT", "DOT", "EQUAL", "PERC", "DOLLAR", "FORWARD_SLASH", 
			"COMP_EQUAL", "DIFF", "BIGGER", "LESSER", "BE", "LE", "AND", "OR", "COLON", 
			"COMMA", "HASHTAG", "UNDERSCORE", "QUOTATION_MARKS", "END", "SPACE", 
			"WS"
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
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	 
		public StartContext() { }
		public void copyFrom(StartContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecStartContext extends StartContext {
		public StatementsContext stmts;
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode BLOCK_START() { return getToken(AutoTaskParser.BLOCK_START, 0); }
		public TerminalNode BLOCK_END() { return getToken(AutoTaskParser.BLOCK_END, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ExecStartContext(StartContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			_localctx = new ExecStartContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			header();
			setState(71);
			type();
			setState(72);
			match(BLOCK_START);
			setState(73);
			((ExecStartContext)_localctx).stmts = statements();
			setState(74);
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
		public StatementContext stmt;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ExecStatementsContext(StatementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		int _la;
		try {
			_localctx = new ExecStatementsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				((ExecStatementsContext)_localctx).stmt = statement();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DOLLAR) | (1L << HASHTAG) | (1L << SPACE))) != 0) );
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
			setState(81);
			match(HASHTAG);
			setState(82);
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
			setState(84);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmtFileSearchContext extends StatementContext {
		public FileSearchContext stmt;
		public TerminalNode HASHTAG() { return getToken(AutoTaskParser.HASHTAG, 0); }
		public TerminalNode END() { return getToken(AutoTaskParser.END, 0); }
		public FileSearchContext fileSearch() {
			return getRuleContext(FileSearchContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public StmtFileSearchContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterStmtFileSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitStmtFileSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitStmtFileSearch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtSendEmailContext extends StatementContext {
		public SendEmailContext stmt;
		public TerminalNode HASHTAG() { return getToken(AutoTaskParser.HASHTAG, 0); }
		public TerminalNode END() { return getToken(AutoTaskParser.END, 0); }
		public SendEmailContext sendEmail() {
			return getRuleContext(SendEmailContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public StmtSendEmailContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterStmtSendEmail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitStmtSendEmail(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitStmtSendEmail(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtIfContext extends StatementContext {
		public If_funcContext stmt;
		public TerminalNode HASHTAG() { return getToken(AutoTaskParser.HASHTAG, 0); }
		public If_funcContext if_func() {
			return getRuleContext(If_funcContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public StmtIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterStmtIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitStmtIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitStmtIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtGetValueContext extends StatementContext {
		public Get_valueContext stmt;
		public TerminalNode HASHTAG() { return getToken(AutoTaskParser.HASHTAG, 0); }
		public Get_valueContext get_value() {
			return getRuleContext(Get_valueContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public StmtGetValueContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterStmtGetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitStmtGetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitStmtGetValue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmtAssignContext extends StatementContext {
		public AssignContext stmt;
		public TerminalNode END() { return getToken(AutoTaskParser.END, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public StmtAssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterStmtAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitStmtAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitStmtAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statement);
		int _la;
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StmtSendEmailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(86);
					match(SPACE);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(HASHTAG);
				setState(93);
				((StmtSendEmailContext)_localctx).stmt = sendEmail();
				setState(94);
				match(END);
				}
				break;
			case 2:
				_localctx = new StmtFileSearchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(96);
					match(SPACE);
					}
					}
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(102);
				match(HASHTAG);
				setState(103);
				((StmtFileSearchContext)_localctx).stmt = fileSearch();
				setState(104);
				match(END);
				}
				break;
			case 3:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(106);
					match(SPACE);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(HASHTAG);
				setState(113);
				((StmtIfContext)_localctx).stmt = if_func();
				}
				break;
			case 4:
				_localctx = new StmtGetValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(114);
					match(SPACE);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(HASHTAG);
				setState(121);
				((StmtGetValueContext)_localctx).stmt = get_value();
				}
				break;
			case 5:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(122);
					match(SPACE);
					}
					}
					setState(127);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(128);
				((StmtAssignContext)_localctx).stmt = assign();
				setState(129);
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
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
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
	public static class ExecSendEmailCollabContext extends SendEmailContext {
		public SubjectContext sub;
		public BodyContext email_body;
		public TerminalNode SEND_EMAIL_LABEL() { return getToken(AutoTaskParser.SEND_EMAIL_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public TerminalNode COMMA() { return getToken(AutoTaskParser.COMMA, 0); }
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public SubjectContext subject() {
			return getRuleContext(SubjectContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(AutoTaskParser.SPACE, 0); }
		public ExecSendEmailCollabContext(SendEmailContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecSendEmailCollab(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecSendEmailCollab(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecSendEmailCollab(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SendEmailContext sendEmail() throws RecognitionException {
		SendEmailContext _localctx = new SendEmailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sendEmail);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExecSendEmailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(SEND_EMAIL_LABEL);
				setState(134);
				match(STMT_START);
				setState(135);
				match(QUOTATION_MARKS);
				setState(136);
				((ExecSendEmailContext)_localctx).em = email();
				setState(137);
				match(QUOTATION_MARKS);
				setState(138);
				match(COMMA);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(139);
					match(SPACE);
					}
				}

				setState(142);
				((ExecSendEmailContext)_localctx).sub = subject();
				setState(143);
				match(COMMA);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(144);
					match(SPACE);
					}
				}

				setState(147);
				((ExecSendEmailContext)_localctx).email_body = body();
				setState(148);
				match(STMT_END);
				}
				break;
			case 2:
				_localctx = new ExecSendEmailCollabContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(SEND_EMAIL_LABEL);
				setState(151);
				match(STMT_START);
				setState(152);
				((ExecSendEmailCollabContext)_localctx).sub = subject();
				setState(153);
				match(COMMA);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(154);
					match(SPACE);
					}
				}

				setState(157);
				((ExecSendEmailCollabContext)_localctx).email_body = body();
				setState(158);
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
		public NumContext fp;
		public SearchInFileContext search;
		public TerminalNode FILE_SEARCH_LABEL() { return getToken(AutoTaskParser.FILE_SEARCH_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public TerminalNode COMMA() { return getToken(AutoTaskParser.COMMA, 0); }
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public SearchInFileContext searchInFile() {
			return getRuleContext(SearchInFileContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(AutoTaskParser.SPACE, 0); }
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
		int _la;
		try {
			_localctx = new ExecFileSearchContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(FILE_SEARCH_LABEL);
			setState(163);
			match(STMT_START);
			setState(164);
			((ExecFileSearchContext)_localctx).fp = num();
			setState(165);
			match(COMMA);
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(166);
				match(SPACE);
				}
			}

			setState(169);
			((ExecFileSearchContext)_localctx).search = searchInFile();
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

	public static class SearchInFileContext extends ParserRuleContext {
		public SearchInFileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchInFile; }
	 
		public SearchInFileContext() { }
		public void copyFrom(SearchInFileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecSearchInContext extends SearchInFileContext {
		public KeywordContext search_in;
		public SearchInFileContext search;
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(AutoTaskParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(AutoTaskParser.QUOTATION_MARKS, i);
		}
		public TerminalNode COMMA() { return getToken(AutoTaskParser.COMMA, 0); }
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public SearchInFileContext searchInFile() {
			return getRuleContext(SearchInFileContext.class,0);
		}
		public TerminalNode SPACE() { return getToken(AutoTaskParser.SPACE, 0); }
		public ExecSearchInContext(SearchInFileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecSearchIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecSearchIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecSearchIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecSearchInFileContext extends SearchInFileContext {
		public KeywordContext search_by;
		public ValueContext search_value;
		public KeywordContext search_for;
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(AutoTaskParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(AutoTaskParser.QUOTATION_MARKS, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AutoTaskParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AutoTaskParser.COMMA, i);
		}
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public List<KeywordContext> keyword() {
			return getRuleContexts(KeywordContext.class);
		}
		public KeywordContext keyword(int i) {
			return getRuleContext(KeywordContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public ExecSearchInFileContext(SearchInFileContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecSearchInFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecSearchInFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecSearchInFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchInFileContext searchInFile() throws RecognitionException {
		SearchInFileContext _localctx = new SearchInFileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_searchInFile);
		int _la;
		try {
			setState(197);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ExecSearchInContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(QUOTATION_MARKS);
				setState(172);
				((ExecSearchInContext)_localctx).search_in = keyword();
				setState(173);
				match(QUOTATION_MARKS);
				setState(174);
				match(COMMA);
				setState(176);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(175);
					match(SPACE);
					}
				}

				setState(178);
				((ExecSearchInContext)_localctx).search = searchInFile();
				}
				break;
			case 2:
				_localctx = new ExecSearchInFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(QUOTATION_MARKS);
				setState(181);
				((ExecSearchInFileContext)_localctx).search_by = keyword();
				setState(182);
				match(QUOTATION_MARKS);
				setState(183);
				match(COMMA);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(184);
					match(SPACE);
					}
				}

				setState(187);
				((ExecSearchInFileContext)_localctx).search_value = value();
				setState(188);
				match(COMMA);
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(189);
					match(SPACE);
					}
				}

				setState(192);
				match(QUOTATION_MARKS);
				setState(193);
				((ExecSearchInFileContext)_localctx).search_for = keyword();
				setState(194);
				match(QUOTATION_MARKS);
				setState(195);
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

	public static class ValueContext extends ParserRuleContext {
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	 
		public ValueContext() { }
		public void copyFrom(ValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SearchKeyVarContext extends ValueContext {
		public VariableContext var;
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SearchKeyVarContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSearchKeyVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSearchKeyVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSearchKeyVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchKeyValueContext extends ValueContext {
		public KeywordContext key;
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(AutoTaskParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(AutoTaskParser.QUOTATION_MARKS, i);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public SearchKeyValueContext(ValueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSearchKeyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSearchKeyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSearchKeyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		try {
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case QUOTATION_MARKS:
				_localctx = new SearchKeyValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(QUOTATION_MARKS);
				setState(200);
				((SearchKeyValueContext)_localctx).key = keyword();
				setState(201);
				match(QUOTATION_MARKS);
				}
				break;
			case DOLLAR:
				_localctx = new SearchKeyVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				((SearchKeyVarContext)_localctx).var = variable();
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
		public TerminalNode IF_LABEL() { return getToken(AutoTaskParser.IF_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public TerminalNode BLOCK_START() { return getToken(AutoTaskParser.BLOCK_START, 0); }
		public End_ifContext end_if() {
			return getRuleContext(End_ifContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public OnlyIfContext(If_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterOnlyIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitOnlyIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitOnlyIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseContext extends If_funcContext {
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
		public TerminalNode BLOCK_END() { return getToken(AutoTaskParser.BLOCK_END, 0); }
		public Start_elseContext start_else() {
			return getRuleContext(Start_elseContext.class,0);
		}
		public End_ifContext end_if() {
			return getRuleContext(End_ifContext.class,0);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public IfElseContext(If_funcContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitIfElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitIfElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_funcContext if_func() throws RecognitionException {
		If_funcContext _localctx = new If_funcContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_if_func);
		int _la;
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new OnlyIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(IF_LABEL);
				setState(207);
				match(STMT_START);
				setState(208);
				((OnlyIfContext)_localctx).if_cond = conditions();
				setState(209);
				match(STMT_END);
				setState(210);
				match(BLOCK_START);
				setState(211);
				((OnlyIfContext)_localctx).stmt_if = statements();
				setState(212);
				end_if();
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(IF_LABEL);
				setState(215);
				match(STMT_START);
				setState(216);
				((IfElseContext)_localctx).if_cond = conditions();
				setState(217);
				match(STMT_END);
				setState(218);
				match(BLOCK_START);
				setState(219);
				((IfElseContext)_localctx).stmt_if = statements();
				setState(220);
				match(BLOCK_END);
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(221);
					match(SPACE);
					}
					}
					setState(226);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(227);
				start_else();
				setState(228);
				match(BLOCK_START);
				setState(229);
				((IfElseContext)_localctx).stmt_else = statements();
				setState(230);
				end_if();
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

	public static class End_ifContext extends ParserRuleContext {
		public End_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_if; }
	 
		public End_ifContext() { }
		public void copyFrom(End_ifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecEndIfContext extends End_ifContext {
		public TerminalNode BLOCK_END() { return getToken(AutoTaskParser.BLOCK_END, 0); }
		public ExecEndIfContext(End_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecEndIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecEndIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecEndIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final End_ifContext end_if() throws RecognitionException {
		End_ifContext _localctx = new End_ifContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_end_if);
		try {
			_localctx = new ExecEndIfContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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

	public static class Start_elseContext extends ParserRuleContext {
		public Start_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_else; }
	 
		public Start_elseContext() { }
		public void copyFrom(Start_elseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecStartElseContext extends Start_elseContext {
		public TerminalNode ELSE() { return getToken(AutoTaskParser.ELSE, 0); }
		public ExecStartElseContext(Start_elseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecStartElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecStartElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecStartElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Start_elseContext start_else() throws RecognitionException {
		Start_elseContext _localctx = new Start_elseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_start_else);
		try {
			_localctx = new ExecStartElseContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(ELSE);
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
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public MultipleConditionsContext(ConditionsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterMultipleConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitMultipleConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitMultipleConditions(this);
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
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterSingleConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitSingleConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitSingleConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_conditions);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new MultipleConditionsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				((MultipleConditionsContext)_localctx).right = condition();
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(239);
					match(SPACE);
					}
				}

				setState(242);
				((MultipleConditionsContext)_localctx).conjSign = conjunction();
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(243);
					match(SPACE);
					}
				}

				setState(246);
				((MultipleConditionsContext)_localctx).left = conditions();
				}
				break;
			case 2:
				_localctx = new SingleConditionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
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
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
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
		enterRule(_localctx, 26, RULE_condition);
		int _la;
		try {
			_localctx = new CondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			((CondContext)_localctx).left = object();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(252);
				match(SPACE);
				}
			}

			setState(255);
			((CondContext)_localctx).compSign = comp();
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(256);
				match(SPACE);
				}
			}

			setState(259);
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
		enterRule(_localctx, 28, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
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
		enterRule(_localctx, 30, RULE_conjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
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

	public static class Get_valueContext extends ParserRuleContext {
		public Get_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get_value; }
	 
		public Get_valueContext() { }
		public void copyFrom(Get_valueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecGetValueContext extends Get_valueContext {
		public NumContext form;
		public NumContext attribute;
		public TerminalNode GET_VALUE_LABEL() { return getToken(AutoTaskParser.GET_VALUE_LABEL, 0); }
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public TerminalNode COMMA() { return getToken(AutoTaskParser.COMMA, 0); }
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public List<NumContext> num() {
			return getRuleContexts(NumContext.class);
		}
		public NumContext num(int i) {
			return getRuleContext(NumContext.class,i);
		}
		public TerminalNode SPACE() { return getToken(AutoTaskParser.SPACE, 0); }
		public ExecGetValueContext(Get_valueContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecGetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecGetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecGetValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Get_valueContext get_value() throws RecognitionException {
		Get_valueContext _localctx = new Get_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_get_value);
		int _la;
		try {
			_localctx = new ExecGetValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(GET_VALUE_LABEL);
			setState(266);
			match(STMT_START);
			setState(267);
			((ExecGetValueContext)_localctx).form = num();
			setState(268);
			match(COMMA);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(269);
				match(SPACE);
				}
			}

			setState(272);
			((ExecGetValueContext)_localctx).attribute = num();
			setState(273);
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
		public TerminalNode EQUAL() { return getToken(AutoTaskParser.EQUAL, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public ExecAssignContext(AssignContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		int _la;
		try {
			_localctx = new ExecAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			((ExecAssignContext)_localctx).var = variable();
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(276);
				match(SPACE);
				}
			}

			setState(279);
			match(EQUAL);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(280);
				match(SPACE);
				}
			}

			setState(283);
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
		public TerminalNode DOLLAR() { return getToken(AutoTaskParser.DOLLAR, 0); }
		public Var_labelContext var_label() {
			return getRuleContext(Var_labelContext.class,0);
		}
		public ExecVarContext(VariableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_variable);
		try {
			_localctx = new ExecVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(DOLLAR);
			setState(286);
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
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public ExecOpTimesDivisionContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecOpTimesDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecOpTimesDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecOpTimesDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecOpParenthesisContext extends OpContext {
		public OpContext result;
		public TerminalNode STMT_START() { return getToken(AutoTaskParser.STMT_START, 0); }
		public TerminalNode STMT_END() { return getToken(AutoTaskParser.STMT_END, 0); }
		public OpContext op() {
			return getRuleContext(OpContext.class,0);
		}
		public ExecOpParenthesisContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecOpParenthesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecOpParenthesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecOpParenthesis(this);
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
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public ExecOpPlusMinusContext(OpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecOpPlusMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecOpPlusMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecOpPlusMinus(this);
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
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecOpAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecOpAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecOpAtom(this);
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_op, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case DOLLAR:
			case HASHTAG:
			case QUOTATION_MARKS:
				{
				_localctx = new ExecOpAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(289);
				((ExecOpAtomContext)_localctx).atom = object();
				}
				break;
			case STMT_START:
				{
				_localctx = new ExecOpParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(STMT_START);
				setState(291);
				((ExecOpParenthesisContext)_localctx).result = op(0);
				setState(292);
				match(STMT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(316);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExecOpTimesDivisionContext(new OpContext(_parentctx, _parentState));
						((ExecOpTimesDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_op);
						setState(296);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(298);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(297);
							match(SPACE);
							}
						}

						setState(300);
						((ExecOpTimesDivisionContext)_localctx).sign = sign_td();
						setState(302);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(301);
							match(SPACE);
							}
						}

						setState(304);
						((ExecOpTimesDivisionContext)_localctx).right = op(5);
						}
						break;
					case 2:
						{
						_localctx = new ExecOpPlusMinusContext(new OpContext(_parentctx, _parentState));
						((ExecOpPlusMinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_op);
						setState(306);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(308);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(307);
							match(SPACE);
							}
						}

						setState(310);
						((ExecOpPlusMinusContext)_localctx).sign = sign_pm();
						setState(312);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(311);
							match(SPACE);
							}
						}

						setState(314);
						((ExecOpPlusMinusContext)_localctx).right = op(4);
						}
						break;
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
	public static class ObjectFileSearchContext extends ObjectContext {
		public FileSearchContext res;
		public TerminalNode HASHTAG() { return getToken(AutoTaskParser.HASHTAG, 0); }
		public FileSearchContext fileSearch() {
			return getRuleContext(FileSearchContext.class,0);
		}
		public ObjectFileSearchContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterObjectFileSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitObjectFileSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitObjectFileSearch(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectGetValueContext extends ObjectContext {
		public Get_valueContext res;
		public TerminalNode HASHTAG() { return getToken(AutoTaskParser.HASHTAG, 0); }
		public Get_valueContext get_value() {
			return getRuleContext(Get_valueContext.class,0);
		}
		public ObjectGetValueContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterObjectGetValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitObjectGetValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitObjectGetValue(this);
			else return visitor.visitChildren(this);
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
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterObjectNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitObjectNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitObjectNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectTextContext extends ObjectContext {
		public StringContext objText;
		public List<TerminalNode> QUOTATION_MARKS() { return getTokens(AutoTaskParser.QUOTATION_MARKS); }
		public TerminalNode QUOTATION_MARKS(int i) {
			return getToken(AutoTaskParser.QUOTATION_MARKS, i);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public ObjectTextContext(ObjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterObjectText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitObjectText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitObjectText(this);
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
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterObjectVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitObjectVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitObjectVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_object);
		try {
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new ObjectVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				((ObjectVariableContext)_localctx).var = variable();
				}
				break;
			case 2:
				_localctx = new ObjectNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				((ObjectNumberContext)_localctx).objNumber = num();
				}
				break;
			case 3:
				_localctx = new ObjectTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(QUOTATION_MARKS);
				setState(324);
				((ObjectTextContext)_localctx).objText = string();
				setState(325);
				match(QUOTATION_MARKS);
				}
				break;
			case 4:
				_localctx = new ObjectFileSearchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(327);
				match(HASHTAG);
				setState(328);
				((ObjectFileSearchContext)_localctx).res = fileSearch();
				}
				break;
			case 5:
				_localctx = new ObjectGetValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(HASHTAG);
				setState(330);
				((ObjectGetValueContext)_localctx).res = get_value();
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

	public static class Sign_tdContext extends ParserRuleContext {
		public TerminalNode TIMES() { return getToken(AutoTaskParser.TIMES, 0); }
		public TerminalNode FORWARD_SLASH() { return getToken(AutoTaskParser.FORWARD_SLASH, 0); }
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
		enterRule(_localctx, 42, RULE_sign_td);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==TIMES || _la==FORWARD_SLASH) ) {
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
		enterRule(_localctx, 44, RULE_sign_pm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
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
		public List<TerminalNode> NUM() { return getTokens(AutoTaskParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(AutoTaskParser.NUM, i);
		}
		public TerminalNode DOT() { return getToken(AutoTaskParser.DOT, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_num);
		int _la;
		try {
			int _alt;
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(338); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(337);
						match(NUM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(340); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(342);
					match(NUM);
					}
					}
					setState(345); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				setState(347);
				match(DOT);
				setState(349); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(348);
						match(NUM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(351); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class StringContext extends ParserRuleContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<AlphanumericContext> alphanumeric() {
			return getRuleContexts(AlphanumericContext.class);
		}
		public AlphanumericContext alphanumeric(int i) {
			return getRuleContext(AlphanumericContext.class,i);
		}
		public CharactersContext characters() {
			return getRuleContext(CharactersContext.class,0);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_string);
		int _la;
		try {
			int _alt;
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(356); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(355);
						alphanumeric();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(358); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(360);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				characters();
				setState(363);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(366); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(365);
					alphanumeric();
					}
					}
					setState(368); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				characters();
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

	public static class CharactersContext extends ParserRuleContext {
		public TerminalNode SPACE() { return getToken(AutoTaskParser.SPACE, 0); }
		public TerminalNode COLON() { return getToken(AutoTaskParser.COLON, 0); }
		public TerminalNode COMMA() { return getToken(AutoTaskParser.COMMA, 0); }
		public TerminalNode HYPHEN() { return getToken(AutoTaskParser.HYPHEN, 0); }
		public TerminalNode EUR() { return getToken(AutoTaskParser.EUR, 0); }
		public CharactersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterCharacters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitCharacters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitCharacters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharactersContext characters() throws RecognitionException {
		CharactersContext _localctx = new CharactersContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_characters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EUR) | (1L << HYPHEN) | (1L << COLON) | (1L << COMMA) | (1L << SPACE))) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_email);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(375);
				alphanumeric();
				}
				}
				setState(378); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(380);
			match(AT);
			setState(382); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(381);
				alphanumeric();
				}
				}
				setState(384); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(386);
			match(DOT);
			setState(388); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(387);
				alphanumeric();
				}
				}
				setState(390); 
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
		enterRule(_localctx, 54, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(392);
				alphanumeric();
				}
				}
				setState(395); 
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
		public SubjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subject; }
	 
		public SubjectContext() { }
		public void copyFrom(SubjectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecSubjectContext extends SubjectContext {
		public Email_textContext text;
		public Email_textContext email_text() {
			return getRuleContext(Email_textContext.class,0);
		}
		public ExecSubjectContext(SubjectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecSubject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecSubject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecSubject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubjectContext subject() throws RecognitionException {
		SubjectContext _localctx = new SubjectContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_subject);
		try {
			_localctx = new ExecSubjectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			((ExecSubjectContext)_localctx).text = email_text();
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
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
	 
		public BodyContext() { }
		public void copyFrom(BodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExecBodyContext extends BodyContext {
		public Email_textContext text;
		public Email_textContext email_text() {
			return getRuleContext(Email_textContext.class,0);
		}
		public ExecBodyContext(BodyContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterExecBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitExecBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitExecBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_body);
		try {
			_localctx = new ExecBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			((ExecBodyContext)_localctx).text = email_text();
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

	public static class Email_textContext extends ParserRuleContext {
		public Email_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_email_text; }
	 
		public Email_textContext() { }
		public void copyFrom(Email_textContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BodyObjectContext extends Email_textContext {
		public ObjectContext obj;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public BodyObjectContext(Email_textContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterBodyObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitBodyObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitBodyObject(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BodySpacesObjectContext extends Email_textContext {
		public ObjectContext obj;
		public Token spaces;
		public BodyContext rest;
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> SPACE() { return getTokens(AutoTaskParser.SPACE); }
		public TerminalNode SPACE(int i) {
			return getToken(AutoTaskParser.SPACE, i);
		}
		public BodySpacesObjectContext(Email_textContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).enterBodySpacesObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AutoTaskListener ) ((AutoTaskListener)listener).exitBodySpacesObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AutoTaskVisitor ) return ((AutoTaskVisitor<? extends T>)visitor).visitBodySpacesObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Email_textContext email_text() throws RecognitionException {
		Email_textContext _localctx = new Email_textContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_email_text);
		int _la;
		try {
			setState(410);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				_localctx = new BodySpacesObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				((BodySpacesObjectContext)_localctx).obj = object();
				setState(403); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(402);
					((BodySpacesObjectContext)_localctx).spaces = match(SPACE);
					}
					}
					setState(405); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(407);
				((BodySpacesObjectContext)_localctx).rest = body();
				}
				break;
			case 2:
				_localctx = new BodyObjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(409);
				((BodyObjectContext)_localctx).obj = object();
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
		enterRule(_localctx, 62, RULE_var_label);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			match(LOWERCASE);
			setState(416);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(413);
					alphanumeric();
					}
					} 
				}
				setState(418);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
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
		enterRule(_localctx, 64, RULE_alphanumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
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
		enterRule(_localctx, 66, RULE_system_name);
		try {
			setState(425);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case LOWERCASE:
			case UPPERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				alphanumeric();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(422);
				match(DOT);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(423);
				match(UNDERSCORE);
				}
				break;
			case HYPHEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(424);
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
		enterRule(_localctx, 68, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 19:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u01b0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3P\n\3\r\3\16\3"+
		"Q\3\4\3\4\3\4\3\5\3\5\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\6\3\6\3\6"+
		"\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\3\6\3\6\3\6\7\6n\n\6\f\6\16\6q\13\6\3"+
		"\6\3\6\3\6\7\6v\n\6\f\6\16\6y\13\6\3\6\3\6\3\6\7\6~\n\6\f\6\16\6\u0081"+
		"\13\6\3\6\3\6\3\6\5\6\u0086\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u008f"+
		"\n\7\3\7\3\7\3\7\5\7\u0094\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u009e"+
		"\n\7\3\7\3\7\3\7\5\7\u00a3\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00aa\n\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00bc"+
		"\n\t\3\t\3\t\3\t\5\t\u00c1\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c8\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u00cf\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00e1\n\13\f\13\16\13\u00e4"+
		"\13\13\3\13\3\13\3\13\3\13\3\13\5\13\u00eb\n\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\5\16\u00f3\n\16\3\16\3\16\5\16\u00f7\n\16\3\16\3\16\3\16\5\16\u00fc"+
		"\n\16\3\17\3\17\5\17\u0100\n\17\3\17\3\17\5\17\u0104\n\17\3\17\3\17\3"+
		"\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0111\n\22\3\22\3\22"+
		"\3\22\3\23\3\23\5\23\u0118\n\23\3\23\3\23\5\23\u011c\n\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0129\n\25\3\25\3\25"+
		"\5\25\u012d\n\25\3\25\3\25\5\25\u0131\n\25\3\25\3\25\3\25\3\25\5\25\u0137"+
		"\n\25\3\25\3\25\5\25\u013b\n\25\3\25\3\25\7\25\u013f\n\25\f\25\16\25\u0142"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u014e\n"+
		"\26\3\27\3\27\3\30\3\30\3\31\6\31\u0155\n\31\r\31\16\31\u0156\3\31\6\31"+
		"\u015a\n\31\r\31\16\31\u015b\3\31\3\31\6\31\u0160\n\31\r\31\16\31\u0161"+
		"\5\31\u0164\n\31\3\32\6\32\u0167\n\32\r\32\16\32\u0168\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\6\32\u0171\n\32\r\32\16\32\u0172\3\32\5\32\u0176\n\32"+
		"\3\33\3\33\3\34\6\34\u017b\n\34\r\34\16\34\u017c\3\34\3\34\6\34\u0181"+
		"\n\34\r\34\16\34\u0182\3\34\3\34\6\34\u0187\n\34\r\34\16\34\u0188\3\35"+
		"\6\35\u018c\n\35\r\35\16\35\u018d\3\36\3\36\3\37\3\37\3 \3 \6 \u0196\n"+
		" \r \16 \u0197\3 \3 \3 \5 \u019d\n \3!\3!\7!\u01a1\n!\f!\16!\u01a4\13"+
		"!\3\"\3\"\3#\3#\3#\3#\5#\u01ac\n#\3$\3$\3$\2\3(%\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\t\3\2\34!\3\2\"#\4\2"+
		"\21\21\33\33\3\2\17\20\6\2\16\16\20\20$%**\3\2\13\r\3\2\f\r\2\u01c8\2"+
		"H\3\2\2\2\4O\3\2\2\2\6S\3\2\2\2\bV\3\2\2\2\n\u0085\3\2\2\2\f\u00a2\3\2"+
		"\2\2\16\u00a4\3\2\2\2\20\u00c7\3\2\2\2\22\u00ce\3\2\2\2\24\u00ea\3\2\2"+
		"\2\26\u00ec\3\2\2\2\30\u00ee\3\2\2\2\32\u00fb\3\2\2\2\34\u00fd\3\2\2\2"+
		"\36\u0107\3\2\2\2 \u0109\3\2\2\2\"\u010b\3\2\2\2$\u0115\3\2\2\2&\u011f"+
		"\3\2\2\2(\u0128\3\2\2\2*\u014d\3\2\2\2,\u014f\3\2\2\2.\u0151\3\2\2\2\60"+
		"\u0163\3\2\2\2\62\u0175\3\2\2\2\64\u0177\3\2\2\2\66\u017a\3\2\2\28\u018b"+
		"\3\2\2\2:\u018f\3\2\2\2<\u0191\3\2\2\2>\u019c\3\2\2\2@\u019e\3\2\2\2B"+
		"\u01a5\3\2\2\2D\u01ab\3\2\2\2F\u01ad\3\2\2\2HI\5\6\4\2IJ\5\b\5\2JK\7\22"+
		"\2\2KL\5\4\3\2LM\7\23\2\2M\3\3\2\2\2NP\5\n\6\2ON\3\2\2\2PQ\3\2\2\2QO\3"+
		"\2\2\2QR\3\2\2\2R\5\3\2\2\2ST\7&\2\2TU\7\7\2\2U\7\3\2\2\2VW\7\3\2\2W\t"+
		"\3\2\2\2XZ\7*\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2"+
		"][\3\2\2\2^_\7&\2\2_`\5\f\7\2`a\7)\2\2a\u0086\3\2\2\2bd\7*\2\2cb\3\2\2"+
		"\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2\2\2hi\7&\2\2ij\5\16\b"+
		"\2jk\7)\2\2k\u0086\3\2\2\2ln\7*\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3"+
		"\2\2\2pr\3\2\2\2qo\3\2\2\2rs\7&\2\2s\u0086\5\24\13\2tv\7*\2\2ut\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7&\2\2{\u0086\5"+
		"\"\22\2|~\7*\2\2}|\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2"+
		"\2\u0080\u0082\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\5$\23\2\u0083\u0084"+
		"\7)\2\2\u0084\u0086\3\2\2\2\u0085[\3\2\2\2\u0085e\3\2\2\2\u0085o\3\2\2"+
		"\2\u0085w\3\2\2\2\u0085\177\3\2\2\2\u0086\13\3\2\2\2\u0087\u0088\7\5\2"+
		"\2\u0088\u0089\7\24\2\2\u0089\u008a\7(\2\2\u008a\u008b\5\66\34\2\u008b"+
		"\u008c\7(\2\2\u008c\u008e\7%\2\2\u008d\u008f\7*\2\2\u008e\u008d\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\5:\36\2\u0091\u0093"+
		"\7%\2\2\u0092\u0094\7*\2\2\u0093\u0092\3\2\2\2\u0093\u0094\3\2\2\2\u0094"+
		"\u0095\3\2\2\2\u0095\u0096\5<\37\2\u0096\u0097\7\25\2\2\u0097\u00a3\3"+
		"\2\2\2\u0098\u0099\7\5\2\2\u0099\u009a\7\24\2\2\u009a\u009b\5:\36\2\u009b"+
		"\u009d\7%\2\2\u009c\u009e\7*\2\2\u009d\u009c\3\2\2\2\u009d\u009e\3\2\2"+
		"\2\u009e\u009f\3\2\2\2\u009f\u00a0\5<\37\2\u00a0\u00a1\7\25\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u0087\3\2\2\2\u00a2\u0098\3\2\2\2\u00a3\r\3\2\2\2"+
		"\u00a4\u00a5\7\4\2\2\u00a5\u00a6\7\24\2\2\u00a6\u00a7\5\60\31\2\u00a7"+
		"\u00a9\7%\2\2\u00a8\u00aa\7*\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2"+
		"\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\5\20\t\2\u00ac\17\3\2\2\2\u00ad\u00ae"+
		"\7(\2\2\u00ae\u00af\58\35\2\u00af\u00b0\7(\2\2\u00b0\u00b2\7%\2\2\u00b1"+
		"\u00b3\7*\2\2\u00b2\u00b1\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\5\20\t\2\u00b5\u00c8\3\2\2\2\u00b6\u00b7\7(\2\2\u00b7"+
		"\u00b8\58\35\2\u00b8\u00b9\7(\2\2\u00b9\u00bb\7%\2\2\u00ba\u00bc\7*\2"+
		"\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be"+
		"\5\22\n\2\u00be\u00c0\7%\2\2\u00bf\u00c1\7*\2\2\u00c0\u00bf\3\2\2\2\u00c0"+
		"\u00c1\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\7(\2\2\u00c3\u00c4\58\35"+
		"\2\u00c4\u00c5\7(\2\2\u00c5\u00c6\7\25\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00ad"+
		"\3\2\2\2\u00c7\u00b6\3\2\2\2\u00c8\21\3\2\2\2\u00c9\u00ca\7(\2\2\u00ca"+
		"\u00cb\58\35\2\u00cb\u00cc\7(\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cf\5&\24"+
		"\2\u00ce\u00c9\3\2\2\2\u00ce\u00cd\3\2\2\2\u00cf\23\3\2\2\2\u00d0\u00d1"+
		"\7\b\2\2\u00d1\u00d2\7\24\2\2\u00d2\u00d3\5\32\16\2\u00d3\u00d4\7\25\2"+
		"\2\u00d4\u00d5\7\22\2\2\u00d5\u00d6\5\4\3\2\u00d6\u00d7\5\26\f\2\u00d7"+
		"\u00eb\3\2\2\2\u00d8\u00d9\7\b\2\2\u00d9\u00da\7\24\2\2\u00da\u00db\5"+
		"\32\16\2\u00db\u00dc\7\25\2\2\u00dc\u00dd\7\22\2\2\u00dd\u00de\5\4\3\2"+
		"\u00de\u00e2\7\23\2\2\u00df\u00e1\7*\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4"+
		"\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e6\5\30\r\2\u00e6\u00e7\7\22\2\2\u00e7\u00e8\5"+
		"\4\3\2\u00e8\u00e9\5\26\f\2\u00e9\u00eb\3\2\2\2\u00ea\u00d0\3\2\2\2\u00ea"+
		"\u00d8\3\2\2\2\u00eb\25\3\2\2\2\u00ec\u00ed\7\23\2\2\u00ed\27\3\2\2\2"+
		"\u00ee\u00ef\7\t\2\2\u00ef\31\3\2\2\2\u00f0\u00f2\5\34\17\2\u00f1\u00f3"+
		"\7*\2\2\u00f2\u00f1\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4"+
		"\u00f6\5 \21\2\u00f5\u00f7\7*\2\2\u00f6\u00f5\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\5\32\16\2\u00f9\u00fc\3\2\2\2\u00fa"+
		"\u00fc\5\34\17\2\u00fb\u00f0\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\33\3\2"+
		"\2\2\u00fd\u00ff\5*\26\2\u00fe\u0100\7*\2\2\u00ff\u00fe\3\2\2\2\u00ff"+
		"\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0103\5\36\20\2\u0102\u0104\7"+
		"*\2\2\u0103\u0102\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\5*\26\2\u0106\35\3\2\2\2\u0107\u0108\t\2\2\2\u0108\37\3\2\2\2\u0109"+
		"\u010a\t\3\2\2\u010a!\3\2\2\2\u010b\u010c\7\6\2\2\u010c\u010d\7\24\2\2"+
		"\u010d\u010e\5\60\31\2\u010e\u0110\7%\2\2\u010f\u0111\7*\2\2\u0110\u010f"+
		"\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\5\60\31\2"+
		"\u0113\u0114\7\25\2\2\u0114#\3\2\2\2\u0115\u0117\5&\24\2\u0116\u0118\7"+
		"*\2\2\u0117\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u0119\3\2\2\2\u0119"+
		"\u011b\7\30\2\2\u011a\u011c\7*\2\2\u011b\u011a\3\2\2\2\u011b\u011c\3\2"+
		"\2\2\u011c\u011d\3\2\2\2\u011d\u011e\5(\25\2\u011e%\3\2\2\2\u011f\u0120"+
		"\7\32\2\2\u0120\u0121\5@!\2\u0121\'\3\2\2\2\u0122\u0123\b\25\1\2\u0123"+
		"\u0129\5*\26\2\u0124\u0125\7\24\2\2\u0125\u0126\5(\25\2\u0126\u0127\7"+
		"\25\2\2\u0127\u0129\3\2\2\2\u0128\u0122\3\2\2\2\u0128\u0124\3\2\2\2\u0129"+
		"\u0140\3\2\2\2\u012a\u012c\f\6\2\2\u012b\u012d\7*\2\2\u012c\u012b\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u0130\5,\27\2\u012f"+
		"\u0131\7*\2\2\u0130\u012f\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0132\3\2"+
		"\2\2\u0132\u0133\5(\25\7\u0133\u013f\3\2\2\2\u0134\u0136\f\5\2\2\u0135"+
		"\u0137\7*\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\3\2"+
		"\2\2\u0138\u013a\5.\30\2\u0139\u013b\7*\2\2\u013a\u0139\3\2\2\2\u013a"+
		"\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c\u013d\5(\25\6\u013d\u013f\3\2"+
		"\2\2\u013e\u012a\3\2\2\2\u013e\u0134\3\2\2\2\u013f\u0142\3\2\2\2\u0140"+
		"\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141)\3\2\2\2\u0142\u0140\3\2\2\2"+
		"\u0143\u014e\5&\24\2\u0144\u014e\5\60\31\2\u0145\u0146\7(\2\2\u0146\u0147"+
		"\5\62\32\2\u0147\u0148\7(\2\2\u0148\u014e\3\2\2\2\u0149\u014a\7&\2\2\u014a"+
		"\u014e\5\16\b\2\u014b\u014c\7&\2\2\u014c\u014e\5\"\22\2\u014d\u0143\3"+
		"\2\2\2\u014d\u0144\3\2\2\2\u014d\u0145\3\2\2\2\u014d\u0149\3\2\2\2\u014d"+
		"\u014b\3\2\2\2\u014e+\3\2\2\2\u014f\u0150\t\4\2\2\u0150-\3\2\2\2\u0151"+
		"\u0152\t\5\2\2\u0152/\3\2\2\2\u0153\u0155\7\13\2\2\u0154\u0153\3\2\2\2"+
		"\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156\u0157\3\2\2\2\u0157\u0164"+
		"\3\2\2\2\u0158\u015a\7\13\2\2\u0159\u0158\3\2\2\2\u015a\u015b\3\2\2\2"+
		"\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015f"+
		"\7\27\2\2\u015e\u0160\7\13\2\2\u015f\u015e\3\2\2\2\u0160\u0161\3\2\2\2"+
		"\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0164\3\2\2\2\u0163\u0154"+
		"\3\2\2\2\u0163\u0159\3\2\2\2\u0164\61\3\2\2\2\u0165\u0167\5B\"\2\u0166"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016a\3\2\2\2\u016a\u016b\5\62\32\2\u016b\u0176\3\2\2\2\u016c"+
		"\u016d\5\64\33\2\u016d\u016e\5\62\32\2\u016e\u0176\3\2\2\2\u016f\u0171"+
		"\5B\"\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0176\3\2\2\2\u0174\u0176\5\64\33\2\u0175\u0166\3"+
		"\2\2\2\u0175\u016c\3\2\2\2\u0175\u0170\3\2\2\2\u0175\u0174\3\2\2\2\u0176"+
		"\63\3\2\2\2\u0177\u0178\t\6\2\2\u0178\65\3\2\2\2\u0179\u017b\5B\"\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u0180\7\26\2\2\u017f\u0181\5B\"\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0184\3\2\2\2\u0184\u0186\7\27\2\2\u0185\u0187\5B\"\2\u0186"+
		"\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2"+
		"\2\2\u0189\67\3\2\2\2\u018a\u018c\5B\"\2\u018b\u018a\3\2\2\2\u018c\u018d"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018e\3\2\2\2\u018e9\3\2\2\2\u018f"+
		"\u0190\5> \2\u0190;\3\2\2\2\u0191\u0192\5> \2\u0192=\3\2\2\2\u0193\u0195"+
		"\5*\26\2\u0194\u0196\7*\2\2\u0195\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\5<"+
		"\37\2\u019a\u019d\3\2\2\2\u019b\u019d\5*\26\2\u019c\u0193\3\2\2\2\u019c"+
		"\u019b\3\2\2\2\u019d?\3\2\2\2\u019e\u01a2\7\f\2\2\u019f\u01a1\5B\"\2\u01a0"+
		"\u019f\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a2\u01a3\3\2"+
		"\2\2\u01a3A\3\2\2\2\u01a4\u01a2\3\2\2\2\u01a5\u01a6\t\7\2\2\u01a6C\3\2"+
		"\2\2\u01a7\u01ac\5B\"\2\u01a8\u01ac\7\27\2\2\u01a9\u01ac\7\'\2\2\u01aa"+
		"\u01ac\7\20\2\2\u01ab\u01a7\3\2\2\2\u01ab\u01a8\3\2\2\2\u01ab\u01a9\3"+
		"\2\2\2\u01ab\u01aa\3\2\2\2\u01acE\3\2\2\2\u01ad\u01ae\t\b\2\2\u01aeG\3"+
		"\2\2\2\64Q[eow\177\u0085\u008e\u0093\u009d\u00a2\u00a9\u00b2\u00bb\u00c0"+
		"\u00c7\u00ce\u00e2\u00ea\u00f2\u00f6\u00fb\u00ff\u0103\u0110\u0117\u011b"+
		"\u0128\u012c\u0130\u0136\u013a\u013e\u0140\u014d\u0156\u015b\u0161\u0163"+
		"\u0168\u0172\u0175\u017c\u0182\u0188\u018d\u0197\u019c\u01a2\u01ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}