
public class Java8Interface implements Java8Interface_One , Java8Interface_Two{
	
	public static void main(String[] args) {
		
		Java8Interface obj = new Java8Interface();
		
		obj.existingMethod("Java 8 easy to learn");
		
		obj.newMethod();
		
		Java8Interface_One.addingStaticMethod();
	}

	@Override
	public void existingMethod(String str) {
		
		System.out.println(" String is = "+str );
	}

	
	@Override
	public void display(String str) {
		
		System.out.println("String is = " + str );
	}

	public void newMethod(){  
        System.out.println("Implementation of default method");  
    }
}
