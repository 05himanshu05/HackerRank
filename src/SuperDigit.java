
public class SuperDigit {

	public static void main(String[] args) {
		
		String n = "987";
		int k = 4;
		
		System.out.println(superDigit(n, k));
	}
	
	static int superDigit(String number, int k) {
        if (number.length() > 1)
        {
            long sum = 0;
            for (int i = 0; i < number.length(); i++)
            {
            	System.out.println(Character.getNumericValue(number.charAt(i)));
                sum += Character.getNumericValue(number.charAt(i));
                System.out.println("sum =" +sum);
            }
            System.out.println("Long value = "+Long.toString(sum*k));
            return superDigit(Long.toString(sum * k), 1);
        }
        else
            return Character.getNumericValue(number.charAt(0));

    }
}
