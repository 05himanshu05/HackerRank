
public class Sorting {
	
	static void quickSort(int a) {
		
	}
	static void bubbleSort(int[] a) {
		// Complexity of Bubble sort is O(n*n)
		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length; j++) {

				if (a[j - 1] > a[j]) {

					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;

				}
			}
		}

	}

	public static void main(String[] args) {

		int[] a = { 5, 4, 2, 1, 3 };

		System.out.println("---------------------After Sorting----------------------");
		bubbleSort(a);
		
		for (int i=0 ; i<a.length;i++) {

			System.out.println(a[i]);
			System.out.println();
		}

	}
}
