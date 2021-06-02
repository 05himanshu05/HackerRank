
public class evaluate {
	
	public static void main(String[] args) {
		int a[] = {1,2,3,4,5};
		int d[] = a;
		int sum =0;
		
		for(int j=0 ; j<3 ; ++j) {
			//System.out.println((a[j]+" "+d[j+1]));
			sum += (a[j]*d[j+1]) + (a[j+1]*d[j]);
			
			System.out.println(sum);
		}
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.deleteCharAt(1);
		System.out.println(sb);
	}
}
