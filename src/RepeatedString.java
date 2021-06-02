
public class RepeatedString {

	public static void main(String[] args) {

		String s = "aba";
		long n = 10;
		System.out.println(repeatedString(s, n));
	}

	public static long repeatedString(String s, long n) {

		long sum = 0L;
		
		int count = 0 ;
		char[] chars = s.toCharArray();
		for (char c : chars) {

			if (c == 'a') {

				count++;
			}

		}
		
		System.out.println("count = " +count);
		if (n % s.length() != 0) {

			sum += count * (n / s.length());
			
			System.out.println("sum first time =" + sum);

			System.out.println("modulo = " + n%s.length());
			
			for (int i = 0; i < n % s.length(); i++) {
				
				if(chars[i]=='a') {
					sum = sum+1;
				}
			}

		}

		else if (n % s.length() == 0) {
			
			System.out.println("inside else if ");
			sum += count * (n / s.length());

			System.out.println("inside else loop " + sum);
		}

		return sum;

	}
}
