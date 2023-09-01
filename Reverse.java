import java.io.*;
class Reverse 
{
	public static void main(String[] args) throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
   		int num , reversed = 0;
    		System.out.print(" Enter the Original Value:");
		num=Integer.parseInt(d.readLine());
    		while(num != 0) 
		{
  	    		int digit = num % 10;
      			reversed = reversed * 10 + digit;
      			num /= 10;
    		}
 		System.out.println("Reversed Number: " + reversed);
  	}
}