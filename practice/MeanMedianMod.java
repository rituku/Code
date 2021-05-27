package practice;

public class MeanMedianMod {
	public static void mean(int array[]) {
		int sum = 0;
		for (int i : array) {
			sum = sum + i;
		}
		System.out.println("mean is ="+sum);
	}

	public static void median(int array[]) {
		System.out.println("array.length % 2 is "+array.length % 2);
		if(array.length % 2 == 0) {
			int a=array[array.length/2];
			int b= array[array.length/2 - 1];
			
			System.out.println("median for even is ="+(a+b)/2.0);
			
		}
		else if(array.length % 2 != 0) {
			System.out.println("median for odd is ="+array[array.length/2]);
		}
	}
	
	public static void mode(int array[]) {
		int n = array.length;
		int max = 0;
		int value = 0;
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = i+1; j < n; j++) {
				if(array[i] == array[j]) {
					int k = j;
					while (k < n-1 ) {
						array[k] = array[k+1];
						k++;
					}
					count++; 
					n--;
					j--;
				}
			}
			if(max < count) {
				max = count;
				value = array[i];
			}
			
		}
		System.out.println("count of "+value+" is "+max);
	}
	public static void main(String[] args) {
		int arr[] = {1,2,37,22,4,5,1,2,5,5,5,5,5,5};
		mean(arr);
	    median(arr);
		mode(arr);
	}
}
