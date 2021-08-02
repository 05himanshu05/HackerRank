import java.util.HashMap;
import java.util.Map.Entry;

public class Test45 {

	public static void main(String[] args) {
		String s = "India is my country. I love my country";
		
		s = s.replaceAll("[^a-zA-Z0-9]", " ");  
		
		String[] words = s.split(" ");

		HashMap<String, Integer> map = new HashMap<>();

		for (String word : words) {

			if (map.containsKey(word)) {

				map.put(word, map.get(word) + 1);

			}

			else {

				map.put(word, 1);
			}

		}
		
		for(Entry<String, Integer> entry:map.entrySet()) {
			
			if(entry.getValue() > 1) {	
				
			System.out.println((entry.getKey() + " " + entry.getValue() ));

			}
			
		}
	}
}
