grammar ValidateForm;

start: header type BLOCK_START statements BLOCK_END;

statements: statement+;

statement: function;

header: HASHTAG HELPDESK;

type: VALIDATE_FORM;

function: HASHTAG mandatory END
        | HASHTAG regex END
        | HASHTAG assert_func END
        | HASHTAG get_attribute END
        | HASHTAG if_func
        | assign END;

mandatory: MANDATORY_LABEL STMT_START nums STMT_END #exec_mandatory;

regex: REGEX_LABEL STMT_START NUM+ COMMA re=string STMT_END #exec_regex;

assert_func: ASSERT_LABEL STMT_START conditions STMT_END #exec_assert;

get_attribute: GET_ATTRIBUTE_LABEL STMT_START NUM+ STMT_END #exec_get_attribute;

nums: NUM+ COMMA nums
    | NUM+;

if_func: IF_LABEL STMT_START conditions STMT_END BLOCK_START statements #only_if
        | IF_LABEL STMT_START conditions STMT_END BLOCK_START statements BLOCK_END ELSE BLOCK_START statements BLOCK_END #if_else;

conditions: condition conjunction conditions #multiple_conditions
          | condition #single_conditions;

condition: object comp object #cond;

comp: COMP_EQUAL
    | DIFF
    | BIGGER
    | LESSER
    | BE
    | LE;

conjunction: AND
           | OR;

assign: variable EQUAL op #exec_assign;

variable : DOLLAR var_label;

op: object sign op
    | object
    | STMT_START op STMT_END;

object: variable
       | NUM+
       | HASHTAG get_attribute;
       
sign: PLUS
    | HYPHEN
    | TIMES
    | FOWARD_SLASH;

var_label: LOWERCASE alphanumeric*;

alphanumeric: LOWERCASE
            | UPPERCASE
            | NUM;

alpha: LOWERCASE
     | UPPERCASE;

string: QUOTATION_MARKS character+ QUOTATION_MARKS;

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