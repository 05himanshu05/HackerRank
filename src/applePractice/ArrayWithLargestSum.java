package applePractice;

import java.util.Arrays;

public class ArrayWithLargestSum {

    // kadane's Algoritham
    static void main() {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<nums.length;i++) {

            if (sum==0) start = i;

            sum = sum + nums[i];

            if (sum>max) {
                max = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum<0) {
                sum = 0;
            }
        }
        int[] sub = Arrays.copyOfRange(nums, 2, 7);
        System.out.println(Arrays.toString(sub));
        return max;
    }
}
