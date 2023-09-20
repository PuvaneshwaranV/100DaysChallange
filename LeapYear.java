import java.util.*;
class Main
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int i,j=1,m=0;
        int l[]=new int[100];
        int n=s.nextInt();
        for(i=0;i<n;i++)
            l[i]=s.nextInt();
        for(i=0;i<n;i++)
        {
            if(l[i]<=0)
            {
                m++;
                j=0;
                System.out.print("Not Applicable"); 
                break;
            }
        }
        for(i=0;i<n && m==0 ;i++)
        {
            
            if(l[i]%100==0 )
            {
                if(l[i]%400==0)
                {
                    j=0;
                    System.out.println(l[i]);
                   
                }
            }
            else if(l[i]%4==0)
            {
                j=0;
                System.out.println(l[i]);
             
            }
        }
        if(j!=0 )
            System.out.print("NIL");
        
    }
}
