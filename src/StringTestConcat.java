import java.util.HashSet;

public class StringTestConcat {
	
	public static void stringExample() {
		String test1 = new String("Test");
		String test2 = "Test";
		String test3 = test1;
		
		System.out.println(test1.equals(test2));
		System.out.println(test1==test2);
		System.out.println(test1.equals(test3));
	}
	
	public static void main(String[] args) {
		String test1 = "Test";
		String test2 = new String("Test");
		String test3 = "Te" + "st";
		
		System.out.println(test1==test2 && test1==test3);
		System.out.println(test1==test2 && test1==test3);
		
		HashSet<String> m = new HashSet<>();
		
		stringExample();
	}
}
