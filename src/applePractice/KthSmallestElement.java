package applePractice;

import java.util.PriorityQueue;

public class KthSmallestElement {

    static void main() {

        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)-> b-a);

        queue.add(10);
        queue.add(4);
        queue.add(7);
        queue.add(11);
        queue.add(1);

        System.out.println(queue.peek());

    }
}
