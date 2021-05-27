package array;

public class countPairOfSum {

	public static int[] sort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] =temp;
				}
			}
		}
		return arr;
	}
	
	public static void printpair(int[] array, int gs) {
	
			int l = 0;
			int r = array.length-1;
			int count = 0;
			while(l < r) {
				if((array[l] + array[r]) > gs) {
					r--;
				}
				else if((array[l]+array[r]) < gs) {
					l++;
				}
				else {
					count++;
					System.out.println("pair is "+array[l]+"and"+array[r]);
					l++;
				}
			}	
			System.out.println("total pair ="+count);
	}
	
	public static void main(String[] args) {
		int pair[] = {3, 4, 5, 2};
		int GS = 6;
		for (int i = 0; i < pair.length; i++) {
			System.out.print(pair[i]+" ");
		}
		System.out.println();
		int array[] =  sort(pair);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		printpair(array, GS);		
	}	
}
