grammar ValidateForm;

start: header type BLOCK_START stmts=statements BLOCK_END #execStart;

statements: stmt=statement+ #execStatements;

header: HASHTAG HELPDESK #execHeader;

type: VALIDATE_FORM #execType;

statement: stmt=mandatory END #stmtMandatory
        | stmt=regex END #stmtRegex
        | stmt=assert_func END #stmtAssert
        | stmt=get_attribute END #stmtAttribute
        | stmt=date_comp END #stmtDateComp
        | stmt=if_func #stmtIf
        | stmt=assign END #stmtAssign;

mandatory: HASHTAG MANDATORY_LABEL STMT_START agr=nums STMT_END #execMandatory;

regex: HASHTAG REGEX_LABEL STMT_START agr=NUM+ COMMA re=string STMT_END #execRegex;

assert_func: HASHTAG ASSERT_LABEL STMT_START cond=conditions STMT_END #execAssert;

get_attribute: HASHTAG GET_ATTRIBUTE_LABEL STMT_START attribute=NUM+ STMT_END #execGetAttribute;

date_comp: HASHTAG DATE_COMPARE_LABEL STMT_START date1=get_attribute conjSign=comp date2=get_attribute STMT_END #execDateCompare;

nums: number=NUM+ COMMA multipleNumbers=nums #execMultipleNumbers
    | number=NUM+ #execNum;

if_func: HASHTAG IF_LABEL STMT_START if_cond=bool STMT_END BLOCK_START stmt_if=statements BLOCK_END #onlyIf
        | HASHTAG IF_LABEL STMT_START if_cond=bool STMT_END BLOCK_START stmt_if=statements BLOCK_END ELSE BLOCK_START stmt_else=statements BLOCK_END #ifElse;

bool: bl=mandatory #boolMandatory
    | bl=regex #boolRegex
    | bl=date_comp #boolDateComp
    | bl=conditions #boolConditions;

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

op: left=op sign=sign_td right=op #execOpTimesDivision
    | left=op sign=sign_pm right=op #execOpPlusMinus
    | STMT_START result=op STMT_END #execOpParenthesis
    | atom=object #execOpAtom;

object: var=variable #objectVariable
       | objNumber=num #objectNumber
       | att=get_attribute #objectAttribute;

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
     | NUM
     | PLUS
     | TIMES
     | PIPE
     | STMT_START
     | STMT_END
     | QUESTION_MARK
     | DOT;

VALIDATE_FORM: 'validateForm';
MANDATORY_LABEL: 'mandatory';
REGEX_LABEL: 'regex';
ASSERT_LABEL: 'assert';
GET_ATTRIBUTE_LABEL: 'getAttribute';
DATE_COMPARE_LABEL: 'dateCompare';
HELPDESK: 'helpdesk';
IF_LABEL: 'if';
ELSE: 'else';
NUM: [0-9];
LOWERCASE: [a-z];
UPPERCASE: [A-Z];
PLUS: '+';
HYPHEN: '-';
PIPE: '|';
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
QUESTION_MARK: '?';
UNDERSCORE: '_';
PARENTHESIS_OPEN: '[';
PARENTHESIS_CLOSE: ']';
QUOTATION_MARKS: '"';
END: ';';
WS : [ \t\r\n]+ -> skip;