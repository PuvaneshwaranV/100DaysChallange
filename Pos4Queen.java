import java.io.*;
class posi
{
	public static void main(String arg[])throws Exception
	{
	DataInputStream d=new DataInputStream(System.in);
	int Q1,Q2,Q3,Q4;
	System.out.println("Enter some combination");
	Q1=Integer.parseInt(d.readLine());	
	Q2=Integer.parseInt(d.readLine());
	Q3=Integer.parseInt(d.readLine());
	Q4=Integer.parseInt(d.readLine());
	if((Q1<5 && Q2<5 && Q3<5 && Q4<5) && (0<Q1 && 0<Q2 && 0<Q3 && 0<Q4))
	{
		if((Q1==2 && Q2==4 && Q3==1 && Q4==3) || (Q1==3 && Q2==1 && Q3==4 && Q4==2))
			System.out.print("This is a possible solution for 4 Queen problem");
		else 
			System.out.print("This is not a possible solution for 4 Queen problem");
	}
	else
		System.out.print("This input is not possible for 4 Queen problem");
	}
}
