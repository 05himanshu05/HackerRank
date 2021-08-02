import java.util.Arrays;

public class SmallestPositiveMissingNumber {
	
	public static void main(String[] args) {
		
		int[] a = {0,-10,1,3,-20};
		
		int[] a2 = {1,2,3,4,6};
		
		Arrays.sort(a);
		
		int min = 0;
		
		System.out.println(min);
		
		
		int j = 0;
		
		for (int i =0 ; i < a.length;i++) {
			
			if(a[i] >= 0) {
				
				min = a[i] ;
				j = i;
				break;
			}
		}
		
		System.out.println( min + " " + j);
		
		for(; j<a.length;j++) {
			System.out.println("min = " + min );
			if(min + 1 == a[j+1]) {
				
				//System.out.println(" Not Missing = " + a[j+1]);
				min = a[j+1];
			}
			
			else {
				min = min+1;
				System.out.println("Not Found = " + min);
				break;
			}
		}
	}
}
