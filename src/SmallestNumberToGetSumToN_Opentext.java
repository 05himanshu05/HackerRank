
public class SmallestNumberToGetSumToN_Opentext {

	public static void main(String[] args) {

		System.out.println(solution(15));
	}

	static int getSum(int n) {
		int sum = 0;

		while (n != 0) {

			sum = sum + n % 10;

			n = n / 10;
		}

		return sum;
	}
	
	
	static public int solution(int N) {
        // write your code in Java SE 8
		
		int i=1;
		
		while(1!=0) {
			
			if(getSum(i)==N) {
				
				//System.out.println(i);
				
				break;
			}
			
			i++;
		}
		return i;
		
    }
}
