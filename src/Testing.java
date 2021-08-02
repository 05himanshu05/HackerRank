import java.util.ArrayList;

public class Testing {

	public static ArrayList<String> permutation(String prefix, String s, ArrayList<String> list) {

		if (s.length() == 0) {

			list.add(prefix);
		}

		for (int i = 0; i < s.length(); i++) {

			permutation(prefix + s.charAt(i), s.subSequence(0, i) + s.substring(i + 1, s.length()), list);

		}

		return list;
	}

	public static void permutation() {
		
		String s = "ABC";
		
		for(int i = 0 ; i <=s.length();i++) {
			
			for(int j = i+1 ; j<=s.length();j++) {
				
				System.out.println(s.substring(i,j));
			}
		}
	}
	public static void main(String[] args) {

		String s = "ABC";
		ArrayList<String> list = new ArrayList<>();
		String prefix = "";
		
		//list = permutation(prefix, s, list);
		permutation();
		//System.out.println(list);

	}
}
