package applePractice;

import java.util.Arrays;
import java.util.Map;

public class HouseRobber {
    static void main() {
        int[] a = {2,7,9,3,1};
        int rob = rob(a);
        System.out.println(rob);

    }

    public static int rob(int[] nums) {
        int sum = 0;
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp, -1);

        for (int i=0;i<nums.length;i++) {
            sum = f(i, nums,dp);
        }
        return sum;
    }

    public static int f(int index, int[] nums,int[] dp) {
        if (index==0) return nums[index];
        if (index<0) return 0;
        if (dp[index]!=-1) return dp[index];
        int pick = nums[index] + f(index-2,nums,dp);
        int notPick = f(index - 1, nums,dp);
        return dp[index] = Math.max(pick,notPick);
    }
}
