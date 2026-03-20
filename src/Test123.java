import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test123 {


    // store all the charctaers into a map
    // then iterate over map and check for the value for each chartacter where you found value is not equal to one return that char.
    static void main() {
        String s = "Automation";
        s = s.toLowerCase();
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c:s.toCharArray()) {

            if(!map.containsKey(c)) {
                map.put(c,1);
            }
            else {
                map.put(c,map.get(c)+1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();

        for(Map.Entry<Character,Integer> entry:map.entrySet()) {
            if (entry.getValue()==1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }
}
