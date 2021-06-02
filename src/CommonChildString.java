import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonChildString {

	static ArrayList<String> list = new ArrayList<String>();

	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	static int commonChild1(String s1, String s2) {
		char[] X = s1.toCharArray();
		char[] Y = s2.toCharArray();
		
		int m = X.length;
		int n = Y.length;
		
		int L[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				if (i == 0 || j == 0) {
					L[i][j] = 0;
				System.out.println(L[i][j]);}
				else if (X[i - 1] == Y[j - 1]) {
					L[i][j] = L[i - 1][j - 1] + 1;
				} else {
					L[i][j] = max(L[i - 1][j], L[i][j - 1]);
				}
			}
		}
		return L[m][n];
	}

	static String commonChild(String s1, String s2) {

		List<String> list1 = new ArrayList<String>(Arrays.asList(s1.split("")));
		List<String> list2 = new ArrayList<String>(Arrays.asList(s2.split("")));
		list1.retainAll(list2);
		return String.join("", list1);

	}

	public static void main(String[] args) {

		String my_str_1 = "HARRY";
		String my_str_2 = "SALLY";

		
		System.out.println(commonChild(my_str_1,my_str_2));

	}
}
