import java.io.*;
class heap
{
	int a[]=new int[20];
	int n,m,k,t,i,j;
	void input()throws Exception
	{
		DataInputStream d=new DataInputStream(System.in);
		System.out.print("Enter the number of elements:");
		n=Integer.parseInt(d.readLine());
		for(i=1;i<=n;i++)
		{	
			System.out.print("Element"+i+":");
			a[i]=Integer.parseInt(d.readLine());
		}
	}
	void sort()
	{
		for(m=n;m>1;m--)
		{
			for(k=m/2;k>0;k--)
			{
				for(i=k;2*i<=m;)
				{
					j=2*i;
					if(j<m)
					{
						if(a[j]<a[j+1])
							j=j+1;
					}
					if(a[i]<a[j])
					{
						t=a[i];
						a[i]=a[j];
						a[j]=t;
						i=j;
					}
					else
						break;
				}
			}
			t=a[1];
			a[1]=a[m];
			a[m]=t;
		}
	}
	void print()
	{
		System.out.println("After sort:");
		for(i=1;i<=n;i++)
		{
			System.out.print("Element"+i+":");
			System.out.println(a[i]);
		}
	}
}
class sort
{
	public static void main(String arg[])throws Exception
	{
		heap h=new heap();
		h.input();
		h.sort();
		h.print();
	} 
}
