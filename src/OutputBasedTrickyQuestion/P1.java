package OutputBasedTrickyQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P1 {
    static void main() {

        int[] a = {1,1,1,1,0,0,1};
        int count=1;
        int maxLen=0;

        ArrayList<Integer> arr = new ArrayList<>();


        for (int i=1;i<a.length;i++){

            if (a[i-1]==a[i]) {
                count++;
            }
            else {
                arr.add(count);
                count =1 ;
            }
        }

        for (int j=0 ; j<arr.size();j++){
            maxLen = Math.max(maxLen,arr.get(j));
        }
        arr.add(count);
        System.out.println(maxLen);

        longestOnesAfterDeletingOne(a);
    }

    public static void longestOnesAfterDeletingOne(int[] arr) {

        int zeroCount = 0; int maxLen = 0 ; int left = 0;
        for(int right=0 ; right< arr.length ; right ++ ) {

            if (arr[right] == 0) {
                zeroCount++;
            }

            while (zeroCount>1) {
                if (arr[left]==0) {
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left);
        }
        System.out.println("max length is = " + maxLen);
    }
}
