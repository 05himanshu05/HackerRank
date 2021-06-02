import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.TreeMap;

public class Test2 {

	public static List<String> mostActive(List<String> customers) {
	 
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(String customer:customers) {
			
			if(!map.containsKey(customer)) {
				map.put(customer, 1);
			}
			else {
				int count = map.get(customer);
				map.put(customer, count+1);
			}
		} 
		
		Map<String, Integer> result = map.entrySet().stream()
	            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                    (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		
		
		
		ArrayList<String> keyList = new ArrayList<String>(result.keySet());
		
		//System.out.println(keyList);
		
		return keyList;
		// Write your code here
		
	}

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Alpha");
		list.add("Alpha");
		list.add("Alpha");
		list.add("Alpha");
		list.add("Alpha");
		list.add("Alpha");
		list.add("Alpha");
		list.add("Omega");
		list.add("Omega");
		list.add("Omega");
		list.add("Omega");
		list.add("Omega");
		list.add("Omega");
		list.add("Omega");
		list.add("Beta");
		list.add("Beta");
		list.add("Beta");
		list.add("Beta");
		list.add("Beta");
		list.add("Himanshu");
		
		System.out.println(mostActive(list));
		
		
		
		//Integer[][] ints = { { 1, 2, 3 }, {null }, { 7, 8, 9 } };
		//System.out.println("value = " + ints[1][1].intValue());
	}
}
