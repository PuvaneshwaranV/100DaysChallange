import java.io.*;
class leo
{
	int n,i,c=0;
	int p[]=new int[100];
	DataInputStream d=new DataInputStream(System.in);
	void input()throws Exception
	{
		
		System.out.println("Enter the number of elelemnts:");
		n=Integer.parseInt(d.readLine());
		for(i=1;i<=n;i++)
		{
			System.out.println("Enter Value"+i+":");
			p[i]=Integer.parseInt(d.readLine());
		}
	}
	void check()
	{
		for(i=1;i<n;i++)
		{
			if(p[i]>p[i+1])
				c++;
		}
	}
	void last()
	{
		if(c!=0)
			System.out.println("List of values is not in ascending order");
		else
			System.out.println("List of values is already in ascending order");
	}
}
class insta
{
	public static void main(String arg[])throws Exception
	{
		leo l=new leo();
		l.input();
		l.check();
		l.last();		
	}	
}