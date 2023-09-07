import java.io.*;
class pirate
{
	int a[]=new int[10];
	int n;
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
		int  min,i,j,c;
		for(i=0;i<n;i++)
		{
			min=i;
			for(j=i+1;j<n;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			c=a[min];
			a[min]=a[i];
			a[i]=c;
		}
	}
	void display()
	{
		System.out.println("Sorted values:");
		for(int i=0;i<n;i++)
		{
			System.out.println("Value "+(i+1)+":");
			System.out.println(a[i]);
		}
	}
}
class selection
{
	public static void main(String arg[])throws Exception
	{
		pirate p =new pirate();
		p.input();
		p.sort();
		p.display();
	}
}