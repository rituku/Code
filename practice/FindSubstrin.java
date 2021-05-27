package practice;

public class FindSubstrin {
	public static void substring(String s, String c) {
		char ch[] = s.toCharArray();
		char ct[] = c.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(ch[i] == ct[0]) {
				int j = 1;
				for (; j < ct.length && i+j < ch.length; j++) {
					
					if(ct[j] != ch[i+j]) {
						break;
					}
					
				}
					if(j == ct.length) {
						System.out.println("found substring");
					}
					else {
						System.out.println("not found substring");
					}
				
			}
		}		
	}

	public static void main(String[] args) {
		String s = "hello ritu rani";
		substring(s,"ritu");
	}
}
