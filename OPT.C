#include<stdio.h>
#include<conio.h>
#include<stdio.h>
struct quad
{
	char result[10],arg1[10],arg2[10],op[3];
};
struct quad tac[10];
int n;

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
void comsubexpeli()
{
	int i,t,j,k,temp=0;

	for(i=0;i<n-1;i++)
		for(j=i+1;j<n;j++)
		{
			temp=0;
			if((!strcmp(tac[i].arg1,tac[j].arg1))&&(!strcmp(tac[i].arg2,tac[j].arg2))&&(!strcmp(tac[i].op,tac[j].op)))
			{
				for(t=i+1;t<j;t++)
				{
					if((!strcmp(tac[j].arg1,tac[t].result))||(!strcmp(tac[j].arg2,tac[t].result)))
					{
						temp=1;break;
					}
				}
				if(temp==0)
				{
					for(k=j+1;k<n;k++)
					{
						if((!strcmp(tac[j].result,tac[k].arg1)))
							strcpy(tac[k].arg1,tac[i].result);
						if((!strcmp(tac[j].result,tac[k].arg2)))
							strcpy(tac[k].arg2,tac[i].result);
					}
					for(k=j;k<n-1;k++)
					{
						strcpy(tac[k].arg1,tac[k+1].arg1);
						strcpy(tac[k].arg2,tac[k+1].arg2);
						strcpy(tac[k].op,tac[k+1].op);
						strcpy(tac[k].result,tac[k+1].result);
					}
					n--;
				}
			}
		}
}
void deadcodeeli()
{
    int i,t,j,k,temp=0;

	for(i=0;i<n-1;i++)
	{
		temp=0;
		for(j=i+1;j<n;j++)
			if((!strcmp(tac[i].result,tac[j].arg1))||(!strcmp(tac[i].result,tac[j].arg2)))
			{
				temp=1;
				break;
			}
		if(temp==0)
		{
			for(k=i;k<n-1;k++)
			{
				strcpy(tac[k].arg1,tac[k+1].arg1);
				strcpy(tac[k].arg2,tac[k+1].arg2);
				strcpy(tac[k].op,tac[k+1].op);
				strcpy(tac[k].result,tac[k+1].result);
			}
			n--;
		}
	}
}
void main()
{
	clrscr();
	input();
	display();
	comsubexpeli();
	printf("\n After Common Subexpression Elimination\n");
	display();
	deadcodeeli();
	printf("\n After dead code elimination\n");
	display();
	getch();

}
