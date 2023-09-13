import java.io.*;
class floyd
{
	public static void main(String ar[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		int i,j,k=0,p,ii,jj,n,c=0;
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
		for(k=0;k<b.length;k++)
		{								
			for(i=0;i<b.length;i++)
			{
				for(p=0;p<b.length;p++)
				{
					++c;
					if(b[i][k]==-1 || b[k][p]==-1)
						b[i][p]=b[i][p];
					else 
						if(b[i][p]>(b[i][k]+b[k][p]))
							b[i][p]=b[i][k]+b[k][p];
						else
							b[i][p]=b[i][p];
				}
			}
		}
		long l1=System.nanoTime();
		//System.out.println((k+1)+" Node as Intermediate:");
		for(ii=0;ii<b.length;ii++)
		{
			for(jj=0;jj<b.length;jj++)
			{
				System.out.print(b[ii][jj]+" ");
			}
			System.out.println("");
		}
		System.out.println("Total number of basic operation executed:"+c);
		System.out.println("Time complexity:"+(l1-l));
	}
}