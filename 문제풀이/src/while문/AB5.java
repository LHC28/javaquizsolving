package while��;

import java.util.Scanner;

public class AB5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			if(A==0 && B==0) {
				break;
			}else {
				System.out.println(A+B);
			}
		}
	}
}
