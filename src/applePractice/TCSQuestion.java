package applePractice;

public class TCSQuestion {

    static void main() {

        String s = "cD*aN fG/DK";
        String[] s1 = s.split(" ");
        // output = Na*Dc KD/Gf
        // reverse the string keeping * and / at the same position and space.

        String reversedString = "";

        reversedString = getString(s1, reversedString);

        //System.out.println("reversed string = " + reversedString);
        getStringTwo(s);

    }

    public static String getString(String[] s1, String reversedString) {
        for (int j = 0; j<= s1.length-1; j++) {
            String temp = s1[j];
            for (int i = temp.length()-1; i >=0 ; i--) {
                reversedString = reversedString + temp.charAt(i);
            }
            reversedString = reversedString + " ";
        }
        return reversedString;
    }

    public static void getStringTwo(String s) {

        String input = "cD*aN fG/DK";
        char[] arr = input.toCharArray();
        int n = arr.length;

        String result = "";
        int i = 0;

        while (i < n) {
            int start = i;

            // Find end of the word
            while (i < n && arr[i] != ' ') {
                i++;
            }
            int end = i - 1;

            // Reverse + toggle case manually
            for (int j = end; j >= start; j--) {
                char ch = arr[j];
                if (ch >= 'A' && ch <= 'Z') {
                    result += (char)(ch + 32);   // to lowercase
                } else if (ch >= 'a' && ch <= 'z') {
                    result += (char)(ch - 32);   // to uppercase
                } else {
                    result += ch;               // special chars
                }
            }

            // Add space if not last word
            if (i < n) {
                result += " ";
            }
            i++; // move past space
        }

        System.out.println(result);
    }
}
