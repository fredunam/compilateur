// Generated from /home/fred/IdeaProjects/1920_TLSS_Compilateur/src/main/antlr4/tmp/PlayPlusWords.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PlayPlusWords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AFFECT=1, LPAR=2, RPAR=3, COMMA=4, PLUS=5, MINUS=6, QUOT=7, DOUBLEQUOT=8, 
		DASH=9, QUESTION=10, EXCLAMATION=11, COLON=12, SEMICOLON=13, STRING=14, 
		CHAR=15, ANY_SPACE=16, SINGLE_SPACE=17, ID=18, NUMBER=19, ENTIER=20, COMMENTMULTI=21, 
		COMMENT=22, NEWLINE=23, WS=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AFFECT", "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "QUOT", "DOUBLEQUOT", 
			"DASH", "QUESTION", "EXCLAMATION", "COLON", "SEMICOLON", "STRING", "CHAR", 
			"ANY_SPACE", "SINGLE_SPACE", "ID", "NUMBER", "LETTER", "DIGIT", "ENTIER", 
			"COMMENTMULTI", "COMMENT", "NEWLINE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'affect'", "'('", "')'", "','", "'+'", "'-'", "'''", "'\"'", "'_'", 
			"'?'", "'!'", "':'", "';'", "'string'", "'char'", null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AFFECT", "LPAR", "RPAR", "COMMA", "PLUS", "MINUS", "QUOT", "DOUBLEQUOT", 
			"DASH", "QUESTION", "EXCLAMATION", "COLON", "SEMICOLON", "STRING", "CHAR", 
			"ANY_SPACE", "SINGLE_SPACE", "ID", "NUMBER", "ENTIER", "COMMENTMULTI", 
			"COMMENT", "NEWLINE", "WS"
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


	public PlayPlusWords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PlayPlusWords.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00ae\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\6\21d\n\21\r\21\16\21e\3\22\3\22\3\23\3\23\3\23\7\23m\n\23"+
		"\f\23\16\23p\13\23\3\24\6\24s\n\24\r\24\16\24t\3\25\3\25\3\26\3\26\3\27"+
		"\5\27|\n\27\3\27\6\27\177\n\27\r\27\16\27\u0080\3\30\3\30\3\30\3\30\7"+
		"\30\u0087\n\30\f\30\16\30\u008a\13\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\31\7\31\u0095\n\31\f\31\16\31\u0098\13\31\3\31\5\31\u009b\n"+
		"\31\3\31\3\31\3\31\3\31\3\32\5\32\u00a2\n\32\3\32\3\32\3\32\3\32\3\33"+
		"\6\33\u00a9\n\33\r\33\16\33\u00aa\3\33\3\33\4\u0088\u0096\2\34\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\2+\2-\26/\27\61\30\63\31\65\32\3\2\4\4\2C\\c|\5\2\13\f"+
		"\17\17\"\"\2\u00b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\5>\3\2\2\2\7@\3\2\2\2"+
		"\tB\3\2\2\2\13D\3\2\2\2\rF\3\2\2\2\17H\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2"+
		"\25N\3\2\2\2\27P\3\2\2\2\31R\3\2\2\2\33T\3\2\2\2\35V\3\2\2\2\37]\3\2\2"+
		"\2!c\3\2\2\2#g\3\2\2\2%i\3\2\2\2\'r\3\2\2\2)v\3\2\2\2+x\3\2\2\2-{\3\2"+
		"\2\2/\u0082\3\2\2\2\61\u0090\3\2\2\2\63\u00a1\3\2\2\2\65\u00a8\3\2\2\2"+
		"\678\7c\2\289\7h\2\29:\7h\2\2:;\7g\2\2;<\7e\2\2<=\7v\2\2=\4\3\2\2\2>?"+
		"\7*\2\2?\6\3\2\2\2@A\7+\2\2A\b\3\2\2\2BC\7.\2\2C\n\3\2\2\2DE\7-\2\2E\f"+
		"\3\2\2\2FG\7/\2\2G\16\3\2\2\2HI\7)\2\2I\20\3\2\2\2JK\7$\2\2K\22\3\2\2"+
		"\2LM\7a\2\2M\24\3\2\2\2NO\7A\2\2O\26\3\2\2\2PQ\7#\2\2Q\30\3\2\2\2RS\7"+
		"<\2\2S\32\3\2\2\2TU\7=\2\2U\34\3\2\2\2VW\7u\2\2WX\7v\2\2XY\7t\2\2YZ\7"+
		"k\2\2Z[\7p\2\2[\\\7i\2\2\\\36\3\2\2\2]^\7e\2\2^_\7j\2\2_`\7c\2\2`a\7t"+
		"\2\2a \3\2\2\2bd\5#\22\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\"\3"+
		"\2\2\2gh\7\"\2\2h$\3\2\2\2in\5)\25\2jm\5)\25\2km\5+\26\2lj\3\2\2\2lk\3"+
		"\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o&\3\2\2\2pn\3\2\2\2qs\5-\27\2rq\3"+
		"\2\2\2st\3\2\2\2tr\3\2\2\2tu\3\2\2\2u(\3\2\2\2vw\t\2\2\2w*\3\2\2\2xy\4"+
		"\62;\2y,\3\2\2\2z|\5\r\7\2{z\3\2\2\2{|\3\2\2\2|~\3\2\2\2}\177\5+\26\2"+
		"~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		".\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084\7,\2\2\u0084\u0088\3\2\2\2"+
		"\u0085\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008c\7,\2\2\u008c\u008d\7\61\2\2\u008d\u008e\3\2\2\2\u008e\u008f\b\30"+
		"\2\2\u008f\60\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7\61\2\2\u0092"+
		"\u0096\3\2\2\2\u0093\u0095\13\2\2\2\u0094\u0093\3\2\2\2\u0095\u0098\3"+
		"\2\2\2\u0096\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u009a\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009b\7\17\2\2\u009a\u0099\3\2\2\2\u009a\u009b\3"+
		"\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\7\f\2\2\u009d\u009e\3\2\2\2\u009e"+
		"\u009f\b\31\2\2\u009f\62\3\2\2\2\u00a0\u00a2\7\17\2\2\u00a1\u00a0\3\2"+
		"\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\b\32\2\2\u00a6\64\3\2\2\2\u00a7\u00a9\t\3\2"+
		"\2\u00a8\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab"+
		"\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\33\2\2\u00ad\66\3\2\2\2\16"+
		"\2elnt{\u0080\u0088\u0096\u009a\u00a1\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}