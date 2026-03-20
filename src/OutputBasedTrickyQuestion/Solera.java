package OutputBasedTrickyQuestion;

import java.util.stream.Collectors;

public class Solera {
    static void main() {

        int[] a = {1,2,3,4,5,-1,-2,-3,4,5,7,8};
        int j=0 ;
        for (int i=0;i<a.length;i++){
            if (a[i]<0){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }


        for (int i=0 ; i<a.length;i++) {
            System.out.println(a[i]);
        }

        System.out.println("-----------------------------");
        int posLoc = j;
        int negLoc = 0 ;

        while(negLoc<posLoc && a[negLoc]<0 && posLoc<a.length) {

            int temp = a[negLoc];
            a[negLoc] = a[posLoc];
            a[posLoc] = temp;
            posLoc++;
            negLoc= negLoc+2;
        }

        for (int i=0 ; i<a.length;i++) {
            System.out.println(a[i]);
        }


        String s = "himanshu";

        String collect = s.chars().mapToObj(c -> String.valueOf((char) c)).filter(c -> "aeiou".contains(c)).collect(Collectors.joining());
        System.out.println(collect);
    }
}
