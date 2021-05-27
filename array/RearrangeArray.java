package array;

public class RearrangeArray {
	public static int[] rearrange(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			
			 if(arr[i] == i) {
				 System.out.print(arr[i]+" ");
			 }
			 else if(arr[i] != i) {
				System.out.print(i+" ");
			 }
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		 int A[] = {-1, -1, 6, 1, 9, 3, 2, -1, 4,-1};
		// int i = 0;
		// System.out.print(A[i++]+" ");
		 rearrange(A);
         //System.out.println(Arrays.toString(fix(A)));
	}

}
