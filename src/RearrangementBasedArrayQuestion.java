import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RearrangementBasedArrayQuestion {
    static void main() {
        int[] a = {2, 3, -4, -1, 6, -9};
        int[] a1 = {1,0,2, 3,0, -4, 0,7,8,0,5};
        rearrange(a);
    }

    public static void rearrangeArrPosAndNegNumAndMaintainOrder(int[] arr) {

        Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n -> n > 0));
        List<Integer> posList = collect.get(true);
        List<Integer> negList = collect.get(false);
        int[] finalArray = new int[posList.size()+negList.size()];
        int j = 0;
        int k = 0;
        for (int i=0 ; i<finalArray.length;i++){
            if (i%2==0) {
                finalArray[i] = posList.get(j);
                j++;
            }
            else {
                finalArray[i] = negList.get(k);
                k++;
            }
        }

        for (int i: finalArray) {
            System.out.println(i);
        }
    }

    public static void moveNegNumbersToBeginingAndPosToEnd(int[] arr){
        int j = 0;
        for (int i = 0; i<arr.length;i++) {
            if (arr[i]<0) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }

        for (int a: arr) {
            System.out.print(a+" ");
        }
    }

    public static void moveAllZerosToEndWithoutChangingOrder(int[] arr) {
       int j= 0;

       for (int i=j;i<arr.length;i++){
           if (arr[i]!=0){
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] = temp;
               j++;
            }
       }

       for (int a:arr) {
           System.out.print(a+ " ");
       }
    }

    public static void moveAllEvenToOneSideAndOddToOneSide(int[] arr){

        Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect.get(true));

    }

    public static void rearrange(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[n];

        int left = 0;
        int right = n - 1;
        int index = 0;

        // {2, 3, -4, -1, 6, -9};
        // {-9,-4,-1,2,3,6}
        while (left <= right) {
            if (index < n) result[index++] = arr[right--];
            if (index < n) result[index++] = arr[left++];
        }

        for (int a:result){
            System.out.print(a+ " ");
        }
    }
}
