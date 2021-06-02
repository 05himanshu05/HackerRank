
public class TestMyStaticClass {
	
	/*
	 * What good are static classes? A good use of a static class is in defining
	 * one-off, utility and/or library classes where instantiation would not make
	 * sense. A great example is the Math class that contains some mathematical
	 * constants such as PI and E and simply provides mathematical calculations.
	 * Requiring instantiation in such a case would be unnecessary and confusing.
	 * See the Math class and source code. Notice that it is final and all of its
	 * members are static. If Java allowed top-level classes to be declared static
	 * then the Math class would indeed be static.
	 */
	
	
	// Math class is the best example for this. where we can call values of PI directly.
	
	public static void main(String[] args) {
		
		MyStaticClass.setMyStaticMember(5);
		
		System.out.println("myStaticMember =" + MyStaticClass.getMyStaticMember());
		
		System.out.println("Square of myStaticMember = " + MyStaticClass.squareMyStaticMember());
	}
}
