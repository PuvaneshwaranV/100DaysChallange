class Constructor
{
	int sum;
  	Main() 
	{
   		this(5, 2);
  	}
  	Main(int arg1, int arg2) 
	{
   		this.sum = arg1 + arg2;
  	}
  	void display() 
	{
    		System.out.println("Sum is: " + sum);
  	}
   	public static void main(String[] args) 
	{
    		Main obj = new Main();
   	 	obj.display();
  	}
}