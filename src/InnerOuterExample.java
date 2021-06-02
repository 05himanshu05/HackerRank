
class OuterClass {
	
	private double piValue = 3.14;
	
	public class InnerClass{
		
		public double getPiValue() {
			return piValue;
			
		}
		
		public double getCircleArea(int radius) {
			
			return piValue*radius*radius;
		}
	}
}

public class InnerOuterExample{
	
	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		
		OuterClass.InnerClass inner = outer.new InnerClass();
		
		System.out.println(inner.getCircleArea(4));
		
		System.out.println(inner.getPiValue());
	}
}