package applePractice;

public class PalandromeNumber {

    static void main() {
        System.out.println(isPalindrome(-121));

    }

    public static boolean isPalindrome(int x) {
        int originalNo = x;
        if (x<0) return false;
        int reverse = 0;
        while(x!=0) {
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        if (reverse== originalNo) return true;
        return false;
    }
}
