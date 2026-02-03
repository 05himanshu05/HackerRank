package applePractice;


public class AddTwoNumbers {
    static void main() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

        ListNode listNode = addTwoNumbers(l1, l2);

        while (listNode != null) {
            System.out.print(listNode.val + " -> ");
            listNode = listNode.next;
        }
    }

    public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode l3 = new ListNode(0);
        int carry = 0;
        int value = 0;
        ListNode head = l3;
        while (l1!=null && l2!=null) {

            value = l1.val + l2.val + carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;

            l1 = l1.next;
            l2 = l2.next;
        }
            while (l1!=null) {
                value = l1.val+ carry;
                carry = value/10;
                l3.next = new ListNode(value%10);
                l3 = l3.next;
                l1 = l1.next;
            }

        while (l2!=null) {
            value = l2.val+ carry;
            carry = value/10;
            l3.next = new ListNode(value%10);
            l3 = l3.next;
            l2 = l2.next;
        }
        if (carry!=0) {
            l3.next = new ListNode(carry);
        }
        return head.next;
    }
}

