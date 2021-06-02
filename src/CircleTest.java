
interface Shape {
	void draw();
}

abstract class CTest {
	void display() {
		System.out.println("Test Display");
	}
}

public class CircleTest extends CTest implements Shape {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
	
		System.out.println("Drawing");
	}
	
	public static void main(String[] args) {
		new CircleTest().display();
		new CircleTest().draw();
		
	}
}
