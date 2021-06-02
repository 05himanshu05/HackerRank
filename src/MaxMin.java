import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxMin {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(100);
		list.add(300);
		list.add(200);
		list.add(1000);
		list.add(20);
		list.add(30);

		System.out.println(maxMin(3, list));
	}

	static int maxMin(int k, List<Integer> arr) {

		int arrayUnfairness = Integer.MAX_VALUE;

		int n = arr.size();

		Collections.sort(arr);

		for (int i = 0; i < n - k + 1; i++) {

			if ((arr.get(i + k - 1) - arr.get(i)) < arrayUnfairness) {

				arrayUnfairness = arr.get(i + k - 1) - arr.get(i);
			}
		}

		return arrayUnfairness;
	}
}
