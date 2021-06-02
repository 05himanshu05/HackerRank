
public class ConvertNumberToWord {
	
	public static void main(String[] args) {
		
		System.out.println("9999- " + convertNumber(9999));
	}

	private static final String[] units = { "", " one", " two", " three", " four", " five", " six", " seven", " eight",
			" nine" };
	private static final String[] twoDigits = { " ten", " eleven", " twelve", " thirteen", " fourteen", " fifteen",
			" sixteen", " seventeen", " eighteen", " nineteen" };

	private static final String[] tenMultiples = { "", "", " twenty", " thirty", " forty", " fifty", " sixty",
			" seventy", " eighty", " ninety" };
	private static final String[] placeValues = { " ", " thousand", " million", " billion", " trillion" };

	private static String convertNumber(long number) {
		String word = "";
		int index = 0;
		do {
			// take 3 digits in each iteration
			int num = (int) (number % 1000);
			if (num != 0) {
				String str = ConversionForUptoThreeDigits(num);
				
				System.out.println("str = " + str);
				word = str + placeValues[index] + word;
			}
			index++;
			// next 3 digits
			number = number / 1000;
		} while (number > 0);
		return word;
	}

	private static String ConversionForUptoThreeDigits(int number) {
		String word = "";
		int num = number % 100;
		System.out.println("num = " + num);
		if (num < 10) {
			System.out.println(units[num]);
			word = word + units[num];
		} else if (num < 20) {
			word = word + twoDigits[num % 10];
		} else {
			System.out.println(tenMultiples[num/10]);
			word = tenMultiples[num / 10] + units[num % 10];
			
			System.out.println("word = " + word);
		}
		
		System.out.println(units[number/100]);
		word = (number / 100 > 0) ? units[number / 100] + " hundred" + word : word;
		return word;
	}
}
