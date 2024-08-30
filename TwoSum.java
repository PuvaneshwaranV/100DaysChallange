import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0, j = 0, s = 0;
        for (i = 0, s = 0; i < nums.length - 1 && s == 0; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    s = 1;
                    break;
                }
            }
        }
        if (s == 1) {
            int[] result = new int[2];
            result[0] = i - 1;
            result[1] = j;
            return result;
        }
        return null;
    }
}

public class TwoSum {
    public static void main(String[] arg) {
        Solution s1 = new Solution();
        Scanner s = new Scanner(System.in);
        System.out.println("Lenth of the Array");
        int n = s.nextInt();
        System.out.println("Target:");
        int target = s.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = s.nextInt();
        }
        int[] result = s1.twoSum(ar, target);
        System.out.println(result[0] + " " + result[1]);
    }

}