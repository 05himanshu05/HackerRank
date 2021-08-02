import java.util.ArrayList;

public class MaximizingTheProfit {
	
	static long maximumProfit(int[] p) {
        long maxProfit = Integer.MIN_VALUE;
        int sizeOfP = p.length;
        for (int i = 0; i < sizeOfP - 2; i++) {
            for (int j = i + 1; j < sizeOfP - 1; j++) {
                if (p[i] >= p[j]) continue;
                for (int k = j + 1; k < sizeOfP; k++) {
                    if (p[j] >= p[k]) continue;
                    
                    long totalProfit = p[i] * p[j] * p[k];
                    if (totalProfit > maxProfit) maxProfit = totalProfit;
                }
            }
        }
        return maxProfit;
    }
	
	public static void main(String[] args) {
		
		int[] p = {10, 2, -10, 6, 1, 0, 8};
		
		System.out.println(maximumProfit(p));
	}
}
