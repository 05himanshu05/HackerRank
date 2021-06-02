import java.util.Arrays;
import java.util.Iterator;

public class OLAGlassdoor {

	public static void main(String[] args) {

		// Characted count in a String - aabbbcccc should return a2b3c4

		// charcaterCounting("aabbbcccc");
		// printFibSeriesWiOutArray();
		/*
		 * String s1 = "test"; String s2 = "estt"; boolean ans =
		 * anagramCheck(s1.toCharArray(), s2.toCharArray()); if(ans) {
		 * System.out.println("Anagrams"); }
		 * 
		 * else { System.out.println("Not Anagrams"); }
		 */

		wordCounting();
	}

	static void charcaterCounting(String s) {

		int[] freq = new int[128];

		char[] chars = s.toCharArray();

		for (char c : chars) {

			freq[c]++;
		}

		for (int i = 0; i < freq.length; i++) {

			if (freq[i] != 0) {
				System.out.println("char = " + (char) i + " " + freq[i]);
			}
		}
	}

	static int fibSeries(int n) {

		if (n <= 1)
			return n;
		return fibSeries(n - 1) + fibSeries(n - 2);
	}

	static void printFibSeriesWiOutArray() {

		int N = 9;
		for (int i = N; i > 1; i--) {

			System.out.println(fibSeries(i) + " ");
		}
	}

	static boolean anagramCheck(char[] s1, char[] s2) {

		Arrays.sort(s1);
		Arrays.sort(s2);

		boolean flag = true;
		if (s1.length != s2.length) {
			System.out.println("Strings are not equal cant be anagrams of each other");
			flag = false;
		} else {

			for (int i = 0; i < s1.length; i++) {

				if (s1[i] != s2[i]) {

					flag = false;
				}
			}
		}
		return flag;
	}

	static void wordCounting() {
		String s1 = "I love my country india. India is very beautifull";
		
		String s = "car car car war war";

		String[] words = s.split(" ");

		String[] unique = new String[words.length];

		int[] count = new int[unique.length];
		
		int m=0;

		for (int i = 0; i < words.length; i++) {
			boolean b=false;
			for (int j = 0; j < words.length; j++) {

				if (words[i].equalsIgnoreCase(unique[j])) {

					count[j]++;
					b=true;
					break;
				}
			}
			
			if(!b){
				count[m]++;
				unique[m]=words[i];
				m++;
			}
		}

		for (int i = 0; i < unique.length - 1; i++) {
			if (unique[i] != null)
				System.out.println(unique[i] + "\t" + count[i]);
		}
	}
}
