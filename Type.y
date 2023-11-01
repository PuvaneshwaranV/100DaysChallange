%{
#include<stdio.h>
#include<string.h>
#include "lex.yy.c"
typedef struct 
{
char name[10];
int s;
}node1;
node1 symtab[10];
int i=1,n=1,j,k=1; 
%}
%union{struct 
{int size ; char *lexeme;}type_id; }
%left ','
%left '+'
%token <type_id> INT FLOAT ID
%type <type_id> D T T1 S E  T2
%%
ST	:	D    S	
D	:	T1  T2 {$2.size=$1.size;}	   	
	|
	;	
T1 	:	T   ID  {$$.size=$1.size;$2.size=$1.size;strcpy(symtab[i].name,$2.lexeme);symtab[i].s=$2.size;i++;}
	;
T2	:   	','	ID  T2 {$$.size=$3.size;$2.size=$3.size;strcpy(symtab[i].name,$2.lexeme);symtab[i].s=$2.size;i++;}
	|	';'	D
	;
T	:	INT {$$.size=$1.size;}
	|	FLOAT {$$.size=$1.size;}
	;
S 	:	ID '=' E ';'		
		{
			  for(j=1;j<i;j++) 
	                                      { 
				if(!strcmp(symtab[j].name,$1.lexeme)) 
					{ break;} 
		        	}
		      	if(j!=i) $1.size= symtab[j].s; else $1.size=-1;
			if($3.size==-1||$1.size==-1)printf("\nSorry variable is not declared");
				
			else if ($1.size==$3.size)  
				printf("\n %s = %s",$1.lexeme,$3.lexeme);
			else if($1.size==2)
				printf("\n %s = (int) %s",$1.lexeme,$3.lexeme);
			else if($1.size==4)
				printf("\n %s = (float)%s",$1.lexeme,$3.lexeme);
		}
	;
E	:	E	'+'	E     
		{
			char temp[10];
			char temp1[10];
			char word[]="t";
			char word1[]="t";
			sprintf(temp,"%d",n);
			strcat(word,temp);
			if($1.size==-1 || $3.size==-1)
			{
				printf("\n SORRY variable is not declared");
				$$.size=-1;
			}
			else
			{
			 if ($1.size>$3.size) 
			{
				$$.size=$1.size; 	
				printf("\n %s=(float)%s",word,$3.lexeme) ;
				strcpy($3.lexeme,word);
				n++;
			} 
			else if ($1.size<$3.size)
			{
				$$.size=$3.size; 
				printf("\n %s=(float)%s",word,$1.lexeme) ;
				strcpy($1.lexeme,word);
				n++;
			} 
			if(n!=k)
			{
				sprintf(temp1,"%d",n);
				strcat(word1,temp1);
				n++;
				k=n;
				printf("\n %s =%s + %s",word1,$1.lexeme,$3.lexeme);
				strcpy($$.lexeme,word1);
			}
			else
			{
				n++;
				k=n;
				printf("\n %s =%s + %s",word,$1.lexeme,$3.lexeme);
				strcpy($$.lexeme,word);
			}}
	}
	|	ID  {strcpy($$.lexeme,$1.lexeme);
		        for(j=1;j<i;j++) 
		       { 
			if(!strcmp(symtab[j].name,$1.lexeme)) 
			{ break;} 
		        }
		      if(j!=i) $$.size= symtab[j].s; else $$.size=-1;	}		
	;
%%


void main()
{
printf("\n Enter the program\n");
yyparse();
}
int yyerror(char *msg)
{
printf("\n ERROR is %s",msg);
}









