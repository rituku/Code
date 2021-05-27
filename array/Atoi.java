package array;

public class Atoi {

	public static int atoi(String s) {
		int no = 0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
			no = no * 10 + s.charAt(i) - '0';
			}
			else {
				System.out.println("number contains string");
				return 0;
			}
		}
		return no;
	}
	public static void main(String[] args) {
		String s="149880";
		System.out.println(atoi(s));
	}
}
