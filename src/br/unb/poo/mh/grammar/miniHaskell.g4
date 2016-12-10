/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */
grammar miniHaskell;

file:   (functionDecl)+ ;

type:   'Inteiro' | 'Booleano' | 'Error' | 'Decimal' ; // user-defined types

functionDecl
    :   ID '(' formalParameters? ')' block // "void f(int x) {...}"
    ;
formalParameters
    :   formalParameter (',' formalParameter)*
    ;
formalParameter
    :   type ID
    ;

block:  '{' stat* '}' ;   // possibly empty statement block
stat:   block
    |   'if' expr 'then' stat ('else' stat)?
    |   'return' expr? ';'
    |   expr '=' expr ';' // assignment
    |   expr ';'          // func call
    ;

expr:   ID '(' exprList? ')'    // func call like f(), f(x), f(1,2)
    |   '-' expr                // unary minus
    |   '!' expr                // boolean not
    |   '&&' expr                // boolean AND
    |   '||' expr                // boolean OR
    |   expr '*' expr
    |   expr ('+'|'-') expr
    |   expr '==' expr          // equality comparison (lowest priority op)
    |   expr '>' expr          // GT
    |   expr '<' expr          // LT
    |   expr '>=' expr          // GTE
    |   expr '<=' expr          // LTE
    |   ID                      // variable reference
    |   INT
    |   '(' expr ')'
    ;
exprList : expr (',' expr)* ;   // arg list

ID  :   LETTER (LETTER | [0-9])* ;
fragment
LETTER : [a-zA-Z] ;

INT :   [0-9]+ ;

WS  :   [ \t\n\r]+ -> skip ;

SL_COMMENT
    :   '//' .*? '\n' -> skip
    ;
