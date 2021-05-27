package linkedlist;

public class LinkedList {

	private int size;
	private Node start;
	
	public LinkedList() {
		this.size = 0;
		this.start = null;
	}
	
	public boolean isEmpty() {
		if(start == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getListSize() {
		return size;
	}
	
	public void viewList() {
		Node t;
		if(isEmpty()) {
			System.out.println("list is empty");
		}
		else {
			t = start;
			for (int i = 0; i <= size; i++) {
			    System.out.println(" "+t.getData());
			    t = t.getNext();
			}
		}
	}
	
	public void insertAtFirst(int val) {
		Node n;
		n = new Node();
		n.setData(val);
		n.setNext(start);
		size++;
		
	}
	
	public void insertAtLast(int val) {
		Node t, n;
		n = new Node();
		n.setData(val);
		t = start;
		if(t == null) {
			start = n;
		}
		else {
			while(t.getNext() != null) {
				t = t.getNext();
			}
			t.setNext(n);
		}		
	}
	
	public void insertAtPos(int val, int pos) {
		if(pos == 1) {
			insertAtFirst(val);
		}
		else if(pos == size+1) {
			insertAtLast(val);
		}
		else if(pos > 1 && pos <= size) {
			Node n, t;
			n = new Node(val, null);
			t = start;
			
			for (int i = 1; i < pos-1; i++) {
				t = t.getNext();
			}
			n.setNext(t.getNext());
			t.setNext(n);
			size++;
			
		}
		
	}
}
