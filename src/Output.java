
class area{
	int width;
	int length;
	int area ;
	void area(int width , int length) {
		this.width = width;
		this.length = length;
	}
}


public class Output {
	
	public static void main(String[] args) {
		area obj = new area();
		obj.area(5,6);
		System.out.println(obj.length + " " + obj.width);
	}
}
