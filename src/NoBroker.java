
public class NoBroker {

	public static void main(String[] args) {

		// aBBcccDDDeeee...

		int i = 1;
		for (char c = 'a'; c <= 'z'; c++) {

			if (i % 2 == 0) {

				for (int j = 0; j < i; j++) {

					System.out.print(Character.toUpperCase(c) + " ");
				}

				i++;
			}

			else {
				for (int j = 0; j < i; j++) {

					System.out.print(c + " ");
				}

				i++;
			}
		}
	}
}
