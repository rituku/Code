package linkedlist;

public class selfstack {
public static void main(String[] args) throws Exception {
	StackLL nw = new StackLL();
	nw.push(256);
	nw.push(97);
	nw.push(34);
	
	nw.display();
	
	System.out.println(nw.peek());
	System.out.println("****");
	System.out.println(nw.pop());
	System.out.println("***");
	nw.display();
}
}
