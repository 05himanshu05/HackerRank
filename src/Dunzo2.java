import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Dunzo2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		Set<String> set = new HashSet<>();
		set.add("");
		list1.add(7000);
		list1.add(13400);
		list1.add(7000);
		list1.add(14000);
		
		list2.add(7000);
		list2.add(13400);
		list2.add(150000);
		list2.add(7000);
		list1.retainAll(list2);
		
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1);
	}
}
