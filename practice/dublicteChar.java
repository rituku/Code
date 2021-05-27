package practice;

public class dublicteChar {
	public static void countchar(String s) {
		char c[] = s.toCharArray();
		int n = c.length;
	
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i+1; j < n; j++) {
				if(c[i] == c[j]) {
					
					int k = j;
					while (k < n-1) {
						c[k] = c[k+1];
						k++;
						
					}
					count++;
					n--;
					j--;
				}
			}
			System.out.println("char is "+c[i]+" count ="+count);
		}
	}
  public static void main(String[] args) {
	String s= "hello ritu rani";
	countchar(s);
}
}
