
class CustomException_One  extends Exception{
	
	String message;
	public CustomException_One (String s) {
		// TODO Auto-generated constructor stub
		
		message = s;
	}
	
	public String toString() {
		return ("Custom exception occured = " + message);
	}
}

public class CustomException {
	
	public static void main(String[] args) {
		
		try {
			throw new CustomException_One("This is a custome exception");
		}
		
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Some exception occured =" + e);
		}
	}
	
	
}



