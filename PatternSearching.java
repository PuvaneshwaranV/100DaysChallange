import java.io.*;
class pattern
{
	public static void main(String arg[])throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		int i,j,k,c=0;
		System.out.println("Enter the Main string:");
		String s1=d.readLine();
		System.out.println("Enter the Search string:");
		String s2=d.readLine();
		char a[]=s1.toCharArray();
		char b[]=s2.toCharArray();
		int n=s1.length();
		int m=s2.length();
		long l=System.nanoTime();
		if(m<=n && m!=0)
		{
			for(i=0;i<n;i++)
			{
				for(j=0,k=i;j<m && k<n;j++)
				{
					if(++c>0 && a[k]==b[j])
						k++;
					else
						break;
				}
				if(j==m)
					break;
			}
			if(i<n)
				System.out.println("Exist");
			else
				System.out.println("Not Exist");
		}
		else if(m>n)	
			System.out.println("Searching String is bigger than Main string");
		else if(m==0)
			System.out.println("There is no Sesrching String");	
		long l1=System.nanoTime();
		System.out.println("Total number of times basic operation is executed:"+c);
		System.out.println("Time complexity:"+(l1-l));
		}
}