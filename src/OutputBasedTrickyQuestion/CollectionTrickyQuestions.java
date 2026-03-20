package OutputBasedTrickyQuestion;

import java.util.*;

class AA {
    int x;
    AA(int x){ this.x = x; }

    public boolean equals(Object o) {
        return o instanceof AA a && a.x == this.x;
    }
}

public class CollectionTrickyQuestions {

    static void main() {

        concurrentModificationException();
        inconsistentComparator();
        hashSetAndEqualWithOutHashCode();

        List<String> list = List.of("A", "B");
        // list.add("C");   list Of method returns immutable list


        Map<String, String> map = new HashMap<>();
        System.out.println(map.put("A", "1"));  // put returns previous value
        System.out.println(map.put("A", "2"));

        hashSetAndMutableObject();
        removeAmbiguity();
        priorityQueue();

    }

    public static void concurrentModificationException(){

        List<Integer> list = new ArrayList<>(List.of(1,2,3,4));
        Iterator<Integer> it = list.iterator();
        // below loop will give error
        /*for (Integer i : list) {
            if (i == 2) {
                list.remove(i);
            }
        }*/

        while (it.hasNext()) {
            if (it.next() == 2) {
                it.remove();
            }
        }
    }

    public static void  inconsistentComparator(){
        Set<String> set = new TreeSet<>((a, b) -> a.length() - b.length());

        set.add("AA");
        set.add("BB");
        set.add("CCC");

        System.out.println(set);   // "AA" and "BB" both length 2 → treated as duplicates.
    }

    public static void  hashSetAndEqualWithOutHashCode(){
        Set<String> set = new TreeSet<>((a, b) -> a.length() - b.length());

        set.add(new AA(10).toString());
        set.add(new AA(10).toString());

        System.out.println(set.size());
    }

    public static void  hashSetAndMutableObject(){
        Set<AA> set = new HashSet<>();
        AA a = new AA(10);
        set.add(a);
        a.x = 20;
        System.out.println(set.contains(a));
    }

    public static void  removeAmbiguity(){
        List<Integer> list = new ArrayList<>(List.of(10,20,30));
        //list.remove(20);
        System.out.println(list);  // emove(20) tries index 20 → IndexOutOfBoundsException (runtime)
    }
    public static void  priorityQueue(){
        Queue<Integer> q = new PriorityQueue<>();
        q.add(5);
        q.add(1);
        q.add(3);
        System.out.println(q);
    }

}
