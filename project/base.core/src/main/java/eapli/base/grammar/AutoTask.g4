grammar AutoTask;

start: header type BLOCK_START statements BLOCK_END;

statements: statement+;

statement: function;

header: HASHTAG HELPDESK;

type: AUTO_TASK;

function: HASHTAG sendEmail END
        | HASHTAG fileSearch END
        | HASHTAG if_func
        | assign END;

sendEmail : SEND_EMAIL_LABEL STMT_START QUOTATION_MARKS email QUOTATION_MARKS COMMA QUOTATION_MARKS subject QUOTATION_MARKS COMMA QUOTATION_MARKS body QUOTATION_MARKS STMT_END;

fileSearch : FILE_SEARCH_LABEL STMT_START QUOTATION_MARKS path QUOTATION_MARKS COMMA QUOTATION_MARKS keyword QUOTATION_MARKS STMT_END;

if_func: IF_LABEL STMT_START conditions STMT_END BLOCK_START statements
        | IF_LABEL STMT_START conditions STMT_END BLOCK_START statements BLOCK_END ELSE BLOCK_START statements BLOCK_END;

conditions: condition conjunction conditions
          | condition;

condition: object comp object;

comp: COMP_EQUAL
    | DIFF
    | BIGGER
    | LESSER
    | BE
    | LE;

conjunction: AND
           | OR;

assign: variable EQUAL op;

variable : DOLLAR var_label;

op: object sign op
    | object
    | STMT_START op STMT_END;

object: variable
       | NUM+
       | HASHTAG fileSearch;

sign: PLUS
    | HYPHEN
    | TIMES
    | FOWARD_SLASH;

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