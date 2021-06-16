grammar AutoTask;

start: header type BLOCK_START statements BLOCK_END;

statements: statement+ #execStatements;

header: HASHTAG HELPDESK;

type: AUTO_TASK;

statement: HASHTAG sendEmail END
        | HASHTAG fileSearch END
        | HASHTAG if_func
        | assign END;

sendEmail : SEND_EMAIL_LABEL STMT_START QUOTATION_MARKS em=email QUOTATION_MARKS COMMA QUOTATION_MARKS sub=subject QUOTATION_MARKS COMMA QUOTATION_MARKS email_body=body QUOTATION_MARKS STMT_END #execSendEmail;

fileSearch : FILE_SEARCH_LABEL STMT_START QUOTATION_MARKS fp=path QUOTATION_MARKS COMMA QUOTATION_MARKS key=keyword QUOTATION_MARKS STMT_END #execFileSearch;

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
      | HASHTAG fileSearch #objectFileSearch;

sign_td: TIMES
    | FOWARD_SLASH;

sign_pm: PLUS
    | HYPHEN;

num: NUM+;

path : port? folder* file;

port: alpha+ COLON;

folder: FOWARD_SLASH system_name+ FOWARD_SLASH;

file: system_name+ DOT XML;

email: alphanumeric+ AT alphanumeric+ DOT alphanumeric+;

keyword : alphanumeric+;

subject: alphanumeric+;

body: alphanumeric+;

var_label: LOWERCASE alphanumeric*;

alphanumeric: LOWERCASE
            | UPPERCASE
            | NUM;

system_name: alphanumeric
           | DOT
           | UNDERSCORE
           | HYPHEN;

alpha: LOWERCASE
     | UPPERCASE;

AUTO_TASK: 'autoTask';
FILE_SEARCH_LABEL: 'fileSearch';
SEND_EMAIL_LABEL: 'sendEmail';
HELPDESK: 'helpdesk';
IF_LABEL: 'if';
ELSE: 'else';
XML: 'xml';
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
QUOTATION_MARKS: '"';
END: ';';
WS : [ \t\r\n]+ -> skip;