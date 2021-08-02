
class Parent {

	public void show() {
		System.out.println("parent");
	}
}

class Child extends Parent {

	public void show() {
		System.out.println("child"); // method hiding is implemented
	}

	public static void printAlphabets() {

		String input11 = "c2k3";

		String input1 = "b10j1d2";
	}
}

class Main {
	public static void main(String main[]) {

		Child p = new Child();
		// p.show();
		p.printAlphabets();
	}
}
