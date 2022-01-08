package while¹®;

import java.util.Scanner;

public class AB_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println(A+B);
		}
	}
}
