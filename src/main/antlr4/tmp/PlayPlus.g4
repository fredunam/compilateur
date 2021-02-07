grammar PlayPlus;

import PlayPlusWords;

root: instruction+;

instruction: AFFECT LPAR ID COMMA expression RPAR   #affectInstr
           ;

expression: NUMBER                                  #constantExpr
          | ID                                      #variableExpr
          | expression opArithmetique expression    #arithmetiqueExpr
          ;

varDecl: ID AS type SEMICOLON;

type: scalar | array;

scalar: BOOLEAN | INTEGER | SQUARE;

array: scalar (ANY_SPACE)* LBRACKET NUMBER+ (COLON (NUMBER+))? (ANY_SPACE)* RBRACKET;

exprD : exprEnt
    | exprBool
    | exprCase
    | exprG
    | ID LPAR (exprD (COMMA exprD)*) RPAR
    | LPAR exprD RPAR;

exprEnt: NUMBER
    | LATITUDE | LONGITUDE | GRID_SIZE
    | ( MAP | RADIO | AMMO | FRUITS | SODA ) COUNT
    | LIFE;

exprArithmetique: exprEnt opArithmetique exprEnt;

cardinaux: (NORTH | SOUTH | EAST | WEST);

exprBool: TRUE | FALSE
    | ENNEMI IS cardinaux
    | GRAAL IS cardinaux
    | exprEnt opBoolCompare2 exprEnt
    | exprBool opBoolCompare1 exprBool
    | NOT exprBool
    | exprBool opBoolEqual exprBool
    | exprEnt opBoolEqual exprEnt;

exprCase: ' ';

exprG: ' ';

opArithmetique: MINUS
    | PLUS
    | MULT
    | DIV
    | MOD;

opBoolCompare1: AND
    | OR
    | NOT;

opBoolCompare2: SMALLER
    | BIGGER;

opBoolEqual: EQUAL;











