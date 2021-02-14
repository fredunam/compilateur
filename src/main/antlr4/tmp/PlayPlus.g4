grammar PlayPlus;

import PlayPlusWords;

root: instruction+;

instruction: AFFECT '(' ID ',' expression ')'   #affectInstr
           ;

expression: NUMBER                                  #constantExpr
          | ID                                      #variableExpr
          | expression opArithmetique expression    #arithmetiqueExpr
          ;

varDecl: ID AS type ';';

type: scalar | array;

scalar: BOOLEAN | INTEGER | SQUARE;

array: scalar (ANY_SPACE)* '[' NUMBER+ (',' (NUMBER+))? (ANY_SPACE)* ']';

exprD : exprEnt
    | exprBool
    | exprCase
    | exprG
    | ID '(' (exprD (COMMA exprD)*) ')'
    | '(' exprD ')';

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

opArithmetique: '-'
    | '+'
    | '*'
    | '/'
    | '%';

opBoolCompare1: AND
    | OR
    | NOT;

opBoolCompare2: SMALLER
    | BIGGER;

opBoolEqual: EQUAL;











