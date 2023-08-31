import java.io.*;
class Gcd 
{
	public static void main(String[] args)throws Exception 
	{
    		int n1 , n2 ;
    		int gcd = 1;
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter n1:");
		n1=Integer.parseInt(d.readLine());
		System.out.println("Enter n2:");
		n2=Integer.parseInt(d.readLine());
    		for (int i = 1; i <= n1 && i <= n2; ++i) 
		{
      			if (n1 % i == 0 && n2 % i == 0)
        				gcd = i;
   		 }
    		System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
 	}
}