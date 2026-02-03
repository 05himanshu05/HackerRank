package applePractice;

public class ArrayRotation {

	static int[] rotLeft(int[] a, int k) {
		int temp = 0;
		int d = 0;
		for (int i = 0; i < k; i++) {
			int j = 0;
			temp = a[d];
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

	public static void rotate(int[] nums, int k) {

		for(int i=0;i<k;i++) {
			int temp = nums[nums.length-1];
			for (int j=nums.length-1;j>0;j--){
				nums[j] = nums[j-1];
			}
			nums[0] = temp;
		}
		for (int num:nums){
			System.out.println(" ---" + num + "--- ");
		}
	}

	public static void rotate1(int[] nums, int k) {
		int n = nums.length;
		reverse(nums, 0, n-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, n-1);
		for (int num:nums){
			System.out.println(" ---" + num + "--- ");
		}
	}

	private static void reverse(int[] nums, int left, int right) {
		while (left < right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5,6,7 };

		//int[] b = rotLeft(a, 1);

		//System.out.println("Array of rotation = " + b[0] + " " + b[1] + " " + b[2] + " " + b[3] + " " + b[4]);

		//StringBuffer sb = new StringBuffer("test");
		
		//System.out.println(righrotate("goldmansache", 3));
		rotate(a,3);
		//rotate1(a,3);
	}
}
