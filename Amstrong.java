import java.io.*;
public class Armstrong 
{
	public static void main(String[] args)throws Exception 
	{
        		int number , originalNumber, remainder, result = 0;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter the number:");
		number=Intger.parseInt(d.readLine());
       		originalNumber = number;
        		while (originalNumber != 0)
        		{
            			remainder = originalNumber % 10;
            			result += Math.pow(remainder, 3);
            			originalNumber /= 10;
        		}
        		if(result == number)
            			System.out.println(number + " is an Armstrong number.");
        		else
            			System.out.println(number + " is not an Armstrong number.");
    	}
}