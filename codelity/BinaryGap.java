package codelity;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {


	  public static int solution(int N) {
	    String binaryString = Integer.toBinaryString(N);
	   
	    int longestBinaryGap = 0;
	    List<Integer> onesList = new ArrayList<>();
	   
	    for(int i=0; i<binaryString.length(); i++) {
	      if(binaryString.charAt(i) == '0') continue;
	      onesList.add(i);
	    }

	    for(int i=0; i<onesList.size() - 1; i++) {
	      //subtract 1 so that don't count 1's next to each other as having any gap
	      int indicesDiff = onesList.get(i+1) - onesList.get(i) - 1;
	     
	      longestBinaryGap = Math.max(longestBinaryGap, indicesDiff);
	    }
	    return longestBinaryGap;
	  }
	public static void main(String[] args) {
		int s = solution(1041);
		System.out.println(s);
	}
}
