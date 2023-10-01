import java.io.*;
class queue
{
	int a[]=new int[3];
	int rear,front;
	void enqueue()throws Exception
	{
		int i;
		if(rear==3)
			System.out.println("queue is Full");
		else
		{
			DataInputStream d=new DataInputStream(System.in);
			System.out.print("Enter the element:");
			i=Integer.parseInt(d.readLine());
			rear++;
			a[rear]=i;
		}
	}
	void dequeue()
	{
		if(rear==front)
			System.out.println("queue is Empty");
		else
		{
			System.out.println(a[front]);
			front++;
		}
	}
	void display()
	{
		if(rear==front)
			System.out.println("Empty");
		else
		{
			for(int i=front;i<rear;i++)
			System.out.println("The element:"+a[i]);
		}
	}
}
class varisu
{
	public static void main(String arg[])throws Exception
	{
		int n;
		queue p=new  queue();
		do
		{
			DataInputStream d=new DataInputStream(System.in);
			System.out.println("1.enqueue\n2.dequeue\n3.display\n");
			System.out.println("Enter your choice");
			int ch=Integer.parseInt(d.readLine());
			if(ch==1)
				p.enqueue();
			else if(ch==2)
				p.dequeue();
			else if(ch==3)
				p.display();
			System.out.println("Once again");
			n=Integer.parseInt(d.readLine());
		}while(n==1);
	}
}				