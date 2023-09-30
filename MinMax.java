import java.io.DataInputStream;
class minmax
{
	int min,max,c=0;
	void min(int p[],int s,int e)
	{
		int mid,m,m1;
		if(s==e)
		{
			min=p[s];
			max=p[s];
		}
		else
		{
			mid=(s+e)/2;
			min( p, s, mid);
			m=min;
			m1=max;
			min( p, mid+1,e);
			if(++c>0 && m<min)
				min=m;	
			if(++c>0 && m1>max)
				max=m1;
		}
	}
	void print()
	{
		System.out.println("Minimum value in the list is:"+min);
		System.out.println("Maximum value in the list is:"+max);
	}
}
class queen
{
	public static void main(String arg[])throws Exception
	{
		minmax z=new minmax();
		int n;
		int p[]=new int[20];
		DataInputStream d=new DataInputStream(System.in);
		System.out.println("Enter total number of values:");
		n=Integer.parseInt(d.readLine());
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter Value "+(i+1)+":");
			p[i]=Integer.parseInt(d.readLine());
		}
		long l=System.nanoTime();
		z.min(p,0,n-1);
		//z.max(p,0,n-1);
		long l1=System.nanoTime();
		z.print();
		System.out.println("Time Complexity:"+(l1-l));
		System.out.print("Number of time basic operation Executed:"+z.c);
	}
}