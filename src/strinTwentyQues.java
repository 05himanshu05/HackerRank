import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;
import java.util.TreeSet;

import com.sun.net.httpserver.Authenticator.Result;

public class strinTwentyQues {
	static ArrayList<String> list = new ArrayList<String>();
	
	static int resultLength;
	static int resultStart;
	
	public static void main(String[] args) {

		int number = 123;
		// maxProfit();
		// reverseString();
		// getUniqueCharacterSubstring("GEEKSFORGEEKS");
		//System.out.println(longestPalindrome("babad"));
		// duplicateCharInString("Himanshu");
		// System.out.println(reverseStringWithoutReverse("amas"));
		// System.out.println(permutation("", ""+number,list));
		// System.out.println(divisbleByNumber(124, 2, list));
		// System.out.println(paladromePermutation("aabbcadad", list));

		// System.out.println(allPermutationInSorted("ABC", list));

		// System.out.println(stringContainAnotherString("hereiamstackerrank"));

		// stringrefcheck();
	}

	public static String longestPalindrome(String s) {
		if (s.length() < 2) {

			return s;
		}

		for (int start = 0; start < s.length()-1; start++) {

			expandRange(s, start, start);
			expandRange(s, start, start + 1);
		}
		
		return s.substring(resultStart,resultStart+resultLength);
	}

	public static void expandRange(String s, int begin, int end) {
		while(begin>=0 && end<s.length() && s.charAt(begin)==s.charAt(end)) {
			
			begin--;
			end++;
		}
		
		if(resultLength < end-begin+1) {
			
			resultLength = end-begin-1;
			resultStart = begin+1;
		}
		
	}

	public static String getUniqueCharacterSubstring(String input) {
		Map<Character, Integer> visited = new HashMap<>();
		String output = "";
		for (int start = 0, end = 0; end < input.length(); end++) {
			char currChar = input.charAt(end);
			if (visited.containsKey(currChar)) {
				start = Math.max(visited.get(currChar) + 1, start);
			}
			if (output.length() < end - start + 1) {
				output = input.substring(start, end + 1);
				System.out.println("output = " + output);
			}
			System.out.println(currChar + " " + end);
			visited.put(currChar, end);
		}
		return output;
	}

	public static void reverseString() {

		String s = "Hello, I am himanshu";

		String newString = "";

		String[] words = s.split(" ");

		for (String word : words) {

			newString = newString + reverseStringWithoutReverse(word) + " ";
		}

		System.out.println(newString);
	}

	public static void maxProfit() {

		int[] a = { 100, 180, 260, 310, 40, 535, 695 };

		long profit = 0;
		int maxsofar = 0;
		for (int i = a.length - 1; i > -1; i--) {

			if (a[i] > maxsofar) {

				maxsofar = a[i];
				// System.out.println(maxsofar);
			}
			profit += maxsofar - a[i];
		}

		System.out.println("Profit = " + profit);
	}

	public static void rvrsWtoutAfctngSpclChrs() {
		String str = "a!!!b.c.d,e'f,ghi";
		char[] chars = str.toCharArray();
		int l = 0;
		int r = chars.length - 1;

		while (l < r) {

			if (!Character.isAlphabetic(chars[l])) {

				l++;
			}

			else if (!Character.isAlphabetic(chars[r])) {

				r--;
			}

			else {

				char temp = chars[r];
				chars[r] = chars[l];
				chars[l] = temp;
				l++;
				r--;
			}
		}

		System.out.println(new String(chars));
	}

	public static void duplicateCharInString(String word) {

		char[] chars = word.toLowerCase().toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char c : chars) {

			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c) + 1);
			}

			else {
				charMap.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();

		System.out.println(entrySet);

		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
	}

	public static String reverseStringUsingReverse(String string) {

		String s = "";
		StringBuffer sb = new StringBuffer(string);
		sb.reverse();
		return sb + s;
	}

	public static String reverseStringWithoutReverse(String string) {

		String s = "";
		char[] chars = string.toLowerCase().toCharArray();
		int i = 0;
		int j = chars.length - 1;
		while (i < j) {
			swap(chars, i, j);
			i++;
			j--;
		}
		return new String(chars);
	}

	private static void swap(char[] str, int i, int j) {
		// TODO Auto-generated method stub
		char temp = str[i];
		str[i] = str[j];
		str[j] = temp;
	}

	public static ArrayList<String> permutation(String prefix, String str, ArrayList<String> list) {

		int n = str.length();
		if (n == 0) {
			// System.out.println(prefix);
			list.add(prefix);
			// System.out.println("Added");
		} else {

			for (int i = 0; i < n; i++) {

				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), list);
			}
		}
		return list;
	}

	public static ArrayList<Integer> divisbleByNumber(int number, int n, ArrayList<String> list) {

		String s = "" + number;
		ArrayList<String> listOfPermuation = permutation("", s, list);
		System.out.println(listOfPermuation);
		ArrayList<Integer> divisableNumb = new ArrayList<>();
		for (String string : listOfPermuation) {
			if (Integer.parseInt(string) % n == 0) {
				divisableNumb.add(Integer.parseInt(string));
			}
		}

		return divisableNumb;
	}

	public static Set<String> paladromePermutation(String s, ArrayList<String> list) {

		ArrayList<String> listOfPermutations = permutation("", s, list);

		Set<String> paladromStrings = new HashSet<>();
		for (String string : listOfPermutations) {

			if (string.equals(reverseStringUsingReverse(string)))

			{
				paladromStrings.add(string);
			}

		}

		return paladromStrings;
	}

	public static Set<String> allPermutationInSorted(String s, ArrayList<String> list) {
		Set<String> set = new TreeSet<>();
		ArrayList<String> listOfPermutation = permutation("", s, list);
		System.out.println(listOfPermutation);
		set.addAll(listOfPermutation);

		return set;
	}

	public static void stringrefcheck() {

		String s = "Himanshu";
		String s1 = "Himanshu";
		String s2 = new String("Himanshu");

		System.out.println(s.equals(s1));

		System.out.println(s == s1);

		System.out.println(s1.equals(s2));

		System.out.println(s1 == s2);
	}

	public static String stringContainAnotherString(String s) {

		String str = "";
		String result = null;
		String toBeMatched = "Hackerrank";

		int j = 0;
		int count = 0;
		for (int i = 0; i < toBeMatched.length(); i++) {
			for (; j < s.length(); j++) {
				count++;
				if (toBeMatched.toLowerCase().toCharArray()[i] == s.toCharArray()[j]) {
					str = str + s.toCharArray()[j];
					j = count;
					break;
				}
			}
		}
		if (toBeMatched.toLowerCase().equals(str.toLowerCase())) {
			result = "YES";
		} else {
			result = "NO";
		}
		return result;
	}
}
