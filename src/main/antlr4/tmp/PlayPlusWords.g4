lexer grammar PlayPlusWords;

// Words

AFFECT: 'affect';
LPAR: '(';
RPAR: ')';
COMMA: ',';
PLUS: '+';
MINUS: '-';
QUOT: '\'';
DOUBLEQUOT: '"';
DASH: '_';
QUESTION: '?';
EXCLAMATION: '!';
COLON: ':';
SEMICOLON: ';';
HASH: '#';
DOT: '.';

IMPORT: 'import';
MAP: 'map';
STRING: 'string';
CHAR: 'char';

//ANY_SPACE: SINGLE_SPACE+;
//SINGLE_SPACE: ' ';


// Identifiers

FILENAME: ID DOT MAP;

ID: LETTER (LETTER | DIGIT)* ;

NUMBER: (ENTIER)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;


ENTIER: (MINUS)? (DIGIT)+;


// Comments -> ignored

COMMENTMULTI: '/*' .*? '*/'  -> skip;
COMMENT: '//' .*? '\r'? '\n' -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \t]+ -> skip ;