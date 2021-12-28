package 반복문1;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 합구하기
//		System.out.print("수를 입력하세요 : ");
//		int num = scan.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=num) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
		// 팩토리얼
		System.out.print("수를 입력하세요 : ");
		int num = scan.nextInt();
		int i = 1;
		int sum = 1;
		if(num>10) {
			System.out.println("다시 입력하세요.");
		}else {
			while(i<=num) {
				sum*=i;
				i++;
			}
			System.out.println(sum);
		}
	}
}
