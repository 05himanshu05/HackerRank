import java.util.Arrays;

public class SortMergerAndRemoveDuplicate {

	public static void main(String[] args) {
		int[] a = { 12, -7, 18, 9, 37, -1, 21 };

		int[] b = { 27, 8, 71, -9, 18 };

		int[] finalArray = new int[a.length + b.length];

		int[] temp = new int[finalArray.length];

		int i = 0, j = 0, k = 0;

		while (i < a.length) {

			finalArray[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {

			finalArray[k] = b[j];
			j++;
			k++;
		}

		Arrays.sort(finalArray);

		int p = 0;

		for (int m = 0; m < finalArray.length - 1; m++) {

			if (finalArray[m] != finalArray[m + 1]) {
				// System.out.println(finalArray[m] + " "+finalArray[m+1]);
				temp[p++] = finalArray[m];
			}
		}

		temp[p++] = finalArray[finalArray.length - 1];

		for (int s = 0; s < temp.length - 1; s++) {

			System.out.println(temp[s]);
		}
	}
}
