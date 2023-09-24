import java.util.Scanner;
class queen
{
	int p[][]=new int[20][20];
	int n,c=0;
	int count=0;
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		n=s.nextInt();
	}
	int check(int a,int b)
	{
		int i,j;
		for(i=0;i<n && ++c>0;i++)
		{
			if(p[a][i]==1)
				return 0;
		}
		for(i=a,j=b;i>=0 && j>=0 && ++c>0;i--,j--)
		{
			if(p[i][j]==1)
				return 0;
		}
		for(i=a,j=b;i<n && j>=0 && ++c>0;i++,j--)
		{
			if(p[i][j]==1)
				return 0;
		}
		return 1;
	}
	void logic(int a,int b)
	{
		int i;
		if(b==n)
		{
			output();
		}
		else
		{
			for(i=0;i<n && ++c>0;i++)
			{
				if(check(i,b)==1)
				{
					p[i][b]=1;
					logic(i,b+1);
					p[i][b]=0;
				}
			}
		}
	}
	void output()
	{
		System.out.println("Solution :"+(++count));
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(p[i][j]+" ");
			System.out.println();				
		}
		
	}
}
class neeuq
{
	public static void main(String arg[])
	{
		queen z=new queen();
		z.input();
		long l=System.nanoTime();
		z.logic(0,0);
		long l1=System.nanoTime();
		System.out.println("Number of times the basic operation executed :"+z.c);
		System.out.print("Time complexity:"+(l1-l));
	}
}