package 반복문1;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		while(true) {
//			System.out.print("수를 입력하세요 : ");
//			int num = scan.nextInt();
//			if(num==0) {
//				System.out.println("끝");
//				break;
//			}
//		}
		
		int i=3;
		int sum = 0;
		
		while(i<=50) {
			if(i%3!=0) {
				i++;
				continue;
			}
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}
