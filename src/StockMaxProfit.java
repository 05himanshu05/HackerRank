import java.util.ArrayList;
import java.util.List;

public class StockMaxProfit {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(4);
		
		System.out.println(stockmax(list));
	}

	public static long stockmax(List<Integer> prices) {

		long profit = 0L;
		int maxsofar = 0;

		for (int i=prices.size()-1;i>-1;i--) {
			
			
			if (prices.get(i) > maxsofar) {
				
				maxsofar = prices.get(i);
				//System.out.println("max value = "+maxsofar);
			}

			profit += maxsofar - prices.get(i);
			
			//System.out.println("profit = " + profit);
		}
		return profit;
	}

}
