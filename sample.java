import java.io.*;
class floyd
{
	public static void main(String ar[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		int i,j,k,p,n,c=0;
//int b[][]={{0,999,3,999},{2,0,999,999},{999,7,0,1},{6,999,999,0}};
		int b[][]=new int[20][20];
		System.out.println("Enter number of vertex:");
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
		for(i=0;i<n;i++)
		{							
			for(p=0;p<n;p++)
			{
				for(k=0;k<n;k++)
				{
					++c;
					b[i][p]=Math.min(b[i][p],(b[i][k]+b[k][p]));
					
				}

			}
	
		}
		long l1=System.nanoTime();
		for(i=0;i<n;i++)
		{
			for(p=0;p<n;p++)
			{
				System.out.print(b[i][p]+" ");
			}
			System.out.println("");
		}
		System.out.println("Total number of times basic operation is executed:"+c);
		System.out.println("Time complexity:"+(l1-l));
	}
}