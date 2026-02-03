package applePractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    static void main() {
        int[] nums = {3,2,4};

        System.out.println(twoSum(nums,6));



    }

    public static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums);
        int i = 0; int j = nums.length-1;
        int[] arr = new int[2];
        while ( i< j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                System.out.println(i + "  " + j);
                arr[0]=i;
                arr[1] = j;
                i++;
                j--;
            }
            else if(sum < target) i++;
            else if(sum > target) j--;

        }
        return arr;
    }
}
