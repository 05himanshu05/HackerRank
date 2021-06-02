
class A{
	public A() {
		System.out.println("A");
	}
}

class B extends A{
	public B() {
		System.out.println("B");
	}
}


class C extends A{
	public C() {
		System.out.println("C");
	}
}

public class MethodCalling {
	
	public static void main(String[] args) {
		//new Employee();
		
		C c = new C();
	}
}
