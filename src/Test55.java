import java.util.Arrays;

public class Test55 {
	
	public static void main(String[] args) {
		int[] c = {5,9,1,4,6};
		int[] a = {5,9,4,1,2,7,18};
		int[] b = {5,9,2,3,16,4};
		
		int i =0 ; int j=0 ; int k=0;
		
		//Arrays.sort(a);
		//Arrays.sort(b);
		//Arrays.sort(c);
		
		//System.out.println("Test");
		
		while(i<a.length && j < b.length && k<c.length) {
			
			//System.out.println(a[i]);
			//System.out.println(b[j]);
			//System.out.println(c[k]);
			
			if(a[i] == b[j] && b[j] == c[k]) {
				
				System.out.println(a[i] + " ");
				i++;
				j++;
				k++;
			}
			
			else if(a[i] < b[j]) {
				
				i++;
			}
			
			else if(b[j] < c[k]) {
				
				j++;
			}
			
			else {
				k++;
			}
		}
	}
}
