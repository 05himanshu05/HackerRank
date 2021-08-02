import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Cloudera {

	public static void main(String[] args) {
		// System.out.println(calculateScore("engine", "reven", "ginkgo"));

		// getFinalPosition("URUL");
		int[] a = { 8, 5, 10, 7, 9, 4 };
		int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
		// MaximumOfAllSubarraysOfSizeK();
		// MaximumOfAllSubarraysOfSizeKOptmimize();
		// firstNegNumOfSizeK();
		 slidingWindoMaximumMaximumofallsubarraysofsizek();
		// printKMax(a, a.length, 3);
		//anagramsCheck();
	}

	public static void anagramsCheck() {
		String s = "aabaabaa";
		String pattern = "aaba";
		int totalNoOfAnagrams = 0;
		int count = 0;
		int k = 4;
		HashMap<Character, Integer> map = new HashMap<>();
		map.put('a', 3);
		map.put('b', 1);
		count = map.size();
		int i = 0;
		int j = 0;

		while (j < s.length()) {
			System.out.println("j = " + j + " i = " + i + " " + " length = " + s.length());

			if (map.containsKey(s.charAt(j))) {

				//System.out.println(s.charAt(j) + " " + map.get(s.charAt(j)));
				map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
				System.out.println("current char = "+ s.charAt(j)+" "+"current value = " + map.get(s.charAt(j)));
				if (map.get(s.charAt(j)) == 0) {
					count--;
					System.out.println("count = " + count);
				}
			}
			//System.out.println(j - i + 1);
			if (j - i + 1 < k) {
				j++;
				continue;
			}
			if (j - i + 1 == k) {
				if (count == 0) {
					totalNoOfAnagrams++;
					System.out.println("total = " + totalNoOfAnagrams);
				}
				if (map.containsKey(s.charAt(i))) {
					System.out.println(map.containsKey(s.charAt(i)));
					System.out.println(s.charAt(i));
					map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
					if (map.get(s.charAt(i)) >= 1) {
						count++;
					}
				}
				i++;
				j++;
			}
		}
		System.out.println("Total No Of Anagrams = " + totalNoOfAnagrams);
	}

	public static void slidingWindoMaximumMaximumofallsubarraysofsizek() {

		int i = 0;
		int j = 0;
		int max = 0;
		int k = 3;
		int[] a = { 1, 3, -1, -3, 5, 3, 6, 7 };

		Deque<Integer> queue = new LinkedList<Integer>();
		
		queue.add(1);
		queue.add(3);
		queue.add(-1);
		System.out.println(queue);
		
		while (j < a.length) {

			// calculations
			//System.out.println(queue.peekLast());
			//System.out.println(a[j]);
			while (a.length > 0 && queue.peekLast() < a[j])
				queue.removeLast();
			
			//System.out.println(a[j]);
			queue.addLast(a[j]);

			if (j - i + 1 < k) {
				j++;
			}

			if (j - i + 1 == k) {

				System.out.println(a[queue.peekLast()]);

				if (a[i] == queue.peekLast()) {

					queue.removeLast();
				}

				i++;
				j++;
			}
		}
	}

	public static void firstNegNumOfSizeK() {

		int start = 0;
		int end = 0;
		int[] a = { 12, -1, -7, 8, -15, 30, 16, 28, -21 };
		int k = 3;
		ArrayList<Integer> list = new ArrayList<>();
		while (start < a.length - 2) {
			// System.out.println("start " + start);
			if (a[end] < 0) {

				list.add(a[end]);
			}

			// System.out.println(list);

			if (end - start + 1 < k) {
				end++;
			}

			else if (end - start + 1 == k) {

				if (list.size() > 0) {

					System.out.print(list.get(0) + " ");
					list.remove(0);
					// System.out.println(list);
					start++;
					end++;

				} else if (list.size() == 0) {
					System.out.print(0 + " ");
					start++;
					end++;
				}
			}
		}
	}

	public static void MaximumOfAllSubarraysOfSizeKOptmimize() {

		int start = 0;
		int end = 0;
		int[] a = { 8, 5, 10, 7, 9, 4 };
		int k = 2;
		int sum = 0;
		int maxSum = 0;
		while (start < a.length - 1) {

			sum = sum + a[end];
			if (end - start + 1 < k) {
				end++;
			} else if (end - start + 1 == k) {

				maxSum = Math.max(sum, maxSum);
				sum = sum - a[start];
				start++;
				end++;
			}
		}

		System.out.println("Max = " + maxSum);
	}

	static void printKMax(int arr[], int n, int k) {
		int j, max;

		for (int i = 0; i <= n - k; i++) {

			max = arr[i];

			for (j = 1; j < k; j++) {
				if (arr[i + j] > max)
					max = arr[i + j];
			}
			System.out.print(max + " ");
		}
	}

	public static void MaximumOfAllSubarraysOfSizeK() {

		int[] a = { 8, 5, 10, 7, 9, 4 };
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		int k = 3;
		int max = 0;
		while (i <= a.length - k) {

			int min = a[i];
			for (int j = 1; j < k; j++) {

				if (a[i + j] < min) {
					min = a[i + j];
				}
			}
			System.out.print(min + " ");
			if (max < min) {
				max = min;
			}
			i++;
		}

		System.out.println("Max = " + max);
	}

	public static String calculateScore(String text, String prefixString, String suffixString) {
		// Write your code here
		String output = "";
		int max_prefix_count = 0, prefix_count = 0, max_suffix_count = 0, suffix_count = 0, sstr_start = 0,
				sstr_end = 0, i = 0, j = 0;

		while (i < text.length()) {
			int k = i, start = -1, end = -1;
			j = 0;
			prefix_count = 0;

			while ((k < text.length() && j < prefixString.length()) && (text.charAt(k) != prefixString.charAt(j)))
				j++;

			while ((k < text.length() && j < prefixString.length()) && (text.charAt(k) == prefixString.charAt(j))) {
				if (start == -1)
					start = k;

				prefix_count++;
				k++;
				j++;
			}

			// update prefix index as we get the new string.
			if (prefix_count > max_prefix_count) {
				max_prefix_count = prefix_count;
				sstr_start = start;
			}

			k = i;
			j = 0;
			suffix_count = 0;

			while ((k < text.length() && j < suffixString.length()) && (text.charAt(k) != suffixString.charAt(j)))
				j++;

			while ((k < text.length() && j < suffixString.length()) && (text.charAt(k) == suffixString.charAt(j))) {
				suffix_count++;
				k++;
				j++;
			}

			end = k;

			// update prefix index as we get the new string.
			if (suffix_count > max_suffix_count) {
				max_suffix_count = suffix_count;
				sstr_end = end;
			}
			i++;
		}
		if (sstr_end > sstr_start)
			return text.substring(sstr_start, sstr_end);
		else
			return text.substring(sstr_start, sstr_end);
	}

	public static void getFinalPosition(String s) {

		int upCount = 0;
		int downCount = 0;

		int rightCount = 0;
		int leftCount = 0;

		String finalPosition;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'U') {

				upCount++;
			}
			if (s.charAt(i) == 'D') {
				downCount++;
			}

			if (s.charAt(i) == 'L') {
				leftCount++;
			}

			if (s.charAt(i) == 'R') {
				rightCount++;
			}
		}

		finalPosition = (rightCount - leftCount) + "," + (upCount - downCount);

		System.out.println(finalPosition);
		if (s.length() == (Math.abs(rightCount - leftCount) + Math.abs(upCount - downCount))) {
			System.out.println("Number of Char to delete = " + 0);
		} else {
			int charToDelete = s.length() - (Math.abs(rightCount - leftCount) + Math.abs(upCount - downCount));

			System.out.println("Number of Char to delete = " + charToDelete);
		}
	}
}
