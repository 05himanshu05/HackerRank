import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapSorting {

	public static void main(String[] args) {

		Map<String, Integer> unsortMap = new HashMap<String, Integer>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("j", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);
		
		LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
		
		unsortMap.entrySet().stream()
		.sorted(Map.Entry.comparingByValue())
		.forEachOrdered(x-> sortedMap.put(x.getKey(), x.getValue()));
		
		System.out.println("Sorted...");
        System.out.println(sortedMap);
        
	}

	
}