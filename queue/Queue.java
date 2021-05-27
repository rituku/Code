package queue;

public class Queue {

	int queue[] = new int[5];
	int size;
	int rear;
	int front;
	
	public void enqueue(int data) {
		queue[rear] = data;
		size = size + 1;
		rear = (rear + 1)%5;
	
	}
	
	public int dequeue() {
		int data = queue[front];
		front = (front + 1)%5;
		size = size - 1;
		return data;
	}
	
	public int getsize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean isFull() {
		return size==5;
	}
	
	public void show() {
		System.out.print("Element : ");
		for (int i = 0; i < size; i++) {
			System.out.print(queue[(front + i)%5]+" ");
		}
		System.out.println();
		for (int n : queue) {
			System.out.print(n+" ");
		}
	}
}
