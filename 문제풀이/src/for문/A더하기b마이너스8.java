package for��;

import java.util.Scanner;

public class A���ϱ�b���̳ʽ�8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0; i<T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			int C = A+B;
			System.out.println("Case #"+(i+1)+": "+A+" + "+B +" = "+ C);
		}
	}
}
