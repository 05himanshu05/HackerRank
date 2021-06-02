
class overload{
	int x;
	double y;
	void add(int a, int b) {
		
		x = a+b;
	}
	
	void add(double c , double d) {
		y = c+d;
	}
	
	overload(){
		this.x = 0;
		this.y = 0;
				
	}
}

public class OverloadExample {
	public static void main(String[] args) {
		
	overload over = new overload();
	
	int a =2 ;
	double b = 3.2;
	
	over.add(a, a);
	over.add(b, b);
	
	System.out.println(over.x);
	System.out.println(over.y);
	}
}
