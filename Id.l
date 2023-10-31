%{
#include "Id.tab.h"
%}
%%
[A-Z_a-z]+ {yylval.str1=yytext;return LETTER;}
[0-9] {yylval.str=yytext;return DIGIT;}
[\t] {}
[\n] {return 0;}
. {return *yytext;}
%%
int yywrap()
{
return 1;
}