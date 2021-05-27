package matrix;

public class DigonalMax {
	public static void print(int mat[][]){
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");				
			}
			System.out.println();
		}		
	}
	
	public static void maxdiagonal(int arr[][]) {
		int digonalleft = arr[0][0];
		int digonalright = arr[0][arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				
				if(i == j) {
					if(arr[i][j] > digonalleft) {
						digonalleft = arr[i][j];
			    	}
				}
				if(i+j == arr.length-1) {
					if(arr[i][j] > digonalright) {
						digonalright = arr[i][j];
			    	}
				}				
			}
		}	
		System.out.println("digonalleft===="+digonalleft);
		System.out.println("digonalright===="+digonalright);
	}
	
	public static void main(String[] args) {
		int arr[][] = {{111,2,3},{4,90,6},{7,8,55}};
		print(arr);		
		maxdiagonal(arr);
	}
}
