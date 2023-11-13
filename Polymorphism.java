import java.io.*;
class  papa
{
	void  kaatu()
	{
		System.out.println("I am papa");
	}
}
class kutty extends papa
{
	void kaatu()
	{
		super.kaatu();
		System.out.println("I am kutty");
	}
}
class  chellam extends kutty
{
	void kaatu()
	{
		super.kaatu();
		System.out.println("I am chellam");
	}
}
class raakamma
{
	void vaangu(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println(c);
	}
	void vaangu(int a,int b, int c)
	{
		int d;
		d=a+b+c;
		System.out.println(d);
	}
}
class buji
{
	public static void main(String arg[])
	{
		kutty k;
		papa p=new  papa();
		chellam c =new chellam();
		raakamma r=  new raakamma();
		k=c;
		k.kaatu();
		r.vaangu(5,6);
		r.vaangu(2,5,12);
	}
}