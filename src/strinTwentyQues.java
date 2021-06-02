import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

import java.util.Set;
import java.util.TreeSet;

public class strinTwentyQues {
	static ArrayList<String> list = new ArrayList<String>();

	public static void main(String[] args) {

			int number = 123;
		// duplicateCharInString("Himanshu");
		 //System.out.println(reverseStringWithoutReverse("amas"));
		// System.out.println(permutation("", ""+number,list));
		 //System.out.println(divisbleByNumber(124, 2, list));
		// System.out.println(paladromePermutation("aabbcadad", list));

		//System.out.println(allPermutationInSorted("ABC", list));
		
		//System.out.println(stringContainAnotherString("hereiamstackerrank"));
			
		//stringrefcheck();
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
		
		System.out.println(s==s1);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
	}
	
	public static String stringContainAnotherString(String s) {

        String str = "";
        String result = null;
        String toBeMatched= "Hackerrank";
        int j=0;
        int count=0;
        for(int i=0; i<toBeMatched.length();i++){
            for(; j<s.length();j++){
                count++;
                if(toBeMatched.toLowerCase().toCharArray()[i]==s.toCharArray()[j]){
                    str = str + s.toCharArray()[j];
                    j= count;
                    break;
                }
            }
        }
        if(toBeMatched.toLowerCase().equals(str.toLowerCase())){
            result = "YES";
        }
        else{
            result = "NO";
        }
        return result;
	}
}
