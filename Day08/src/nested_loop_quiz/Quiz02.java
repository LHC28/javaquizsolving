package nested_loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("ũ�⸦ �Է��ϼ��� : ");
		int row = scan.nextInt();
		
		for(int i=1; i<=row; i++) {
			int num = i;
			for(int j=0; j<i; j++) {
				System.out.print(num+" "); // ù��° ���� i(num)���� �״�� ����Ѵ�.
				num = num + (row - 1 - j); // �� ���� ���� ���� row-1 ���� ������ �����ϰ�, �� ���� ���� ��� �߰��ɼ��� -1�� �����ؾ��ϹǷ�
//				1�� �����ϰ� �ִ� j�� ����.
				
			}
			System.out.println( ); //�� �ٲ� �� �ٹٲ�
			
		}
		
	}

}
