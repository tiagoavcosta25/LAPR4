grammar AutoTask;

start: header type BLOCK_START stmts=statements BLOCK_END #execStart;

statements: stmt=statement+ #execStatements;

header: HASHTAG HELPDESK;

type: AUTO_TASK;

statement: SPACE* HASHTAG stmt=sendEmail END #stmtSendEmail
        | SPACE* HASHTAG stmt=fileSearch END #stmtFileSearch
        | SPACE* HASHTAG stmt=if_func #stmtIf
        | SPACE* HASHTAG stmt=get_value #stmtGetValue
        | SPACE* stmt=assign END #stmtAssign;

sendEmail : SEND_EMAIL_LABEL STMT_START QUOTATION_MARKS em=email QUOTATION_MARKS COMMA SPACE? sub=subject COMMA SPACE? email_body=body STMT_END #execSendEmail
        | SEND_EMAIL_LABEL STMT_START sub=subject COMMA SPACE? email_body=body STMT_END #execSendEmailCollab;

fileSearch : FILE_SEARCH_LABEL STMT_START fp=num COMMA SPACE? search=searchInFile #execFileSearch;

searchInFile: QUOTATION_MARKS search_in = keyword QUOTATION_MARKS COMMA SPACE? search=searchInFile #execSearchIn
            | QUOTATION_MARKS search_by=keyword QUOTATION_MARKS COMMA SPACE? search_value=value COMMA SPACE? QUOTATION_MARKS  search_for=keyword QUOTATION_MARKS STMT_END #execSearchInFile;

value: QUOTATION_MARKS key=keyword QUOTATION_MARKS #searchKeyValue
    | var=variable #searchKeyVar;

if_func: IF_LABEL STMT_START if_cond=conditions STMT_END BLOCK_START stmt_if=statements end_if #onlyIf
        | IF_LABEL STMT_START if_cond=conditions STMT_END BLOCK_START stmt_if=statements BLOCK_END SPACE* start_else BLOCK_START stmt_else=statements end_if #ifElse;

end_if: BLOCK_END #execEndIf;

start_else: ELSE #execStartElse;

conditions: right=condition SPACE? conjSign=conjunction SPACE? left=conditions #multipleConditions
          | cond=condition #singleConditions;

condition: left=object SPACE? compSign=comp SPACE? right=object #cond;

comp: COMP_EQUAL
    | DIFF
    | BIGGER
    | LESSER
    | BE
    | LE;

conjunction: AND
           | OR;

get_value: GET_VALUE_LABEL STMT_START form=num COMMA SPACE? attribute=num STMT_END #execGetValue;

assign: var=variable SPACE? EQUAL SPACE? res=op #execAssign;

variable : DOLLAR label=var_label #execVar;

op: left=op SPACE? sign=sign_td SPACE? right=op #execOpTimesDivision
    | left=op SPACE? sign=sign_pm SPACE? right=op #execOpPlusMinus
    | atom=object #execOpAtom
    | STMT_START result=op STMT_END #execOpParenthesis;

object: var=variable #objectVariable
      | objNumber=num #objectNumber
      | QUOTATION_MARKS objText=string QUOTATION_MARKS #objectText
      | HASHTAG res=fileSearch #objectFileSearch
      | HASHTAG res=get_value #objectGetValue;

sign_td: TIMES
    | FORWARD_SLASH;

sign_pm: PLUS
    | HYPHEN;

num: NUM+
    | NUM+ DOT NUM+;

string: alphanumeric+ string
        | characters string
        | alphanumeric+
        | characters;

characters: SPACE
        | COLON
        | COMMA
        | HYPHEN
        | EUR;

email: alphanumeric+ AT alphanumeric+ DOT alphanumeric+;

keyword : alphanumeric+;

subject: text=email_text #execSubject;

body: text=email_text #execBody;

email_text: obj=object spaces=SPACE+ rest=body #bodySpacesObject
        | obj=object #bodyObject;

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
GET_VALUE_LABEL: 'getAttribute';
HELPDESK: 'helpdesk';
IF_LABEL: 'if';
ELSE: 'else';
XML_FILE: '.xml';
NUM: [0-9];
LOWERCASE: [a-z];
UPPERCASE: [A-Z];
EUR: '€';
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
FORWARD_SLASH: '/';
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
SPACE: ' ';
WS: [\t\r\n]+ -> skip;