package function_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		//Method ����ϱ�
		
		// �ݿø�
		double d = 3.68;
		
		//long�� int���� �� ū �ڷ����� �ִ�
		long roundNumber = Math.round(d);
		System.out.println(roundNumber);
		
		System.out.println(Math.round(d));
		
		//ū �� ���ϱ�
		int max = Math.max(10, 90);
		System.out.println(max);
		System.out.println(Math.max(10, 90));
		
		//���밪 ���ϱ�
		double abs = Math.abs(-5.5); //input : ���� ���ڰ�, �μ�, argument
		System.out.println(abs); //output : �����, return ��
		
		
	}

}
