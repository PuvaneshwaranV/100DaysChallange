import java.util.Scanner;
import java.io.PrintStream;
class Rotate
{
	public static void main(String arg[])
	{
		Scanner s =new Scanner(System.in);
		int a[]=new int[5];
		int n,k,l;
		n=s.nextInt();
		for(int i=0;i<n;i++)
			a[i]=s.nextInt();
		System.out.println("Times of rotate:");
		k=s.nextInt()%n;
		for(int i=0;i<k;i++)
		{
			l=a[0];
			for(int j=0;j<n-1;j++)
				a[j]=a[j+1];
			a[n-1]=l;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}