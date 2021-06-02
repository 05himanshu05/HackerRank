import java.util.ArrayList;
import java.util.Iterator;

public class ArrayUtil {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>(9);

		a.add(1);
		a.add(5);
		a.add(10);
		a.add(12);
		a.add(15);

		a.trimToSize();

		for (Integer number : a) {

			System.out.println("Number " + number);
		}
	}
}
