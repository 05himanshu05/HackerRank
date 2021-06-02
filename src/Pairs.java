import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Pairs {

	//Given an array of integers and a target value, determine the number of pairs of array 
	//elements that have a difference equal to the target value.
	
	public static void main(String[] args) {
		
		int[] arr = {1,5,3,4,2};
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(2);
		System.out.println(pairs(2, list));
	}
	
	public static int pairs(int k, ArrayList<Integer> list) {
		
		
		int count = 0;
	    HashSet<Integer> set = new HashSet<>();
	    for(int num : list)
	    {
	        set.add(num);
	    }

	    for(int number : list)
	    {	
	    	
	    //	System.out.println(number+k);
	        if(set.contains(number + k))
	        {
	            count++;
	        }
	    }
	    return count;

	    }

}
