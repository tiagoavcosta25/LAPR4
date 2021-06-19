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
            DATE_COMPARE_LABEL=6, HELPDESK=7, IF_LABEL=8, ELSE=9, NUM=10, LOWERCASE=11,
            UPPERCASE=12, PLUS=13, HYPHEN=14, PIPE=15, TIMES=16, BLOCK_START=17, BLOCK_END=18,
            STMT_START=19, STMT_END=20, AT=21, DOT=22, EQUAL=23, PERC=24, DOLLAR=25,
            FOWARD_SLASH=26, COMP_EQUAL=27, DIFF=28, BIGGER=29, LESSER=30, BE=31,
            LE=32, AND=33, OR=34, COLON=35, COMMA=36, HASHTAG=37, QUESTION_MARK=38,
            UNDERSCORE=39, PARENTHESIS_OPEN=40, PARENTHESIS_CLOSE=41, QUOTATION_MARKS=42,
            END=43, WS=44;
    public static final int
            RULE_start = 0, RULE_statements = 1, RULE_header = 2, RULE_type = 3, RULE_statement = 4,
            RULE_mandatory = 5, RULE_regex = 6, RULE_assert_func = 7, RULE_get_attribute = 8,
            RULE_date_comp = 9, RULE_nums = 10, RULE_if_func = 11, RULE_bool = 12,
            RULE_conditions = 13, RULE_condition = 14, RULE_comp = 15, RULE_conjunction = 16,
            RULE_assign = 17, RULE_variable = 18, RULE_op = 19, RULE_object = 20,
            RULE_sign_td = 21, RULE_sign_pm = 22, RULE_num = 23, RULE_var_label = 24,
            RULE_alphanumeric = 25, RULE_alpha = 26, RULE_string = 27, RULE_character = 28;
    private static String[] makeRuleNames() {
        return new String[] {
                "start", "statements", "header", "type", "statement", "mandatory", "regex",
                "assert_func", "get_attribute", "date_comp", "nums", "if_func", "bool",
                "conditions", "condition", "comp", "conjunction", "assign", "variable",
                "op", "object", "sign_td", "sign_pm", "num", "var_label", "alphanumeric",
                "alpha", "string", "character"
        };
    }
    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[] {
                null, "'validateForm'", "'mandatory'", "'regex'", "'assert'", "'getAttribute'",
                "'dateCompare'", "'helpdesk'", "'if'", "'else'", null, null, null, "'+'",
                "'-'", "'|'", "'*'", "'{'", "'}'", "'('", "')'", "'@'", "'.'", "'='",
                "'%'", "'$'", "'/'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'",
                "'||'", "':'", "','", "'#'", "'?'", "'_'", "'['", "']'", "'\"'", "';'"
        };
    }
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static String[] makeSymbolicNames() {
        return new String[] {
                null, "VALIDATE_FORM", "MANDATORY_LABEL", "REGEX_LABEL", "ASSERT_LABEL",
                "GET_ATTRIBUTE_LABEL", "DATE_COMPARE_LABEL", "HELPDESK", "IF_LABEL",
                "ELSE", "NUM", "LOWERCASE", "UPPERCASE", "PLUS", "HYPHEN", "PIPE", "TIMES",
                "BLOCK_START", "BLOCK_END", "STMT_START", "STMT_END", "AT", "DOT", "EQUAL",
                "PERC", "DOLLAR", "FOWARD_SLASH", "COMP_EQUAL", "DIFF", "BIGGER", "LESSER",
                "BE", "LE", "AND", "OR", "COLON", "COMMA", "HASHTAG", "QUESTION_MARK",
                "UNDERSCORE", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "QUOTATION_MARKS",
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
        public TerminalNode BLOCK_START() { return getToken(ValidateFormParser.BLOCK_START, 0); }
        public TerminalNode BLOCK_END() { return getToken(ValidateFormParser.BLOCK_END, 0); }
        public StatementsContext statements() {
            return getRuleContext(StatementsContext.class,0);
        }
        public ExecStartContext(StartContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecStart(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecStart(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecStart(this);
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
                setState(58);
                header();
                setState(59);
                type();
                setState(60);
                match(BLOCK_START);
                setState(61);
                ((ExecStartContext)_localctx).stmts = statements();
                setState(62);
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
        int _la;
        try {
            _localctx = new ExecStatementsContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(65);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(64);
                            ((ExecStatementsContext)_localctx).stmt = statement();
                        }
                    }
                    setState(67);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==DOLLAR || _la==HASHTAG );
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
        public HeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_header; }

        public HeaderContext() { }
        public void copyFrom(HeaderContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class ExecHeaderContext extends HeaderContext {
        public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
        public TerminalNode HELPDESK() { return getToken(ValidateFormParser.HELPDESK, 0); }
        public ExecHeaderContext(HeaderContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecHeader(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecHeader(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public final HeaderContext header() throws RecognitionException {
        HeaderContext _localctx = new HeaderContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_header);
        try {
            _localctx = new ExecHeaderContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(69);
                match(HASHTAG);
                setState(70);
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
        public TypeContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_type; }

        public TypeContext() { }
        public void copyFrom(TypeContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class ExecTypeContext extends TypeContext {
        public TerminalNode VALIDATE_FORM() { return getToken(ValidateFormParser.VALIDATE_FORM, 0); }
        public ExecTypeContext(TypeContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecType(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecType(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecType(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TypeContext type() throws RecognitionException {
        TypeContext _localctx = new TypeContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_type);
        try {
            _localctx = new ExecTypeContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(72);
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
        public Assert_funcContext stmt;
        public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
        public Assert_funcContext assert_func() {
            return getRuleContext(Assert_funcContext.class,0);
        }
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
    public static class StmtDateCompContext extends StatementContext {
        public Date_compContext stmt;
        public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
        public Date_compContext date_comp() {
            return getRuleContext(Date_compContext.class,0);
        }
        public StmtDateCompContext(StatementContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterStmtDateComp(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitStmtDateComp(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitStmtDateComp(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class StmtIfContext extends StatementContext {
        public If_funcContext stmt;
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
        public MandatoryContext stmt;
        public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
        public MandatoryContext mandatory() {
            return getRuleContext(MandatoryContext.class,0);
        }
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
        public Get_attributeContext stmt;
        public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
        public Get_attributeContext get_attribute() {
            return getRuleContext(Get_attributeContext.class,0);
        }
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
        public RegexContext stmt;
        public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
        public RegexContext regex() {
            return getRuleContext(RegexContext.class,0);
        }
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
        public AssignContext stmt;
        public TerminalNode END() { return getToken(ValidateFormParser.END, 0); }
        public AssignContext assign() {
            return getRuleContext(AssignContext.class,0);
        }
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
            setState(93);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
                case 1:
                    _localctx = new StmtMandatoryContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(74);
                    ((StmtMandatoryContext)_localctx).stmt = mandatory();
                    setState(75);
                    match(END);
                }
                break;
                case 2:
                    _localctx = new StmtRegexContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(77);
                    ((StmtRegexContext)_localctx).stmt = regex();
                    setState(78);
                    match(END);
                }
                break;
                case 3:
                    _localctx = new StmtAssertContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(80);
                    ((StmtAssertContext)_localctx).stmt = assert_func();
                    setState(81);
                    match(END);
                }
                break;
                case 4:
                    _localctx = new StmtAttributeContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(83);
                    ((StmtAttributeContext)_localctx).stmt = get_attribute();
                    setState(84);
                    match(END);
                }
                break;
                case 5:
                    _localctx = new StmtDateCompContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(86);
                    ((StmtDateCompContext)_localctx).stmt = date_comp();
                    setState(87);
                    match(END);
                }
                break;
                case 6:
                    _localctx = new StmtIfContext(_localctx);
                    enterOuterAlt(_localctx, 6);
                {
                    setState(89);
                    ((StmtIfContext)_localctx).stmt = if_func();
                }
                break;
                case 7:
                    _localctx = new StmtAssignContext(_localctx);
                    enterOuterAlt(_localctx, 7);
                {
                    setState(90);
                    ((StmtAssignContext)_localctx).stmt = assign();
                    setState(91);
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
        public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
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
                setState(95);
                match(HASHTAG);
                setState(96);
                match(MANDATORY_LABEL);
                setState(97);
                match(STMT_START);
                setState(98);
                ((ExecMandatoryContext)_localctx).agr = nums();
                setState(99);
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
        public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
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
                setState(101);
                match(HASHTAG);
                setState(102);
                match(REGEX_LABEL);
                setState(103);
                match(STMT_START);
                setState(105);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(104);
                            ((ExecRegexContext)_localctx).agr = match(NUM);
                        }
                    }
                    setState(107);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==NUM );
                setState(109);
                match(COMMA);
                setState(110);
                ((ExecRegexContext)_localctx).re = string();
                setState(111);
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
        public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
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
                setState(113);
                match(HASHTAG);
                setState(114);
                match(ASSERT_LABEL);
                setState(115);
                match(STMT_START);
                setState(116);
                ((ExecAssertContext)_localctx).cond = conditions();
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
        public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
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
                setState(119);
                match(HASHTAG);
                setState(120);
                match(GET_ATTRIBUTE_LABEL);
                setState(121);
                match(STMT_START);
                setState(123);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(122);
                            ((ExecGetAttributeContext)_localctx).attribute = match(NUM);
                        }
                    }
                    setState(125);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==NUM );
                setState(127);
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

    public static class Date_compContext extends ParserRuleContext {
        public Date_compContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_date_comp; }

        public Date_compContext() { }
        public void copyFrom(Date_compContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class ExecDateCompareContext extends Date_compContext {
        public Get_attributeContext date1;
        public CompContext conjSign;
        public Get_attributeContext date2;
        public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
        public TerminalNode DATE_COMPARE_LABEL() { return getToken(ValidateFormParser.DATE_COMPARE_LABEL, 0); }
        public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
        public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
        public List<Get_attributeContext> get_attribute() {
            return getRuleContexts(Get_attributeContext.class);
        }
        public Get_attributeContext get_attribute(int i) {
            return getRuleContext(Get_attributeContext.class,i);
        }
        public CompContext comp() {
            return getRuleContext(CompContext.class,0);
        }
        public ExecDateCompareContext(Date_compContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterExecDateCompare(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitExecDateCompare(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitExecDateCompare(this);
            else return visitor.visitChildren(this);
        }
    }

    public final Date_compContext date_comp() throws RecognitionException {
        Date_compContext _localctx = new Date_compContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_date_comp);
        try {
            _localctx = new ExecDateCompareContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(129);
                match(HASHTAG);
                setState(130);
                match(DATE_COMPARE_LABEL);
                setState(131);
                match(STMT_START);
                setState(132);
                ((ExecDateCompareContext)_localctx).date1 = get_attribute();
                setState(133);
                ((ExecDateCompareContext)_localctx).conjSign = comp();
                setState(134);
                ((ExecDateCompareContext)_localctx).date2 = get_attribute();
                setState(135);
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
        enterRule(_localctx, 20, RULE_nums);
        int _la;
        try {
            setState(149);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
                case 1:
                    _localctx = new ExecMultipleNumbersContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(138);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(137);
                                ((ExecMultipleNumbersContext)_localctx).number = match(NUM);
                            }
                        }
                        setState(140);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while ( _la==NUM );
                    setState(142);
                    match(COMMA);
                    setState(143);
                    ((ExecMultipleNumbersContext)_localctx).multipleNumbers = nums();
                }
                break;
                case 2:
                    _localctx = new ExecNumContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(145);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    do {
                        {
                            {
                                setState(144);
                                ((ExecNumContext)_localctx).number = match(NUM);
                            }
                        }
                        setState(147);
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
        public BoolContext if_cond;
        public StatementsContext stmt_if;
        public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
        public TerminalNode IF_LABEL() { return getToken(ValidateFormParser.IF_LABEL, 0); }
        public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
        public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
        public TerminalNode BLOCK_START() { return getToken(ValidateFormParser.BLOCK_START, 0); }
        public TerminalNode BLOCK_END() { return getToken(ValidateFormParser.BLOCK_END, 0); }
        public BoolContext bool() {
            return getRuleContext(BoolContext.class,0);
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
        public BoolContext if_cond;
        public StatementsContext stmt_if;
        public StatementsContext stmt_else;
        public TerminalNode HASHTAG() { return getToken(ValidateFormParser.HASHTAG, 0); }
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
        public BoolContext bool() {
            return getRuleContext(BoolContext.class,0);
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
        enterRule(_localctx, 22, RULE_if_func);
        try {
            setState(173);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
                case 1:
                    _localctx = new OnlyIfContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(151);
                    match(HASHTAG);
                    setState(152);
                    match(IF_LABEL);
                    setState(153);
                    match(STMT_START);
                    setState(154);
                    ((OnlyIfContext)_localctx).if_cond = bool();
                    setState(155);
                    match(STMT_END);
                    setState(156);
                    match(BLOCK_START);
                    setState(157);
                    ((OnlyIfContext)_localctx).stmt_if = statements();
                    setState(158);
                    match(BLOCK_END);
                }
                break;
                case 2:
                    _localctx = new IfElseContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(160);
                    match(HASHTAG);
                    setState(161);
                    match(IF_LABEL);
                    setState(162);
                    match(STMT_START);
                    setState(163);
                    ((IfElseContext)_localctx).if_cond = bool();
                    setState(164);
                    match(STMT_END);
                    setState(165);
                    match(BLOCK_START);
                    setState(166);
                    ((IfElseContext)_localctx).stmt_if = statements();
                    setState(167);
                    match(BLOCK_END);
                    setState(168);
                    match(ELSE);
                    setState(169);
                    match(BLOCK_START);
                    setState(170);
                    ((IfElseContext)_localctx).stmt_else = statements();
                    setState(171);
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

    public static class BoolContext extends ParserRuleContext {
        public BoolContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_bool; }

        public BoolContext() { }
        public void copyFrom(BoolContext ctx) {
            super.copyFrom(ctx);
        }
    }
    public static class BoolMandatoryContext extends BoolContext {
        public MandatoryContext bl;
        public MandatoryContext mandatory() {
            return getRuleContext(MandatoryContext.class,0);
        }
        public BoolMandatoryContext(BoolContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterBoolMandatory(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitBoolMandatory(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitBoolMandatory(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class BoolDateCompContext extends BoolContext {
        public Date_compContext bl;
        public Date_compContext date_comp() {
            return getRuleContext(Date_compContext.class,0);
        }
        public BoolDateCompContext(BoolContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterBoolDateComp(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitBoolDateComp(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitBoolDateComp(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class BoolRegexContext extends BoolContext {
        public RegexContext bl;
        public RegexContext regex() {
            return getRuleContext(RegexContext.class,0);
        }
        public BoolRegexContext(BoolContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterBoolRegex(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitBoolRegex(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitBoolRegex(this);
            else return visitor.visitChildren(this);
        }
    }
    public static class BoolConditionsContext extends BoolContext {
        public ConditionsContext bl;
        public ConditionsContext conditions() {
            return getRuleContext(ConditionsContext.class,0);
        }
        public BoolConditionsContext(BoolContext ctx) { copyFrom(ctx); }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).enterBoolConditions(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof ValidateFormListener ) ((ValidateFormListener)listener).exitBoolConditions(this);
        }
        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if ( visitor instanceof ValidateFormVisitor ) return ((ValidateFormVisitor<? extends T>)visitor).visitBoolConditions(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BoolContext bool() throws RecognitionException {
        BoolContext _localctx = new BoolContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_bool);
        try {
            setState(179);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
                case 1:
                    _localctx = new BoolMandatoryContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(175);
                    ((BoolMandatoryContext)_localctx).bl = mandatory();
                }
                break;
                case 2:
                    _localctx = new BoolRegexContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(176);
                    ((BoolRegexContext)_localctx).bl = regex();
                }
                break;
                case 3:
                    _localctx = new BoolDateCompContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(177);
                    ((BoolDateCompContext)_localctx).bl = date_comp();
                }
                break;
                case 4:
                    _localctx = new BoolConditionsContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(178);
                    ((BoolConditionsContext)_localctx).bl = conditions();
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
        enterRule(_localctx, 26, RULE_conditions);
        try {
            setState(186);
            _errHandler.sync(this);
            switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
                case 1:
                    _localctx = new MultipleConditionsContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(181);
                    ((MultipleConditionsContext)_localctx).right = condition();
                    setState(182);
                    ((MultipleConditionsContext)_localctx).conjSign = conjunction();
                    setState(183);
                    ((MultipleConditionsContext)_localctx).left = conditions();
                }
                break;
                case 2:
                    _localctx = new SingleConditionsContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(185);
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
        enterRule(_localctx, 28, RULE_condition);
        try {
            _localctx = new CondContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(188);
                ((CondContext)_localctx).left = object();
                setState(189);
                ((CondContext)_localctx).compSign = comp();
                setState(190);
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
        enterRule(_localctx, 30, RULE_comp);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(192);
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
        enterRule(_localctx, 32, RULE_conjunction);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(194);
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
        enterRule(_localctx, 34, RULE_assign);
        try {
            _localctx = new ExecAssignContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(196);
                ((ExecAssignContext)_localctx).var = variable();
                setState(197);
                match(EQUAL);
                setState(198);
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
        enterRule(_localctx, 36, RULE_variable);
        try {
            _localctx = new ExecVarContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(200);
                match(DOLLAR);
                setState(201);
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
        int _startState = 38;
        enterRecursionRule(_localctx, 38, RULE_op, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(209);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case STMT_START:
                    {
                        _localctx = new ExecOpParenthesisContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(204);
                        match(STMT_START);
                        setState(205);
                        ((ExecOpParenthesisContext)_localctx).result = op(0);
                        setState(206);
                        match(STMT_END);
                    }
                    break;
                    case NUM:
                    case DOLLAR:
                    case HASHTAG:
                    {
                        _localctx = new ExecOpAtomContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(208);
                        ((ExecOpAtomContext)_localctx).atom = object();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(221);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,12,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        if ( _parseListeners!=null ) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(219);
                            _errHandler.sync(this);
                            switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
                                case 1:
                                {
                                    _localctx = new ExecOpTimesDivisionContext(new OpContext(_parentctx, _parentState));
                                    ((ExecOpTimesDivisionContext)_localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_op);
                                    setState(211);
                                    if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
                                    setState(212);
                                    ((ExecOpTimesDivisionContext)_localctx).sign = sign_td();
                                    setState(213);
                                    ((ExecOpTimesDivisionContext)_localctx).right = op(5);
                                }
                                break;
                                case 2:
                                {
                                    _localctx = new ExecOpPlusMinusContext(new OpContext(_parentctx, _parentState));
                                    ((ExecOpPlusMinusContext)_localctx).left = _prevctx;
                                    pushNewRecursionContext(_localctx, _startState, RULE_op);
                                    setState(215);
                                    if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(216);
                                    ((ExecOpPlusMinusContext)_localctx).sign = sign_pm();
                                    setState(217);
                                    ((ExecOpPlusMinusContext)_localctx).right = op(4);
                                }
                                break;
                            }
                        }
                    }
                    setState(223);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
        public Get_attributeContext att;
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
        enterRule(_localctx, 40, RULE_object);
        try {
            setState(227);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case DOLLAR:
                    _localctx = new ObjectVariableContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(224);
                    ((ObjectVariableContext)_localctx).var = variable();
                }
                break;
                case NUM:
                    _localctx = new ObjectNumberContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(225);
                    ((ObjectNumberContext)_localctx).objNumber = num();
                }
                break;
                case HASHTAG:
                    _localctx = new ObjectAttributeContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(226);
                    ((ObjectAttributeContext)_localctx).att = get_attribute();
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
        enterRule(_localctx, 42, RULE_sign_td);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(229);
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
        enterRule(_localctx, 44, RULE_sign_pm);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(231);
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
        enterRule(_localctx, 46, RULE_num);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(234);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1:
                        {
                            {
                                setState(233);
                                match(NUM);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(236);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
        enterRule(_localctx, 48, RULE_var_label);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(238);
                match(LOWERCASE);
                setState(242);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input,15,_ctx);
                while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
                    if ( _alt==1 ) {
                        {
                            {
                                setState(239);
                                alphanumeric();
                            }
                        }
                    }
                    setState(244);
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
        enterRule(_localctx, 50, RULE_alphanumeric);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(245);
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
        enterRule(_localctx, 52, RULE_alpha);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(247);
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
        enterRule(_localctx, 54, RULE_string);
        int _la;
        try {
            _localctx = new ExecStringContext(_localctx);
            enterOuterAlt(_localctx, 1);
            {
                setState(249);
                match(QUOTATION_MARKS);
                setState(251);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(250);
                            ((ExecStringContext)_localctx).str = character();
                        }
                    }
                    setState(253);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << PLUS) | (1L << HYPHEN) | (1L << PIPE) | (1L << TIMES) | (1L << STMT_START) | (1L << STMT_END) | (1L << DOT) | (1L << QUESTION_MARK) | (1L << PARENTHESIS_OPEN) | (1L << PARENTHESIS_CLOSE))) != 0) );
                setState(255);
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
        public TerminalNode PLUS() { return getToken(ValidateFormParser.PLUS, 0); }
        public TerminalNode TIMES() { return getToken(ValidateFormParser.TIMES, 0); }
        public TerminalNode PIPE() { return getToken(ValidateFormParser.PIPE, 0); }
        public TerminalNode STMT_START() { return getToken(ValidateFormParser.STMT_START, 0); }
        public TerminalNode STMT_END() { return getToken(ValidateFormParser.STMT_END, 0); }
        public TerminalNode QUESTION_MARK() { return getToken(ValidateFormParser.QUESTION_MARK, 0); }
        public TerminalNode DOT() { return getToken(ValidateFormParser.DOT, 0); }
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
        enterRule(_localctx, 56, RULE_character);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(257);
                _la = _input.LA(1);
                if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM) | (1L << LOWERCASE) | (1L << UPPERCASE) | (1L << PLUS) | (1L << HYPHEN) | (1L << PIPE) | (1L << TIMES) | (1L << STMT_START) | (1L << STMT_END) | (1L << DOT) | (1L << QUESTION_MARK) | (1L << PARENTHESIS_OPEN) | (1L << PARENTHESIS_CLOSE))) != 0)) ) {
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
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u0106\4\2\t\2\4"+
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
                    "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
                    "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
                    "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
                    "\3\2\3\3\6\3D\n\3\r\3\16\3E\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
                    "\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\7\3"+
                    "\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\6\bl\n\b\r\b\16\bm\3\b\3\b\3\b\3\b"+
                    "\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\6\n~\n\n\r\n\16\n\177\3\n\3\n"+
                    "\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\6\f\u008d\n\f\r\f\16\f\u008e"+
                    "\3\f\3\f\3\f\6\f\u0094\n\f\r\f\16\f\u0095\5\f\u0098\n\f\3\r\3\r\3\r\3"+
                    "\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
                    "\3\r\5\r\u00b0\n\r\3\16\3\16\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\17"+
                    "\3\17\3\17\5\17\u00bd\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
                    "\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00d4"+
                    "\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u00de\n\25\f\25\16"+
                    "\25\u00e1\13\25\3\26\3\26\3\26\5\26\u00e6\n\26\3\27\3\27\3\30\3\30\3\31"+
                    "\6\31\u00ed\n\31\r\31\16\31\u00ee\3\32\3\32\7\32\u00f3\n\32\f\32\16\32"+
                    "\u00f6\13\32\3\33\3\33\3\34\3\34\3\35\3\35\6\35\u00fe\n\35\r\35\16\35"+
                    "\u00ff\3\35\3\35\3\36\3\36\3\36\2\3(\37\2\4\6\b\n\f\16\20\22\24\26\30"+
                    "\32\34\36 \"$&(*,.\60\62\64\668:\2\t\3\2\35\"\3\2#$\4\2\22\22\34\34\3"+
                    "\2\17\20\3\2\f\16\3\2\r\16\7\2\f\22\25\26\30\30((*+\2\u0101\2<\3\2\2\2"+
                    "\4C\3\2\2\2\6G\3\2\2\2\bJ\3\2\2\2\n_\3\2\2\2\fa\3\2\2\2\16g\3\2\2\2\20"+
                    "s\3\2\2\2\22y\3\2\2\2\24\u0083\3\2\2\2\26\u0097\3\2\2\2\30\u00af\3\2\2"+
                    "\2\32\u00b5\3\2\2\2\34\u00bc\3\2\2\2\36\u00be\3\2\2\2 \u00c2\3\2\2\2\""+
                    "\u00c4\3\2\2\2$\u00c6\3\2\2\2&\u00ca\3\2\2\2(\u00d3\3\2\2\2*\u00e5\3\2"+
                    "\2\2,\u00e7\3\2\2\2.\u00e9\3\2\2\2\60\u00ec\3\2\2\2\62\u00f0\3\2\2\2\64"+
                    "\u00f7\3\2\2\2\66\u00f9\3\2\2\28\u00fb\3\2\2\2:\u0103\3\2\2\2<=\5\6\4"+
                    "\2=>\5\b\5\2>?\7\23\2\2?@\5\4\3\2@A\7\24\2\2A\3\3\2\2\2BD\5\n\6\2CB\3"+
                    "\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2F\5\3\2\2\2GH\7\'\2\2HI\7\t\2\2I\7"+
                    "\3\2\2\2JK\7\3\2\2K\t\3\2\2\2LM\5\f\7\2MN\7-\2\2N`\3\2\2\2OP\5\16\b\2"+
                    "PQ\7-\2\2Q`\3\2\2\2RS\5\20\t\2ST\7-\2\2T`\3\2\2\2UV\5\22\n\2VW\7-\2\2"+
                    "W`\3\2\2\2XY\5\24\13\2YZ\7-\2\2Z`\3\2\2\2[`\5\30\r\2\\]\5$\23\2]^\7-\2"+
                    "\2^`\3\2\2\2_L\3\2\2\2_O\3\2\2\2_R\3\2\2\2_U\3\2\2\2_X\3\2\2\2_[\3\2\2"+
                    "\2_\\\3\2\2\2`\13\3\2\2\2ab\7\'\2\2bc\7\4\2\2cd\7\25\2\2de\5\26\f\2ef"+
                    "\7\26\2\2f\r\3\2\2\2gh\7\'\2\2hi\7\5\2\2ik\7\25\2\2jl\7\f\2\2kj\3\2\2"+
                    "\2lm\3\2\2\2mk\3\2\2\2mn\3\2\2\2no\3\2\2\2op\7&\2\2pq\58\35\2qr\7\26\2"+
                    "\2r\17\3\2\2\2st\7\'\2\2tu\7\6\2\2uv\7\25\2\2vw\5\34\17\2wx\7\26\2\2x"+
                    "\21\3\2\2\2yz\7\'\2\2z{\7\7\2\2{}\7\25\2\2|~\7\f\2\2}|\3\2\2\2~\177\3"+
                    "\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082"+
                    "\7\26\2\2\u0082\23\3\2\2\2\u0083\u0084\7\'\2\2\u0084\u0085\7\b\2\2\u0085"+
                    "\u0086\7\25\2\2\u0086\u0087\5\22\n\2\u0087\u0088\5 \21\2\u0088\u0089\5"+
                    "\22\n\2\u0089\u008a\7\26\2\2\u008a\25\3\2\2\2\u008b\u008d\7\f\2\2\u008c"+
                    "\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
                    "\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7&\2\2\u0091\u0098\5\26\f\2\u0092"+
                    "\u0094\7\f\2\2\u0093\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0093\3\2"+
                    "\2\2\u0095\u0096\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u008c\3\2\2\2\u0097"+
                    "\u0093\3\2\2\2\u0098\27\3\2\2\2\u0099\u009a\7\'\2\2\u009a\u009b\7\n\2"+
                    "\2\u009b\u009c\7\25\2\2\u009c\u009d\5\32\16\2\u009d\u009e\7\26\2\2\u009e"+
                    "\u009f\7\23\2\2\u009f\u00a0\5\4\3\2\u00a0\u00a1\7\24\2\2\u00a1\u00b0\3"+
                    "\2\2\2\u00a2\u00a3\7\'\2\2\u00a3\u00a4\7\n\2\2\u00a4\u00a5\7\25\2\2\u00a5"+
                    "\u00a6\5\32\16\2\u00a6\u00a7\7\26\2\2\u00a7\u00a8\7\23\2\2\u00a8\u00a9"+
                    "\5\4\3\2\u00a9\u00aa\7\24\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ac\7\23\2"+
                    "\2\u00ac\u00ad\5\4\3\2\u00ad\u00ae\7\24\2\2\u00ae\u00b0\3\2\2\2\u00af"+
                    "\u0099\3\2\2\2\u00af\u00a2\3\2\2\2\u00b0\31\3\2\2\2\u00b1\u00b6\5\f\7"+
                    "\2\u00b2\u00b6\5\16\b\2\u00b3\u00b6\5\24\13\2\u00b4\u00b6\5\34\17\2\u00b5"+
                    "\u00b1\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2"+
                    "\2\2\u00b6\33\3\2\2\2\u00b7\u00b8\5\36\20\2\u00b8\u00b9\5\"\22\2\u00b9"+
                    "\u00ba\5\34\17\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\5\36\20\2\u00bc\u00b7"+
                    "\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\35\3\2\2\2\u00be\u00bf\5*\26\2\u00bf"+
                    "\u00c0\5 \21\2\u00c0\u00c1\5*\26\2\u00c1\37\3\2\2\2\u00c2\u00c3\t\2\2"+
                    "\2\u00c3!\3\2\2\2\u00c4\u00c5\t\3\2\2\u00c5#\3\2\2\2\u00c6\u00c7\5&\24"+
                    "\2\u00c7\u00c8\7\31\2\2\u00c8\u00c9\5(\25\2\u00c9%\3\2\2\2\u00ca\u00cb"+
                    "\7\33\2\2\u00cb\u00cc\5\62\32\2\u00cc\'\3\2\2\2\u00cd\u00ce\b\25\1\2\u00ce"+
                    "\u00cf\7\25\2\2\u00cf\u00d0\5(\25\2\u00d0\u00d1\7\26\2\2\u00d1\u00d4\3"+
                    "\2\2\2\u00d2\u00d4\5*\26\2\u00d3\u00cd\3\2\2\2\u00d3\u00d2\3\2\2\2\u00d4"+
                    "\u00df\3\2\2\2\u00d5\u00d6\f\6\2\2\u00d6\u00d7\5,\27\2\u00d7\u00d8\5("+
                    "\25\7\u00d8\u00de\3\2\2\2\u00d9\u00da\f\5\2\2\u00da\u00db\5.\30\2\u00db"+
                    "\u00dc\5(\25\6\u00dc\u00de\3\2\2\2\u00dd\u00d5\3\2\2\2\u00dd\u00d9\3\2"+
                    "\2\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0"+
                    ")\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e6\5&\24\2\u00e3\u00e6\5\60\31"+
                    "\2\u00e4\u00e6\5\22\n\2\u00e5\u00e2\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5"+
                    "\u00e4\3\2\2\2\u00e6+\3\2\2\2\u00e7\u00e8\t\4\2\2\u00e8-\3\2\2\2\u00e9"+
                    "\u00ea\t\5\2\2\u00ea/\3\2\2\2\u00eb\u00ed\7\f\2\2\u00ec\u00eb\3\2\2\2"+
                    "\u00ed\u00ee\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\61"+
                    "\3\2\2\2\u00f0\u00f4\7\r\2\2\u00f1\u00f3\5\64\33\2\u00f2\u00f1\3\2\2\2"+
                    "\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\63"+
                    "\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\t\6\2\2\u00f8\65\3\2\2\2\u00f9"+
                    "\u00fa\t\7\2\2\u00fa\67\3\2\2\2\u00fb\u00fd\7,\2\2\u00fc\u00fe\5:\36\2"+
                    "\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
                    "\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7,\2\2\u01029\3\2\2\2\u0103\u0104"+
                    "\t\b\2\2\u0104;\3\2\2\2\23E_m\177\u008e\u0095\u0097\u00af\u00b5\u00bc"+
                    "\u00d3\u00dd\u00df\u00e5\u00ee\u00f4\u00ff";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}