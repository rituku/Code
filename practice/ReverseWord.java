package practice;

public class ReverseWord {
	public static void reverseWord(String s) {
		char c[] = s.toCharArray();
		String st = "";
		for (int i = c.length-1; i >= 0; i--) {
			int k = i;
			while (i >= 0 && c[i] != ' ') {
				i--;
			}
			int j = i+1;
			while (j <= k) {
				st = st + c[j];
				j++;
			}
			if(i >= 0) {
				st = st+c[i];
			}
			
		}
		System.out.println(st);
	}

	public static void main(String[] args) {
		String s= "hello ritu rani";
		reverseWord(s);
	}
}
