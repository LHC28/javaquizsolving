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
		System.out.println("�� : "+share);
		System.out.println("������ : "+remainder);
	}
	
	public static void oddEven(int num) {
		if(num%2==0) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
	}
	
	public static boolean isEvenNumber(int number) {
		
		
		return number%2==0? true : false; //���� ���ǹ� - Ȯ���غ���
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
//		1
//		System.out.print("�������� ���� ���ڸ� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		
//		int squ = getSquard(num);
//		System.out.println(num+"�� ������ "+squ+"�̴�.");
		
//		2
//		System.out.print("������ �Է��ϼ��� : ");
//		int score1 = scan.nextInt();
//		int score2 = scan.nextInt();
//		int score3 = scan.nextInt();
//		int score4 = scan.nextInt();
//		
//		double average = getAverage(score1, score2, score3, score4);
//		System.out.println("����� "+average);
		
//		3
//		System.out.print("���ڿ� ���� ���� �Է��ϼ��� : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		printQuotientRemainder(num1, num2);
		
//		4
		System.out.print("������ �Է��ϼ��� : ");
		int num = scan.nextInt();
		oddEven(num);
		
	}

}
