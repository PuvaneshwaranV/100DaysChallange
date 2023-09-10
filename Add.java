import java.io.*;
class addition
{
	int d,f;
	float e;
	public  void add(int a,int b)
	{
		
		d=a+b;
		System.out.println("answer:"+d);
	}
	public void add(float a,float b)
	{
		
		e=a+b;
		System.out.println("answer:"+e);
	}
	public void add(int a,int b,int c)
	{
		
		f=a+b+c;
		System.out.println("answer:"+f);
	}
}
public class add
{
	public static void main(String arg[])
	{
		addition p=new addition();
		p.add(34, 6);
		addition p1=new addition();
		p1.add( 5.5f, 6.7f);
		addition p2=new addition();
		p2.add( 6, 6, 6);
	}
}