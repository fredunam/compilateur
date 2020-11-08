grammar PlayPlus;

import PlayPlusWords;

/******************************************************************************/
/*****************   FILE DECLARATION   ***************************************/
/******************************************************************************/

impDecl : HASH IMPORT DOUBLEQUOT fileDecl DOUBLEQUOT;
fileDecl: FILENAME;


/******************************************************************************/
/****************   PROGRAMME   ***********************************************/
/******************************************************************************/

root: instruction+;

instruction: AFFECT LPAR ID COMMA expression RPAR   #affectInstr
           ;

expression: NUMBER                                  #constantExpr
          | ID                                      #variableExpr
          | expression op=(PLUS|MINUS) expression   #plusMinusExpr
          ;