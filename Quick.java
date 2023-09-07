import java.io.*;
import java.util.*;
class rasa
{
	int i,j,t,pivot,c=0;
	int part(int a[],int start,int end)
	{
		pivot=a[start];
		i=start;
		j=end;
		while(i<j)
		{
			while(++c>0 && i<=end && pivot>=a[i] )
				i++;
			while(++c>0 && j>start && pivot<=a[j] )
				j--;
			if(i<j)
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
			t=a[start];
			a[start]=a[j];
			a[j]=t;
		
		
		return j;		
	}
	void divide(int a[],int start,int end)
	{
		if(start<end)
		{
			j=part(a,start,end);
			divide(a,start,j-1);
			divide(a,j+1,end);
		}
	}	
}
class quick
{
	public static void main(String arg[])throws Exception
	{
		rasa s=new rasa();
		int i,n;
		int a[]=new int[300];
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		n=d.nextInt();
		
		Random r=new Random();
		System.out.println("The array elements are:"); 
		for(i=0;i<n;i++)
		{
			a[i]=r.nextInt(1000);
			System.out.println(a[i]);
		}
//insertion sort
		/*int  v,j;
		for( i=0;i<n;i++)
		{
			v=a[i];
			for( j=i-1;j>=0 && a[j]>v;j--)
			{
				a[j+1]=a[j];
			}
			a[j+1]=v;
		}
		System.out.println("Insertion:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}*/
//insertion sort
		long l= System.nanoTime();
		s.divide(a,0,n-1);
		long l1= System.nanoTime();
		System.out.println("The sorted elements:");
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Basic operation  executed Times:"+s.c);
		System.out.println("Time complexity:"+(l1-l));
		
	}
}