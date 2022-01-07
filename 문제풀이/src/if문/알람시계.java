package if문;

import java.util.Scanner;

public class 알람시계 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = b-45;
		if(b-45<0) {
			if(a==0) {
				a=23;
			}else {
				a-=1;
			}
			b+=15;
		}else {
			b-=45;
		}
		System.out.println(a+" "+b);
	}
}
