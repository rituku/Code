package string;

public class findMaxMinword {
	static String minWord = "", maxWord = ""; 
	  
    static void minMaxLengthWords(String input)  
    { 
        // minWord and maxWord are received by reference  
        // and not by value 
        // will be used to store and return output 
        int len = input.length(); 
        int si = 0, ei = 0; 
        int min_length = len, min_start_index = 0, 
              max_length = 0, max_start_index = 0; 
  
       while(ei < len) {
    	   
    	   if(ei < len && input.charAt(ei) != ' ') {
    		   ei++;
    	   }
    	   else 
    	   {
    		   int cur_len = ei-si;
    		   if(cur_len < min_length) {
    			   min_length = cur_len;
    			   min_start_index = si;
    		   }
    		   if(cur_len > max_length) {
    			   max_length = cur_len;
    			   max_start_index = si;
    		   }
    		   ei++;
    		   si = ei;
    		   
    	   }
       }
           
        // store minimum and maximum length words 
        minWord = input.substring(min_start_index, min_start_index + min_length); 
        maxWord = input.substring(max_start_index, max_length); 
    } 
	public static void main(String[] args) {
		String a = "GeeksforGeeks A Computer Science portal for Geeks"; 
		  
        minMaxLengthWords(a); 
  
        // to take input in string use getline(cin, a); 
        System.out.print("Minimum length word: "+ minWord + "\nMaximum length word: "+ maxWord); 
	}
}
