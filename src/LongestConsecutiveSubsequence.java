import java.util.Arrays;

public class LongestConsecutiveSubsequence {
	
	public static void main(String[] args) {
		int a[] = {2,7,1,9,4,5,3};
		int a1[] = {1,9,3,10,4,20,2};
		Arrays.sort(a);
		
		int longestSequence = 0;
		
		for(int i =0 ; i<a.length-1;i++) {
			if(a[i+1] == a[i]+1) {
				longestSequence++;
				//System.out.println(longestSequence);
			}
			else {
				break;
			}
			
		}
				
		System.out.println(longestSequence+1);
	}
}
