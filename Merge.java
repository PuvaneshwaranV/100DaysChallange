import java.util.*;
class petti
{
	int i,j,k,count=0,start,mid,end;
	int c[]=new int[300];
	void divide(int s[],int start,int end)
	{
		if(start<end)
 		{
			int mid=(start+end)/2;
			divide(s,start,mid);
			divide(s,mid+1,end);
			combine(s,start,mid,end);
		}
				
	}
	void combine(int s[],int start,int mid,int end)
	{
		i=start;
		j=mid+1;
		k=0;
		while((i<=mid) && (j<=end))
		{
			count++;
			if(s[i]<s[j])
				c[k++]=s[i++];
			else
				c[k++]=s[j++];
		}
		while(i<=mid)
		{
			c[k++]=s[i++];
		}
		while(j<=end)
		{
			c[k++]=s[j++];
		}
		for(i=start,k=0;i<=end;i++,k++) 
			s[i]=c[k];	
	}
	void print()
	{
		
		System.out.println("Number of time basic operation is executed:"+count);	
	}

}
class merge
{
	public static void main(String arg[])throws Exception
	{
		petti x=new petti();
		int s[]=new int[300];
		int i,start, mid,end;
		Scanner p=new Scanner(System.in);
		Random r=new Random();
		System.out.println("Enter the  number of values :");
		int n=p.nextInt();
		System.out.println("List of the inputs:");
		for( i=0;i<n;i++)
		{
			s[i]=r.nextInt(1000);
			System.out.println((i+1)+"...."+s[i]);
		}
		long l=System.nanoTime();
		x.divide(s,0,n-1);
		long l1=System.nanoTime();
		System.out.println("After sort:");
		for(i=0;i<n;i++)
		{
			System.out.println((i+1)+"...."+s[i]);
		}
		x.print();
		System.out.println("Time complexity:"+(l1-l));
	}
}