import java.util.Scanner;
public class Vowel
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		int count=0;
		System.out.print("Enter the String :");
		String a=d.nextLine();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='a' || 
			   a.charAt(i)=='e' || 						   							   a.charAt(i)=='i' || 
			   a.charAt(i)=='o' ||
			   a.charAt(i)=='u' ||
  			   a.charAt(i)=='A'||
			   a.charAt(i)=='E'||
			   a.charAt(i)=='I'||
		 	    a.charAt(i)=='O'||
	 			a.charAt(i)=='U')
			count++;
		}
		System.out.println("Vowels in a String ="+count);
	}
}