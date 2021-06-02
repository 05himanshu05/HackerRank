class Sample1 {
	public void display() {
		// Java Arrays with Answers
		System.out.println("Hello this is the method of the super class");
	}
}

public class MyClass extends Sample1 {
	public void greet() {
		System.out.println("Hello this is the method of the sub class");
	}

	public static void main(String args[]) {
		MyClass obj = new MyClass();
		
		

		Sample1 obj1 = new MyClass();
		
		

		Sample1 obj3 = new Sample1();

		// MyClass obj4 = new Sample1();

		/*
		 * Once you create an object, you can't change its type. That's why you can't
		 * cast an Super class to a Child class. However, if you create an object of a
		 * sub-class, you can keep a reference to it in a variable of the super-class
		 * type, and later you can cast it to the sub-class type.
		 */

		MyClass obj5 = (MyClass) obj1;

		 
		obj.greet();
	}
}