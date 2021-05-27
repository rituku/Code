package matrix;

class Shift90Right{ 
	static void display(int mat[][]){  
		for(int i=0;i<mat.length;i++){   
			for(int j=0;j<mat[i].length;j++){   
				System.out.print(mat[i][j]+"  ");  
				}   
			System.out.println(); 
			} 
		}
	static int[][] transpose(int[][] ar){  
		for(int i=0;i<ar.length;i++){  
			for(int j=i+1;j<ar[i].length;j++){   
				int temp=ar[i][j];   
				ar[i][j]=ar[j][i];   
				ar[j][i]=temp;   
				}
			}
		return ar; 
		}
	static int[][] rowReverse(int ar[][]){  
		for(int i=0;i<ar.length;i++){  
			for(int j=0;j<ar[i].length/2;j++){    
				if(ar[i][j] != ar[i][ar[i].length-1-j]){    
					int temp=ar[i][j];    
					ar[i][j]=ar[i][ar[i].length-1-j];  
					ar[i][ar[i].length-1-j]=temp;   
					}   
				} 
			} 
		return ar; 

}
	public static void main(String[] args){   
	int ar[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};   
	display(ar);  
	ar=transpose(ar);   
	display(ar);   
	ar=rowReverse(ar);   
	display(ar);  
	} } 
