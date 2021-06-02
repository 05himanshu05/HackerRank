import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dunzo {
	
	
	public static boolean matchStringChars(String s1,String s2) {
		boolean flag = true;
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if (s1.charAt(i)==s2.charAt(j)) {
					flag = true;
					break;
				} else {
					flag = false;
				}
			}
		}
		
		return flag;
		
	}
	
	
	public static boolean isStringEqual(String s1,String s2) {
		
		List<String> list1 = Arrays.asList(s1.split(""));
		List<String> list2 = Arrays.asList(s2.split(""));
		return list1.containsAll(list2);
		
	}
	
	public static List<String> funWithAnagrams(List<String> text) {
		List<String> newlist = new ArrayList<>();
		for(int i=0;i<text.size();i++) {
			System.out.println(text.get(i));
			int j=1;
			for(;j<text.size();j++) {
				System.out.println(text.get(j));
				if(text.get(i).length()==text.get(j).length()) {
					boolean flag = isStringEqual(text.get(i), text.get(j));
					System.out.println("flag" + flag);
					if(flag==true) {
						if (!newlist.contains(text.get(i))) {
							newlist.add(text.get(i));	
						}
					}
					
					else {
						
						j = j+1;
					}
				}
			}
		}
		
		return newlist;
	    // Write your code here

	    }
	
	public static void main(String[] args) {
	
		
		//str = ['code','doce','ecod','framer','frame'];
		
		List<String> str = new ArrayList<>();
		
		str.add("code");
		
		str.add("doce");
		str.add("ecod");
		str.add("framer");
		str.add("frame");
		
		//System.out.println(matchStringChars("code", "dacm"));
		
		System.out.println("List =" + funWithAnagrams(str));
		
	}
}
