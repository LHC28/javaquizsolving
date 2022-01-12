package 문자열;

import java.util.Scanner;

public class 문자열반복 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();

		for(int i=0; i<T; i++) {
			int count = scan.nextInt();
			String S = scan.next();
			for(int j=0; j<S.length(); j++) {
				for(int k=0; k<count; k++) {
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
