import java.util.Arrays;

public class OLATest2 {
	
	public static void main(String[] args) {
		int[] a1 = {-7,-6,1,5,8,7,6,4,3,-4,-1,-2};
		
		int[] a = {-7,-6,1,5,8,7,-5,6,4,3,-4,-2,-1,-3};
		
		Arrays.sort(a);

		
		int min = a[0];
		
		System.out.println(min);
		
		for(int i =1 ; i<a.length;i++) {
			
			if(min+1 == a[i]) {
				
				System.out.println("Found");
				
				min = a[i];
			}
			
			else {
				int notFound = min+1;
				
				System.out.println("Not Found =" + notFound);
				
				break;
			}
		}
		
	}
}
