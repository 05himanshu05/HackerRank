import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class FailFastFailSafe {

	public static void main(String[] args) {

	}

	static void failSafe() {
		ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
		// Adding elements to map
		map.put("Dell", 1);
		map.put("IBM", 2);
		// Getting an Iterator from map
		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(key + " : " + map.get(key));
			map.put("Google", 3);
		}
	}

	static void failFast() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		// Getting an Iterator from list
		
		// Synchronizing a list using Collections
		//wwss
		
		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			Integer integer = (Integer) it.next();
			list.add(4);
		}
	}
}
