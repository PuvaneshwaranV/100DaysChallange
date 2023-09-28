import java.io.*;
import java.util.*;
class prims
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter total no of vertex:");
int n=s.nextInt();
int cost[][]=new int[20][20];
int i;
System.out.println(" Here Infinity is : -1");
for( i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(i!=j)
		{
			System.out.print("Enter path cost from vertex "+ i+" to "+j+"   :");
			cost[i][j]=s.nextInt();
		}
		else
			cost[i][j]=0;
	}
}
int p[][]=new int[20][20];
int v[]=new int[20];
int q[]=new int[20];
int c=0,l=-1, y;
int rear=0;
int front=0;
System.out.println("enter starting vertex");
int st=s.nextInt();
//	INITIALIZATION
System.out.println("path steps");
for( i=0;i<n;i++)
{
	v[i]=0;
	for(int j=0;j<n;j++)
	{
		p[i][j]=-1;
		if(j==0)
			p[i][0]=st;
	}
}
v[st]=1;
q[rear++]=st;
for(int u=0;u<n;u++)
{
	int min=9999;
	int k=-1;
	i=front;
	for(;i<rear;i++)
	{
		if(v[q[i]]==1)
		{
			for(int j=0;j<n;j++)
			{
				if(v[j]==0&&cost[q[i]][j]!=-1)
				{
					if(min>cost[q[i]][j])
					{
						min=cost[q[i]][j];
						 l=q[i];
						 k=j;
					}
				}
			}
		}
	}
	if(k!=-1&&min!=9999&&rear<n)
	{
		v[k]=1;
		System.out.print(l+"-"+k+"   :   ");
		System.out.println(cost[l][k]);
		c=c+cost[l][k];
		for(y=0;y<n;y++)
			p[k][y]=p[l][y];
		for(y=1;y<n&&p[k][y]!=-1;y++);
			p[k][y]=k;
		q[rear++]=k;
		min=9999;
		k=-1;
		i=front;
	}
}
System.out.println("path matrix");
for( i=0;i<n;i++)
{
	for(int j=0;j<n;j++)
	{
		if(p[i][j]!=-1)
			System.out.print(p[i][j]+"    ");
	}
	System.out.println();
}
System.out.println("cost="+c);
}
}
