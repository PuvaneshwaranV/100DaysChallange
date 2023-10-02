import java.io.*;
class stack
{
	int a[]=new int[10];
	int i,top;
	stack()
	{
		top=-1;
	}
	void push()throws Exception
	{
		if(top==10)
			System.out.println("Stack is Full");
		else
		{
			DataInputStream d=new DataInputStream(System.in);
			System.out.print("Enter the element:");
			i=Integer.parseInt(d.readLine());
			top++;
			a[top]=i;
		}
	}
	void pop()
	{
		if(top==-1)
			System.out.println("Stack is Empty");
		else
		{
			System.out.println(a[top]);
			top--;
		}
	}
	void display()
	{
		if(top==-1)
			System.out.println("Empty");
		else
		{
			for(i=0;i<=top;i++)
			System.out.println("The element:"+a[i]);
		}
	}
}
class kaka
{
	public static void main(String arg[])throws Exception
	{
		int n;
		stack p=new  stack();
		do
		{
			DataInputStream d=new DataInputStream(System.in);
			System.out.println("1.push\n2.pop\n3.display\n");
			System.out.println("Enter your choice");
			int ch=Integer.parseInt(d.readLine());
			if(ch==1)
				p.push();
			else if(ch==2)
				p.pop();
			else if(ch==3)
				p.display();
			System.out.println("Once again");
			n=Integer.parseInt(d.readLine());
		}while(n==1);
	}
}				