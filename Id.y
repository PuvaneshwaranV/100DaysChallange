%{
#include<stdio.h>
#include "lex.yy.c"
%}
%union
{
char *str,*str1;	
}
%token <str1,str> LETTER DIGIT
%%
ID : 	LETTER S {printf("IDENTIFIER");}
 S  :	LETTER S |DIGIT S |; 
%%
void main()
{
	printf(" Enter The String\n");
	yyparse();
}
int yyerror(char *msg)
{
	 printf("\nsorry");
}