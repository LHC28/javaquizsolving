package 개념확인용;

import java.util.Scanner;

public class 함수만들기 {
	
	public static int getSquared(int x) {
		return x*x;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		return (score1+score2+score3+score4)/4.0;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int squared = getSquared(num);
		System.out.println("5의 제곱은 "+squared+"입니다.");
		*/
		System.out.print("점수를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		
		System.out.println("평균은 "+getAverage(num1,num2,num3,num4));

	}

}
