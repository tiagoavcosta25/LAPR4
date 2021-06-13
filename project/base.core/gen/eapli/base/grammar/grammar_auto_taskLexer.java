// Generated from D:/Escola/Uni/_Year-02/LAPR4/ProjetoIntegrador/project/base.core/src/main/java/eapli/base/grammar\grammar_auto_task.g4 by ANTLR 4.9.1
package eapli.base.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammar_auto_taskLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AUTO_TASK=1, VALIDATE_FORM=2, FILE_SEARCH_LABEL=3, SEND_EMAIL_LABEL=4, 
		HELPDESK=5, IF_LABEL=6, ELSE=7, XML=8, NUM=9, LOWERCASE=10, UPPERCASE=11, 
		PLUS=12, HYPHEN=13, TIMES=14, BLOCK_START=15, BLOCK_END=16, STMT_START=17, 
		STMT_END=18, AT=19, DOT=20, EQUAL=21, PERC=22, DOLLAR=23, FOWARD_SLASH=24, 
		COMP_EQUAL=25, DIFF=26, BIGGER=27, LESSER=28, BE=29, LE=30, AND=31, OR=32, 
		COLON=33, COMMA=34, HASHTAG=35, UNDERSCORE=36, END=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AUTO_TASK", "VALIDATE_FORM", "FILE_SEARCH_LABEL", "SEND_EMAIL_LABEL", 
			"HELPDESK", "IF_LABEL", "ELSE", "XML", "NUM", "LOWERCASE", "UPPERCASE", 
			"PLUS", "HYPHEN", "TIMES", "BLOCK_START", "BLOCK_END", "STMT_START", 
			"STMT_END", "AT", "DOT", "EQUAL", "PERC", "DOLLAR", "FOWARD_SLASH", "COMP_EQUAL", 
			"DIFF", "BIGGER", "LESSER", "BE", "LE", "AND", "OR", "COLON", "COMMA", 
			"HASHTAG", "UNDERSCORE", "END", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'autoTask'", "'validateForm'", "'fileSearch'", "'sendEmail'", 
			"'helpdesk'", "'if'", "'else'", "'xml'", null, null, null, "'+'", "'-'", 
			"'*'", "'{'", "'}'", "'('", "')'", "'@'", "'.'", "'='", "'%'", "'$'", 
			"'/'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", 
			"':'", "','", "'#'", "'_'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AUTO_TASK", "VALIDATE_FORM", "FILE_SEARCH_LABEL", "SEND_EMAIL_LABEL", 
			"HELPDESK", "IF_LABEL", "ELSE", "XML", "NUM", "LOWERCASE", "UPPERCASE", 
			"PLUS", "HYPHEN", "TIMES", "BLOCK_START", "BLOCK_END", "STMT_START", 
			"STMT_END", "AT", "DOT", "EQUAL", "PERC", "DOLLAR", "FOWARD_SLASH", "COMP_EQUAL", 
			"DIFF", "BIGGER", "LESSER", "BE", "LE", "AND", "OR", "COLON", "COMMA", 
			"HASHTAG", "UNDERSCORE", "END", "WS"
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


	public grammar_auto_taskLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "grammar_auto_task.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00d6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3"+
		"\"\3#\3#\3$\3$\3%\3%\3&\3&\3\'\6\'\u00d1\n\'\r\'\16\'\u00d2\3\'\3\'\2"+
		"\2(\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36"+
		";\37= ?!A\"C#E$G%I&K\'M(\3\2\6\3\2\62;\3\2c|\3\2C\\\5\2\13\f\17\17\"\""+
		"\2\u00d6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5X\3\2\2\2\7e"+
		"\3\2\2\2\tp\3\2\2\2\13z\3\2\2\2\r\u0083\3\2\2\2\17\u0086\3\2\2\2\21\u008b"+
		"\3\2\2\2\23\u008f\3\2\2\2\25\u0091\3\2\2\2\27\u0093\3\2\2\2\31\u0095\3"+
		"\2\2\2\33\u0097\3\2\2\2\35\u0099\3\2\2\2\37\u009b\3\2\2\2!\u009d\3\2\2"+
		"\2#\u009f\3\2\2\2%\u00a1\3\2\2\2\'\u00a3\3\2\2\2)\u00a5\3\2\2\2+\u00a7"+
		"\3\2\2\2-\u00a9\3\2\2\2/\u00ab\3\2\2\2\61\u00ad\3\2\2\2\63\u00af\3\2\2"+
		"\2\65\u00b2\3\2\2\2\67\u00b5\3\2\2\29\u00b7\3\2\2\2;\u00b9\3\2\2\2=\u00bc"+
		"\3\2\2\2?\u00bf\3\2\2\2A\u00c2\3\2\2\2C\u00c5\3\2\2\2E\u00c7\3\2\2\2G"+
		"\u00c9\3\2\2\2I\u00cb\3\2\2\2K\u00cd\3\2\2\2M\u00d0\3\2\2\2OP\7c\2\2P"+
		"Q\7w\2\2QR\7v\2\2RS\7q\2\2ST\7V\2\2TU\7c\2\2UV\7u\2\2VW\7m\2\2W\4\3\2"+
		"\2\2XY\7x\2\2YZ\7c\2\2Z[\7n\2\2[\\\7k\2\2\\]\7f\2\2]^\7c\2\2^_\7v\2\2"+
		"_`\7g\2\2`a\7H\2\2ab\7q\2\2bc\7t\2\2cd\7o\2\2d\6\3\2\2\2ef\7h\2\2fg\7"+
		"k\2\2gh\7n\2\2hi\7g\2\2ij\7U\2\2jk\7g\2\2kl\7c\2\2lm\7t\2\2mn\7e\2\2n"+
		"o\7j\2\2o\b\3\2\2\2pq\7u\2\2qr\7g\2\2rs\7p\2\2st\7f\2\2tu\7G\2\2uv\7o"+
		"\2\2vw\7c\2\2wx\7k\2\2xy\7n\2\2y\n\3\2\2\2z{\7j\2\2{|\7g\2\2|}\7n\2\2"+
		"}~\7r\2\2~\177\7f\2\2\177\u0080\7g\2\2\u0080\u0081\7u\2\2\u0081\u0082"+
		"\7m\2\2\u0082\f\3\2\2\2\u0083\u0084\7k\2\2\u0084\u0085\7h\2\2\u0085\16"+
		"\3\2\2\2\u0086\u0087\7g\2\2\u0087\u0088\7n\2\2\u0088\u0089\7u\2\2\u0089"+
		"\u008a\7g\2\2\u008a\20\3\2\2\2\u008b\u008c\7z\2\2\u008c\u008d\7o\2\2\u008d"+
		"\u008e\7n\2\2\u008e\22\3\2\2\2\u008f\u0090\t\2\2\2\u0090\24\3\2\2\2\u0091"+
		"\u0092\t\3\2\2\u0092\26\3\2\2\2\u0093\u0094\t\4\2\2\u0094\30\3\2\2\2\u0095"+
		"\u0096\7-\2\2\u0096\32\3\2\2\2\u0097\u0098\7/\2\2\u0098\34\3\2\2\2\u0099"+
		"\u009a\7,\2\2\u009a\36\3\2\2\2\u009b\u009c\7}\2\2\u009c \3\2\2\2\u009d"+
		"\u009e\7\177\2\2\u009e\"\3\2\2\2\u009f\u00a0\7*\2\2\u00a0$\3\2\2\2\u00a1"+
		"\u00a2\7+\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7B\2\2\u00a4(\3\2\2\2\u00a5\u00a6"+
		"\7\60\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7?\2\2\u00a8,\3\2\2\2\u00a9\u00aa"+
		"\7\'\2\2\u00aa.\3\2\2\2\u00ab\u00ac\7&\2\2\u00ac\60\3\2\2\2\u00ad\u00ae"+
		"\7\61\2\2\u00ae\62\3\2\2\2\u00af\u00b0\7?\2\2\u00b0\u00b1\7?\2\2\u00b1"+
		"\64\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\7?\2\2\u00b4\66\3\2\2\2\u00b5"+
		"\u00b6\7@\2\2\u00b68\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8:\3\2\2\2\u00b9\u00ba"+
		"\7@\2\2\u00ba\u00bb\7?\2\2\u00bb<\3\2\2\2\u00bc\u00bd\7>\2\2\u00bd\u00be"+
		"\7?\2\2\u00be>\3\2\2\2\u00bf\u00c0\7(\2\2\u00c0\u00c1\7(\2\2\u00c1@\3"+
		"\2\2\2\u00c2\u00c3\7~\2\2\u00c3\u00c4\7~\2\2\u00c4B\3\2\2\2\u00c5\u00c6"+
		"\7<\2\2\u00c6D\3\2\2\2\u00c7\u00c8\7.\2\2\u00c8F\3\2\2\2\u00c9\u00ca\7"+
		"%\2\2\u00caH\3\2\2\2\u00cb\u00cc\7a\2\2\u00ccJ\3\2\2\2\u00cd\u00ce\7="+
		"\2\2\u00ceL\3\2\2\2\u00cf\u00d1\t\5\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\u00d5\b\'\2\2\u00d5N\3\2\2\2\4\2\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}