package applePractice;

import java.util.Arrays;
import java.util.Map;

public class BD {

    static void main() {
        int[] a= {12,16,31,12,78,12,18};
        int[] b= {35,16,7,9,12,18};

        //getMergedAndSortedArrayWithoutDuplicate(a,b);
        //getCommonElements(a,b);
        //findElementsPresentInOneButNotInSecond(a,b);
        //intersectionTwoArraysUsingTwoPointer(a,b);
        //frequencyOfElements(new int[]{1,1,2,2,3,4,4});
        //firstDuplicateElementInArray(new int[] {1,2,3,4,4,5});
        //firstNonRepeatingElementInArray(new int[] {1,2,3,4,4,5});
        //findPairWithGivenSum(new int[]{1,2,3,4},5);
        //findMissingNumber(new int[] {1,2,3,4,6});
        findDuplicatesUsingMarkingTechnique(new int[] {1, 2, 3, 2, 4, 5, 1});
    }

    public static void getMergedAndSortedArrayWithoutDuplicate(int[] a , int[] b) {
        int[] result = mergeTwoArrays(a, b);
        sortTheArray(result);
        getFinalArrayWithOutDuplicate(result);
    }

    private static void getCommonElements(int[] a , int[] b){
        int[] result = mergeTwoArrays(a, b);
        sortTheArray(result);
        getFinalArrayWithDuplicate(result);
    }

    private static void getFinalArrayWithDuplicate(int[] result) {
        int[] temp = new int[result.length];
        int j=0;
        int k =0;
        for (int i = 0; i< result.length-1; i++) {
            if (result[i]== result[i+1] && temp[k]!=result[i]) {
                temp[j++] = result[i];
                k = j-1;
            }
        }
        getResultantArray(j, temp);
    }

    private static void getFinalArrayWithOutDuplicate(int[] result) {
        int[] temp = new int[result.length];
        int j=0;

        for (int i = 0; i< result.length-1; i++) {
            if (result[i]!= result[i+1]) {
                temp[j++] = result[i];
            }
        }
        getResultantArray(j, temp);
    }

    private static void getResultantArray(int j, int[] temp) {
        int[] c = new int[j];
        for (int k = 0; k< j; k++) {
            c[k] = temp[k];
        }

        for (int i=0 ; i<c.length;i++) {

            System.out.print(" " + c[i]);
        }
    }

    private static void sortTheArray(int[] result) {
        for (int i = 0; i< result.length-1; i++) {
                for(int j = 0; j< result.length-i-1; j++) {
                    if (result[j] > result[j+1]) {
                        int temp = result[j];
                        result[j] = result[j+1];
                        result[j+1] = temp;
                    }
                }
        }
    }

    private static int[] mergeTwoArrays(int[] a, int[] b) {
        int[] result = new int[a.length+ b.length];
        for (int i = 0; i< a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i< b.length; i++) {
            result[a.length+i] = b[i];
        }
        return result;
    }

    public static void findElementsPresentInOneButNotInSecond(int[] a,int[] b){
        int length = (a.length > b.length) ? a.length : b.length;
        int minLen = Math.min(a.length,b.length);
        int[] c = new int[length];
        int k = 0;
        for(int i=0;i<length-1;i++) {
            boolean found = false;
            for (int j=0 ; j<minLen-1;j++ ) {
                if (a[i] == b[j]){
                    found = true;
                }
            }
            if (!found) {
                c[k++] = a[i];
            }
        }
        getResultantArray(k,c);
    }

    public static void intersectionTwoArraysUsingTwoPointer(int[] a , int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int[] c = new int[Math.max(a.length, b.length)];
        int i = 0;
        int j = 0;
        int k =0;
        while (i<a.length && j< b.length) {
            if (a[i] == b[j]) {
                c[k++] = a[i];
                i++;
                j++;
            }
            if (a[i]  > b[j]) {
                j++;
            } else if (a[i] < b[j]) {
                i++;
            }
        }
        getResultantArray(k,c);
    }

    public static void frequencyOfElements(int[] a){
        Arrays.sort(a);
        // {1,2,2,3}
        int i = 0;
        int j =0;
        int k =0;

        int[] c = new int[a.length];
        for (;j<a.length-1;){
            int count = 0;
            while (a[i] == a[j] && j<a.length-1) {
                count++;
                if (j==a.length-2 && a[j]==a[j+1]) {
                    count++;
                }
                j++;
            }
            c[k++] = count;
            i=j;
        }
        if (a.length%2==0) {
            c[k] = 1;
            k++;
        }
        getResultantArray(k,c);
    }

    public static void firstDuplicateElementInArray(int[] a) {
        boolean flag = false;
        int repeatingNumber = 0;
        for (int i =0 ; i<a.length-1 ; i++) {
            for (int j=i+1;j<a.length-1;j++) {
                if (a[i] == a[j]) {
                    flag = true;
                    repeatingNumber = a[j];
                    break;
                }
            }
        }
        System.out.println(flag + " " + repeatingNumber);
    }
    public static void firstNonRepeatingElementInArray(int[] a) {
        boolean flag = false;
        int repeatingNumber = 0;
        for (int i =0 ; i<a.length-1 ; i++) {
           if (!flag){
               for (int j=i+1;j<a.length-1;j++) {
                   if (a[i] != a[j]) {
                       flag = true;
                       repeatingNumber = a[i];
                       break;
                   }
               }
           }
        }
        System.out.println(flag + " " + repeatingNumber);
    }

    public static void findPairWithGivenSum(int[] a , int sum) {
        int[][] c = new int[a.length/2][a.length/2];
        Arrays.sort(a);
        int left = 0;
        int right = a.length-1;
        int i =0 ;

        while (left<a.length-1 && right>0 && right>left) {
            if (a[left] + a[right] == sum) {
                c[i][0] = a[left];
                c[i][1] = a[right];
                i++;
                left++;
                right--;
            }
            if (a[left] + a[right] > sum) {
                right--;
            } else if (a[left] + a[right] < sum) {
                left++;
            }
        }

        for (int l = 0; l< c.length; l++) {
            System.out.print("(" + c[l][0] + "," + c[l][1] + ")");
            System.out.println();
        }
    }

    public static void findMissingNumber(int[] a) {
        Arrays.sort(a);
        for (int i=0; i<a.length-1 ; i++) {
            if (a[i+1]-a[i] != 1) {
                int number = a[i] + 1;
                System.out.println(" missing number is = " + number);
            }
        }
    }

    public static void findDuplicatesUsingMarkingTechnique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]);

            if (arr[index] >= 0) {
                arr[index] = -arr[index];  // mark visited
            } else {
                System.out.print(index + " "); // duplicate
            }
        }
    }
}
