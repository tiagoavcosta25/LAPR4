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
		RULE_sendEmail = 5, RULE_fileSearch = 6, RULE_searchInFile = 7, RULE_if_func = 8, 
		RULE_conditions = 9, RULE_condition = 10, RULE_comp = 11, RULE_conjunction = 12, 
		RULE_get_value = 13, RULE_assign = 14, RULE_variable = 15, RULE_op = 16, 
		RULE_object = 17, RULE_sign_td = 18, RULE_sign_pm = 19, RULE_num = 20, 
		RULE_string = 21, RULE_characters = 22, RULE_email = 23, RULE_keyword = 24, 
		RULE_subject = 25, RULE_body = 26, RULE_email_text = 27, RULE_var_label = 28, 
		RULE_alphanumeric = 29, RULE_system_name = 30, RULE_alpha = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statements", "header", "type", "statement", "sendEmail", "fileSearch", 
			"searchInFile", "if_func", "conditions", "condition", "comp", "conjunction", 
			"get_value", "assign", "variable", "op", "object", "sign_td", "sign_pm", 
			"num", "string", "characters", "email", "keyword", "subject", "body", 
			"email_text", "var_label", "alphanumeric", "system_name", "alpha"
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
			setState(64);
			header();
			setState(65);
			type();
			setState(66);
			match(BLOCK_START);
			setState(67);
			((ExecStartContext)_localctx).stmts = statements();
			setState(68);
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
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				((ExecStatementsContext)_localctx).stmt = statement();
				}
				}
				setState(73); 
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
			setState(75);
			match(HASHTAG);
			setState(76);
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
			setState(78);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new StmtSendEmailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(80);
					match(SPACE);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(HASHTAG);
				setState(87);
				((StmtSendEmailContext)_localctx).stmt = sendEmail();
				setState(88);
				match(END);
				}
				break;
			case 2:
				_localctx = new StmtFileSearchContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(90);
					match(SPACE);
					}
					}
					setState(95);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(96);
				match(HASHTAG);
				setState(97);
				((StmtFileSearchContext)_localctx).stmt = fileSearch();
				setState(98);
				match(END);
				}
				break;
			case 3:
				_localctx = new StmtIfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(100);
					match(SPACE);
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(HASHTAG);
				setState(107);
				((StmtIfContext)_localctx).stmt = if_func();
				}
				break;
			case 4:
				_localctx = new StmtGetValueContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(108);
					match(SPACE);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(HASHTAG);
				setState(115);
				((StmtGetValueContext)_localctx).stmt = get_value();
				}
				break;
			case 5:
				_localctx = new StmtAssignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(116);
					match(SPACE);
					}
					}
					setState(121);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				((StmtAssignContext)_localctx).stmt = assign();
				setState(123);
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
			setState(154);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ExecSendEmailContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(SEND_EMAIL_LABEL);
				setState(128);
				match(STMT_START);
				setState(129);
				match(QUOTATION_MARKS);
				setState(130);
				((ExecSendEmailContext)_localctx).em = email();
				setState(131);
				match(QUOTATION_MARKS);
				setState(132);
				match(COMMA);
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(133);
					match(SPACE);
					}
				}

				setState(136);
				((ExecSendEmailContext)_localctx).sub = subject();
				setState(137);
				match(COMMA);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(138);
					match(SPACE);
					}
				}

				setState(141);
				((ExecSendEmailContext)_localctx).email_body = body();
				setState(142);
				match(STMT_END);
				}
				break;
			case 2:
				_localctx = new ExecSendEmailCollabContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				match(SEND_EMAIL_LABEL);
				setState(145);
				match(STMT_START);
				setState(146);
				((ExecSendEmailCollabContext)_localctx).sub = subject();
				setState(147);
				match(COMMA);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(148);
					match(SPACE);
					}
				}

				setState(151);
				((ExecSendEmailCollabContext)_localctx).email_body = body();
				setState(152);
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
			setState(156);
			match(FILE_SEARCH_LABEL);
			setState(157);
			match(STMT_START);
			setState(158);
			((ExecFileSearchContext)_localctx).fp = num();
			setState(159);
			match(COMMA);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(160);
				match(SPACE);
				}
			}

			setState(163);
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
		public KeywordContext search_value;
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
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ExecSearchInContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(QUOTATION_MARKS);
				setState(166);
				((ExecSearchInContext)_localctx).search_in = keyword();
				setState(167);
				match(QUOTATION_MARKS);
				setState(168);
				match(COMMA);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(169);
					match(SPACE);
					}
				}

				setState(172);
				((ExecSearchInContext)_localctx).search = searchInFile();
				}
				break;
			case 2:
				_localctx = new ExecSearchInFileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				match(QUOTATION_MARKS);
				setState(175);
				((ExecSearchInFileContext)_localctx).search_by = keyword();
				setState(176);
				match(QUOTATION_MARKS);
				setState(177);
				match(COMMA);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(178);
					match(SPACE);
					}
				}

				setState(181);
				match(QUOTATION_MARKS);
				setState(182);
				((ExecSearchInFileContext)_localctx).search_value = keyword();
				setState(183);
				match(QUOTATION_MARKS);
				setState(184);
				match(COMMA);
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(185);
					match(SPACE);
					}
				}

				setState(188);
				match(QUOTATION_MARKS);
				setState(189);
				((ExecSearchInFileContext)_localctx).search_for = keyword();
				setState(190);
				match(QUOTATION_MARKS);
				setState(191);
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
		public TerminalNode BLOCK_END() { return getToken(AutoTaskParser.BLOCK_END, 0); }
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
		enterRule(_localctx, 16, RULE_if_func);
		int _la;
		try {
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new OnlyIfContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(IF_LABEL);
				setState(196);
				match(STMT_START);
				setState(197);
				((OnlyIfContext)_localctx).if_cond = conditions();
				setState(198);
				match(STMT_END);
				setState(199);
				match(BLOCK_START);
				setState(200);
				((OnlyIfContext)_localctx).stmt_if = statements();
				setState(201);
				match(BLOCK_END);
				}
				break;
			case 2:
				_localctx = new IfElseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(IF_LABEL);
				setState(204);
				match(STMT_START);
				setState(205);
				((IfElseContext)_localctx).if_cond = conditions();
				setState(206);
				match(STMT_END);
				setState(207);
				match(BLOCK_START);
				setState(208);
				((IfElseContext)_localctx).stmt_if = statements();
				setState(209);
				match(BLOCK_END);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SPACE) {
					{
					{
					setState(210);
					match(SPACE);
					}
					}
					setState(215);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(216);
				match(ELSE);
				setState(217);
				match(BLOCK_START);
				setState(218);
				((IfElseContext)_localctx).stmt_else = statements();
				setState(219);
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
		enterRule(_localctx, 18, RULE_conditions);
		int _la;
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				_localctx = new MultipleConditionsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				((MultipleConditionsContext)_localctx).right = condition();
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(224);
					match(SPACE);
					}
				}

				setState(227);
				((MultipleConditionsContext)_localctx).conjSign = conjunction();
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SPACE) {
					{
					setState(228);
					match(SPACE);
					}
				}

				setState(231);
				((MultipleConditionsContext)_localctx).left = conditions();
				}
				break;
			case 2:
				_localctx = new SingleConditionsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
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
		enterRule(_localctx, 20, RULE_condition);
		int _la;
		try {
			_localctx = new CondContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			((CondContext)_localctx).left = object();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(237);
				match(SPACE);
				}
			}

			setState(240);
			((CondContext)_localctx).compSign = comp();
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(241);
				match(SPACE);
				}
			}

			setState(244);
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
		enterRule(_localctx, 22, RULE_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
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
			setState(248);
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
		enterRule(_localctx, 26, RULE_get_value);
		int _la;
		try {
			_localctx = new ExecGetValueContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(GET_VALUE_LABEL);
			setState(251);
			match(STMT_START);
			setState(252);
			((ExecGetValueContext)_localctx).form = num();
			setState(253);
			match(COMMA);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(254);
				match(SPACE);
				}
			}

			setState(257);
			((ExecGetValueContext)_localctx).attribute = num();
			setState(258);
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
		enterRule(_localctx, 28, RULE_assign);
		int _la;
		try {
			_localctx = new ExecAssignContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			((ExecAssignContext)_localctx).var = variable();
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(261);
				match(SPACE);
				}
			}

			setState(264);
			match(EQUAL);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SPACE) {
				{
				setState(265);
				match(SPACE);
				}
			}

			setState(268);
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
		enterRule(_localctx, 30, RULE_variable);
		try {
			_localctx = new ExecVarContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(DOLLAR);
			setState(271);
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_op, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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

				setState(274);
				((ExecOpAtomContext)_localctx).atom = object();
				}
				break;
			case STMT_START:
				{
				_localctx = new ExecOpParenthesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(275);
				match(STMT_START);
				setState(276);
				((ExecOpParenthesisContext)_localctx).result = op(0);
				setState(277);
				match(STMT_END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(303);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExecOpTimesDivisionContext(new OpContext(_parentctx, _parentState));
						((ExecOpTimesDivisionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_op);
						setState(281);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(283);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(282);
							match(SPACE);
							}
						}

						setState(285);
						((ExecOpTimesDivisionContext)_localctx).sign = sign_td();
						setState(287);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(286);
							match(SPACE);
							}
						}

						setState(289);
						((ExecOpTimesDivisionContext)_localctx).right = op(5);
						}
						break;
					case 2:
						{
						_localctx = new ExecOpPlusMinusContext(new OpContext(_parentctx, _parentState));
						((ExecOpPlusMinusContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_op);
						setState(291);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(293);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(292);
							match(SPACE);
							}
						}

						setState(295);
						((ExecOpPlusMinusContext)_localctx).sign = sign_pm();
						setState(297);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==SPACE) {
							{
							setState(296);
							match(SPACE);
							}
						}

						setState(299);
						((ExecOpPlusMinusContext)_localctx).right = op(4);
						}
						break;
					}
					} 
				}
				setState(305);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		enterRule(_localctx, 34, RULE_object);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new ObjectVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				((ObjectVariableContext)_localctx).var = variable();
				}
				break;
			case 2:
				_localctx = new ObjectNumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				((ObjectNumberContext)_localctx).objNumber = num();
				}
				break;
			case 3:
				_localctx = new ObjectTextContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(QUOTATION_MARKS);
				setState(309);
				((ObjectTextContext)_localctx).objText = string();
				setState(310);
				match(QUOTATION_MARKS);
				}
				break;
			case 4:
				_localctx = new ObjectFileSearchContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(312);
				match(HASHTAG);
				setState(313);
				((ObjectFileSearchContext)_localctx).res = fileSearch();
				}
				break;
			case 5:
				_localctx = new ObjectGetValueContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				match(HASHTAG);
				setState(315);
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
		enterRule(_localctx, 36, RULE_sign_td);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
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
		enterRule(_localctx, 38, RULE_sign_pm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
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
		enterRule(_localctx, 40, RULE_num);
		int _la;
		try {
			int _alt;
			setState(338);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(322);
						match(NUM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(325); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(328); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(327);
					match(NUM);
					}
					}
					setState(330); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NUM );
				setState(332);
				match(DOT);
				setState(334); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(333);
						match(NUM);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(336); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
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
		enterRule(_localctx, 42, RULE_string);
		int _la;
		try {
			int _alt;
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(340);
						alphanumeric();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(343); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(345);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				characters();
				setState(348);
				string();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(350);
					alphanumeric();
					}
					}
					setState(353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
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
		enterRule(_localctx, 44, RULE_characters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		enterRule(_localctx, 46, RULE_email);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360);
				alphanumeric();
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(365);
			match(AT);
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(366);
				alphanumeric();
				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE))) != 0) );
			setState(371);
			match(DOT);
			setState(373); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(372);
				alphanumeric();
				}
				}
				setState(375); 
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
		enterRule(_localctx, 48, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(377);
				alphanumeric();
				}
				}
				setState(380); 
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
		enterRule(_localctx, 50, RULE_subject);
		try {
			_localctx = new ExecSubjectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
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
		enterRule(_localctx, 52, RULE_body);
		try {
			_localctx = new ExecBodyContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
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
		enterRule(_localctx, 54, RULE_email_text);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new BodySpacesObjectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				((BodySpacesObjectContext)_localctx).obj = object();
				setState(388); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(387);
					((BodySpacesObjectContext)_localctx).spaces = match(SPACE);
					}
					}
					setState(390); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==SPACE );
				setState(392);
				((BodySpacesObjectContext)_localctx).rest = body();
				}
				break;
			case 2:
				_localctx = new BodyObjectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
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
		enterRule(_localctx, 56, RULE_var_label);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			match(LOWERCASE);
			setState(401);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(398);
					alphanumeric();
					}
					} 
				}
				setState(403);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 58, RULE_alphanumeric);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
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
		enterRule(_localctx, 60, RULE_system_name);
		try {
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
			case LOWERCASE:
			case UPPERCASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(406);
				alphanumeric();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
				match(DOT);
				}
				break;
			case UNDERSCORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(408);
				match(UNDERSCORE);
				}
				break;
			case HYPHEN:
				enterOuterAlt(_localctx, 4);
				{
				setState(409);
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
		enterRule(_localctx, 62, RULE_alpha);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
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
		case 16:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u01a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3J\n\3\r\3\16\3K\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\7\6T\n\6\f\6\16\6W\13\6\3\6\3\6\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\3\6\3\6\3\6\7\6p\n\6\f"+
		"\6\16\6s\13\6\3\6\3\6\3\6\7\6x\n\6\f\6\16\6{\13\6\3\6\3\6\3\6\5\6\u0080"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0089\n\7\3\7\3\7\3\7\5\7\u008e\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0098\n\7\3\7\3\7\3\7\5\7\u009d"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\5\b\u00a4\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u00ad\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b6\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00bd\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c4\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u00d6\n\n\f\n\16\n\u00d9"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e0\n\n\3\13\3\13\5\13\u00e4\n\13\3\13"+
		"\3\13\5\13\u00e8\n\13\3\13\3\13\3\13\5\13\u00ed\n\13\3\f\3\f\5\f\u00f1"+
		"\n\f\3\f\3\f\5\f\u00f5\n\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3"+
		"\17\3\17\5\17\u0102\n\17\3\17\3\17\3\17\3\20\3\20\5\20\u0109\n\20\3\20"+
		"\3\20\5\20\u010d\n\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\5\22\u011a\n\22\3\22\3\22\5\22\u011e\n\22\3\22\3\22\5\22\u0122\n"+
		"\22\3\22\3\22\3\22\3\22\5\22\u0128\n\22\3\22\3\22\5\22\u012c\n\22\3\22"+
		"\3\22\7\22\u0130\n\22\f\22\16\22\u0133\13\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u013f\n\23\3\24\3\24\3\25\3\25\3\26\6\26"+
		"\u0146\n\26\r\26\16\26\u0147\3\26\6\26\u014b\n\26\r\26\16\26\u014c\3\26"+
		"\3\26\6\26\u0151\n\26\r\26\16\26\u0152\5\26\u0155\n\26\3\27\6\27\u0158"+
		"\n\27\r\27\16\27\u0159\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0162\n\27\r"+
		"\27\16\27\u0163\3\27\5\27\u0167\n\27\3\30\3\30\3\31\6\31\u016c\n\31\r"+
		"\31\16\31\u016d\3\31\3\31\6\31\u0172\n\31\r\31\16\31\u0173\3\31\3\31\6"+
		"\31\u0178\n\31\r\31\16\31\u0179\3\32\6\32\u017d\n\32\r\32\16\32\u017e"+
		"\3\33\3\33\3\34\3\34\3\35\3\35\6\35\u0187\n\35\r\35\16\35\u0188\3\35\3"+
		"\35\3\35\5\35\u018e\n\35\3\36\3\36\7\36\u0192\n\36\f\36\16\36\u0195\13"+
		"\36\3\37\3\37\3 \3 \3 \3 \5 \u019d\n \3!\3!\3!\2\3\"\"\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@\2\t\3\2\34!\3\2\"#"+
		"\4\2\21\21\33\33\3\2\17\20\6\2\16\16\20\20$%**\3\2\13\r\3\2\f\r\2\u01bb"+
		"\2B\3\2\2\2\4I\3\2\2\2\6M\3\2\2\2\bP\3\2\2\2\n\177\3\2\2\2\f\u009c\3\2"+
		"\2\2\16\u009e\3\2\2\2\20\u00c3\3\2\2\2\22\u00df\3\2\2\2\24\u00ec\3\2\2"+
		"\2\26\u00ee\3\2\2\2\30\u00f8\3\2\2\2\32\u00fa\3\2\2\2\34\u00fc\3\2\2\2"+
		"\36\u0106\3\2\2\2 \u0110\3\2\2\2\"\u0119\3\2\2\2$\u013e\3\2\2\2&\u0140"+
		"\3\2\2\2(\u0142\3\2\2\2*\u0154\3\2\2\2,\u0166\3\2\2\2.\u0168\3\2\2\2\60"+
		"\u016b\3\2\2\2\62\u017c\3\2\2\2\64\u0180\3\2\2\2\66\u0182\3\2\2\28\u018d"+
		"\3\2\2\2:\u018f\3\2\2\2<\u0196\3\2\2\2>\u019c\3\2\2\2@\u019e\3\2\2\2B"+
		"C\5\6\4\2CD\5\b\5\2DE\7\22\2\2EF\5\4\3\2FG\7\23\2\2G\3\3\2\2\2HJ\5\n\6"+
		"\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\5\3\2\2\2MN\7&\2\2NO\7\7\2"+
		"\2O\7\3\2\2\2PQ\7\3\2\2Q\t\3\2\2\2RT\7*\2\2SR\3\2\2\2TW\3\2\2\2US\3\2"+
		"\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2XY\7&\2\2YZ\5\f\7\2Z[\7)\2\2[\u0080"+
		"\3\2\2\2\\^\7*\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`b\3\2\2\2"+
		"a_\3\2\2\2bc\7&\2\2cd\5\16\b\2de\7)\2\2e\u0080\3\2\2\2fh\7*\2\2gf\3\2"+
		"\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7&\2\2m\u0080"+
		"\5\22\n\2np\7*\2\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2s"+
		"q\3\2\2\2tu\7&\2\2u\u0080\5\34\17\2vx\7*\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2"+
		"\2\2yz\3\2\2\2z|\3\2\2\2{y\3\2\2\2|}\5\36\20\2}~\7)\2\2~\u0080\3\2\2\2"+
		"\177U\3\2\2\2\177_\3\2\2\2\177i\3\2\2\2\177q\3\2\2\2\177y\3\2\2\2\u0080"+
		"\13\3\2\2\2\u0081\u0082\7\5\2\2\u0082\u0083\7\24\2\2\u0083\u0084\7(\2"+
		"\2\u0084\u0085\5\60\31\2\u0085\u0086\7(\2\2\u0086\u0088\7%\2\2\u0087\u0089"+
		"\7*\2\2\u0088\u0087\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\5\64\33\2\u008b\u008d\7%\2\2\u008c\u008e\7*\2\2\u008d\u008c\3\2"+
		"\2\2\u008d\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\5\66\34\2\u0090"+
		"\u0091\7\25\2\2\u0091\u009d\3\2\2\2\u0092\u0093\7\5\2\2\u0093\u0094\7"+
		"\24\2\2\u0094\u0095\5\64\33\2\u0095\u0097\7%\2\2\u0096\u0098\7*\2\2\u0097"+
		"\u0096\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\5\66"+
		"\34\2\u009a\u009b\7\25\2\2\u009b\u009d\3\2\2\2\u009c\u0081\3\2\2\2\u009c"+
		"\u0092\3\2\2\2\u009d\r\3\2\2\2\u009e\u009f\7\4\2\2\u009f\u00a0\7\24\2"+
		"\2\u00a0\u00a1\5*\26\2\u00a1\u00a3\7%\2\2\u00a2\u00a4\7*\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a6\5\20\t\2"+
		"\u00a6\17\3\2\2\2\u00a7\u00a8\7(\2\2\u00a8\u00a9\5\62\32\2\u00a9\u00aa"+
		"\7(\2\2\u00aa\u00ac\7%\2\2\u00ab\u00ad\7*\2\2\u00ac\u00ab\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\5\20\t\2\u00af\u00c4\3"+
		"\2\2\2\u00b0\u00b1\7(\2\2\u00b1\u00b2\5\62\32\2\u00b2\u00b3\7(\2\2\u00b3"+
		"\u00b5\7%\2\2\u00b4\u00b6\7*\2\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2\2"+
		"\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\7(\2\2\u00b8\u00b9\5\62\32\2\u00b9"+
		"\u00ba\7(\2\2\u00ba\u00bc\7%\2\2\u00bb\u00bd\7*\2\2\u00bc\u00bb\3\2\2"+
		"\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\7(\2\2\u00bf\u00c0"+
		"\5\62\32\2\u00c0\u00c1\7(\2\2\u00c1\u00c2\7\25\2\2\u00c2\u00c4\3\2\2\2"+
		"\u00c3\u00a7\3\2\2\2\u00c3\u00b0\3\2\2\2\u00c4\21\3\2\2\2\u00c5\u00c6"+
		"\7\b\2\2\u00c6\u00c7\7\24\2\2\u00c7\u00c8\5\24\13\2\u00c8\u00c9\7\25\2"+
		"\2\u00c9\u00ca\7\22\2\2\u00ca\u00cb\5\4\3\2\u00cb\u00cc\7\23\2\2\u00cc"+
		"\u00e0\3\2\2\2\u00cd\u00ce\7\b\2\2\u00ce\u00cf\7\24\2\2\u00cf\u00d0\5"+
		"\24\13\2\u00d0\u00d1\7\25\2\2\u00d1\u00d2\7\22\2\2\u00d2\u00d3\5\4\3\2"+
		"\u00d3\u00d7\7\23\2\2\u00d4\u00d6\7*\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d9"+
		"\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\3\2\2\2\u00d9"+
		"\u00d7\3\2\2\2\u00da\u00db\7\t\2\2\u00db\u00dc\7\22\2\2\u00dc\u00dd\5"+
		"\4\3\2\u00dd\u00de\7\23\2\2\u00de\u00e0\3\2\2\2\u00df\u00c5\3\2\2\2\u00df"+
		"\u00cd\3\2\2\2\u00e0\23\3\2\2\2\u00e1\u00e3\5\26\f\2\u00e2\u00e4\7*\2"+
		"\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e7"+
		"\5\32\16\2\u00e6\u00e8\7*\2\2\u00e7\u00e6\3\2\2\2\u00e7\u00e8\3\2\2\2"+
		"\u00e8\u00e9\3\2\2\2\u00e9\u00ea\5\24\13\2\u00ea\u00ed\3\2\2\2\u00eb\u00ed"+
		"\5\26\f\2\u00ec\u00e1\3\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\25\3\2\2\2\u00ee"+
		"\u00f0\5$\23\2\u00ef\u00f1\7*\2\2\u00f0\u00ef\3\2\2\2\u00f0\u00f1\3\2"+
		"\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f4\5\30\r\2\u00f3\u00f5\7*\2\2\u00f4"+
		"\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\5$"+
		"\23\2\u00f7\27\3\2\2\2\u00f8\u00f9\t\2\2\2\u00f9\31\3\2\2\2\u00fa\u00fb"+
		"\t\3\2\2\u00fb\33\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00fe\7\24\2\2\u00fe"+
		"\u00ff\5*\26\2\u00ff\u0101\7%\2\2\u0100\u0102\7*\2\2\u0101\u0100\3\2\2"+
		"\2\u0101\u0102\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\5*\26\2\u0104\u0105"+
		"\7\25\2\2\u0105\35\3\2\2\2\u0106\u0108\5 \21\2\u0107\u0109\7*\2\2\u0108"+
		"\u0107\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010c\7\30"+
		"\2\2\u010b\u010d\7*\2\2\u010c\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\5\"\22\2\u010f\37\3\2\2\2\u0110\u0111\7\32"+
		"\2\2\u0111\u0112\5:\36\2\u0112!\3\2\2\2\u0113\u0114\b\22\1\2\u0114\u011a"+
		"\5$\23\2\u0115\u0116\7\24\2\2\u0116\u0117\5\"\22\2\u0117\u0118\7\25\2"+
		"\2\u0118\u011a\3\2\2\2\u0119\u0113\3\2\2\2\u0119\u0115\3\2\2\2\u011a\u0131"+
		"\3\2\2\2\u011b\u011d\f\6\2\2\u011c\u011e\7*\2\2\u011d\u011c\3\2\2\2\u011d"+
		"\u011e\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\5&\24\2\u0120\u0122\7*"+
		"\2\2\u0121\u0120\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"\u0124\5\"\22\7\u0124\u0130\3\2\2\2\u0125\u0127\f\5\2\2\u0126\u0128\7"+
		"*\2\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"\u012b\5(\25\2\u012a\u012c\7*\2\2\u012b\u012a\3\2\2\2\u012b\u012c\3\2"+
		"\2\2\u012c\u012d\3\2\2\2\u012d\u012e\5\"\22\6\u012e\u0130\3\2\2\2\u012f"+
		"\u011b\3\2\2\2\u012f\u0125\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2"+
		"\2\2\u0131\u0132\3\2\2\2\u0132#\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u013f"+
		"\5 \21\2\u0135\u013f\5*\26\2\u0136\u0137\7(\2\2\u0137\u0138\5,\27\2\u0138"+
		"\u0139\7(\2\2\u0139\u013f\3\2\2\2\u013a\u013b\7&\2\2\u013b\u013f\5\16"+
		"\b\2\u013c\u013d\7&\2\2\u013d\u013f\5\34\17\2\u013e\u0134\3\2\2\2\u013e"+
		"\u0135\3\2\2\2\u013e\u0136\3\2\2\2\u013e\u013a\3\2\2\2\u013e\u013c\3\2"+
		"\2\2\u013f%\3\2\2\2\u0140\u0141\t\4\2\2\u0141\'\3\2\2\2\u0142\u0143\t"+
		"\5\2\2\u0143)\3\2\2\2\u0144\u0146\7\13\2\2\u0145\u0144\3\2\2\2\u0146\u0147"+
		"\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0155\3\2\2\2\u0149"+
		"\u014b\7\13\2\2\u014a\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014a\3"+
		"\2\2\2\u014c\u014d\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u0150\7\27\2\2\u014f"+
		"\u0151\7\13\2\2\u0150\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0150\3"+
		"\2\2\2\u0152\u0153\3\2\2\2\u0153\u0155\3\2\2\2\u0154\u0145\3\2\2\2\u0154"+
		"\u014a\3\2\2\2\u0155+\3\2\2\2\u0156\u0158\5<\37\2\u0157\u0156\3\2\2\2"+
		"\u0158\u0159\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\5,\27\2\u015c\u0167\3\2\2\2\u015d\u015e\5.\30\2\u015e"+
		"\u015f\5,\27\2\u015f\u0167\3\2\2\2\u0160\u0162\5<\37\2\u0161\u0160\3\2"+
		"\2\2\u0162\u0163\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u0167\3\2\2\2\u0165\u0167\5.\30\2\u0166\u0157\3\2\2\2\u0166\u015d\3\2"+
		"\2\2\u0166\u0161\3\2\2\2\u0166\u0165\3\2\2\2\u0167-\3\2\2\2\u0168\u0169"+
		"\t\6\2\2\u0169/\3\2\2\2\u016a\u016c\5<\37\2\u016b\u016a\3\2\2\2\u016c"+
		"\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e\u016f\3\2"+
		"\2\2\u016f\u0171\7\26\2\2\u0170\u0172\5<\37\2\u0171\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0175\3\2"+
		"\2\2\u0175\u0177\7\27\2\2\u0176\u0178\5<\37\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\61\3\2\2"+
		"\2\u017b\u017d\5<\37\2\u017c\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u017c"+
		"\3\2\2\2\u017e\u017f\3\2\2\2\u017f\63\3\2\2\2\u0180\u0181\58\35\2\u0181"+
		"\65\3\2\2\2\u0182\u0183\58\35\2\u0183\67\3\2\2\2\u0184\u0186\5$\23\2\u0185"+
		"\u0187\7*\2\2\u0186\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2"+
		"\2\2\u0188\u0189\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\5\66\34\2\u018b"+
		"\u018e\3\2\2\2\u018c\u018e\5$\23\2\u018d\u0184\3\2\2\2\u018d\u018c\3\2"+
		"\2\2\u018e9\3\2\2\2\u018f\u0193\7\f\2\2\u0190\u0192\5<\37\2\u0191\u0190"+
		"\3\2\2\2\u0192\u0195\3\2\2\2\u0193\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194"+
		";\3\2\2\2\u0195\u0193\3\2\2\2\u0196\u0197\t\7\2\2\u0197=\3\2\2\2\u0198"+
		"\u019d\5<\37\2\u0199\u019d\7\27\2\2\u019a\u019d\7\'\2\2\u019b\u019d\7"+
		"\20\2\2\u019c\u0198\3\2\2\2\u019c\u0199\3\2\2\2\u019c\u019a\3\2\2\2\u019c"+
		"\u019b\3\2\2\2\u019d?\3\2\2\2\u019e\u019f\t\b\2\2\u019fA\3\2\2\2\63KU"+
		"_iqy\177\u0088\u008d\u0097\u009c\u00a3\u00ac\u00b5\u00bc\u00c3\u00d7\u00df"+
		"\u00e3\u00e7\u00ec\u00f0\u00f4\u0101\u0108\u010c\u0119\u011d\u0121\u0127"+
		"\u012b\u012f\u0131\u013e\u0147\u014c\u0152\u0154\u0159\u0163\u0166\u016d"+
		"\u0173\u0179\u017e\u0188\u018d\u0193\u019c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}