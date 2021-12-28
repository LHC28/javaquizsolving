package function;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1
//		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
//		int num = scan.nextInt();
//		System.out.println(num+"의 제곱은 "+getSquared(num)+"이다.");
		
//		System.out.print("점수를 입력하세요 : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		
//		2
//		double num = getAverage(score1, score2, score3, score4);
//		System.out.println("평균은 "+num+"이다.");
		
//		3
		System.out.print("숫자와 나눌 수를 입력하세요 : ");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		printQuotientRemainder(number1, number2);
	}
	
	public static int getSquared(int x) {
		return x*x;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		return (score1+score2+score3+score4)/4.00;
	}
	
	public static void printQuotientRemainder(int number1, int number2) {
		int num1 = number1/number2;
		int num2 = number1%number2;
		
		System.out.println("몫 : "+num1);
		System.out.println("나머지 : "+num2);
	}
}
