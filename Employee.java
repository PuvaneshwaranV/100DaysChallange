import java.io.*;
class employee
{
String emp_name,emp_id,emp_email,emp_address;
long mob_number ;
float BP;
void inputs()throws Exception
{
	DataInputStream d=new DataInputStream(System.in);
	System.out.println("name:");
	emp_name =d.readLine();
	System.out.println(" id:");
	emp_id =d.readLine();
	System.out.println("email:");
	emp_email =d.readLine();
	System.out.println("mobile number:");
	mob_number =Long.parseLong(d.readLine());
	System.out.println("address:");
	emp_address=d.readLine();
	System.out.println(" basic pay :");
	BP=Float.parseFloat(d.readLine());
}
}
class Assistant_professor extends employee
{
	void inputs()throws Exception
	{
		System.out.println("Assistant Professor  details");
		super.inputs();
		float DA,HRA,PF,SCF,gross,net;
		DA =BP *0.97f;
		HRA=BP *0.1f;
		PF =BP *0.12f;
		SCF =BP*0.001f;
		gross =BP +DA;
		net=gross-PF-SCF;
		System.out.println("monthly salary  "+gross);
		System.out.println("Net salary:"+net);
	}
}
class programmer extends employee
{
	void inputs()throws Exception
	{
		System.out.println("Programmer details");
		super.inputs();
		float DA,HRA,PF,SCF,gross,net;
		DA =BP *0.97f;
		HRA=BP *0.1f;
		PF =BP *0.12f;
		SCF =BP*0.001f;
		gross =BP +DA;
		net=gross-PF-SCF;
		System.out.println("monthly salary  "+gross);
		System.out.println("Net salary:"+net);
	}
}
class Associate_professor extends employee
{
	void inputs()throws Exception
	{
		System.out.println("Associate professor details");
		super.inputs();
		float DA,HRA,PF,SCF,gross,net;
		DA =BP *0.97f;
		HRA=BP *0.1f;
		PF =BP *0.12f;
		SCF =BP*0.001f;
		gross =BP +DA;
		net=gross-PF-SCF;
		System.out.println("monthly salary  "+gross);
		System.out.println("Net salary:"+net);
	}
}
class professor extends employee
{	
	void inputs()throws Exception
	{
		System.out.println("Professor details :");
		super.inputs();
		float DA,HRA,PF,SCF,gross,net;
		DA =BP *0.97f;
		HRA=BP *0.1f;
		PF =BP *0.12f;
		SCF =BP*0.001f;
		gross =BP +DA;
		net=gross-PF-SCF;
		System.out.println("monthly salary  "+gross);
		System.out.println("Net salary:"+net);
	}
}

class details
{
public static void main(String args[])throws Exception
{
Assistant_professor L =new Assistant_professor();
programmer O =new programmer();
Associate_professor V=new Associate_professor();
professor E =new professor();
L.inputs();
O.inputs();
V.inputs();
E.inputs();
}
}