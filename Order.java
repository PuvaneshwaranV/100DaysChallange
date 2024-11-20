import java.io.*;
class Leo
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
	boolean check()
	{
		for(i=0;i<n - 1;i++)
		{
			if(p[i]>p[i+1])
				return false;
		}
		return true;
	}
	void last(boolean result )
	{
		if(!result)
			System.out.println("List of values is not in ascending order");
		else
			System.out.println("List of values is already in ascending order");
	}
}
class Insta
{
	public static void main(String arg[])throws Exception
	{
		leo l=new leo();
		l.input();
		l.last(l.check());
			
	}	
}
