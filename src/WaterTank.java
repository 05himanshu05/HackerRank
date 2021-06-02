import java.util.HashMap;

public class WaterTank {

	private String brand;
	private boolean empty;
	public static void main(String[] args) {
		WaterTank wb = new WaterTank();

		//System.out.println("Empty " + wb.empty);
		//System.out.println("Brand " + wb.brand);
		
		HashMap<String	, Integer> map = new HashMap<>();
		
		map.put("A", new Integer(1));
		map.put("B", new Integer(2));
		map.put("C", new Integer(3));
		
		System.out.println(map);
	}
}
