package practice;

public class reverseAtSamePlace {
	public static void reverseAtPlace(String s) {
		char c[] = s.toCharArray();
		String st = "";
		for (int i = 0; i < c.length; i++) {
			int k = i;
			while (i <= c.length-1 && c[i] != ' ') {
				i++;				
			}
			int j = i-1;
			while(j >= k) {
				st = st+c[j];
				j--;
			}
			if(i <= c.length-1) {
				st = st+c[i];
			}
		}
		System.out.println(st);
	}
	public static void main(String[] args) {
        String s = "hello ritu rani";
        reverseAtPlace(s);
	}
}
