import java.util.*;
class rasa
{
	int i,j,t,c=0,z;
	int part(int a[],int start,int end,int n)
	{	Random r=new Random();
		int o=r.nextInt(n-1);
		int pivot=start+(0%(end-start+1));
		z=a[start];
		a[start]=a[pivot];
		a[pivot]=z;
		pivot=a[start];
		i=start;
		j=end;
		while(i<j)
		{
			while( pivot>=a[i] && i<=end)
				i++;
			while( pivot<=a[j] && j>start)
				j--;
			if(i<j)
			{
				t=a[i];
				a[i]=a[j];
				a[j]=t;
			}
		}
			t=a[start];
			a[start]=a[j];
			a[j]=t;
		return j;		
	}
	void divide(int a[],int start,int end,int k,int n)
	{
		if(start<=end )
		{
			j=part(a,start,end,n);
			if((k-1)==j)
			{
				++c;
				System.out.println("The "+k+"th smallest number is :"+a[j]);
			}
			else if(++c>0 && k-1<j)
				divide(a,start,j-1,k,n);
			else if(++c>0 && k-1>j)
				divide(a,j+1,end,k,n);
		}
	}	
}
class kth
{
	public static void main(String arg[])throws Exception
	{
		rasa s=new rasa();
		int i,n,k;
		int a[]=new int[300];
		Scanner d=new Scanner(System.in);
		System.out.println("Enter the number of inputs:");
		n=d.nextInt();
		Random r=new Random();
		System.out.println("The array elements are:"); 
		for(i=0;i<n;i++)
		{
			a[i]=r.nextInt(1000);
			System.out.println(a[i]);
		}
 		k=r.nextInt(n+10);
		System.out.println("kth value:"+k);
		if(k<=n && k>0)
		{
			long l= System.nanoTime();
			s.divide(a,0,n-1,k,n);
			long l1= System.nanoTime();
			System.out.println("Basic operation  executed Times:"+s.c);
			System.out.println("Time complexity:"+(l1-l));
		}
		else
			System.out.print("value of k is not in the range of 1 to "+n+" so can't find the kth smallest number");
	}
}