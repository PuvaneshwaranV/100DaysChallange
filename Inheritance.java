public class puvi
{
	void print()
	{
		System.out.println("Hello");
	}
}
class puvanesh extends puvi
{
	void print()
	{	
		super.print();
		System.out.println("Hii");
	}
}
class jan extends puvi
{
	void print()
	{	
		super.print();
		System.out.println("welcome");
	}
}
class apr extends puvi
{
	void print()
	{
		super.print();
		System.out.println("How are you? ");
	}
}
class and
{
	public static void main(String arg[])
	{
		jan p=new  jan();
		p.print();
		puvanesh t =new puvanesh();
		t.print();
		apr u =new apr();
		u.print();
	}
}
