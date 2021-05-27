package practice;

public class FindLargest {
	public static void findLargest(int data[]) {
		
		int largest=data[0];
		int notlargest =0;
		for(int i=0;i<data.length;i++) {
			if(i != data.length) {
				if(data[i] > largest) {
					largest = data[i];
				}
			}
			
		}
		System.out.println("largest value ="+largest);
		
	}
	
	public static void main(String[] args) {
		int arraycoll[] = {10,2,5,3,8,6,9};
		findLargest(arraycoll);
	}

}
