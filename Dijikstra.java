import java.util.Scanner;
class dij
{
	int a[][]=new int[20][20];
	int v[]=new int[20];
	int d[]=new int[20];
	int s,n;
	void input()
	{
		int i,j;
		Scanner d=new Scanner(System.in);
		System.out.println("enter the Total number of vertex");
		n=d.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(i!=j)
				{
					System.out.print("path cost from vertex "+i+" to vertex "+j+" :");
					a[i][j]=d.nextInt();
				}
				else
					a[i][j]=0;
			}
		}	
		System.out.println("the  adj matrix");
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
				System.out.print(a[i][j]+"     ");
		System.out.println();
		}
		System.out.println("enter source");
		s=d.nextInt();
	}
	void logic()
	{
		int path[][]=new int[10][10];
		int i,j,m,min,cu;
		for(i=1;i<=n;i++)
		{
			if(i==s)
				d[i]=0;
			else
				d[i]=9999;

			v[i]=0;
			path[i][1]=s;
			for(j=2;j<=n;j++)
				path[i][j]=-1;
		}
		cu=s;	
		v[s]=1;
		for(i=1;i<n;)
		{
			for(j=1;j<=n;j++)
			{
				if(v[j]==0)
				{
					if(a[cu][j]!=9999)
					{
						m=d[cu]+a[cu][j];
						if(d[j]==9999||d[j]>m)
						{
							d[j]=m;										int k;
							for(k=1;k<=n;k++)
								path[j][k]=path[cu][k];
							for(k=2;k<=n && path[j][k]!=-1;k++);
								path[j][k]=j;
						}
						/*else if(d[j]>m)
						{
							d[j]=m;
							int k;
							for(k=1;k<=n;k++)
								path[j][k]=path[cu][k];
							for(k=2;k<=n&&path[j][k]!=-1;k++);
								path[j][k]=j;							}*/
					}
				}
			}
			min=9999;
			m=cu;
			for(j=1;j<=n;j++)
			{
				if(v[j]==0)
				{
					if(min==9999||min>d[j])
					{
						min=d[j];
						m=j;
					}
					/*if(min>d[j])
					{
						min=d[j];
						m=j;
					}*/
				}
			}
			if(min==9999)
			{
				cu=m;
				v[m]=1;
				i++;
			}
			else
				break;
		}
		System.out.println("Distance :");
		for(i=1;i<=n;i++)
			System.out.println("Vertex ="+i+" "+d[i]);
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n && path[i][j]!=-1;j++ )
				System.out.print(path[i][j]);
			System.out.println();
		}
	}
}
class manga
{
	public  static void main(String arg[])throws  Exception
	{
		dij l=new dij();
		l.input();
		l.logic();
	}			
		
}