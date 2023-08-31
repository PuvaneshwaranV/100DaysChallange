class fibi 
{
	public static void main(String[] args) 
	{
		int first = 0, second= 1;
    		System.out.println("Fibonacci Series:");
    		for (int i = 1; i <= 20; ++i) 
		{
      			System.out.print(first + ", ");
		        	int next = first + second;
      			first = second;
      			second = next;
   		 }
	 }
}