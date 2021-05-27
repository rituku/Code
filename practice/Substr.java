package practice;

public class Substr {
	public static void substring(String s, String st) {
		char c[] = s.toCharArray();
		char ct[] = st.toCharArray();
		int count = 0;
		
		for (int i = 0; i < c.length; i++) {
			if(c[i] == ct[0]) {
				
				int k = 1;
				while (k < ct.length) {
					if(c[i+k] != ct[k]) {
						break;
					}
					k++;
				}
				if(k > ct.length-1) {
					count++;
				}
			}
		}
		System.out.println("count ="+count);
	}
	public static void main(String[] args) {
        String s="hello ritu rani ritu rani";
        String st = "ritu";
        substring(s,st);
	}
}
