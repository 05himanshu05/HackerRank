import java.util.*;

public class GE {

    static void main() {

        int[] a1 = {0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 0};
        int[] a = {0, 1, 0, 1, 1,0};
        int[] a3 = {1, 1, 0, 0, 1, 0, 1};
        countAllGroups(a);
        maxConsecutiveOnes(a);
        maxConsecutiveZeros(a);
        countASubArrayWithOnes(a);
        longestSubArrayWithAlternateZeroAndOne(a3);
        longestOnesAfterDeletingOne(a1);
        longestSubarrayWithAtMostKZeros(a1,2);

    }

    public static void maxConsecutiveOnes(int[] arr) {
        int count = 0;
        int maxLen = 0;
        for(int i=0 ; i< arr.length;i++) {

           if (arr[i] == 1) {
               count ++;
               maxLen = Math.max(maxLen,count);
           }
           else  {
               count = 0;
           }
        }
        System.out.println("total number of consecutive ones = " + maxLen);
    }

    public static void maxConsecutiveZeros(int[] arr) {
        int count = 0;
        int maxLen = 0;
        for(int i=0 ; i< arr.length;i++) {

            if (arr[i] == 0) {
                count ++;
                maxLen = Math.max(maxLen,count);
            }
            else  {
                count = 0;
            }
        }
        System.out.println("total number of consecutive Zeros = " + maxLen);
    }

    public static void countAllGroups(int[] arr) {
        List<Integer> runs = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                runs.add(count);
                count = 1;
            }
        }
        runs.add(count);
        System.out.println(runs);
    }

    public static void countASubArrayWithOnes(int[] arr) {

        int count = 0;
        int ones = 0;

        for (int num : arr) {
            if (num == 1) {
                ones++;
            } else {
                count += ones * (ones + 1) / 2;
                ones = 0;
            }
        }

        // Add last block if array ends with 1s
        count += ones * (ones + 1) / 2;

        System.out.println(count);
    }

    // Count Transitions will also get solved with below logic
    public static  void longestSubArrayWithAlternateZeroAndOne(int[] arr) {

        if (arr.length == 0);

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] + arr[i - 1]==1) {
                currLen++;
            } else {
                currLen = 1;
            }
            maxLen = Math.max(maxLen, currLen);
        }

        System.out.println("longest sub array with consecutive one and zero = " +maxLen);
    }

    public static int longestOnesAfterDeletingOne(int[] nums) {
        int left = 0, zeroCount = 0, maxLen = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }

            // Shrink window if more than one zero
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }

            // right - left is length after deleting one element
            maxLen = Math.max(maxLen, right - left);
        }
        System.out.println(" length of longest Ones After deleting One Zero = " + maxLen);
        return maxLen;
    }

    public static void longestSubarrayWithAtMostKZeros(int[] a , int k){
        int left = 0 ; int maxLen = 0; int zeroCount = 0 ;
        for(int right = 0 ; right<a.length ; right++){

            if (a[right] == 0) {
                zeroCount ++;
            }

            while (zeroCount>2) {
                if (a[right] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        System.out.println("longest Sub Array With At-Most K Zeros = " + maxLen);
    }
}
