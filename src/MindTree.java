
public class MindTree {

	public static void main(String[] args) {

		int[] a = { 1, 1, 0, 2, 3, 4, 4 };

		int[] b = new int[a.length];

		int j = 0;

		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] != a[i + 1]) {

				b[j++] = a[i];
			}
		}

		b[j++] = a[a.length - 1];
		for (int i = 0; i < b.length - 1; i++) {

			System.out.println(b[i]);
		}
	}
}
