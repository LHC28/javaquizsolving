package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
//		���� ������ 90�� �̻��̸� 'A'�����̰� ������ 4.0 �Դϴ�.
//		���� ������ 80�� �̻��̸� 'B'�����̰� ������ 3.0 �Դϴ�.
		double a = 4.0;
		double b = 3.0;
		System.out.println("���� ������ 90�� �̻��̸� 'A'�����̰� ������ "+a+"�Դϴ�.");
		System.out.println("���� ������ 90�� �̻��̸� 'B'�����̰� ������ "+b+"�Դϴ�.");
		
//		�Ʒ� ������ �Ǽ��� ���ؼ� ����ϼ���
		int number1 = 33;
		double number2 = 35.325;
		double sum = number1*number2;
		System.out.println("�� ���� �� : "+sum);
		
//		3. ��¥ ���ϱ�
//		943 �ð��� ���� ��ð� ���� ���Ͽ� ����ϼ���.
//		��� ����
//		943�ð��� 39�� 7�ð� �Դϴ�.
		
		int day = 943/24;
		int hour = (943%24);
		
		System.out.println("943�ð��� "+day+"�� "+hour+"�ð��Դϴ�.");
		
//		4. ���� ���� ���ϱ�
//		���� ���� 8, ���� ���� 9�� �簢���� �ﰢ���� ���̸� ���� ���Ͽ� ����ϼ���.
//		���̴� ���� ������� ����, ��ǻ�Ϳ��� �纸�ϼ���.

//		��� ����
//		�簢���� ����: 72
//		�ﰢ���� ����: 36
		int garo = 8;
		int sero = 9;
		int tri = (garo*sero)/2;
		int rec = garo*sero;
		System.out.println("�簢���� ���� : "+rec);
		System.out.println("�ﰢ���� ���� : "+tri);
		
	}

}