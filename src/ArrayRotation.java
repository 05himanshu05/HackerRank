
public class ArrayRotation {

	static int[] rotLeft(int[] a, int d) {
		int temp = 0;
		int k = 0;
		for (int i = 0; i < d; i++) {
			int j = 0;
			temp = a[k];
			for (; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[j] = temp;
		}

		return a;

	}

	static String leftrotate(String str, int d) {
		String ans = str.substring(d) + str.substring(0, d);
		return ans;
	}
	
	static String righrotate(String str,int d) {
		
		return leftrotate(str, str.length()-d);
	}
	
	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		int[] b = rotLeft(a, 4);

		//System.out.println("Array of rotation = " + b[0] + " " + b[1] + " " + b[2] + " " + b[3] + " " + b[4]);

		StringBuffer sb = new StringBuffer("test");
		
		System.out.println(righrotate("goldmansache", 3));

	}
}
