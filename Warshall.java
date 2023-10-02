import java.io.*;
class warshall
{
	public static void main(String ar[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		int i,j,k,p,n,c=0;
		//int b[][]={{0,1,0,1,1,0},{0,0,1,0,0,0},{1,0,0,0,0,0},{0,0,0,0,0,0},{0,1,0,1,0,0},
//{0,1,1,0,1,0}};
		int b[][]=new int[20][20];
		n=Integer.parseInt(d.readLine());
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("Enter the value "+(i+1)+(j+1)+" :");
				b[i][j]=Integer.parseInt(d.readLine());
			}
		}	
		long l=System.nanoTime();	
		for(k=0;k<n;k++)
		{
			for(i=0;i<n;i++)
			{
				for(p=0;p<n;p++)
				{
					++c;
					if(b[i][p]==1)
						b[i][p]=1;
					else
						b[i][p]=b[i][k] *b[k][p];
				}
			}
		}
		long l1=System.nanoTime();
		//System.out.println((k+1)+" Node as Intermediate:");
		for(i=0;i<n;i++)
		{
			for(p=0;p<n;p++)
			{
				System.out.print(b[i][p]+" ");
			}
			System.out.println("");
		}
		System.out.println("Total number of basic operation executed:"+c);
		System.out.println("Time complexity:"+(l1-l));
	}
}