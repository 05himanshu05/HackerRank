package applePractice;

public class MoveZerosToEnd {
    static void main() {

        int[] a1 = {0,1,0,3,12};
        int[] a2 = {0,0,1,0,1,0,3,0,12,0};
        int[] a = {2,1};
        int[] a3 = {1};
        moveZeroes(a2);
    }

    public static void moveZeroes(int[] nums) {

        if (nums.length>=2){
            int j = -1;
            for(int i=0 ; i<nums.length;i++) {

                if (nums[i] == 0){
                    j = i;
                    break;
                }
            }
            if (j == -1) return;
            for (int i=j+1;i<nums.length;i++) {
                if (nums[i]!=0){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    j++;
                }
            }
        }
    }
}
