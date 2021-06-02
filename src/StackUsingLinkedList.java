
public class StackUsingLinkedList {

	private static Node head;

	public StackUsingLinkedList() {
		head = null;
	}

	private class Node {
		int data;
		Node next;
	}

	public void push(int value) {

		Node oldHead = head;
		head = new Node();
		if (head == null) {
			System.out.println("Overflow");
		}
		head.data = value;
		head.next = oldHead;
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("Empty");
		}
		
		int value = head.data;
		head = head.next;
		return value;
		
	}
	
	public static void printList() {
		Node temp = head;
		while(temp!=null) {
			System.out.println(temp.data);
			
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		StackUsingLinkedList list = new StackUsingLinkedList();
		
		list.push(11);
		list.push(25);
		list.push(45);
		list.push(35);
		
		printList();
		
		list.pop();
		list.pop();
		System.out.println("-------------------------------------");
		printList();
	}
}
