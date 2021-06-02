import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 10, 40 };
		int high = arr.length;
		//System.out.println(binarySearch(arr, high, 4));
		//System.out.println(binarySearchRecursive(arr, 1, high, 10));
		
		
	}

	public static int binarySearch(int arr[], int n, int key) {

		int low = 1;
		int high = n;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			if (arr[mid] < key)
				low = mid + 1;
			else
				high = mid - 1;
		}
		return 0;
	}

	public static int binarySearchRecursive(int arr[], int low, int high, int key) {

		if (low == high) {
			if (arr[low] == key)
				return low;
			else
				return 0;

		} else {

			int mid = (low + high) / 2;
			if (arr[mid] == key)
				return mid;
			if (key < arr[mid])
				return binarySearchRecursive(arr, low, mid - 1, key);
			return binarySearchRecursive(arr, mid + 1, high, key);
		}
	}
}
