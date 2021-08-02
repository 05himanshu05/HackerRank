import java.util.HashMap;



public class OlaTest4 {
	
	public static void main(String[] args) {
		//abbcccddddeeeee
		//Output: a1b2c3d4e5
		
		String s = "abbcccddddeeeee";
		  
		Character currenCharacter = s.charAt(0);
		
		String result = "";
		
		int count1 = 1;
		
		result = result + s.charAt(0)+count1;
		
		System.out.println(result);
		
		for(int i=1 ; i<s.length()-1;i++) {
			//System.out.println(result);
			if(s.charAt(i) == s.charAt(i+1)) {
				count1++;
				continue;
			}
			result = result + s.charAt(i) + count1;
			count1 = 1;
		}
		
		System.out.println(result);
	}
}	
