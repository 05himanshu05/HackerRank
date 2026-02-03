package applePractice;

import java.util.HashMap;

public class LongestSubArrayWithoutRepeatingChar {

    static void main() {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        longestSubstringWithoutRepeatingChar(s);
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56};
        int target = 9;
        System.out.println(binarySearch(arr,target));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        int start = 0;
        int n = s.length();
        int maxLen = 0;

        for (int end =0 ; end<n;end++) {
            if (map.containsKey(s.charAt(end))) {

                start = Math.max(start,map.get(s.charAt(end)) + 1);
            }
            maxLen = Math.max(maxLen,end-start+1);
            map.put(s.charAt(end),end);

        }
        return maxLen;
    }

    public static String longestSubstringWithoutRepeatingChar(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start = 0;
        int n = s.length();
        int end =0;

        for (; end<n;end++) {
            if (map.containsKey(s.charAt(end))) {

                start = Math.max(start,map.get(s.charAt(end)) + 1);
            }
            //maxLen = Math.max(maxLen,end-start+1);
            map.put(s.charAt(end),end);

        }
        String substring = s.substring(start,end);
        System.out.println(substring);
        return s.substring(start,end);
    }

    public static int binarySearch(int[] arr,int target) {

        int left =0, right=arr.length-1;
        while (left<=right) {
            int mid = left + ((right-left)/2);
            if (arr[mid]==target){
                return mid;
            }
            if (arr[mid]>target){
                right = mid-1;
            }
            if (arr[mid]<target){
                left = mid+1;
            }
        }
        return -1;
    }
}
