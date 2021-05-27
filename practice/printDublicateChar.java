package practice;

public class printDublicateChar {
	public static void nonrepatedchar(String data) {
		char ch[]= data.toCharArray();
		int n=ch.length;
		for(int i=0;i<n;i++) {
			for(int j = i+1; j<n;j++) {
				
			}
		}
	}
	public static void findDublicate(String data) {
		char ch[]= data.toCharArray();
		int n=ch.length;
		for(int i=0;i<n;i++) {
			int count = 1;
			for(int j = i+1; j<n;j++) {
				
				if(ch[i]==ch[j]) {
					count++;
					int k=j;
					while(k<n-1) {
						ch[k]=ch[k+1];
						k++;
					}
					n--;
					j--;
					
					//System.out.println("found dublicate "+ch[i]+" at index "+j);
				}
			}
			if(count>=2) {
				System.out.println("count of "+ch[i]+"->"+count);
			}
			else {
				System.out.println("nonrepeated "+ch[i]);
			}
		}
		
	}
	public static void main(String[] args) {
		String data = "rituranirani";
		findDublicate(data);
		nonrepatedchar(data);
	}

}
