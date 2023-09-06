import java.io.*;
import java.util.*;
class linearsearch
{
	int a[]=new int[200];
	int p,n,i,c=0,s;
	void input()throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		Random r=new Random();
		System.out.println("Enter the no. of elements: ");
		n=Integer.parseInt(d.readLine());
		for( i=0;i<n;i++)
		{
			a[i]=r.nextInt(1000);
		}
		for( i=0;i<n;i++)
		{
			System.out.println("element "+(i+1)+":"+a[i]);
		}
		System.out.println("Enter a searching element:");
		s=Integer.parseInt(d.readLine());
	}
	void logic()throws Exception
	{
		for( i=0;i<n;i++)
		{
			c++;
			if( a[i]==s)
			{
				p++;
				break;
			}
		}
	}
	void output()
	{
		System.out.println("Number of time :"+c);
		if(p!=0)
			System.out.println("Number is found");
		else
		System.out.println("Number is not found");
	}
}
class Rashmi
{
	public static void main(String arg[])throws Exception
	{
		linearsearch k=new linearsearch();
		k.input();
		long l=System.nanoTime();
		k.logic();
		long l1=System.nanoTime();
		k.output();
		System.out.println("Time complexity:"+(l1-l));
	}
}
