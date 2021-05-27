package practice;

public class SecondLargest {
	public static void secondLargest(int data[]) {
		int flar =0;
		int slar=0;
		for(int i=0;i<data.length;i++) {
			if(flar<data[i]) {
				slar=flar;
				flar=data[i];
			}
			if(slar<data[i] && flar>data[i]) {
				slar=data[i];
			}
			
		}
		System.out.println("first largest="+flar);
		System.out.println("second largest="+slar);
		
	} 
	public static void main(String[] args) {
		int arraycoll[] = {2,5,3,8,6,9};
		secondLargest(arraycoll);
	}

}
