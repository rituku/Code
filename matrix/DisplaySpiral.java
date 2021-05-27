package matrix;

public class DisplaySpiral {
	public static void printMatrix(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); 
		}
	}
	
	static void spiral(int mat[][]) {
		int n = mat.length;
		for (int i = 0,j=n-1; i < j; i++,j--) {			
			for (int k = i; k <j; k++) {
				System.out.print(mat[i][k]+" ");
			}
			for (int k = i; k < j; k++) {
				System.out.print(mat[k][j]+" ");
				
			}
			for (int k = j; k > i; k--) {
				System.out.print(mat[j][k]+" ");
			}
			for (int k = j; k > i; k--) {
				System.out.print(mat[k][i]+" ");
			}
		}
		if(n%2 == 1) {
			System.out.println(mat[n/2][n/2]);
		}
		
	}
	
	
	public static void main(String[] args) {
		int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
		printMatrix(mat);
		System.out.println();
		spiral(mat);
	}
}
