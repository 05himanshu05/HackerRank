import java.util.ArrayList;
import java.util.List;

public class RSA {
	
	public static double invert(double num) {
		//102
		double invert = 0 ;
		
		while(num>0) {
			
			invert = invert*10 + num%10;
			num = num/10;
		}
		
		return invert;
		
	}
	
	public static void stockMaxProfit(List<Integer> list) {
		
		long profit = 0L;
		int maxSoFar = 0 ;
		
		// int[] a = {2,30,15,10, 8 , 25,80 }
		
		for(int i = list.size()-1 ; i>-1;i--) {
			
			if(list.get(i) > maxSoFar) {
				
				maxSoFar = list.get(i);
				System.out.println("maxSOfar " + maxSoFar);
			}
			
			profit += maxSoFar - list.get(i); 
			
			System.out.println(profit);
		}
		
		System.out.println(" Profit = " + profit);
	}
	
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int[] b = { 1, 2, 3, 4, 5, 6, 7, 8, 9, };

		int sumA = 0;
		int sumB = 0;

		for (int i = 0; i < a.length; i++) {

			sumA = sumA + a[i];

		}

		for (int j = 0; j < b.length; j++) {

			sumB = sumB + b[j];

		}
		
		//System.out.println("Missing Number =" + Math.abs(sumA-sumB));
		
		//System.out.println(invert(102354679158));
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(30);
		list.add(15);
		list.add(10);
		list.add(8);
		list.add(25);
		list.add(80);
		
		stockMaxProfit(list);
	}
}
