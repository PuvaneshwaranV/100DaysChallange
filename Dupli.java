class puvi
{
	public static void main(String arg[])throws Exception
	{
		int c=0,j;
		int a[]={1,32,35,5,2,3,4,23};
		for(int i=0;i<a.length;i++)
		{
			for(j=0;j<a.length ;j++)
			{
				if(i!=j && a[i]==a[j])
				{
					c++;
					break;
				}
			}
		}
		if(c!=0)
			System.out.println("True");
		else
			System.out.println("False");	
	}
}