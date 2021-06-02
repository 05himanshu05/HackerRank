
public final class MyStaticClass {

	private static int myStaticMember;

	private MyStaticClass() {
		// TODO Auto-generated constructor stub
		myStaticMember = 1;
	}

	public static void setMyStaticMember(int value) {
		
		myStaticMember = value;
	}

	public static int getMyStaticMember() {

		return myStaticMember;
	}

	public static int squareMyStaticMember() {

		return myStaticMember*myStaticMember;
	}
}
