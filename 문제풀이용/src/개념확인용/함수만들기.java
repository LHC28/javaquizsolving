package ����Ȯ�ο�;

import java.util.Scanner;

public class �Լ������ {
	
	public static int getSquared(int x) {
		return x*x;
	}
	
	public static double getAverage(int score1, int score2, int score3, int score4) {
		return (score1+score2+score3+score4)/4.0;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/*
		System.out.print("�������� ���� ���ڸ� �Է��ϼ��� : ");
		int num = scan.nextInt();
		int squared = getSquared(num);
		System.out.println("5�� ������ "+squared+"�Դϴ�.");
		*/
		System.out.print("������ �Է��ϼ��� : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		int num4 = scan.nextInt();
		
		System.out.println("����� "+getAverage(num1,num2,num3,num4));

	}

}
