import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class MinimumCountToDelete {

	public static void main(String[] args) {
		
		String s = "aaabbbccc";
		System.out.println(solution(s));
	}

	static public int solution(String s) {

		Integer[] charCounts = new Integer[26];

		Arrays.fill(charCounts, 0);

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 'a';
			int count = charCounts[index];
			charCounts[index] = count + 1;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<charCounts.length;i++) {
			
			if(charCounts[i]>0) {
				
				list.add(charCounts[i]);
			}
		}
		
		Collections.sort(list,Collections.reverseOrder());
		
		
		Integer[] counts = list.toArray(new Integer[list.size()]);
		
		int deletions = 0;
		
		for(int i=0;i<counts.length-1;i++) {
			
			for(int j=i+1;j<counts.length;j++) {
				
				if(counts[i]>0 && counts[i]==counts[j]) {
					int count = counts[j];
					counts[j] = count-1;
					deletions++;
				}
				else
					break;
			}
		}
		return deletions;

	}
}
