package string;

public class Permutation {
	public static void stringPermutation(String prefix, String st) {
		int len = st.length();
		
		if(len == 0) {
			System.out.println(prefix);
			return;
		}
		for (int i = 0; i < len; i++) {
					
			stringPermutation(prefix+st.charAt(i), st.substring(0, i)+st.substring(i+1, len));
		}
		
	}
	public static void permutation(String s) {
		stringPermutation("", s);
	}
    public static void main(String[] args) {
		String s = "abc";
		permutation(s);
	}
}
