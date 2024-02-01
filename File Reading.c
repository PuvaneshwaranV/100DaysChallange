#include<stdio.h>
void main()
{
	FILE *f1,*f2;
	char ch;
	f1=fopen("word.c","r");
	f2=fopen("copy.txt","w");
	while((ch=fgetc(f1))!=EOF)
	{
		
		fprintf(f2,"%c",ch);
	}
	fclose(f1);
}