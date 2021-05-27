package string;

public class SwapFirstAndLastCharaterOfWord {
	public static String swapString(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			
			int k = i;
			while(i < ch.length && ch[i] != ' ') {
				i++;
			}
			
			char temp = ch[k];
			ch[k] = ch[i-1];
			ch[i-1] = temp;
		}
		return new String(ch);
	}
	
	
	public static void main(String[] args) {
		String s= "geeks for geeks";
		String st=swapString(s);
		System.out.println(st);
	}
}
