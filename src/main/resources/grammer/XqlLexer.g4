lexer grammar XqlLexer; 

import XqlLexerFragments;

EQUAL_OPERATOR
    : '='
    ;

GREATER_OR_EQUAL_OPERATOR
    : '>='
    ;

GREATER_THAN_OPERATOR
    : '>'
    ;

LESS_OR_EQUAL_OPERATOR
    : '<='
    ;

LESS_THAN_OPERATOR
    : '<'
    ;

NOT_EQUAL_OPERATOR
    : '!='
    ;

PLUS_OPERATOR
    : '+'
    ;

MINUS_OPERATOR
    : '-'
    ;

MULT_OPERATOR
    : '*'
    ;

DIV_OPERATOR
    : '/'
    ;

MOD_OPERATOR
    : '%'
    ;

COMMA_SYMBOL
    : ','
    ;

OPEN_PAR_SYMBOL
    : '('
    ;

CLOSE_PAR_SYMBOL
    : ')'
    ;

DOT_SYMBOL
    : '.'
    ;

BACK_TICK_QUOTED_ID
    : BACK_TICK (.)*? BACK_TICK
    ;

SELECT_SYMBOL
    : S E L E C T
    ;

ALL_SYMBOL
    : MULT_OPERATOR
    ;

DISTINCT_SYMBOL
    : D I S T I N C T
    ;

FROM_SYMBOL
    : F R O M
    ;

WHERE_SYMBOL
    : W H E R E
    ;

IS_SYMBOL
    : I S
    ;

NOT_SYMBOL
    : N O T
    ;

TRUE_SYMBOL
    : T R U E
    ;

FALSE_SYMBOL
    : F A L S E
    ;

NULL_SYMBOL
    : N U L L
    ;

AND_SYMBOL
    : A N D
    ;

OR_SYMBOL
    : O R
    ;

BETWEEN_SYMBOL
    : B E T W E E N
    ;

LIKE_SYMBOL
    : L I K E
    ;

DATE_SYMBOL
    : D A T E
    ;

AVG_SYMBOL
    : A V G
    ;

COUNT_SYMBOL
    : C O U N T
    ;

MIN_SYMBOL 
    : M I N
    ;

MAX_SYMBOL
    : M A X
    ;

STDDEV_SYMBOL
    : S T D D E V
    ;

SUM_SYMBOL
    : S U M
    ;

INT_NUMBER
    : DIGITS
    ;

DECIMAL_NUMBER
    : DIGITS? DOT_SYMBOL DIGITS
    ;

FLOAT_NUMBER
    : (DIGITS? DOT_SYMBOL)? DIGITS [eE] (MINUS_OPERATOR | PLUS_OPERATOR)? DIGITS
    ;

DOUBLE_QUOTED_TEXT
    : DOUBLE_QUOTE (.)*? DOUBLE_QUOTE
    ;

SINGLE_QUOTED_TEXT
    : SINGLE_QUOTE (.)*? SINGLE_QUOTE
    ;