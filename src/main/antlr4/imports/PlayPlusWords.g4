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
WHITESPACE: ' ';

STRING: 'string';
CHAR: 'char';



// Identifiers

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
WS: [ \n\r\t]+ -> skip ;