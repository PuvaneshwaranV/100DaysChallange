import java.util.Scanner;
class java
{
	//int a[][]={{0,10,17,7},{10,0,5,2},{17,5,0,11},{7,2,11,0}};
	int a[][]=new int[10][10];
	int i,j,n,c=0,k=0,d=0,t=0,st;
	int p[]=new int[10];
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter total Number of vertices:");
		n=s.nextInt();
		System.out.println("Enter '000' for Infinity ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{	
				if(i!=j)
				{
			System.out.print("Enter path cost from "+i+" to "+j+":");
					a[i][j]=s.nextInt();
				}
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{	
				if(a[i][j]!=a[j][i])
					d++;
			}
		}
		if(d==0)
		{
			System.out.println("Starting vertex should between 0 to "+(n-1));
			System.out.println("Starting vertex");
			st=s.nextInt();

		}
	}
	void logic()
	{
		p[k++]=st;
		if(st==n-1 && ++t>0)
		{
			c=c+a[st][0];
			i=0;
		}
		else if(st!=n-1 && ++t>0)
		{
			c=c+a[st][st+1];
			i=st+1;
		}
		while(i!=st)
		{
			for(;i<n-1 && i!=st && ++t>0;i++)
			{
				c=c+a[i][i+1];
				p[k++]=i;
			}
			if(i!=st && i==(n-1) && ++t>0)
			{
				p[k++]=i;
				c=c+a[i][0];
				i=0;
			}
		}	
		p[k]=i;
	}	
	void output()
	{
		System.out.print("Path:");
		System.out.print(p[0]);
		for(k=1;k<(n+1);k++)
		{
			System.out.print("->");
			System.out.print(p[k]);
		}
	}
}
class nears 
{
	public static void main(String arg[])
	{
		java j=new java();
		j.input();
		if(j.d==0)
		{
			long l=System.nanoTime();
			j.logic();
			long l1=System.nanoTime();
			j.output();
			System.out.println("Total cost:"+j.c);
			System.out.println("Number of times basic operation executed:"+j.t);	
			System.out.println("Time Complexity:"+(l1-l));
		}
		else if(j.d>0)
			System.out.println("Not a complete graph");
	}
}