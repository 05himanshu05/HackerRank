import java.util.HashSet;

public class SpecialStringAgain {
	
	
	
	static int countNonEmptySubstr(String str)
    {
        int n = str.length();
        return n * (n + 1) / 2;
    }
	public static long substrCount(int n , String s) {
		
		int count = 0 ;
		
		
		for(int i =0 ; i<n-1;i++) {
			
			String substring = s.substring(i, i+2);
			System.out.println("sub =" +substring);
			if(substring.charAt(i)==substring.charAt(i+1)) {
				count++;
			}
		}
		
		System.out.println("count =" + count);
		
		return count+n;
	}
	
	public static void main(String[] args) {
		
		String s1 = "abcbaba";
		
		String s = "aaaa";
		
		//System.out.println(substrCount(s1.length(),s));
		
		System.out.println(countNonEmptySubstr(s));
		
	}
}
