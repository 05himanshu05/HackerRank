import java.util.ArrayList;
import java.util.List;

public class JumpingOnClouds {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(0);
		list.add(0);
		list.add(1);
		list.add(0);
		list.add(0);
		//list.add(0);
		
		
		System.out.println("total jumps required = "+jumpingOnClouds(list));
		
	}

	public static int jumpingOnClouds(List<Integer> c) {

		int jumps = 0;
		int start = 0;
		
		
		for (; start < c.size()-1;) {
			System.out.println("start = "+start);
			//System.out.println(c.get(start+2));
			System.out.println("left length =" + (c.size()-1-start>=2));
			if ((c.size()-1-start>=2) && (c.get(start + 2) != 0)) {

				start = start+1;
				System.out.println(start);
				jumps = jumps + 1;
			}

			else {

				start = start+2;
				System.out.println(start);
				jumps = jumps + 1;
			}
		}

		return jumps;
		// Write your code here

	}
}
