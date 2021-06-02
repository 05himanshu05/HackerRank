
public class BiigerIsGreater {
	
	// In this probelm we are trying to find out a lexicographical string which is bigger then current string
	public static void main(String[] args) {
	
		String s = "dkhc";
		
		System.out.println(process(s));
	}
	
	 static String process(String str){
        char[] chars = str.toCharArray();
        int i= chars.length-1;
        while(i>0){
        	System.out.println("Chars i-1 = " +chars[i-1] + "  " +"chars of i = " + chars[i]);
            if(chars[i-1]>=chars[i]){
                i--;
            }else{
                int j=i;
                while(j<chars.length&&chars[j]>chars[i-1]){
                    j++;
                }
                char temp = chars[i-1];
                chars[i-1]=chars[j-1];
                chars[j-1]=temp;
                
                char[] newChar = new char[chars.length];
                for(int k=0;k<i;k++){
                    newChar[k]=chars[k];
                }
                int end = chars.length-1;
                for(int k=i;k<chars.length;k++){
       
                    newChar[k]=chars[end--];
                }
                return new String(newChar);
            }
        }
        return "no answer";
    }
    
}
