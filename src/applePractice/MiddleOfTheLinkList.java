package applePractice;

import java.util.LinkedList;

public class MiddleOfTheLinkList {
    static void main() {

        CustomLinkList list = new CustomLinkList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.getHead();

        Node node = middleOfLinkOfList(list.getHead());
        System.out.println(node.data);
    }

    public static Node middleOfLinkOfList(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast!=null && fast.next!=null) {

            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
