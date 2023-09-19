import java.util.*;
class Main
{
    public static void main(String arg[])throws Exception
    {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int X=s.nextInt();       
        int p=1;
        if(N==1 && X==1 )
            System.out.print("1");
        else if(N>1 && X>1)
        {
            for(int i=0;i<N;i++)
            {
                p=p*X;
            }
            System.out.print(p);
        }
        else if(N<1 && X<1 )
            System.out.print("values not be in negative");
        else
            System.out.print("Not Applicable");
    }    
}
