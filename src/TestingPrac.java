import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class TestingPrac {

	public static void main(String[] args) {

		String s = "himanshu";
		HashMap<Character, Integer> map = new HashMap<>();

		char[] chars = s.toCharArray();

		for (char c : chars) {
			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			}

			else {
				map.put(c, 1);
			}
		}

		ArrayList<Character> list = new ArrayList<>();

		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {

				list.add(entry.getKey());
			}

		}

		System.out.println(map);
		System.out.println(list);

		HashMap<Character, Integer> map1 = new HashMap<>();

		for (char c : chars) {

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

				if (map1.containsKey(c)) {
					map1.put(c, map1.get(c) + 1);
				}

				else {
					map1.put(c, 1);
				}
			}
		}

		System.out.println("map1 =" + map1);

		int num = 321;
		int invert = 0;
		while (num != 0) {

			invert = invert * 10 + num % 10;
			num = num / 10;
		}
		
		System.out.println(invert);
		
		String s1 = "        Hello";
		System.out.println(s1.trim().replaceAll("\\s+"," "));
	}

}
