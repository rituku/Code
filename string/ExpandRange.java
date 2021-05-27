package string;

import java.lang.reflect.Array;

public class ExpandRange {
	
	public static void expand(String s) {
		String[] st = s.split(", ");
		
		for (int i = 0; i < st.length; i++) {
			System.out.println("st="+st[i]);
			int[] arr = new int[st.length];
			if(st[i].contains("-")) {
				
			}
			
			
		}
		
		
	}
	
	public static void main(String[] args) {
		String s = "1-5, 8, 11-14, 18, 20, 26-29"; 
		expand(s);

	}
}
