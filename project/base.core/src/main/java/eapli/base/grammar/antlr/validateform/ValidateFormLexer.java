// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\ValidateForm.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.validateform;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ValidateFormLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VALIDATE_FORM=1, MANDATORY_LABEL=2, REGEX_LABEL=3, ASSERT_LABEL=4, GET_ATTRIBUTE_LABEL=5, 
		DATE_COMPARE_LABEL=6, HELPDESK=7, IF_LABEL=8, ELSE=9, NUM=10, LOWERCASE=11, 
		UPPERCASE=12, PLUS=13, HYPHEN=14, TIMES=15, BLOCK_START=16, BLOCK_END=17, 
		STMT_START=18, STMT_END=19, AT=20, DOT=21, EQUAL=22, PERC=23, DOLLAR=24, 
		FOWARD_SLASH=25, COMP_EQUAL=26, DIFF=27, BIGGER=28, LESSER=29, BE=30, 
		LE=31, AND=32, OR=33, COLON=34, COMMA=35, HASHTAG=36, UNDERSCORE=37, PARENTHESIS_OPEN=38, 
		PARENTHESIS_CLOSE=39, QUOTATION_MARKS=40, END=41, WS=42;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"VALIDATE_FORM", "MANDATORY_LABEL", "REGEX_LABEL", "ASSERT_LABEL", "GET_ATTRIBUTE_LABEL", 
			"DATE_COMPARE_LABEL", "HELPDESK", "IF_LABEL", "ELSE", "NUM", "LOWERCASE", 
			"UPPERCASE", "PLUS", "HYPHEN", "TIMES", "BLOCK_START", "BLOCK_END", "STMT_START", 
			"STMT_END", "AT", "DOT", "EQUAL", "PERC", "DOLLAR", "FOWARD_SLASH", "COMP_EQUAL", 
			"DIFF", "BIGGER", "LESSER", "BE", "LE", "AND", "OR", "COLON", "COMMA", 
			"HASHTAG", "UNDERSCORE", "PARENTHESIS_OPEN", "PARENTHESIS_CLOSE", "QUOTATION_MARKS", 
			"END", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'validateForm'", "'mandatory'", "'regex'", "'assert'", "'getAttribute'", 
			"'dateCompare'", "'helpdesk'", "'if'", "'else'", null, null, null, "'+'", 
			"'-'", "'*'", "'{'", "'}'", "'('", "')'", "'@'", "'.'", "'='", "'%'", 
			"'$'", "'/'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", 
			"':'", "','", "'#'", "'_'", "'['", "']'", "'\"'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "VALIDATE_FORM", "MANDATORY_LABEL", "REGEX_LABEL", "ASSERT_LABEL", 
			"GET_ATTRIBUTE_LABEL", "DATE_COMPARE_LABEL", "HELPDESK", "IF_LABEL", 
			"ELSE", "NUM", "LOWERCASE", "UPPERCASE", "PLUS", "HYPHEN", "TIMES", "BLOCK_START", 
			"BLOCK_END", "STMT_START", "STMT_END", "AT", "DOT", "EQUAL", "PERC", 
			"DOLLAR", "FOWARD_SLASH", "COMP_EQUAL", "DIFF", "BIGGER", "LESSER", "BE", 
			"LE", "AND", "OR", "COLON", "COMMA", "HASHTAG", "UNDERSCORE", "PARENTHESIS_OPEN", 
			"PARENTHESIS_CLOSE", "QUOTATION_MARKS", "END", "WS"
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


	public ValidateFormLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ValidateForm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u00f2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\""+
		"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\6+\u00ed\n+\r+\16"+
		"+\u00ee\3+\3+\2\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,\3\2\6\3\2\62;\3\2c|\3"+
		"\2C\\\5\2\13\f\17\17\"\"\2\u00f2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5d\3\2\2\2\7n\3\2"+
		"\2\2\tt\3\2\2\2\13{\3\2\2\2\r\u0088\3\2\2\2\17\u0094\3\2\2\2\21\u009d"+
		"\3\2\2\2\23\u00a0\3\2\2\2\25\u00a5\3\2\2\2\27\u00a7\3\2\2\2\31\u00a9\3"+
		"\2\2\2\33\u00ab\3\2\2\2\35\u00ad\3\2\2\2\37\u00af\3\2\2\2!\u00b1\3\2\2"+
		"\2#\u00b3\3\2\2\2%\u00b5\3\2\2\2\'\u00b7\3\2\2\2)\u00b9\3\2\2\2+\u00bb"+
		"\3\2\2\2-\u00bd\3\2\2\2/\u00bf\3\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2"+
		"\2\65\u00c5\3\2\2\2\67\u00c8\3\2\2\29\u00cb\3\2\2\2;\u00cd\3\2\2\2=\u00cf"+
		"\3\2\2\2?\u00d2\3\2\2\2A\u00d5\3\2\2\2C\u00d8\3\2\2\2E\u00db\3\2\2\2G"+
		"\u00dd\3\2\2\2I\u00df\3\2\2\2K\u00e1\3\2\2\2M\u00e3\3\2\2\2O\u00e5\3\2"+
		"\2\2Q\u00e7\3\2\2\2S\u00e9\3\2\2\2U\u00ec\3\2\2\2WX\7x\2\2XY\7c\2\2YZ"+
		"\7n\2\2Z[\7k\2\2[\\\7f\2\2\\]\7c\2\2]^\7v\2\2^_\7g\2\2_`\7H\2\2`a\7q\2"+
		"\2ab\7t\2\2bc\7o\2\2c\4\3\2\2\2de\7o\2\2ef\7c\2\2fg\7p\2\2gh\7f\2\2hi"+
		"\7c\2\2ij\7v\2\2jk\7q\2\2kl\7t\2\2lm\7{\2\2m\6\3\2\2\2no\7t\2\2op\7g\2"+
		"\2pq\7i\2\2qr\7g\2\2rs\7z\2\2s\b\3\2\2\2tu\7c\2\2uv\7u\2\2vw\7u\2\2wx"+
		"\7g\2\2xy\7t\2\2yz\7v\2\2z\n\3\2\2\2{|\7i\2\2|}\7g\2\2}~\7v\2\2~\177\7"+
		"C\2\2\177\u0080\7v\2\2\u0080\u0081\7v\2\2\u0081\u0082\7t\2\2\u0082\u0083"+
		"\7k\2\2\u0083\u0084\7d\2\2\u0084\u0085\7w\2\2\u0085\u0086\7v\2\2\u0086"+
		"\u0087\7g\2\2\u0087\f\3\2\2\2\u0088\u0089\7f\2\2\u0089\u008a\7c\2\2\u008a"+
		"\u008b\7v\2\2\u008b\u008c\7g\2\2\u008c\u008d\7E\2\2\u008d\u008e\7q\2\2"+
		"\u008e\u008f\7o\2\2\u008f\u0090\7r\2\2\u0090\u0091\7c\2\2\u0091\u0092"+
		"\7t\2\2\u0092\u0093\7g\2\2\u0093\16\3\2\2\2\u0094\u0095\7j\2\2\u0095\u0096"+
		"\7g\2\2\u0096\u0097\7n\2\2\u0097\u0098\7r\2\2\u0098\u0099\7f\2\2\u0099"+
		"\u009a\7g\2\2\u009a\u009b\7u\2\2\u009b\u009c\7m\2\2\u009c\20\3\2\2\2\u009d"+
		"\u009e\7k\2\2\u009e\u009f\7h\2\2\u009f\22\3\2\2\2\u00a0\u00a1\7g\2\2\u00a1"+
		"\u00a2\7n\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4\7g\2\2\u00a4\24\3\2\2\2\u00a5"+
		"\u00a6\t\2\2\2\u00a6\26\3\2\2\2\u00a7\u00a8\t\3\2\2\u00a8\30\3\2\2\2\u00a9"+
		"\u00aa\t\4\2\2\u00aa\32\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac\34\3\2\2\2\u00ad"+
		"\u00ae\7/\2\2\u00ae\36\3\2\2\2\u00af\u00b0\7,\2\2\u00b0 \3\2\2\2\u00b1"+
		"\u00b2\7}\2\2\u00b2\"\3\2\2\2\u00b3\u00b4\7\177\2\2\u00b4$\3\2\2\2\u00b5"+
		"\u00b6\7*\2\2\u00b6&\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8(\3\2\2\2\u00b9\u00ba"+
		"\7B\2\2\u00ba*\3\2\2\2\u00bb\u00bc\7\60\2\2\u00bc,\3\2\2\2\u00bd\u00be"+
		"\7?\2\2\u00be.\3\2\2\2\u00bf\u00c0\7\'\2\2\u00c0\60\3\2\2\2\u00c1\u00c2"+
		"\7&\2\2\u00c2\62\3\2\2\2\u00c3\u00c4\7\61\2\2\u00c4\64\3\2\2\2\u00c5\u00c6"+
		"\7?\2\2\u00c6\u00c7\7?\2\2\u00c7\66\3\2\2\2\u00c8\u00c9\7#\2\2\u00c9\u00ca"+
		"\7?\2\2\u00ca8\3\2\2\2\u00cb\u00cc\7@\2\2\u00cc:\3\2\2\2\u00cd\u00ce\7"+
		">\2\2\u00ce<\3\2\2\2\u00cf\u00d0\7@\2\2\u00d0\u00d1\7?\2\2\u00d1>\3\2"+
		"\2\2\u00d2\u00d3\7>\2\2\u00d3\u00d4\7?\2\2\u00d4@\3\2\2\2\u00d5\u00d6"+
		"\7(\2\2\u00d6\u00d7\7(\2\2\u00d7B\3\2\2\2\u00d8\u00d9\7~\2\2\u00d9\u00da"+
		"\7~\2\2\u00daD\3\2\2\2\u00db\u00dc\7<\2\2\u00dcF\3\2\2\2\u00dd\u00de\7"+
		".\2\2\u00deH\3\2\2\2\u00df\u00e0\7%\2\2\u00e0J\3\2\2\2\u00e1\u00e2\7a"+
		"\2\2\u00e2L\3\2\2\2\u00e3\u00e4\7]\2\2\u00e4N\3\2\2\2\u00e5\u00e6\7_\2"+
		"\2\u00e6P\3\2\2\2\u00e7\u00e8\7$\2\2\u00e8R\3\2\2\2\u00e9\u00ea\7=\2\2"+
		"\u00eaT\3\2\2\2\u00eb\u00ed\t\5\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00ee\3"+
		"\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f1\b+\2\2\u00f1V\3\2\2\2\4\2\u00ee\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}