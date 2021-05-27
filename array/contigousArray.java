package array;

public class contigousArray {
   public static void maxsum(int array[]) {
	  int max_start = array[0];
	  int max_end = 0;
	  int start =0, end = 0, s = 0;
	  for (int i = 0; i < array.length; i++) {
	      max_end = max_end + array[i];
	      if(max_start < max_end) {
	    	  max_start = max_end;
	    	  start = s; end = i;
	      }
	      if(max_end < 0) {
	    	  max_end = 0;
	    	  s = i + 1;
	      }
	}
	  System.out.println("start "+start+" end "+end);
   }
   public static void main(String[] args) {
	int arr[] = {4,-3,-2,2,3,1,-2,-3,4,2,-6,-3,-1,3,1,2};
	maxsum(arr);
}
}
