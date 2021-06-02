public class InsertingNodeSortedDoublyLL {
	
	static int size = 0;
	static Node tail = null;
	static Node head = null;
	
	static void display() {
		
		Node current = head;
		
		if(head==null) {
			System.out.println("List is Empty");
			return ;
		}
		
		while(current!=null) {
			
			System.out.println(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	static void insertNode(int data) {

		Node new_node = new Node(data);

		if (head == null) {

			head = tail = new_node;

			head.prev = null;
			tail.next = null;
		}

		else {
			tail.next = new_node;
			new_node.prev = tail;

			tail = new_node;
			tail.next = null;

		}
		
		size++;
	}
	
	static void addBegning(int data) {
		
		Node new_node = new Node(data);
		
		new_node.next = head;
		head.prev = new_node;
		new_node.prev = null;
		head = new_node;
		
		size++;
	}
	
	static void addInMid(int data) {
		
		Node new_node = new Node(data);
		
		if(head==null) {
			System.out.println("List is empty");
			
			head = tail = new_node;
			
			head.prev = null;
			
			tail.next = null;
			
		}
		
		else {
			
			Node current = head;
			
			int mid = (size%2==0)?(size/2):((size+1)/2-1);
			System.out.println("Size = " + size);
			System.out.println("mid =" +mid);
			for(int i=0 ; i<mid;i++) {
				current = current.next;
			}
			
			System.out.println("current data = "+current.data);
			
			Node temp = current.next;
			//temp.prev = current;
			
			current.next = new_node;
			new_node.prev = current;
			new_node.next = temp;
			temp.prev = new_node; 
			
		}
		
		size++;
	}
	public static void main(String[] args) {
		insertNode(10);
		insertNode(20);
		addBegning(5);
		display();
		addInMid(50);
		System.out.println("Size = " + size);
		System.out.println("------------------------------After in Middle -----------------------------");
		display();
	}
}
