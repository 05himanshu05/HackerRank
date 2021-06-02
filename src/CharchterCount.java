import java.util.HashMap;
import java.util.Map;

public class CharchterCount {

	static Map<Integer, Integer> integerCount(Integer i) {

		HashMap<Integer, Integer> map = new HashMap<>();
		int num = i;
		while (num != 0) {

			int lastdigit = num % 10;

			num /= 10;
			
			System.out.println("Last Digit =" +lastdigit);
			System.out.println("Num =" +num);
			if (map.containsKey(lastdigit)) {
				map.put(lastdigit, map.get(lastdigit) + 1);
			}

			else {
				map.put(lastdigit, 1);
			}
		}
		return map;

	}

	static Map<Character, Integer> charcterCount(String s) {

		HashMap<Character, Integer> map = new HashMap<>();
		char[] charArray = s.toLowerCase().toCharArray();

		for (char c : charArray) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}

			else {
				map.put(c, 1);
			}
		}
		return map;

	}
	
	static void wordCountWithoutCollection(String s) {
		
		String[] words = s.split(" ");
		
		String[] foundWords = new String[words.length];
		
		int[] foundCount = new int[words.length];
		
		int foundIndex = 0;
		
		for (String word : words) {
		    int j = 0;
		    for (; j < foundIndex; j++) {
		        if (foundWords[j].equals(word.toLowerCase())) { //found
		            foundCount[j]++;
		            //System.out.println("Found COunt = "+foundCount);
		            break;
		        }
		    }
		    if (j == foundIndex) { //word bot found in foundWords
		        foundWords[foundIndex] = word.toLowerCase();
		        foundCount[foundIndex] = 1;
		        //System.out.println("Found Index = "+foundIndex);
		        foundIndex++;
		    }
		}
		
		for (int i = 0; i <foundIndex ; i++) {
		    System.out.println(foundWords[i] + " : " + foundCount[i]);
		}
	}
	static Map<String,Integer> wordCount(String string){
		
		HashMap<String, Integer> map = new HashMap<>();
		String[] words = string.split(" ");
	
		for (String word : words) {
			
			if(map.containsKey(word.toLowerCase())) {
				map.put(word, map.get(word)+1);
			}
			
			else {
				map.put(word.toLowerCase(), 1);
			}
		}
		return map;
		
	}

	public static void main(String[] args) {

		// System.out.println(charcterCount(""+12312343));

		//System.out.println(wordCount("Test SDET himanshu test"));
		
		wordCountWithoutCollection("Test SDET himanshu test");
		
		//System.out.println(integerCount(12334));
	}
}
