package companywise;

public class LinkedList {
	
	static Node head1, head2;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}

	int getNode() {
		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;
		
		if(c1 > c2) {
			d = c1 - c2;
			return getIntersectionNode(d, head1, head2);
		}
		else {
			d = c2 - c1;
			return getIntersectionNode(d, head2, head1);
		}
		
	}
	
	int getIntersectionNode(int d, Node node1, Node node2) {
		
		for (int i = 0; i < d; i++) {
			if(node1 == null) {
				return -1;
			}
			node1 = node1.next; 
		}
		
		while (node1 != null || node2 != null) {
			if(node1.data == node2.data) {
				return node1.data;
			}
			node1 = node1.next;
			node2 = node2.next;
		}
		
		return -1;
	}
	
	int getCount(Node node) {
		Node current = node;
		int count = 0;
		
		while(current != null) {
			count++; 
			current = current.next;
		}
		
		return count;
	}
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.head1 = new Node(3);
		list.head1.next = new Node(6); 
        list.head1.next.next = new Node(9); 
        list.head1.next.next.next = new Node(15); 
        list.head1.next.next.next.next = new Node(30); 
  
        // creating second linked list 
        list.head2 = new Node(10); 
        list.head2.next = new Node(15); 
        list.head2.next.next = new Node(30); 
  
        System.out.println("The node of intersection is " + list.getNode()); 
    
	}
}
