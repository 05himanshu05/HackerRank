import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeating {

	static int missing(){
		Integer[] arr = {4, 2, -1, 6, 5 };
		Set<Integer> distinct = new HashSet<>();
		Collections.addAll(distinct, arr);

		// return first smallest missing positive number from the set
		int index = 1;
		while (true)
		{
			if (!distinct.contains(index)) {
				return index;
			}
			index++;
		}
	}
	
	static int missing1() {
		
		int[] a = {4, 2, 1, 6, 5 };
		int missingValue = 0;
		if(a.length==1) {
			
			if(a[0]==1) {
				return missingValue=2;
			}
			
			else {
				return missingValue=1;
			}
		}
		
		boolean b[] = new boolean[a.length+1];
		
		System.out.println(b.length);
		
		for(int i=0;i <a.length-1;i++) {
			if(a[i]>0) {
				
				if(b[a[i]]!=true) {
					b[a[i]] = true;
					System.out.println(b[a[i]]);
				}
			}
		}
		
		for(int i=0; i<b.length-1;i++) {
			
			if(b[i]==false) {
				
				missingValue = i;
			}
			
			else {
				missingValue = i+1;
			}
		}
		return missingValue;
		
	} 
	static void missinPositive() {

		
		int[] a = {2, 1, 6,3,4 };
		
		int[] a1 = {4, 2, 0, 6, 5};
		
		//1 2 3 4 5 6 
		
		Arrays.sort(a);
		
		for(int i =0 ; i<a.length-1;i++) {
			
			if(a[i]+1 != a[i+1]) {     
				
				System.out.println(a[i]+1);
				break;
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		missinPositive();
	}
	
	
}
