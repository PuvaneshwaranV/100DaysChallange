import java.io.*; 
public class Prime 
{
	public static void main(String[] args)throws Exception 
	{
    		int num, c=0;
		DataInputStream d=new DataInputStream(System.in);
		num=Integer.parseInt(d.readLine());
    		for (int i = 2; i <= num / 2; ++i) 
		{
      			if (num % i == 0) 
			{
        				c++;
        				break;
      			}
    		}
    		if (c!=0)
     			 System.out.println(num + " is a prime number.");
    		else
      			System.out.println(num + " is not a prime number.");
  	}
}