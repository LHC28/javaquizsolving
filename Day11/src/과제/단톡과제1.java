package ����;

import java.util.Scanner;

public class �������1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char[] name = {'J','u','n','g','a','h'};
		
		System.out.println("���° ���Ĺ��� ����Ʈ�ұ��? ");
		int num = sc.nextInt();
		num-=1;
		if(num>=0 && num<=5) {
			System.out.println(name[num]);
		}
		else {
			System.out.println("������ ������ϴ�.");
		}
		
	}

}
