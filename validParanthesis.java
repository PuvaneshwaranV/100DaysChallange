import java.util.Scanner;
class Solution {
     public boolean isValid(String s) {
        String s1="";int m=0;
        for(int i=0;i<s.length();i++)
        {
            if((s.charAt(i)=='(') || (s.charAt(i)=='{')  || (s.charAt(i)=='[') )
            {
                s1=s1+s.charAt(i);
            }
            else if((s1.length()-1>=0) && ( (s.charAt(i)==')' && s1.charAt(s1.length()-1)=='(') || (s.charAt(i)=='}' && s1.charAt(s1.length()-1)=='{') || (s.charAt(i)==']' && s1.charAt(s1.length()-1)=='[')))
            {
                s1=s1.substring(0,s1.length()-1);
            }
            else {
                    m=1;
                    break;
            }
        }
        if(m==0 && s1.length()==0)
            return true;
        else
            return false;
    }
}
public class commonPrefix
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        Scanner s1=new Scanner(System.in);
        String n=s1.next();
        boolean result=s.isValid(n);
        System.out.println(result);
    }
}