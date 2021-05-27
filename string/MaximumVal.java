package string;

public class MaximumVal {

	static int calcMaxValue(String s) {
		/*int res = str.charAt(0) -'0'; 
	       
        // Start traversing the string 
        for (int i = 1; i < str.length(); i++) 
        { 
            // Check if any of the two numbers 
            // is 0 or 1, If yes then add current 
            // element 
            if (str.charAt(i) == '0' || str.charAt(i) == '1' || 
                res < 2 ) 
                res += (str.charAt(i)-'0'); 
       
            // Else multiply 
            else
                res *= (str.charAt(i)-'0'); 
        } 
       
        // Return maximum value 
        return res; */
		int res = s.charAt(0) -  '0';
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '0' || s.charAt(i) == '1' || res < 2) {
				res = res + (s.charAt(i) - '0');
			}
			else
			{
				res = res * (s.charAt(i) - '0'); 
			}
		}
		
		return res; 
	}
	public static void main(String[] args) {
		String str = "-101891"; 
        System.out.println(calcMaxValue(str));
	}
}
