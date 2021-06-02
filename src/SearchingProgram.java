
public class SearchingProgram {
	
	
	static int binary_search(int[] a, int l , int r , int key) {
		
		if(r>=l) {
			
			int mid = l + (r-l)/2 ;
			System.out.println("mid =" + mid);
			
			if(a[mid] == key) {
				
				return mid;
			}
			
			if(a[mid] > key) {
				
				return binary_search(a, l, mid-1, key);
			}
			
			return binary_search(a, mid+1, r, key);
		}
		
		return -1;
	}
	
	
	
	static void linear_search(int[] a , int key) {
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]==key) {
				
				System.out.println("Element found at position =" +i);
				
				break;
			}
		}
		
	}
	public static void main(String[] args) {
		
		int[] a= {10,20,30,50,70,90};    
        int key = 50;
        
        int n = a.length;
        System.out.println("n = "  + n);
       // linear_search(a, key);
        int result = binary_search(a, 0, n-1, key);
        
        if(result!=-1) {
        	System.out.println("Element Present at position = " + result);
        }
        
        else {
        	System.out.println("Element present");
        }
	}
}
