
class Stack{
	static final int MAX = 1000;
	int top;
	
	int a[] = new int[MAX];
	
	boolean push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("Stack Overflow");
			
			return false;
		}
		
		else {
			a[++top] = x;
			System.out.println(x +" = Element pushed");
			return true;
		}
	}
	
	int pop() {
		if(top<0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		
		else {
			int x = a[top--];
			return x;
		}
	}
}

public class StackImplementation {
	
		public static void main(String[] args) {
			
			Stack stack = new Stack();
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
		}
}
