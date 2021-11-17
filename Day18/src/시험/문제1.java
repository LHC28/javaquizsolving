package 시험;

import java.util.Scanner;

public class 문제1 {

	public static int sum(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("수를 입력하시오 : ");
		int num = scan.nextInt();
		System.out.println("1부터 10까지의 합은 "+sum(num));
		
	}

}
