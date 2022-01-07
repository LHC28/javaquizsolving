package if문;

import java.util.Scanner;

public class 시험성적 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if(90<=a && a<=100) {
			System.out.println("A");
		}else if(a>=80 && a<=89) {
			System.out.println("B");
		}else if(a>=70 && a<=79) {
			System.out.println("C");
		}else if(a>=60 && a<=69) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}
}
