package nested_loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1.�𷡽ð�
		
		//(1) ���� ������ ������.
		//(2) ���� �����ϴ� ��Ҹ� �и��Ѵ�.
		//    2-1. - �� ����ϴ� ��Ģ�� ã�´�. => �ﰢ��
		//    2-2. *+�� ����ϴ� ��Ģ�� ã�´�. => row / 2 �򿡼����� �ึ�� �ϳ��� ����
		//    2-3. *�� ����ϴ� ��Ģ�� ã�´�. => ������ �ϳ��� ���
		//    2-4. -�� ����ϴ� ��Ģ�� ã�´�. => �ﰢ��(2-1�� ����)
		Scanner scan = new Scanner(System.in);
		System.out.println("ũ�⸦ �Է��ϼ��� : ");
		int row = scan.nextInt();
		
		for(int i=0; i<=row/2; i++) { //��� �� ����
			//2-1. - ���
			for(int j=0; j<i; j++) {
				System.out.print("-");
			}
			//2-2 *+ ���
			for(int j=0; j<(row/2)-i; j++) {
				System.out.print("*+");
			}
			
			//2-3. * ���
			System.out.print("*");
			
			//2-4
			for(int j=0; j<i; j++) {
				System.out.print("-");
			}
			
			
			System.out.println(); //�ٹٲ�
		}

	}

}
