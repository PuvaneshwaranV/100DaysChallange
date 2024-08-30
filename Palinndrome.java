import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int t=0,s=0,k=x;
        while(x>0){
            t=x%10;
            x=x/10;
            s=s*10+t;
        }
        if(s==k)
            return true;
        else
            return false;
    }
}
public class Palindrome{
    public static void main(String[] arg){
        Solution s1=new Solution();
        Scanner s =new Scanner(System.in);
        int x=s.nextInt();
        boolean f=s1.isPalindrome(x);
        System.out.println(f);
    }
}