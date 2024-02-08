import java.util.Scanner;
class metho
{
	int n,i;
	char ch;
	String s1;
	int count=0;
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String:");
		s1=s.nextLine();
		n=s1.length();
	}
	void logic()
	{
		for(i=0;i<n;i++)
		{
			ch=s1.charAt(i);
			if(ch=='1')
			{	
				if(count<4)
				{
					System.out.print(ch);
					count++;
				}
				else if(count==4){
					System.out.print(ch+"0");
					count=0;}
			}

			else if(ch=='0'){
				System.out.print(ch);
				count=0;}
	
	}
}
}
class Bit
{
	public static void main(String arg[])
	{
		metho m=new metho();
		m.input();
		m.logic();
}
}