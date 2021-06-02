import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SdetFrequentlyAsked {

	static Set<String> removeDuplicateFromArrayList(List<String> list) {

		Set<String> set = new HashSet<String>();
		set.addAll(list);
		return set;
	}

	static List<String> sortArrayList(List<String> list) {
		Collections.sort(list);
		return list;
	}

	static List<String> sortArrayList(List<String> list, Comparator<Object> comparator) {
		Collections.sort(list, Collections.reverseOrder());
		return list;
	}

	static long doInvert(long number) {

		long invert = 0;
		while (number != 0) {
			invert = (invert * 10) + (number % 10);
			number = number / 10;
		}
		return invert;
	}

	static void findFirstTwoMax(int[] arr) {

		int firstMax = 0;
		int secondMax = 0;

		for (int j = 1; j < arr.length; j++) {

			if (arr[j] > arr[j - 1]) {

				firstMax = arr[j];
				secondMax = arr[j - 1];
			}
		}

		System.out.println("FirstMax = " + firstMax + "  " + "Second Max =" + secondMax);
	}
	
	static String removeWhiteSpaces(String s) {
		String trimedValue = s.trim().replaceAll("\\s{2,}", " ");
		String trimedValue1 = s.trim().replaceAll("\\s+", " ");
		return trimedValue1;
	}
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Test");
		list.add("Test");
		list.add("Humaira");
		list.add("Himanshu");
		list.add("Samra");
		int[] arr = { 15, 24, 48, 21, 43, 11, 79, 93 };
		long num = 401;
		// System.out.println(removeDuplicateFromArrayList(list));
		// System.out.println(sortArrayList(list,Collections.reverseOrder()));
		// System.out.println(doInvert(num));
		//findFirstTwoMax(arr);
		//System.out.println(removeWhiteSpaces("  hello      there"));
		duplicateCharInString();
	}
	
	static void duplicateCharInString() {
		
		String s = "himanshu";
		
		//char[] chars = s.toCharArray();
		
		int[] freq = new int[256];
		
		//System.out.println(freq);
		
		for (char ch : s.toCharArray()) {
			
			freq[ch]++;
		}
		
		for(int i=0 ; i<freq.length;i++) {
			
			if(freq[i]>0) {
				System.out.println("char = " + (char)i + " "+ "freq = " + freq[i] );
			}
		}
	}
}
