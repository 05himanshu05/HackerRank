
public class QueueUsingLL {

	QNode front, rear;

	QueueUsingLL() {
		this.front = this.rear = null;
	}

	void enqueque(int data) {
		
		QNode newNode = new QNode(data);
		
		if(this.rear==null) {
			
			this.rear = this.front = newNode;
			
			return;
		}
		
		else {
			
			this.rear.next = newNode;
			this.rear = newNode;
		}
	}
	
	void DQueue() {
		
		if(this.front==null) {
			
			System.out.println("Empty");
		}
		else {
			QNode item = this.front;
			this.front = this.front.next;
		}
	}
	
	public static void main(String[] args) {
		
		QueueUsingLL queue = new QueueUsingLL();
		
		queue.enqueque(10);
		queue.enqueque(20);
		queue.enqueque(30);
		System.out.println("Queue Front : " + queue.front.data);
		System.out.println("Queue Front : " + queue.rear.data);
	}
}
