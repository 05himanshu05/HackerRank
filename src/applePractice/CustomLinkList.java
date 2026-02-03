package applePractice;

public class CustomLinkList {

    private Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head==null) {
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public Node getHead() {
        return head;
    }
}
