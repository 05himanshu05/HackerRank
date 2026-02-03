package applePractice;

import java.util.Arrays;

public class LongestCommonSubSequence {

    static void main() {

        System.out.println(lcs("abc","cde"));
    }

    public static int lcs(String s1 , String s2) {

        int n = s1.length();
        int m = s2.length();

        int[][] dp = new int[n][m];
        for(int[] row:dp) Arrays.fill(row,-1);

        return f(n-1,m-1,s1,s2,dp);

    }

    public static int f(int n, int m, String s1, String s2, int[][] dp){

        if (n<0 || m < 0) return  0;

        if (dp[n][m]!=-1) return dp[n][m];

        if (s1.charAt(n) == s2.charAt(m)) return 1+ f(n-1,m-1,s1,s2,dp);

        return  dp[n][m] = Math.max(f(n-1,m,s1,s2,dp),f(n,m-1,s1,s2,dp));
    }
}
