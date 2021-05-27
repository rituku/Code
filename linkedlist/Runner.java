package linkedlist;

public class Runner {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(123);
		st.push(23);
		st.push(67);
		
		st.show();
		
		System.out.println(st.pop());
		System.out.println("*****");
		st.show();
		System.out.println("***");
		System.out.println(st.peek());
	}
	
}
