package practice;

public class CountDublicateChar {
	public static void countChar(String s) {
		char c[] = s.toCharArray();
		int n = c.length;
		int count = 1;
		for (int i = 0; i < n; i++) {
			count = 1;
			for (int j = i+1; j < n; j++) {
				if(c[i] == c[j]) {
					int k = j;
					while(k < n-1) {
						c[k] = c[k+1];
						k++;
					}
					count++;
					n--;
					j--;
				}
			}
			System.out.println("char ="+c[i]+" count is "+count);
		}
	}
	public static void main(String[] args) {
         String s= "this is ritu rani";
         countChar(s);
	}
}
