package for문;

import java.util.Scanner;

public class A더하기B마이너스7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0; i<T; i++) {
			int A = scan.nextInt();
			int B = scan.nextInt();
			System.out.println("Case #"+(i+1)+": "+(A+B));
		}
	}
}
