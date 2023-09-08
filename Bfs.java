import java.io.*;
class bfs
{
	public static void main(String arg[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		int a[][]=new int[20][20];
		int q[]=new int[20];
		int v[]=new int[20];
		int i,j,r=0,f=0,n,st,c=0;
		System.out.print("Enter the Total Number of Vertices:");
		n=Integer.parseInt(d.readLine());
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print("The Egde from "+"Vertex "+(i)+" to Vertex "+(j)+" is :");
				a[i][j]=Integer.parseInt(d.readLine());
			}
		}
		System.out.println("The Adjacent Matrix representation for Given graph is:");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("Enter the starting vertex:");
		st=Integer.parseInt(d.readLine());
		long l1=System.nanoTime();	
		q[r++]=st;
		v[st]=1;
		for(i=f;i<r;i++)
		{
			for(j=0;j<n;j++)
			{
				if(++c>0&&a[ q[i] ][j]==1 && v[j]!=1)
				{
					q[r++]=j;
					v[j]=1;
				}
			}
		}
		long l=System.nanoTime();
		System.out.println("Tree Edges for given starting vertex:");
		for(i=f;i<r;i++)
			System.out.print(q[i]+" ");
		System.out.println("Number of time basic operation executed:"+c);
		System.out.println("The Time complexity is:"+(l-l1));
	}

}
