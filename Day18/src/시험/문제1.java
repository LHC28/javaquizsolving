package ����;

import java.util.Scanner;

public class ����1 {

	public static int sum(int num) {
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �Է��Ͻÿ� : ");
		int num = scan.nextInt();
		System.out.println("1���� 10������ ���� "+sum(num));
		
	}

}
