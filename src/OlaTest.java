
public class OlaTest {
	
	public static void main(String[] args) {
		
		String s = "my name is himanshu himanshu is a good boy";
		
		String[] words = s.split(" ");
		
		String[] uniquewords = new String[words.length];
		
		int[] count = new int[words.length];
		
		int foundIndex = 0;
		
		for (String  word : words) {
			
			int j=0;
			
			//System.out.println(word);
			
			for(;j<foundIndex;j++) {
				
				if(uniquewords[j].equalsIgnoreCase(word)) {
					
					count[j]++;
					
					break;
				}
			}
			
			if(j==foundIndex) {
				
				uniquewords[foundIndex] = word;
				count[foundIndex] = 1;
				foundIndex++;
			}
			
			
		}
		
		for(int i=0;i<foundIndex;i++) {
			
			System.out.println(uniquewords[i] + " " + count[i]);
		}
	}
}
