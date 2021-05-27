package practice;

public class CountingSort {

	public static void sort(char[] ch) {
		int n = ch.length;
		char b[] = new char[n];		
		int count[] = new int[256];
		
		for (int i = 0; i < 256; ++i) {
			count[i] = 0;
		}
		
		for (int i = 0; i < n; ++i) {
			++count[ch[i]];
		}
		
		for (int i = 1; i <= 255; i++) {
			count[i] += count[i-1];
		}
		
		for (int i = n-1; i >= 0; i--) {
			 b[--count[ch[i]]]  = ch[i];
		}
		
		for (int i = 0; i < n; i++) {
			ch[i] = b[i];
		}
		
	}
	
	public static void main(String[] args) {
		CountingSort ob = new CountingSort();
		char ch[] = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
		for (int i = 0; i < ch.length; i++) {
			  System.out.print(ch[i]+" "); 
		}
		System.out.println();
		ob.sort(ch);
		
		for (int i = 0; i < ch.length; i++) {
			  System.out.print(ch[i]+" "); 
		}
	}
}
