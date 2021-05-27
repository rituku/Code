package linkedlist;

/*class Node{
	int i;
	Node next;
}

class Linked{
	public void printlist(Node node) {
		if(node == null) {
			return;
		}
		
		System.out.print(node.i+" ");
		printlist(node.next);
	}
		
	public Node getNode(int i) {
		Node n = new Node();
		n.i = i;
		n.next = null;
		return n;		
	}
	
	public Node insertAtPosition(int i, int position, Node node) {
		if(position < 1) {
			System.out.println("position is less than 1");
			return node;
		}
		
		if(node == null && position > 1) {
			System.out.println("position is greater than 1 but node is null");
			return node;
		}
		
		if(node == null && position == 1) {
			return getNode(i);
		}
		
		if(position == 1) {
			Node newnode = getNode(i);
			newnode.next = node;
			return newnode;
		}
		
		System.out.println("next node "+node.next);
		node.next = insertAtPosition(i, position - 1,node.next);
		return node;
	}	
	
	public Node insert(int i , Node node) {
		if(node == null)
		{
		return getNode(i);
		}
		else
		{
			node.next = insert(i, node.next);
		}
		
		return node;
	}		
}*/

public class InsertRow {
	public static void main(String[] args) {
	/*	Node root = null;
		Linked a = new Linked();
		
		root = a.insert(12, root);
		root = a.insert(99, root);
		root = a.insert(14, root);
		
		a.printlist(root);
		
		root = a.insertAtPosition(5, 3, root);
		a.printlist(root);*/
		
	}

}
