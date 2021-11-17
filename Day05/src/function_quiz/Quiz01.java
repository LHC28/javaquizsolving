package function_quiz;

import java.util.Scanner;

public class Quiz01 {
	
	public static int getSquard(int x) {
		return x*x;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		double average = (score1+score2+score3+score4)/4.0;
		return average;
	}
	
	public static void printQuotientRemainder(int number1, int number2) {
		int share = number1/number2;
		int remainder = number1%number2;
		System.out.println("몫 : "+share);
		System.out.println("나머지 : "+remainder);
	}
	
	public static void oddEven(int num) {
		if(num%2==0) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}
	
	public static boolean isEvenNumber(int number) {
		
		
		return number%2==0? true : false; //삼항 조건문 - 확인해보기
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		1
//		System.out.print("제곱값을 구할 숫자를 입력하세요 : ");
//		int num = scan.nextInt();
//		
//		int squ = getSquard(num);
//		System.out.println(num+"의 제곱은 "+squ+"이다.");
		
//		2
//		System.out.print("정수를 입력하세요 : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		
//		double average = getAverage(score1, score2, score3, score4);
//		System.out.println("평균은 "+average);
		
//		3
//		System.out.print("숫자와 나눌 수를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		printQuotientRemainder(num1, num2);
		
//		4
		System.out.print("정수를 입력하세요 : ");
		int num = scan.nextInt();
		oddEven(num);
		
	}

}
