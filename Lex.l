%{
#include<stdio.h>
%}
letter [a-zA-Z_]
digit [0-9]
key (void|main|int|return|printf|float|include)
id {letter}({letter}|{digit})*
num {digit}+
deci {digit}+(.{digit}+)?(E[+|-]?{digit}+)?
lit \".*\"
op "+"|"-"|"*"|"/"|"="
sep "{"|"}"|"("|")"|","
sym "#"|"<"|">"|";"|"."
%%
{key} {fprintf(yyout,"\n %s is a keyword",yytext);}
{id} {fprintf(yyout,"\n %s is an identifier",yytext);}
{deci} {fprintf(yyout,"\n %s is a decimal number",yytext);}
{num} {fprintf(yyout,"\n %s is an integer constant",yytext);}
{op} {fprintf(yyout,"\n %s is an operator",yytext);}
{sep} {fprintf(yyout,"\n %s is a seperator",yytext);}
{lit} {fprintf(yyout,"\n %s is a string literal",yytext);}
{sym} {fprintf(yyout,"\n %s is a special symbol",yytext);}
%%
void main()
{
 extern FILE *yyin,*yyout;
 yyin=fopen("input.txt","r");
 yyout=fopen("output.txt","w");
 yylex();
}
int yywrap()
{
 return 1;
}