package array;

public class PositionalElements {
	static int MAX = 100;
	public static int countPositional(int arr[][], int m, int n) {

		int rowmax[] = new int[m]; 
		int rowmin[] = new int[m]; 
		int colmax[] = new int[n]; 
		int colmin[] = new int[n]; 

		for (int i = 0; i < m; i++) {
			int rminn = Integer.MAX_VALUE; 
            int rmaxx = Integer.MIN_VALUE; 
			for (int j = 0; j < n; j++) {
                   if(rminn > arr[i][j]) {
                	   rminn = arr[i][j];
                   }
                   if(rmaxx < arr[i][j]) {
                	   rmaxx = arr[i][j];
                   }
			}	
			rowmax[i] = rmaxx;
		    rowmin[i] = rminn;
		}
		
		for (int i = 0; i < m; i++) {
			int cminn = Integer.MAX_VALUE; 
            int cmaxx = Integer.MIN_VALUE; 
			for (int j = 0; j < n; j++) {
			     if(cminn > arr[j][i]) {
			    	 cminn = arr[j][i];
			     }	
			     if(cmaxx < arr[j][i]) {
			    	 cmaxx = arr[j][i];
			     }
			}
			colmax[i] = cmaxx;
			colmin[i] = cminn;
		}
		int count = 0; 
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if((arr[i][j] == rowmax[i]) || (arr[i][j] == rowmin[i]) || (arr[i][j] == colmax[j]) || (arr[i][j] == colmin[j])) {
					count++;
				}
			}
		}
		 return count; 
		//System.out.println("rminn max value "+rminn+" min value "+rminn);
	}
	public static void main(String[] args) {
		int arr[][] = { { 1, 3, 4 }, { 5, 2, 9 }, { 8, 7, 6 } };
		 System.out.println(countPositional(arr, 3, 3)); 
		//countPositional(arr, 3, 3);
	}
}
