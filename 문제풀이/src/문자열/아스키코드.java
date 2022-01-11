package 문자열;

import java.util.Scanner;

public class 아스키코드 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String T = scan.next();
		int a = (int)T.charAt(0);
		System.out.println(a);
	}
}
