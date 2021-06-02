class Queue {
	int front, rear, size, capacity;
	int[] array;

	public Queue(int capacity) {
		this.capacity = capacity;
		front = 0;
		rear = capacity - 1;
		array = new int[this.capacity];
	}

	boolean isFull(Queue queue) {
		return (queue.size == queue.capacity);
	}

	boolean isEmpty(Queue queue) {

		return (queue.size == 0);
	}

	void enqueue(int item) {
		System.out.println("Front =" + front + "Rear = " + rear + " capacity = " + capacity + "size =" + size);
		if (isFull(this)) {
			System.out.println("Full");
		}
		this.rear = (this.rear + 1) % this.capacity;

		this.array[this.rear] = item;
		this.size = this.size + 1;

		System.out.println(item + " enqueued to queue");
	}

	int dequeue() {

		if (isEmpty(this))
			return Integer.MIN_VALUE;
		int item = this.array[this.front];

		this.front = (this.front + 1) % this.capacity;

		this.size = this.size - 1;

		return item;
	}
}

public class QueueImplementation {

	public static void main(String[] args) {
		Queue queue = new Queue(10);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);

		System.out.println("Queue is dequed = " + queue.dequeue());
		System.out.println("Queue is dequed = " + queue.dequeue());
	}
}
