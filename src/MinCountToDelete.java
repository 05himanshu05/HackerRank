import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class MinCountToDelete {

	public static void main(String[] args) {

		String s = "aaaabbbbcccc";
		System.out.println(minCountToDelte(s));
	}

	static int minCountToDelte(String s) {

		char[] chars = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : chars) {

			if (map.containsKey(c)) {

				map.put(c, map.get(c) + 1);
			} else {

				map.put(c, 1);
			}
		}
		
		System.out.println("map = " + map);
		ArrayList<Integer> list = new ArrayList<>();

		for (Entry<Character, Integer> entry : map.entrySet()) {

			list.add(entry.getValue());
		}

		System.out.println("list values = "+list);

		int deletionCount = 0;

		for (int i = 0; i < list.size(); i++) {

			for (int j = i + 1; j < list.size(); j++) {
				
				if( (list.get(i)>0) && (list.get(i)==list.get(j))) {
				
					System.out.println(j);
					list.set(j, list.get(j)-1);
					
					deletionCount++;
				}
				else 
					break;
			}
		}
		
		return deletionCount;
	}
}
