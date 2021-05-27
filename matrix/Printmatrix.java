package matrix;

public class Printmatrix {
	public static void printarr(int arr[][]) {
	
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"");
			}
			System.out.println();
		}
	}
	
	public static int[][] transpose(int arr[][]) {
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
				//System.out.print(arr[i][j]+"");
			}
			//System.out.println();
		}
		return arr;
	}
	
	public static int[][] clockwise(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length/2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][arr[i].length-1-j];
				arr[i][arr[i].length-1-j] = temp;
			}
			
		}
		return arr;
	}
	
	
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		printarr(arr);
		arr = transpose(arr);
		//printarr(arr);
		arr = clockwise(arr);
		printarr(arr);
	}
}
