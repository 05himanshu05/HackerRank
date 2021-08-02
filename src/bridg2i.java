
public class bridg2i {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4,5, 6, 7, 8};
		int[] b = { 9,10,11,12,13,14,15,16};
		int[] c = new int[a.length + b.length];
		int k = 5;
		int m = 0;
		int i = 0;
		int pos = 0;
		int j = b.length - k;
		int a_length = 0;
		int temp1 = k;
		int temp2 = b.length;
		while (a_length < c.length) {
			if(temp1<a.length) {
			for (; i < temp1;) {
				c[m] = a[i];
				//System.out.println(c[m] + " " + a[i]);
				i++;
				m++;
			}
			}
			temp1 = temp1 + k;
			
			a_length = a_length + k;
			
			if(j>0) {
			for (; j < temp2;) {
				c[m] = b[j];
				//System.out.println(c[m] + " " + b[j]);
				m++;
				j++;
			}
			temp2 = j - k;
			j = temp2 - k;
			a_length = a_length + k;
			
			}
		}
		
		while(i< a.length) {
			c[m] = a[i];
			i++;
			m++;
		}
		
		while(temp2 >0) {
			c[m] = b[pos];
			System.out.println(c[m] + " ");
			pos++;
			m++;
			temp2--;
			
		}
		
		for(int r = 0 ; r<c.length ; r++) {
			
			System.out.print(c[r] + " ");
		}
	}
}
