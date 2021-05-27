package practice;

public class firstCapLetter {
	public static void firstcap(String s) {
		char c[] = s.toCharArray();
		String st = "";
		for (int i = 0; i < c.length; i++) {
			if((i == 0 && c[i] != ' ') || (c[i] != ' ' && c[i-1] == ' ')) {
				if(c[i] >= 'a' && c[i] <= 'z') {
					c[i] = (char)(c[i] - 32);
				}
			}
			else if(c[i] >= 'A' && c[i] <= 'Z') {
				  c[i] = (char)(c[i] + 32);
			}
			st = st + c[i];
		}
		System.out.println(st);
	}
   public static void main(String[] args) {
	String s= "hello riTu rani";
	firstcap(s);
}
}
