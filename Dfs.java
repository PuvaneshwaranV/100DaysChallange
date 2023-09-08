import java.io.*;

class dfs
{
public static void main(String args[])throws Exception
{
DataInputStream d=new DataInputStream(System.in);
int i,j;
System.out.println("enter no.of vertex:");
//int n=7;
int n=Integer.parseInt(d.readLine());
int a[][]=new int[20][20];
//int a[][]={{0,0,1,1,0,1,0},{0,0,1,1,0,0,1},{1,1,0,0,1,1,0},{1,1,0,0,0,0,0},{0,0,1,0,0,1,1},
//{1,0,1,0,1,0,0},{0,1,0,0,1,0,0}};
int fp[]=new int[10];
int bp[]=new int[10];
int vis[]=new int[10];
int st[]=new int[10],t=0;
for(i=0;i<n;i++)
{
	vis[i]=0;
	for( j=0;j<n;j++)
	{
		System.out.print("enter value"+(i+1)+" "+(j+1)+":");
		a[i][j]=Integer.parseInt(d.readLine());
	}
}
System.out.println("enter starting vertix:");
int se=Integer.parseInt(d.readLine());
int r=0,q=0,c=0;
st[t]=se;
fp[r++]=se;
vis[se]=1;

long l=System.nanoTime();
for(i=t;i>=0&&t<n;)
{
	for(j=0;j<n;j++)
	{
		if(++c>0&&a[st[i]][j]==1&&vis[j]!=1)
		{
			st[++t]=j;
			fp[r++]=j;
			vis[j]=1;
			i=t;
			break;
		}
	}
	if(t>=0&&++c>0&&j==n)
	{
		bp[q++]=st[t--];
		i=t;
	}
}
long l1=System.nanoTime();
System.out.println("forward path");
for(i=0;i<r;i++)
	System.out.println(fp[i]);
System.out.println("backward path");
for(i=0;i<q;i++)
	System.out.println(bp[i]);
System.out.println("Time complexity is:"+(l1-l));
System.out.println("Basic operation:"+c);
}
}