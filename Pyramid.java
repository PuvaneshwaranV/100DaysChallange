public class Pyramid 
{
  	public static void main(String[] args) 
	{
    		int l = 5, k = 0;
    		for (int i = 1; i <= l; ++i, k = 0) 
		{
      			for (int j = 1; j <= l - i; ++j) 
			{
        				System.out.print("  ");
      			}
      			while (k != 2 * i - 1) 
			{
        				System.out.print("* ");
        				++k;
      			}
      			System.out.println();
    		}
  	}
}