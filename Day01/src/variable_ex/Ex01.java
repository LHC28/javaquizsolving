package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		//������ ����(Integer)
		int number = 10; // �� ó�� ������ ���� �ִ� �� : '�ʱ�ȭ' initialize, ������ ���� �ִ� �� : �Ҵ��Ѵ�. assign
		System.out.println(number);
		
		number = 5; //�����̹Ƿ� ���� ������ �� �ִ�. ������ ���� �ڷ����� ����
		System.out.println(number);
		
		int number2 = 100;
		int sum = number+number2;
		System.out.println(sum);
		
		//�Ǽ��� ����(float) : ���� �� ��. ������ ���� �� �ִ�. ������ �߿����� �ʰ� �޸𸮸� �Ʋ��� �ϴ� ��쿡 ���
		float f = 1.5f;
		System.out.println(f);
		
		//�Ǽ��� ����(double)
		double d = 3.88888888888888888;
		System.out.println(d);
		
		//���� ����(charactor) : ���� �� ��. ���� ����ǥ�� ���Ѵ�.
		char c = 'z';
		System.out.println(c);
		
		//boolean ���� : ��(true) �Ǵ� ����(false)
		boolean isReal = true; //camel case(��Ÿ)  - java      is_real : snake case(��) - ���̽�
		boolean isFalse = false;
		System.out.println("�� : "+ isReal);
		System.out.println("���� : "+isFalse);
		
		
	}

}
