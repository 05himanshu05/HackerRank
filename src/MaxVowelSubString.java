
public class MaxVowelSubString {

	static String maxVowelSubString(String str, int K) {
// Store the length of the string
		int N = str.length();

// Initialize a prefix sum array
		int[] pref = new int[N];
		
		System.out.println("Lenght of pref array { " + pref.length + " }");

// Loop through the string to
// create the prefix sum array
		for (int i = 0; i < N; i++) {
// Store 1 at the index
			
// if it is a vowel
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u')
				pref[i] = 1;

// Otherwise, store 0
			else
				pref[i] = 0;

// Process the prefix array
			if (i != 0)
				pref[i] += pref[i - 1];
			System.out.println("value of {"+ pref[i] + " }" );
		}

// Initialize the variable to store
// maximum count of vowels
		int maxCount = pref[K - 1];
		
		System.out.println("Value of maxcount {" +maxCount + " }");
// Initialize the variable
// to store substring
// with maximum count of vowels
		String res = str.substring(0, K);
		
		System.out.println("sub string {" + res + " }");
		
// Loop through the prefix array
		for (int i = K; i < N; i++) {
// Store the current
// count of vowels
			int currCount = pref[i] - pref[i - K];
			
			System.out.println("value of current count { " + currCount + " }");
// Update the result if current count
// is greater than maximum count
			if (currCount > maxCount) {
				maxCount = currCount;
				int p = i-K+1;
				System.out.println("value of i-k+1 " +p);
				System.out.println(i+1);
				res = str.substring(i - K + 1, i + 1);
				
				System.out.println("Substring inside res { " + res + " }");
			}

// Update lexicographically smallest
// substring if the current count
// is equal to the maximum count
			else if (currCount == maxCount) {
				int p = i-K+1;
				String temp = str.substring(i - K + 1, i + 1);
				System.out.println("value of i-k+1 " +p);
				System.out.println("Substring inside temp { " + temp + " }");
				
				if (temp.compareTo(res) < 0)
					res = temp;
				
				System.out.println("inside compareto { " + res + " }");
			}
		}

// Return the result
		return res;
	}

	public static void main(String[] args) {

		String str = "samara";
		int K = 3;
		System.out.print(maxVowelSubString(str, K));
	}
}
