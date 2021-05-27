package matrix;

import java.util.Scanner;

public class Formattor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int takedata = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.format("%d x %d = %d%n", takedata, i, i * takedata);
		}
	}
}
