
import java.util.ArrayList;

public class ReplaceCharString {

	static char[] swapChar(String s, Character c1, Character c2) {
		char[] chars = s.toCharArray();
		int i = s.indexOf(c1);
		int j = s.indexOf(c2);

		char temp = chars[i];

		chars[i] = chars[j];

		chars[j] = temp;

		return chars;
	}

	public static void main(String[] args) {
		
		System.out.println(swapChar("himanshu", 'm', 'u'));

	}
}
