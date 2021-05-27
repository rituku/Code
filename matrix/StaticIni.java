package matrix;

import java.util.Scanner;

public class StaticIni {
	private static int b;
	private static int h;
	private static boolean flag;
	
	static {
		Scanner sc = new Scanner(System.in);
		b = sc.nextInt();
		h = sc.nextInt();
		
		if(b < 0 || h < 0) {
			System.out.println("not negative");
			flag = false;
		}
		else {
			flag = true;
		}
		
	} 
	
	public static void main(String[] args) {
		if(flag) {
			System.out.println("area is ="+b*h);
		}
		
	}
}
