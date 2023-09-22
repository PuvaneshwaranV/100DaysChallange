import java.util.Scanner;
class java
{
	int a[][]=new int[10][10];
	int i,j,n,c=0,k=0,d=0,t=0,st;
	int p[]=new int[10];
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Enter total Number of vertices:");
		n=s.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{	
				if(i!=j)
				{
			System.out.print("Enter path cost from "+i+" to "+j+":");
					a[i][j]=s.nextInt();
					if(a[i][j]==999)
						d++;
				}
			}
		}
		if(d==0)
		{
			System.out.println("Starting vertex");
			st=s.nextInt();
		}
	}
	void logic()
	{
		for(i=st;i<n-1;i++)
		{
			for(j=i+1;j<(i+2);j++)
			{	
				++t;
				c=c+a[i][j];
				p[k++]=i;
			}
		}
		++t;
		c=c+a[n-1][0];
		p[k++]=n-1;
		++i;
		if(i==n)
		{
			for(i=0;i<st;i++)
			{
				for(j=i+1;j<(i+2);j++)
				{
					++t;
					c=c+a[i][j];
					p[k++]=i;
				}
			}
		}
		p[k]=st;
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
		System.out.println("");
		System.out.println("Total cost:"+c);
		System.out.println("Number of times basic operation executed:"+t);	
	}
}
class near 
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
			System.out.println("Time Complexity:"+(l1-l));
		}
		else
			System.out.println("Not a complete graph");
	}
}