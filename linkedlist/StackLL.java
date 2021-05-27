package linkedlist;

class Node1{
	int data;
	Node1 next;
	public Node1(int data) {		
		this.data = data;
		this.next = null;
	}
	
}
public class StackLL {

	private Node1 head;

	public StackLL() {	
		this.head = null;
	}
	
	public void push(int data) {
		Node1 createnode = new Node1(data);
		createnode.next = this.head;
		this.head = createnode;
	}
	
	public void display() {
		if(this.head == null) {
			System.out.println("stack is empty");
		}
		Node1 temp = this.head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public int peek() throws Exception {
		if(this.head == null) {
			System.out.println("stack is empty");
			throw new Exception();
		}
		return this.head.data;
	}
	
	public int pop() throws Exception{
		if(this.head == null) {
			System.out.println("stack is empty");
			throw new Exception();
		}
		Node1 temp = head;
		this.head = this.head.next;
		return temp.data;
	}
}
