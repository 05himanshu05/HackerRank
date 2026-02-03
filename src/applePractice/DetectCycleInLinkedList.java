package applePractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class DetectCycleInLinkedList {
    static void main() {

        CustomLinkList list = new CustomLinkList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(10);

        Node head = list.getHead();
        System.out.println(detectCycle(head));
    }

    public static boolean detectCycle(Node head){
        Node fast = head;
        Node slow = head;
        while (fast!=null && fast.next!=null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow==fast) {
                return true;
            }
        }
        return false;
    }
}
