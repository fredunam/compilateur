lexer grammar PlayPlusWords;

// Words

AFFECT: 'affect';
LPAR: '(';
RPAR: ')';
COMMA: ',';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
MOD: '%';
QUOT: '\'';
DOUBLEQUOT: '"';
DASH: '_';
QUESTION: '?';
EXCLAMATION: '!';
COLON: ':';
SEMICOLON: ';';
LBRACKET: '[';
RBRACKET: ']';


//LangageWords

STRING: 'string';
CHAR: 'char';
BOOLEAN: 'boolean';
INTEGER: 'integer';
TRUE: 'true';
FALSE: 'false';
AND: 'and';
OR: 'or';
NOT: 'not';
SMALLER: '<';
BIGGER: '>';
EQUAL: '=';

SQUARE: 'square';

AS: 'as';
IS: 'is';

//WordPlay
LATITUDE: 'latitude';
LONGITUDE: 'longitude';
NORTH: 'north';
SOUTH: 'south';
EAST: 'east';
WEST: 'west';
GRID_SIZE: 'grid size';
MAP: 'map';
RADIO: 'radio';
AMMO: 'ammo';
FRUITS: 'fruits';
SODA: 'soda';
COUNT: 'count';
LIFE: 'life';
ENNEMI: 'ennemi';
GRAAL: 'graal';


ANY_SPACE: SINGLE_SPACE+;
SINGLE_SPACE: ' ';


// Identifiers

ID: LETTER (LETTER | DIGIT)* ;

NUMBER: MINUS? (ENTIER)+;

fragment LETTER: 'A'..'Z' | 'a'..'z' ;
fragment DIGIT: '0'..'9' ;


ENTIER: (MINUS)? (DIGIT)+;


// Comments -> ignored

COMMENTMULTI: '/*' .*? '*/'  -> skip;
COMMENT: '//' .*? '\r'? '\n' -> skip;

// Whitespaces -> ignored

NEWLINE: '\r'? '\n'  -> skip ;
WS: [ \n\r\t]+ -> skip ;