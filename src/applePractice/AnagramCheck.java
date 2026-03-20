package applePractice;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AnagramCheck {

    static void main() {
        String s = "Him an shu123||!!";
        String s1 = "Himanshu12";

        boolean b = checkAnagram(s, s1);

        System.out.println(b);

        // To check if two strings are anagrams (same characters, same frequency, different order)

        s1.chars().mapToObj(c->String.valueOf((char)c)).filter(c-> "aeiou".contains(c)).collect(Collectors.joining());

        System.out.println(s1.chars().mapToObj(c->String.valueOf((char)c)).filter(c-> "aeiou".contains(c)).collect(Collectors.joining()));

        System.out.println(s1.chars().mapToObj(c->String.valueOf((char)c)).filter(c->!"aeiou".contains(c)).collect(Collectors.joining()));

        System.out.println(s1.chars().mapToObj(c->String.valueOf((char)c)).filter(c->!"aeiou".contains(c)).count());
        System.out.println(s1.chars().mapToObj(c->String.valueOf((char)c)).filter(c->"aeiou".contains(c)).count());
    }

    public static boolean checkAnagram(String s1 , String s2){
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if(s1==null || s2==null) return false;
        //if (s1.length()!=s2.length()) return  false;

        int[] count = new int[26];
        s1=s1.replaceAll("\\s", "").toLowerCase();
        s2=s2.replaceAll("\\s", "").toLowerCase();
        for (int i =0 ; i<s1.length();i++) {
            if (Character.isLetter(s1.charAt(i))){
                count[s1.charAt(i)-'a']++;
            }
        }

        for (int i =0 ; i<s2.length();i++) {
            if (Character.isLetter(s2.charAt(i))) {
                count[s2.charAt(i)-'a']--;
            }
        }

        for (int c:count){
                if (c!=0) return  false;
        }
        return true;
    }
}
