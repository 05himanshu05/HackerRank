package applePractice;

import java.util.HashSet;

public class LongestPalandromicString {


    static void main() {
        String s = "cbbd";
        String s1 = longestPalandromic(s);
        System.out.println(s1);
    }

    public static String longestPalandromic(String s) {
        String result = "";
        int n = s.length();
        int resLen = 0;
        if (s.length()%2==0){
            for (int i=0;i<n;i++) {
                int l = i;
                int r = i+1;
                while (l>=0 && r<n && s.charAt(l)==s.charAt(r)) {
                    if (r-l+1 >= resLen) {
                        result = s.substring(l,r+1);
                        resLen = r-l+1;
                    }
                    l--;
                    r++;
                }
            }
        }
        else {
            for (int i=0;i<n;i++) {
                int l = i;
                int r = i;
                while (l>=0 && r<n && s.charAt(l)==s.charAt(r)) {
                    if (r-l+1 >= resLen) {
                        result = s.substring(l,r+1);
                        resLen = r-l+1;
                    }
                    l--;
                    r++;
                }
            }
        }
        return  result;
    }
}
