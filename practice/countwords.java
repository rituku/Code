package practice;

public class countwords {
	public static void countwords(String s) {
		char c[] = s.toCharArray();
		String st = "";
		int k = 1;
		for (int i = 0; i < c.length; i++) {
			if(i < c.length && c[i] != ' ') {
				st = st + c[i];
			}
			else {
				k++;
				st = st + c[i];
			}
		}
		System.out.println(st);
		System.out.println(k);
	}
	
	public static void main(String[] args) {
      String s = "how r u";
      countwords(s); 
	}
}
