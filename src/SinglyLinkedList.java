import java.util.Arrays;

public class SinglyLinkedList {

	static Node head;

	static void addNode(int data) {

		if (head == null) {

			Node new_node = new Node(data);
			new_node.next = head;
			head = new_node;
		}

		else {

			Node new_node = new Node(data);

			Node current = head;

			while (current.next != null) {
				current = current.next;

			}

			current.next = new_node;
		}
	}

	static void addNodeBeg(int data) {

		Node new_node = new Node(data);

		Node current_head = head;

		new_node.next = current_head;

		head = new_node;
	}

	static void display() {

		Node current = head;

		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		while (current != null) {

			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	
	static Node reverse()
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;  // reverse
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

	public static void main(String[] args) {
		System.out.println("Adding in LL");
		addNode(10);
		addNode(20);
		addNodeBeg(5);
		display();
		System.out.println("Reverse of LL");
		reverse();
		display();
		
	}
}
