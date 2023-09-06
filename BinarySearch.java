import java.io.*;
import java.util.*;
class java
{
	int n, se;
	int a[]=new int[300];
	Scanner s=new Scanner(System.in);
	Random r=new Random();
	DataInputStream d=new DataInputStream(System.in);
	void input()throws Exception
	{
		System.out.println("Enter the No.of values:");
		n=s.nextInt();
		System.out.println("List of elements:");
		for(int i=0;i<n;i++)
		{
			
			a[i]=r.nextInt(1000);
			System.out.println(a[i]);
		}
		System.out.println("Enter the value to searched:");
		se=Integer.parseInt(d.readLine());
	}
	void sort()
	{
		int  v,j;
		for(int i=0;i<n;i++)
		{
			v=a[i];
			for( j=i-1;j>=0 && a[j]>v;j--)
			{
				a[j+1]=a[j];
			}
			a[j+1]=v;
		}
	}
	void binary()
	{
		int start=0,end=n-1;
		int mid,count =0;
		while(start<=end)
		{	count=count+1;;
			mid=(start+end)/2;
			if(a[mid] == se)
			{
				break;
			}
			else if(a[mid]>se)
			{
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			
		}
		System.out.println("No of times basic operation is executed = " +count);
		if(start<=end)
			System.out.println("Found");
		else
			System.out.println("Not Found");
	}
}
class search
{
	public static void main(String arg[])throws Exception
	{
		java j=new java();
		j.input();
		j.sort();
		long l=System.nanoTime();
		j.binary();
		long l1=System.nanoTime();
		System.out.println("Time Complexity:"+(l1-l));
	}
}