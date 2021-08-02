import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ClouderaTest {

	public static String maxRunOfTest(String[] nums) {

		HashMap<String, Integer> map = new HashMap<>();

		String[] nums1 = { "T2", "T2", "T1", "T1", "T1", "T2", "T2" };

		for (String num : nums) {

			if (map.containsKey(num)) {
				map.put(num, map.get(num) + 1);
			}

			else {
				map.put(num, 1);
			}
		}

		int max = 0;
		String testCaseName = "";

		for (Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() > max) {

				max = entry.getValue();
				testCaseName = entry.getKey();
			}
		}

		if (max > nums.length / 2) {

			System.out.println(testCaseName);
		}

		else {
			System.out.println("No max");
		}

		return testCaseName;
	}

	public static int moves(List<Integer> arr) {


		int i = 0;
		int j = arr.size() - 1;

		int count = 0;
		while (i < j) {

			if (arr.get(i) % 2 != 0 && arr.get(j) % 2 == 0) {

				int temp = arr.get(i);

				Collections.swap(arr, i, j);

				count++;
			}

			i++;
			j--;
		}


		return count;
		// Write your code here

	}

	
	public static void maxRunOfTestOptimized(String[] nums) {
		//{"T2","T2","T1","T1","T1","T2","T2","T3","T3","T3","T3","T3"};
		String result = nums[0];
		int count = 1;
		String currentresult="";
		
		for(int i=1;i<nums.length;i++ ) {
			currentresult = nums[i];
			//System.out.println(result + " " + currentresult);
			//System.out.println("count = " + count);
			if(currentresult == result) {
				
				count++;
			}
			
			else {
				
				if(count>0) {
					count--;
				}
				
				if(count <= 0) {
					
					result = currentresult;
					
				}
			}
		}
		
		System.out.println(" Result  = " + result);
	}
	public static void main(String[] args) {

		List<Integer> arr = new ArrayList<>();

		// arr = [13, 10, 21, 20]
		String[] nums1 = {"T2","T2","T1","T1","T1","T2","T2","T3","T3","T3","T3","T3"};

		arr.add(4);
		arr.add(13);
		arr.add(10);
		arr.add(21);
		arr.add(20);

		//System.out.println(moves(arr));
		
		maxRunOfTestOptimized(nums1);
	}
}
