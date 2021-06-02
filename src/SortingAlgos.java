import java.util.Arrays;

public class SortingAlgos {

	public static void main(String[] args) {

		int arr[] = { 6, 5, 8, 9, 3, 10, 15, 12, 16 };

		// quickSort(arr, 0, arr.length - 1);

		// sort(arr, 0, arr.length-1);

		// insertionSort(arr);

		selectionSort(arr);

		// display(arr);
	}

	static void display(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {

			System.out.println(arr[i]);

			// System.out.println();
		}
	}

	static void insertionSort(int[] a) {

		for (int i = 1; i < a.length; i++) {

			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {

				a[j + 1] = a[j];

				j = j - 1;
			}

			a[j + 1] = key;
		}
	}

	static void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		System.out.println("N1 =" + n1 + " " + "N2 = " + n2);
		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarry array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	static void mergeSort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;

			System.out.println("mid = " + m);
			// Sort first and second halves
			mergeSort(arr, l, m);
			mergeSort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	static int partition1(int array[], int low, int high) {

		int pivot = array[high];

		int i = (low - 1);

		for (int j = low; j < high; j++) {

			if (array[j] <= pivot) {

				i++;
				System.out.println(i);
				System.out.println(j);
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}

		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return (i + 1);
	}

	static int partition(int array[], int low, int high) {

		int pivot = array[low];
		int i = low;
		int j = high;

		do {
			i++;
		} while (array[i] < pivot);

		do {
			j--;
		} while (array[j] > pivot);

		if (i < j) {

			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		int temp = array[low];

		array[low] = array[j];
		array[j] = temp;

		return j;

	}

	static void quickSort(int array[], int low, int high) {
		if (low < high) {

			int pi = partition1(array, low, high);

			quickSort(array, low, pi - 1);

			quickSort(array, pi + 1, high);
		}
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

	public static void selectionSort(int[] a) {

		int temp, min = 0;

		for (int i = 0; i < a.length; i++) {

			min = i;
			for (int j = i + 1; j < a.length; j++) {

				if (a[j] < a[min]) {

					min = j;
					System.out.println("min =" + min);
				}
			}

			temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}
		

		for (int k = 0; k < a.length; k++) { 
			 System.out.print(a[k]);
			 System.out.println(); 
			 }

	}
}
