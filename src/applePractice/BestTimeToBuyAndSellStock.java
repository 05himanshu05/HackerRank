package applePractice;

public class BestTimeToBuyAndSellStock {
    static void main() {

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minimum = prices[0]; int profit = 0;
        int cost=0;
        for(int i=1; i<prices.length;i++) {
            cost = prices[i] - minimum;
            profit = Math.max(cost,profit);
            minimum = Math.min(minimum,prices[i]);
        }

        return profit;
    }
}
