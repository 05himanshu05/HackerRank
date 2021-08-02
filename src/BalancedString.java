import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedString {

	static boolean areBracketsBalanced(String expr) {
		// Using ArrayDeque is faster than using Stack class
		Deque<Character> stack = new ArrayDeque<Character>();
		//([{}])
		// Traversing the Expression
		for (int i = 0; i < expr.length(); i++) {
			char x = expr.charAt(i);
			System.out.println(x);
			if (x == '(' || x == '[' || x == '{') {
				// Push the element in the stack
				stack.push(x);
				continue;
			}
			// If current character is not opening
			// bracket, then it must be closing. So stack
			// cannot be empty at this point.
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				System.out.println("check = " +check);
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = stack.pop();
				System.out.println("check = " +check);
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = stack.pop();
				System.out.println("check = " +check);
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		// Check Empty Stack
		return (stack.isEmpty());
	}

	public static void main(String[] args) {

		// areBracketsBalanced("([{}])");

		if (areBracketsBalanced("([{}])"))
			System.out.println("Balanced ");
		else
			System.out.println("Not Balanced ");
	}
}
