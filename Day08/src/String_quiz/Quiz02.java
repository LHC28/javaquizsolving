package String_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1
//		System.out.print("ID�� �Է��ϼ��� : ");
//		String id = scan.next();
//		
//		System.out.println("Welcome! "+id);
		
//		2
		System.out.print("�ܾ �Է��ϼ��� : ");
		String word = scan.next();
		
		int num = 0;
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i)=='e') {
				num+=1;
			}
		}
		System.out.println("e�� ������ "+num+"�� �Դϴ�.");
		
	}

}
