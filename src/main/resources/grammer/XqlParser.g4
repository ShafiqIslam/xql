grammar XqlParser;

import XqlLexer;

@header {
    package com.shafiqistaken.xql.grammer;
}

selectStatement
    : SELECT_SYMBOL selectItemList fromClause? whereClause?
    ;

selectItemList
    : ALL_SYMBOL
    | selectItem (COMMA_SYMBOL selectItem)*
    | DISTINCT_SYMBOL selectItem
    ;

selectItem
    : identifier
    ;

fromClause
    : FROM_SYMBOL sheetName
    ;

whereClause
    : WHERE_SYMBOL expr
    ;

expr
    : boolPrimaryExpression (
        IS_SYMBOL NOT_SYMBOL? type = (TRUE_SYMBOL | FALSE_SYMBOL)
    )?                                                   # exprIs
    | expr op = AND_SYMBOL expr                          # exprAnd
    | expr op = OR_SYMBOL expr                           # exprOr
    ;

boolPrimaryExpression
    : predicate                                                         # primaryExprPredicate
    | boolPrimaryExpression IS_SYMBOL NOT_SYMBOL? NULL_SYMBOL           # primaryExprIsNull
    | boolPrimaryExpression compOp predicate                            # primaryExprCompare
    ;

compOp
    : EQUAL_OPERATOR
    | GREATER_OR_EQUAL_OPERATOR
    | GREATER_THAN_OPERATOR
    | LESS_OR_EQUAL_OPERATOR
    | LESS_THAN_OPERATOR
    | NOT_EQUAL_OPERATOR
    ;

predicate
    : bitExpr (
        NOT_SYMBOL? predicateOperations
    )?
    ;

predicateOperations
    : BETWEEN_SYMBOL bitExpr AND_SYMBOL predicate                      # predicateExprBetween
    | LIKE_SYMBOL simpleExpr                                           # predicateExprLike
    ;

bitExpr
    : simpleExpr
    | bitExpr op = (
        MULT_OPERATOR
        | DIV_OPERATOR
        | MOD_OPERATOR
    ) bitExpr
    | bitExpr op = (PLUS_OPERATOR | MINUS_OPERATOR) bitExpr
    ;

simpleExpr
    : columnRef                                                                                  # simpleExprColumnRef
    | functionCall                                                                               # simpleExprRuntimeFunction
    | literal                                                                                    # simpleExprLiteral
    | sumExpr                                                                                    # simpleExprSum
    | op = (PLUS_OPERATOR | MINUS_OPERATOR) simpleExpr                                           # simpleExprUnary
    | NOT_SYMBOL simpleExpr                                                                      # simpleExprNot
    ;

columnRef
    : identifier
    ;

functionCall
    : DATE_SYMBOL exprWithParentheses
    ;

exprWithParentheses
    : OPEN_PAR_SYMBOL expr CLOSE_PAR_SYMBOL
    ;

sumExpr
    : name = (
        AVG_SYMBOL
        | COUNT_SYMBOL
        | MIN_SYMBOL 
        | MAX_SYMBOL
        | STDDEV_SYMBOL
        | SUM_SYMBOL
    ) OPEN_PAR_SYMBOL DISTINCT_SYMBOL? ALL_SYMBOL? expr CLOSE_PAR_SYMBOL
    ;

literal
    : textLiteral
    | numLiteral
    | nullLiteral
    | boolLiteral
    ;

textLiteral
    : value = (SINGLE_QUOTED_TEXT | DOUBLE_QUOTED_TEXT)
    ;

numLiteral
    : INT_NUMBER
    | DECIMAL_NUMBER
    | FLOAT_NUMBER
    ;

boolLiteral
    : TRUE_SYMBOL
    | FALSE_SYMBOL
    ;

nullLiteral
    : NULL_SYMBOL
    ;

sheetName
    : identifier
    ;

identifier
    : BACK_TICK_QUOTED_ID
    ;
