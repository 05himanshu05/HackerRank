package applePractice;

import java.util.Arrays;
import java.util.HashMap;

public class FrogJump {
    static void main() {

        int[] stones = {0,1,3,5,6,8,12,17};
        boolean b = canCross(stones);
        System.out.println(b);
    }

    public static boolean canCross(int[] stones) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int position = 0;
        if (stones[1]!=1) return false;
        int n = stones.length;
        int[][] dp = new int[8][8];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -1);
        }
        for (int i=0; i<stones.length;i++) {
            map.put(stones[i],i);
        }

        return solve(0,0,stones,map,dp);

    }

    public static boolean solve(int currentStoneIndex, int previousJump,
                                int[] stones, HashMap<Integer, Integer> map, int[][] dp) {
        if (currentStoneIndex == stones.length - 1) return true;
        if (dp[currentStoneIndex][previousJump] != -1) {
            return dp[currentStoneIndex][previousJump] == 1;
        }
        int currentPos = stones[currentStoneIndex];
        for (int nextJump = previousJump - 1; nextJump <= previousJump + 1; nextJump++) {
            if (nextJump > 0) {
                int nextPos = currentPos + nextJump;
                if (map.containsKey(nextPos)) {
                    int nextIndex = map.get(nextPos);
                    if (solve(nextIndex, nextJump, stones, map, dp)) {
                        dp[currentStoneIndex][previousJump] = 1;
                        return true;
                    }
                }
            }
        }
        dp[currentStoneIndex][previousJump] = 0;
        return false;
    }

}
