class ExecutionTime 
{
	public void display() 
	{
    		System.out.println("Calculating Method execution time:");
  	}
	public static void main(String[] args) 
	{
   		Main obj = new Main();
   		long start = System.nanoTime();
   		obj.display();
    		long end = System.nanoTime();
    		long execution = end - start;
    		System.out.println("Execution time: " + execution + " nanoseconds");
  	}
}