import java.util.Scanner;
class Solution {
    public int romanToInt(String s) {
        int result=0,t=0;
        for(int i=0;i<s.length();i++)
        {
		t=0;
            if((i+1<s.length()) && (s.charAt(i)=='I' || s.charAt(i)=='X' || s.charAt(i)=='C'))
            {
                if(s.charAt(i)=='I')
                {
                    if(s.charAt(i+1)=='V')
                    {
                        result=result+4;
                        i++;
                        t=1;
                    }
                    else if(s.charAt(i+1)=='X')
                    {
                        result=result+9;
                        i++;
                        t=1;
                    }
                }
                else if(s.charAt(i)=='X')
                {
                    if(s.charAt(i+1)=='L')
                    {
                        result=result+40;
                        i++;
                        t=1;
                    }
                    else if(s.charAt(i+1)=='C')
                    {
                        result=result+90;
                        i++;
                        t=1;
                    }
                }
                 else if(s.charAt(i)=='C')
                {
                    if(s.charAt(i+1)=='D')
                    {
                        result=result+400;
                        i++;
                        t=1;
                    }
                    else if(s.charAt(i+1)=='M')
                    {
                        result=result+900;
                        i++;
                        t=1;
                    }
                }
            }
            if(t==0)
            {
                if(s.charAt(i)=='I')
                    result=result+1;
                else if(s.charAt(i)=='V')
                    result=result+5;
                else if(s.charAt(i)=='X')
                    result=result+10;
                else if(s.charAt(i)=='L')
                    result=result+50;
                else if(s.charAt(i)=='C')
                    result=result+100;
                else if(s.charAt(i)=='D')
                    result=result+500;
                else if(s.charAt(i)=='M')
                    result=result+1000;
            }
        }
        return result;
    }
}
public class romonToInt{
    public static void main(String[] args){
        Solution s=new Solution();
        Scanner s1=new Scanner(System.in);
        String r=s1.next();
        System.out.println(s.romanToInt(r));
    }
}