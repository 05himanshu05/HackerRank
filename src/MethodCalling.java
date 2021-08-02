
class A{
	public A() {
		System.out.println("A");
	}
	
	public static void show() {
		System.out.println("In A");
	}
}

class B extends A{
	public B() {
		System.out.println("B");
	}
	
	public static  void show() {
		
		System.out.println("In B");
		
	}
}


class C extends A{
	public C() {
		System.out.println("C");
	}
	
	public static void show() {
		
		System.out.println("In C");
	}
}

public class MethodCalling {
	
	public static void main(String[] args) {
		//new Employee();
		
		A c = new C();
		
		//C.show();
		
		
	}
}
