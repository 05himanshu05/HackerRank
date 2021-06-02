
public class StringTest {
	
	public static void main(String[] args) {
		
		int test_number = 10;
		
		switch(test_number) {
		case 10 : System.out.println("Test Number value :" + test_number++);
		case 11 : System.out.println("Test Number value :" + test_number++);
		default : System.out.println("Test Number value :" + test_number++);
		}
	}
}
