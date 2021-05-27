package companywise;

import java.util.Stack;

public class SortStack {
	public static Stack<Integer> sortstack(Stack<Integer> input){
		Stack<Integer> tmprstack = new Stack<Integer>();
		
		
		while (!input.isEmpty()) {
			int temp = input.pop();
			
			while (!tmprstack.isEmpty() && tmprstack.peek() > temp) {
			
				input.push(tmprstack.pop());
			}
			tmprstack.push(temp);			
		}
		
		return tmprstack;
	}
	
	public static void main(String[] args) {
		Stack<Integer> input = new Stack<Integer>();
		input.add(23);
		input.add(44);
		input.add(77);
		input.add(11);
		input.add(32);
		
		Stack<Integer> tmpstack = sortstack(input);
		
		while (!tmpstack.empty()) {
			System.out.print(tmpstack.pop()+" ");
			
		}
	}

}
