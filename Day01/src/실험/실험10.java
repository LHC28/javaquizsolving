package ����;

import java.util.Random;
import java.util.Scanner;

public class ����10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int arr[] = {65,66,67};
		int num = ran.nextInt(3);
		int com = arr[num];
		
		while(true) {
			System.out.println(com);
			System.out.println("A,B,C �� ���纸�ÿ�");
			String ans = scan.next();
			char me = ans.charAt(0);
			int me1 = (int)me;
			if(com==me1) {
				System.out.println("�¾ҽ��ϴ�.");
				break;
			}else {
				System.out.println("Ʋ�Ƚ��ϴ�.");
			}
		}
		
	}

}
