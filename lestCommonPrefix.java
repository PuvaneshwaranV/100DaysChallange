class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result="";int k=0,j=0;
        for(int i=0;i<strs[0].length();i++)
        {
            k=0;
            for(j=1;j<strs.length;j++)
            {
                if(i<strs[j].length()){
                if(strs[0].charAt(i)==strs[j].charAt(i))
                {
                    k++;
                }}
             }   
                if(k==(strs.length-1)){
                   
                    result=result+strs[0].charAt(i);
                    
                }
                else {
                    
                    return result;}
            
        }
        
        return result;
    }
}
public class commonPrefix
{
    public static void main(String[] args)
    {
        Solution s=new Solution();
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        String[] strs=new String[n];
        for(int i=0;i<n;i++)
        {
            strs[i]=s1.next();
        }
        String result=s.longestCommonPrefix(strs);
        System.out.println(result);
    }
}