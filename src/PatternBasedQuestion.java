import java.util.Iterator;

public class PatternBasedQuestion {

	public static void main(String[] args) {

		rightPyramid();
	}

	static void cgi_pyramid() {
		int k = 0;
		while (k < 3) {

			for (int i = 0; i < 3; i++) {

				for (int j = 0; j <= i + 2; j++) {

					System.out.print("*");
				}

				System.out.println();
			}
			k++;
		}
	}

	static void rightPyramid() {

		for (int i = 0; i < 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
	}

	static void leftPyramid() {

		int i, j;

		int n = 5;

		for (i = 0; i < n; i++) {

			for (j = 2 * (n - i); j > 2; j--) {
				System.out.print(" ");
			}

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}

	static void starPattern() {

		int i, j;

		int n = 5;

		for (i = 0; i < n; i++) {

			for (j = n - i; j > 1; j--) {

				System.out.print(" ");
			}

			for (int k = 0; k <= i; k++) {

				System.out.print("* ");
			}
			
			System.out.println();
		}

	}
}
