package applePractice;

import java.util.Arrays;

public class FirstMissingPositive {
    static void main() {
        int[] a = {1,2,0};
        int[] a1 = {3,4,-1,1};
        int[] a2 = {7,8,9,11,12};
        int[] a3 = {1,2,3,4,5,6,7,8,9,20};
        System.out.println(firstMissingPositive(a2));
    }

    public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n + 1];
        for (int num : nums) {
            if (num > 0 && num <= n) {
                seen[num] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!seen[i]) {
                return i;
            }
        }
        return n + 1;
    }}
