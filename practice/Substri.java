package practice;

public class Substri {
	public static void substr(String s, String st) {
		char c[] = s.toCharArray();
		char ch[] = st.toCharArray();
		int count = 0;
		String sr = "";
		
		for (int i = 0; i < c.length; i++) {
			if(c[i] == ch[0]) {
				sr = sr + c[i];
				int k = 1;
				while (k < ch.length) {
					if(c[i+k] != ch[k]) {
						break;
					}
					sr = sr + ch[k];
					k++;
				}
				if(k > ch.length -1) {
					count++; 
				}
			}
		}
		System.out.println("count ="+count);
		System.out.println("substring ="+sr);
	}
	
	public static void main(String[] args) {
		String s = "hello world hello";
		String st = "hello";
		substr(s, st);
	}

}
