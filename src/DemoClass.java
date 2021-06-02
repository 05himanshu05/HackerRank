
class Example{
	int width;
	int height;
	int length;
	int volume;
	
	void volume(int height , int lenght , int width) {
		
		volume = height*lenght*width;
	}
}



public class DemoClass {

	public static void main(String[] args) {
		
		Example dm = new Example();
		dm.height = 1;
		dm.length = 5;
 		dm.width = 5;
 		
 		dm.volume(3,2,1);
 		
 		System.out.println(dm.volume);
		
	}

}
