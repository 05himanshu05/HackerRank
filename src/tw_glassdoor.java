public class tw_glassdoor {

	public static void main(String[] args) {
		
		removeDuplicateEntry();
	}
	
	
	public static void removeDuplicateEntry() {
		int[] data = { 1,2,6,3,8,3,5,9,3,6,5 };
				
		
	}
	public static void checkNumber(int num) {

		int n = 142857;

		int m = n * 2;

		int[] a;

		int sum = 0;

		int sumM = 0;

		while (n > 0) {

			a = new int[10];

			int t = n % 10;

			a[t - 0]--;

			n /= 10;

			sum = sum + a[t - 0];
		}

		while (m > 0) {
			a = new int[10];

			int t = m % 10;

			a[t - 0]--;

			m /= 10;

			sumM = sumM + a[t - 0];
		}

		System.out.println(sumM + " " + sum);
		if (sum == sumM) {
			System.out.println("Equal");
		}
	}
}
