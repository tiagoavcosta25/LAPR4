grammar helpdesk_grammar;

statements: header statement+;

statement:  type NEWLINE;

header: '#!/helpdesk';

type: '#' sendEmail
    | '#' fileSearch
    | '#' calc;

sendEmail : 'email';

fileSearch : 'fileSearch';

calc : 'calc';

NEWLINE: [\r\n]+;