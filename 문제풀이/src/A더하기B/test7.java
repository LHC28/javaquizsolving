package A¥ı«œ±‚B;

import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		String B = scan.next();
		int a = A*Integer.parseInt(B.substring(2));
		int b = A*Integer.parseInt(B.substring(1,2));
		int c = A*Integer.parseInt(B.substring(0,1));
		int sum = a+b*10+c*100;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(sum);
	}
}
