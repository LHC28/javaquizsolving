package function;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1
//		System.out.print("�������� ���� ���ڸ� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		System.out.println(num+"�� ������ "+getSquared(num)+"�̴�.");
		
//		System.out.print("������ �Է��ϼ��� : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		
//		2
//		double num = getAverage(score1, score2, score3, score4);
//		System.out.println("����� "+num+"�̴�.");
		
//		3
		System.out.print("���ڿ� ���� ���� �Է��ϼ��� : ");
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
		
		System.out.println("�� : "+num1);
		System.out.println("������ : "+num2);
	}
}
