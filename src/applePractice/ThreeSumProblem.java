package applePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {

    static void main() {

        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums,2));

    }

    public static List<List<Integer>> threeSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i=0;i<nums.length;i++) {

            if (i>0 && nums[i] == nums[i-1]) continue;

            int j = i+1; int k = nums.length-1;

            while (j<k){
                int sum = nums[i] + nums [j] + nums[k];

                if (sum==target) {
                    list.add(Arrays.asList(i,j,k));
                    j++;
                    k--;
                }
                else if (sum  > target) k--;
                else if (sum < target ) j++ ;
            }

            while (j< k && nums[j] == nums[j-1]) j++;
            while (j< k && nums[k] == nums[k+1]) k--;
        }
        return list;
    }
}
