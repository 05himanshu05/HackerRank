package applePractice;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class RemoveDuplicateLetters {
    static void main() {
        String s = "cbacdcbc";
        String s1 = removeDuplicateLettersUsingStack(s);

        System.out.println(s1);

    }

    public static  String removeDuplicateLetters(String s) {
        int n = s.length();
        StringBuilder result = new StringBuilder();
        boolean[] taken = new boolean[26];
        Arrays.fill(taken, false);
        int[] lastIndex = new int[26];
        for (int i=0 ; i<n;i++) {
            char ch = s.charAt(i);
            lastIndex[ch-'a'] = i;
        }
        for(int i=0;i<n ; i++) {
            char ch = s.charAt(i);
            int idx = ch-'a';
            while (!result.isEmpty() && ch < result.charAt(result.length() - 1) && lastIndex[result.charAt(result.length() - 1) - 'a'] > i && !taken[s.charAt(i)-'a']) {
                taken[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }
            if (!taken[s.charAt(i)-'a']){
                result.append(ch);
                taken[idx] = true;
            }

        }
        return result.toString();
    }

    public static  String removeDuplicateLettersUsingStack(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();

        boolean[] taken = new boolean[26];
        int[] lastIndex = new int[26];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            lastIndex[ch - 'a'] = i;
        }

        for (int i = 0; i < n; i++) {
            int idx = s.charAt(i) - 'a';

            if (taken[idx]) continue;

            while (!st.isEmpty() && s.charAt(i) < st.peek() && lastIndex[st.peek() - 'a'] > i) {
                taken[st.pop() - 'a'] = false;
            }

            st.push(s.charAt(i));
            taken[idx] = true;
        }

        StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.append(st.pop());
        }

        return result.reverse().toString();
    }
}