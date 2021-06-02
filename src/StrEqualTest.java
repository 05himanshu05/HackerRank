
public class StrEqualTest {
	
	public static void main(String[] args) {
		String s1= "Himanshu";
		String s2 = new String("Himanshu");
		String s3 = "Himanshu";
		
		if(s1==s2) {
			System.out.println("s1 and s2 are equal");
		}
		
		else {
			System.out.println("s1 and s2 are not equal");
		}
		
		if(s1==s3) {
			
			System.out.println("s1 and s3 are equal");
		}
		
		else {
			System.out.println("s1 and s2 are not equal");
		}
	}
}
