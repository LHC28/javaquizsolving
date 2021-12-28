package 반복문1;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("횟수를 입력하세요 : ");
//		int num = scan.nextInt();
//		int i = 0;
//		
//		while(i < num) {
//			System.out.println("화이팅!!!");
//			i++;
//		}
		
//		System.out.print("카운트 다운 수를 입력하세요 : ");
//		int num = scan.nextInt();
//		
//		while(num>=0) {
//			System.out.println(num);
//			if(num==0) {
//				System.out.println("발사");
//			}
//			num--;
//		}
		
		// 구구단 출력
		int i=1;
		while(i<=9) {
			System.out.println("3 * "+i+" = "+(3*i));
			i++;
		}
	}
}
