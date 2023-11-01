%{
#include "Type.tab.h"
%}
id ([a-zA-Z])([0-9a-zA-Z])*
%%
int {yylval.type_id.size=2;return INT;}
float {yylval.type_id.size=4; return FLOAT;}
{id} {yylval.type_id.lexeme=strdup(yytext);return ID;}
[ \t] {}
[\n] {return 0;}
. {return *yytext;}
%%
int yywrap()
{
return 1;
}
