package queue;

public class Runner {

	public static void main(String[] args) {
		Queue q = new Queue();
		q.enqueue(22);
		q.enqueue(44);
		q.enqueue(445);
		q.enqueue(77);
		
		
		q.dequeue();
		q.dequeue();
		
		q.enqueue(66);
		q.enqueue(11);
		
		
		q.show();
	}
}
