public class arrayManipulation {

	static long arrayManipulation(int n, int[][] queries) {

		int[] arr = new int[n];

		for (int j = 0; j < queries.length; j++) {

			int a = queries[j][0];
			int b = queries[j][1];
			int k = queries[j][2];
			
			System.out.println(a+" "+b+" "+k);
			for (int i = a-1; i < b; i++) {
				arr[i] = arr[i] + k;
			}
		}
		
		int max = arr[0];
		for(int j=1 ;j<arr.length;j++) {
			if(max<arr[j]) {
				max = arr[j];
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int n = 5;
		int[][] arr = { { 1, 2, 100 }, { 2, 5, 100 }, { 3, 4, 100 } };
		 System.out.println(arrayManipulation(n, arr));
	}
}
