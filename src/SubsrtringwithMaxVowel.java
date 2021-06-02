import java.util.ArrayList;
import java.util.List;

public class SubsrtringwithMaxVowel {

	public static void main(String[] args) {

		//ArrayList<String> totalatring = findsubstring("Shiv");
		//System.out.println(totalatring);
		System.out.println(kSizeSubstringConcat("abcbcscsesesesd", 3));
	}

	public static ArrayList<String> findsubstring(String inputString) {
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < inputString.length(); i++) {
			for (int j = i + 1; j <= inputString.length(); j++) {

				// System.out.println(inputString.substring(i,j));

				list.add(inputString.substring(i, j));
			}
		}
		
		return list;
	}

	public static String kSizeSubstringConcat(String string,int K) {
			
		String ans = "";
		int i=0;
		for(;i<string.length();) {
			
			int j = i+ K; 
			//System.out.println(i + " " +j);
			ans = ans + string.substring(i, j);
			//System.out.println(ans);
			i = j;
			
			//System.out.println(i + " " +j);
		}
		
		return ans;
	}
}
