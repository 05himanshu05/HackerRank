import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		//int m = 3;
		//Integer[] numarray = {1,5,4,3,2};
		//List<Integer> a = new ArrayList<Integer>(Arrays.asList(numarray));
		
		charCount("bob");
		
	}

	public static int maxScore(List<Integer> a, int m) {
		
		int length = a.size()/m;
		Collections.sort(a);
		for(int i=0 ; i<length;i++) {
			
		}
		return m;

	}

	static void charCount(String s) {
		
		int[] freq = new int[26];
		
		for(int i=0;i<s.length();i++) {
			
			freq[s.charAt(i)-'a']++;
		}
		
		for(int i=0 ; i<s.length();i++) {
			
			if(freq[s.charAt(i)-'a']!=0) {
				
				System.out.println(s.charAt(i) + " " + freq[s.charAt(i)-'a']);
				freq[s.charAt(i) - 'a'] = 0;
			}
		}
	}
}