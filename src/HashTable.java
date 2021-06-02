import java.util.Hashtable;

public class HashTable {

		public static void main(String[] args) {
			
			Hashtable<String, Integer> obj = new Hashtable<>();
			
			obj.put("D", new Integer(3));
			obj.put("E", new Integer(2));
			obj.put("A", new Integer(8));
			//obj.put("C", new Integer());
			
			//obj.remove(new String("A"));
			
			System.out.println(obj);
		}
}
