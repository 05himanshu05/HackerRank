class D{
	public int i;
	public int j;
	
	D(){
		i=1 ; j=2;
	}
}

class E extends D{
	int a;
	
	E(){
		super();
	}
}
public class ExtendExample {
	
	public static void main(String[] args) {
		E obj = new E();
		System.out.println(obj.i + " " +obj.j);
	}
}
