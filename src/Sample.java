
interface InterfaceP {
	public void show();
}

interface InterfaceQ {

	public void show();
}

public class Sample implements InterfaceP, InterfaceQ {
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show() method Implementation");
	}
	
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.show();
	}
}
