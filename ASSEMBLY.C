#include<stdio.h>
#include<conio.h>
#include<stdio.h>
struct quad
{
	char result[10],arg1[10],arg2[10],op[3];
};
struct quad tac[10];
int n;

char reg[20][10];

void input()
{
	int i;
	printf("\nEnter the total number of three address code\n");
	scanf("%d",&n);
	for(i=0;i<n;i++)
	{
		printf("\n Enter the First operand:" );
		scanf("%s",tac[i].arg1);
		printf("\n Enter the Second Operand:" );
		scanf("%s",tac[i].arg2);
		printf("\n Enter the Operator:" );
		scanf("%s",tac[i].op);
		printf("\n Enter the result:" );
		scanf("%s",tac[i].result);
	}
}

void display()
{
	int i;
	printf("\nThree address statement\n");
	for(i=0;i<n;i++)
	{
		printf("\n%s\t=\t%s\t%s\t%s",tac[i].result,tac[i].arg1,tac[i].op,tac[i].arg2);
	}
}
char *registeralloc(char memory[])
{
	int j;
	char temp[10],word[10];

	for(j=0;j<20;j++)
		if(!strcmp(memory,reg[j]))
		{
			strcpy(word,"r");
			sprintf(temp,"%d",j);
			strcat(word,temp);
			return word;
		}
	for(j=0;j<20;j++)
		if(reg[j]==NULL)
		{
			strcpy(word,"r");
			strcpy(reg[j],memory);
			sprintf(temp,"%d",j);
			strcat(word,temp);
			printf("\n LD %s %s",memory,word);
			return word;
		}
	return NULL;
}

void assemblycode()
{
	int  i,j,pos;
	char reg1[10],reg2[10],reg3[10],temp[10];
	for(i=0;i<10;i++)
	{
	    strcpy(reg1,registeralloc(tac[i].arg1));
	    strcpy(reg2,registeralloc(tac[i].arg2));

	    for(j=0;j<20;j++)
		if(!strcmp(reg[j],"\0"))
		{
			strcpy(reg3,"r");
			sprintf(temp,"%d",j);
			strcat(reg3,temp);
			pos=j;
			break;
		}

	    if(!strcmp(tac[i].op,"+"))
		printf("\n ADD %s %s %s",reg3,reg1,reg2);
	    else  if(!strcmp(tac[i].op,"-"))
		printf("\n SUB %s %s %s",reg3,reg1,reg2);

	    for(j=0;j<20;j++)
		if(!strcmp(reg[j],tac[i].result))
			strcpy(reg[j],"\0");
	    strcpy(reg[pos],tac[i].result);
	    printf("\n ST %s %s",tac[i].result,reg1);
	}
}




void main()
{
	int i,j;
	clrscr();
	for(i=0;i<20;i++)
		strcpy(reg[i],"\0");
	input();
	display();
	assemblycode();
	getch();

}
