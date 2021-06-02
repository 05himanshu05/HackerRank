import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class FindPairSum {

	public static void main(String[] args) {

		int[] A = { 8, 7, 2, 5, 3, 1 };
		int sum = 10;
		// findPair(A, sum);
		// finaPairUsingMap(A, sum);

		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5));

		int[] a = { 1, 10, 2, 2, 10, 3, 3, 3, 4, 5, 5 };

		int[] arr = removeDuplicateListWithoutCollection(a);

		for (int i : arr) {

			System.out.println(i);
		}
		
		String s = "05,23,10";
		
		System.out.println("Questio in Snider electric = " + s.split(",")[1]);
		
		int index = s.indexOf(",");
		
		int[] array = new int[3];
		 
		array[0] = index;
		int i = 1 ;
		
		while (index >= 0) {
			System.out.println(index);
		    index = s.indexOf(",", index + 1);
		    
		    array[i] = index;
		     i = i+1;
		    System.out.println("index again = " +index);
		}
		
		System.out.println(array[0] + "  " + array[1]);
		
		System.out.println(s.substring(array[0]+1,array[1]));
		
		
	}

	static void findPair(int[] a, int sum) {

		Arrays.sort(a);
		int low = 0;
		int high = a.length - 1;

		while (low < high) {

			if (a[low] + a[high] == sum) {

				System.out.println("Pair found (" + a[low] + ", " + a[high] + ")");
				// return;
			}

			if (a[low] + a[high] < sum) {
				low++;
			}

			else {
				high--;
			}
		}
	}

	static HashMap<Integer, Integer> finaPairUsingMap(int[] a, int sum) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < a.length; i++) {

			if (map.containsKey(sum - a[i])) {

				System.out.printf("Pair found (%d, %d)", a[map.get(sum - a[i])], a[i]);
			}

			map.put(a[i], i);
		}

		return map;
	}

	static List<Integer> removeDuplicateList(List<Integer> list) {

		List<Integer> newList = new ArrayList<>();

		for (Integer integer : list) {

			if (!newList.contains(integer)) {

				newList.add(integer);
			}
		}
		return newList;
	}

	static int[] removeDuplicateListWithoutCollection(int[] a) {

		Arrays.sort(a);

		int[] result = new int[a.length];

		int previous = a[0];

		result[0] = previous;

		for (int i = 1; i < a.length; i++) {

			int j = a[i];

			if (previous != j) {

				result[i] = j;
			}

			previous = j;
		}

		return result;

	}

	static void findPair1(int[] a, int sum) {

	}
}
