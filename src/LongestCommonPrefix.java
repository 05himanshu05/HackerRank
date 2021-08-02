import java.util.Vector;

public class LongestCommonPrefix {
	
	static String commonPrefix(String s1 , String s2) {
		
		String result = "";
		
		int n1 = s1.length(); int n2 = s2.length();
		
		for(int i=0 , j=0 ; i<=n1-1 && j<=n2-1;i++ , j++ ) {
			
			if(s1.charAt(i)!=s2.charAt(j)) {
				
				break;
			}
			
			result += s1.charAt(i); 
		}
		
		return result;
	}
	
	public static String longestCommonPrefix(String[] strs) {
	
		String prefix = strs[0];
		
		System.out.println(prefix);
		
		for(int i=1; i <strs.length;i++) {
			
			prefix = commonPrefix(prefix, strs[i]);
			System.out.println(prefix);
		}
		
		
		return prefix;

	}

	public static void main(String[] args) {

		String[] str = {"flower","flow","flight"};
		
		String n = longestCommonPrefix(str);
		
		System.out.println(n+""+n.length());
	}
}
