import java.text.SimpleDateFormat;
import java.util.Date;

public class FibonacciExample {

	
	static int fib(int n)
    {
        // Base Case
        if (n <= 1)
            return n;
  
        // Recursive call
        return fib(n - 1)
            + fib(n - 2);
    }
	
	static void generateUniqueNum() {
	}
	public static void main(String[] args) {
		
		int N=10;
		
		for (int i = N; i > 1; i--) {
			  
            System.out.print(fib(i) + " ");
        }
		
		//Date dNow = new Date();
        //SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmss");
        //String datetime = ft.format(dNow);
        //System.out.println(datetime);
	}
}	
