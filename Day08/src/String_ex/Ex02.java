package String_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //����ϰ� �Ǹ� String�� ������ ��������� ����ϰ� ��.
//		���Ͱ��� �����ϰ� �ܾ �������� ������ ���ʹ� �����ִ� ���°� ��. �����ִ� ���ͷ� ���� �ٷ� ����Ǹ鼭 �����ϰ� �Ǵ� ����.
//		�̸� �ذ��ϱ� ���� nextLine()�� ������ִ� ������ ���Ͱ��� ���� �� �ִ�.
		
		String word = scan.next(); //�ܾ�
		System.out.println(word);
		
		scan.nextLine(); //���ʿ��� ���͸� ����������.
		
		String text = scan.nextLine(); //����(�����̽��� ����)
		System.out.println(text);
		
		System.out.println("��");
		
		scan.close();
	}

}
