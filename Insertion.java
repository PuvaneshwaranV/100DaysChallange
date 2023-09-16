import java.io.*;
class python
{
	int n;
	int a[]=new int[10];
	void input()throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter the No.of values:");
		n=Integer.parseInt(d.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value "+(i+1)+":");
			a[i]=Integer.parseInt(d.readLine());
		}
		
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
	void display()
	{
		System.out.println("Sorted values:");
		for(int i=0;i<n;i++)
		{
			System.out.println(" Value "+(i+1)+":"+a[i]);
		}
	}
}
class insertion
{
	public static void main(String arg[])throws Exception
	{
		python p =new python();
		p.input();
		p.sort();
		p.display();
	}
}