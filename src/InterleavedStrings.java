
public class InterleavedStrings {
	
	
	
	public static void main(String[] args) {
		
		String A = "XY";
		String B = "X";
		String C = "XXY";
		
		StringBuffer bf = new StringBuffer();
		System.out.println(B+A);
		if(C.equals(B+A)) {
			System.out.println("is interleaving");
		}
		
		else {
			
			System.out.println("is not interleaving");
		}
	}
}
