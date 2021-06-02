import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Sapient {

	public static void main(String[] args) {

		String str = "management";
		String s = "hoh";
		 //System.out.println(nonRepeatedCharsInString(str));
		//System.out.println(voweelCountInString(str));
		System.out.println(palandromString(s));
	}

	static ArrayList<Character> nonRepeatedCharsInString(String str) {

		char[] chars = str.toCharArray();

		HashMap<Character, Integer> freq = new HashMap<>();

		for (Character c : chars) {

			if ((freq.containsKey(c))) {

				freq.put(c, freq.get(c) + 1);
			}

			else {

				freq.put(c, 1);
			}
		}
		ArrayList<Character> list = new ArrayList<>();

		for (Entry<Character, Integer> entry : freq.entrySet()) {

			// System.out.println(entry.getValue());

			if (entry.getValue() ==1) {

				list.add(entry.getKey());

			}
		}

		return list;
	}

	static HashMap<Character, Integer> voweelCountInString(String s) {
		char[] chars = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>();

		for (char c : chars) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				}

				else {

					map.put(c, 1);
				}
			}

		}

		return map;
	}
	
	static boolean palandromString(String s) {
		String reverseString = "";
		StringBuffer sb = new StringBuffer(s);
		return (sb.reverse() + reverseString).equals(s);
	}
}
