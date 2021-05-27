package matrix;

public class anticlock {
	static void printmat(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]+" ");
			}	
			System.out.println();
		}		
	}
	
	static int[][] transpose(int mat[][]){
		for (int i = 0; i < mat.length; i++) {
			for (int j = i+1; j < mat[i].length; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		return mat;
	}
	
	public static int[][] rowreverse(int mat[][]){
		for (int i = 0; i < mat.length/2; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[mat.length - i -1][j];
				mat[mat.length - i -1][j] = temp;
			}			
		}
		return mat;
	}
	
	
	public static void main(String[] args) {
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		printmat(mat);
		transpose(mat);
		System.out.println(); 
		//printmat(mat);
		//System.out.println();
		rowreverse(mat);
		printmat(mat);
	}
}
