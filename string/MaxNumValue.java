package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MaxNumValue {
	
		static int extractMaximum(String str) 
	    {
			String s="\\d+";
			Pattern p = Pattern.compile(s);
			Matcher m = p.matcher(str);
			int Max = 0;
			
			while(m.find()) {
				int num = Integer.parseInt(m.group());
				if(num > Max) {
					Max = num;
				}
			}
			
			return Max;			
	    }
	
	public static void main(String[] args) {
		 String str = "100klh564abc365bg"; 
  	     System.out.println(extractMaximum(str));	
	}
}
