grammar ValidateForm;

start: header type BLOCK_START statements BLOCK_END;

statements: statement+ #execStatements;

header: HASHTAG HELPDESK;

type: VALIDATE_FORM;

statement: HASHTAG mandatory END
        | HASHTAG regex END
        | HASHTAG assert_func END
        | HASHTAG get_attribute END
        | HASHTAG if_func
        | assign END;

mandatory: MANDATORY_LABEL STMT_START agr=nums STMT_END #execMandatory;

regex: REGEX_LABEL STMT_START agr=NUM+ COMMA re=string STMT_END #execRegex;

assert_func: ASSERT_LABEL STMT_START cond=conditions STMT_END #execAssert;

get_attribute: GET_ATTRIBUTE_LABEL STMT_START attribute=NUM+ STMT_END #execGetAttribute;

nums: number=NUM+ COMMA multipleNumbers=nums #execMultipleNumbers
    | number=NUM+ #execNum;

if_func: IF_LABEL STMT_START if_cond=conditions STMT_END BLOCK_START stmt_if=statements #onlyIf
        | IF_LABEL STMT_START if_cond=conditions STMT_END BLOCK_START stmt_if=statements BLOCK_END ELSE BLOCK_START stmt_else=statements BLOCK_END #ifElse;

conditions: right=condition conjSign=conjunction left=conditions #multipleConditions
          | cond=condition #singleConditions;

condition: left=object compSign=comp right=object #cond;

comp: COMP_EQUAL
    | DIFF
    | BIGGER
    | LESSER
    | BE
    | LE;

conjunction: AND
           | OR;

assign: var=variable EQUAL res=op #execAssign;

variable : DOLLAR label=var_label #execVar;

op: left=object sign=sign_td right=op #execOpTimesDivision
    | left=object sign=sign_pm right=op #execOpPlusMinus
    | atom=object #execOpAtom
    | STMT_START result=op STMT_END #execOpParenthesis;

object: var=variable #objectVariable
       | objNumber=num #objectNumber
       | HASHTAG get_attribute #objectAttribute;

sign_td: TIMES
    | FOWARD_SLASH;

sign_pm: PLUS
    | HYPHEN;

num: NUM+;

var_label: LOWERCASE alphanumeric*;

alphanumeric: LOWERCASE
            | UPPERCASE
            | NUM;

alpha: LOWERCASE
     | UPPERCASE;

string: QUOTATION_MARKS str=character+ QUOTATION_MARKS #execString;

character: LOWERCASE
     | UPPERCASE
     | PARENTHESIS_OPEN
     | PARENTHESIS_CLOSE
     | HYPHEN
     | NUM;

VALIDATE_FORM: 'validateForm';
MANDATORY_LABEL: 'mandatory';
REGEX_LABEL: 'regex';
ASSERT_LABEL: 'assert';
GET_ATTRIBUTE_LABEL: 'getAttribute';
HELPDESK: 'helpdesk';
IF_LABEL: 'if';
ELSE: 'else';
NUM: [0-9];
LOWERCASE: [a-z];
UPPERCASE: [A-Z];
PLUS: '+';
HYPHEN: '-';
TIMES: '*';
BLOCK_START: '{';
BLOCK_END: '}';
STMT_START: '(';
STMT_END: ')';
AT: '@';
DOT: '.';
EQUAL: '=';
PERC: '%';
DOLLAR: '$';
FOWARD_SLASH: '/';
COMP_EQUAL: '==';
DIFF: '!=';
BIGGER: '>';
LESSER: '<';
BE: '>=';
LE: '<=';
AND: '&&';
OR: '||';
COLON: ':';
COMMA: ',';
HASHTAG: '#';
UNDERSCORE: '_';
PARENTHESIS_OPEN: '[';
PARENTHESIS_CLOSE: ']';
QUOTATION_MARKS: '"';
END: ';';
WS : [ \t\r\n]+ -> skip;