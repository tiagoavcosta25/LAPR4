// Generated from D:/Universidade/2/2/LAPR/lei20_21_s4_2di_03/project/base.core/src/main/java/eapli/base/grammar\AutoTask.g4 by ANTLR 4.9.1
package eapli.base.grammar.antlr.autotask;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AutoTaskLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AUTO_TASK", "FILE_SEARCH_LABEL", "SEND_EMAIL_LABEL", "GET_VALUE_LABEL", 
			"HELPDESK", "IF_LABEL", "ELSE", "XML_FILE", "NUM", "LOWERCASE", "UPPERCASE", 
			"EUR", "PLUS", "HYPHEN", "TIMES", "BLOCK_START", "BLOCK_END", "STMT_START", 
			"STMT_END", "AT", "DOT", "EQUAL", "PERC", "DOLLAR", "FORWARD_SLASH", 
			"COMP_EQUAL", "DIFF", "BIGGER", "LESSER", "BE", "LE", "AND", "OR", "COLON", 
			"COMMA", "HASHTAG", "UNDERSCORE", "QUOTATION_MARKS", "END", "SPACE", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'autoTask'", "'fileSearch'", "'sendEmail'", "'getValue'", "'helpdesk'", 
			"'if'", "'else'", "'.xml'", null, null, null, "'\u00E2\u201A\u00AC'", 
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


	public AutoTaskLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AutoTask.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u00e1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3"+
		"!\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\6*\u00dc"+
		"\n*\r*\16*\u00dd\3*\3*\2\2+\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+\3\2\6\3\2\62;\3\2"+
		"c|\3\2C\\\4\2\13\f\17\17\2\u00e1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\3U\3\2\2\2\5^\3\2\2\2\7i\3\2\2\2\ts\3\2"+
		"\2\2\13|\3\2\2\2\r\u0085\3\2\2\2\17\u0088\3\2\2\2\21\u008d\3\2\2\2\23"+
		"\u0092\3\2\2\2\25\u0094\3\2\2\2\27\u0096\3\2\2\2\31\u0098\3\2\2\2\33\u009c"+
		"\3\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2!\u00a2\3\2\2\2#\u00a4\3\2\2"+
		"\2%\u00a6\3\2\2\2\'\u00a8\3\2\2\2)\u00aa\3\2\2\2+\u00ac\3\2\2\2-\u00ae"+
		"\3\2\2\2/\u00b0\3\2\2\2\61\u00b2\3\2\2\2\63\u00b4\3\2\2\2\65\u00b6\3\2"+
		"\2\2\67\u00b9\3\2\2\29\u00bc\3\2\2\2;\u00be\3\2\2\2=\u00c0\3\2\2\2?\u00c3"+
		"\3\2\2\2A\u00c6\3\2\2\2C\u00c9\3\2\2\2E\u00cc\3\2\2\2G\u00ce\3\2\2\2I"+
		"\u00d0\3\2\2\2K\u00d2\3\2\2\2M\u00d4\3\2\2\2O\u00d6\3\2\2\2Q\u00d8\3\2"+
		"\2\2S\u00db\3\2\2\2UV\7c\2\2VW\7w\2\2WX\7v\2\2XY\7q\2\2YZ\7V\2\2Z[\7c"+
		"\2\2[\\\7u\2\2\\]\7m\2\2]\4\3\2\2\2^_\7h\2\2_`\7k\2\2`a\7n\2\2ab\7g\2"+
		"\2bc\7U\2\2cd\7g\2\2de\7c\2\2ef\7t\2\2fg\7e\2\2gh\7j\2\2h\6\3\2\2\2ij"+
		"\7u\2\2jk\7g\2\2kl\7p\2\2lm\7f\2\2mn\7G\2\2no\7o\2\2op\7c\2\2pq\7k\2\2"+
		"qr\7n\2\2r\b\3\2\2\2st\7i\2\2tu\7g\2\2uv\7v\2\2vw\7X\2\2wx\7c\2\2xy\7"+
		"n\2\2yz\7w\2\2z{\7g\2\2{\n\3\2\2\2|}\7j\2\2}~\7g\2\2~\177\7n\2\2\177\u0080"+
		"\7r\2\2\u0080\u0081\7f\2\2\u0081\u0082\7g\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7m\2\2\u0084\f\3\2\2\2\u0085\u0086\7k\2\2\u0086\u0087\7h\2\2\u0087"+
		"\16\3\2\2\2\u0088\u0089\7g\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b"+
		"\u008c\7g\2\2\u008c\20\3\2\2\2\u008d\u008e\7\60\2\2\u008e\u008f\7z\2\2"+
		"\u008f\u0090\7o\2\2\u0090\u0091\7n\2\2\u0091\22\3\2\2\2\u0092\u0093\t"+
		"\2\2\2\u0093\24\3\2\2\2\u0094\u0095\t\3\2\2\u0095\26\3\2\2\2\u0096\u0097"+
		"\t\4\2\2\u0097\30\3\2\2\2\u0098\u0099\7\u00e4\2\2\u0099\u009a\7\u201c"+
		"\2\2\u009a\u009b\7\u00ae\2\2\u009b\32\3\2\2\2\u009c\u009d\7-\2\2\u009d"+
		"\34\3\2\2\2\u009e\u009f\7/\2\2\u009f\36\3\2\2\2\u00a0\u00a1\7,\2\2\u00a1"+
		" \3\2\2\2\u00a2\u00a3\7}\2\2\u00a3\"\3\2\2\2\u00a4\u00a5\7\177\2\2\u00a5"+
		"$\3\2\2\2\u00a6\u00a7\7*\2\2\u00a7&\3\2\2\2\u00a8\u00a9\7+\2\2\u00a9("+
		"\3\2\2\2\u00aa\u00ab\7B\2\2\u00ab*\3\2\2\2\u00ac\u00ad\7\60\2\2\u00ad"+
		",\3\2\2\2\u00ae\u00af\7?\2\2\u00af.\3\2\2\2\u00b0\u00b1\7\'\2\2\u00b1"+
		"\60\3\2\2\2\u00b2\u00b3\7&\2\2\u00b3\62\3\2\2\2\u00b4\u00b5\7\61\2\2\u00b5"+
		"\64\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7\u00b8\7?\2\2\u00b8\66\3\2\2\2\u00b9"+
		"\u00ba\7#\2\2\u00ba\u00bb\7?\2\2\u00bb8\3\2\2\2\u00bc\u00bd\7@\2\2\u00bd"+
		":\3\2\2\2\u00be\u00bf\7>\2\2\u00bf<\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2"+
		"\7?\2\2\u00c2>\3\2\2\2\u00c3\u00c4\7>\2\2\u00c4\u00c5\7?\2\2\u00c5@\3"+
		"\2\2\2\u00c6\u00c7\7(\2\2\u00c7\u00c8\7(\2\2\u00c8B\3\2\2\2\u00c9\u00ca"+
		"\7~\2\2\u00ca\u00cb\7~\2\2\u00cbD\3\2\2\2\u00cc\u00cd\7<\2\2\u00cdF\3"+
		"\2\2\2\u00ce\u00cf\7.\2\2\u00cfH\3\2\2\2\u00d0\u00d1\7%\2\2\u00d1J\3\2"+
		"\2\2\u00d2\u00d3\7a\2\2\u00d3L\3\2\2\2\u00d4\u00d5\7$\2\2\u00d5N\3\2\2"+
		"\2\u00d6\u00d7\7=\2\2\u00d7P\3\2\2\2\u00d8\u00d9\7\"\2\2\u00d9R\3\2\2"+
		"\2\u00da\u00dc\t\5\2\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\b*\2\2\u00e0"+
		"T\3\2\2\2\4\2\u00dd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}