package matrix;

import java.io.IOException;

public class clockwise {
	public static void printMatrix(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(); 
		}
	}
	
	public static int[][] transpose(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				//System.out.print(arr[i][j]+" ");
			}	
		//	System.out.println();
		}	
		return arr;
	}
	
	public static int[][] colreverse(int arr[][]){
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length/2; j++) {
				//if(i>j) {
					int temp = arr[i][j];
					arr[i][j] = arr[i][arr[i].length - 1 -j];
					arr[i][arr[i].length - 1-j] = temp;
				//}
			}			
		}
		return arr;
	}
	
	public static int[][] rowreverse(int arr[][]){
		for (int i = 0; i < arr.length/2; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[arr.length - 1- i][j];
				arr[arr.length - 1 - i][j] = temp;
				
			}
		}
		return arr;
	}
	
	public static void main (String[] args) throws IOException{
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		 printMatrix(arr);
		 arr = transpose(arr);
		// printMatrix(arr);
		// colreverse(arr);
		 System.out.println();
		// printMatrix(arr);
		 rowreverse(arr);
		 System.out.println();
		 printMatrix(arr);
		// System.out.println(arr); 
	
	}

}
