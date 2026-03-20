package applePractice;

public class ReverseWordInSentence {

    static void main() {
        String s = "I love snowflake test";

        StringBuilder sb = new StringBuilder();

        String[] s1 = s.split(" ");

        for (int i = s1.length-1;i>=0;i--) {
            sb.append(s1[i]+" ");
        }
        System.out.println(sb);
        reverse(s1);
    }

    static void reverse(String[] words){

        int start =0;
        int end = words.length;
        String reverse="";

        while (start<end){
            String temp = words[start];
            words[start] = words[end-1];
            words[end-1] = temp;
            start++;
            end--;
        }

        for (String w:words){
           reverse = reverse + w+" ";
        }
        System.out.println(reverse);
    }
}
