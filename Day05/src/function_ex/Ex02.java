package function_ex;

public class Ex02 {

	public static void main(String[] args) {//�޸𸮸� �ø��ٰ� ����

		//�޼ҵ� �����
		//1. � �Լ��� ������ �޼ҵ���� ���´�.(����� ���� ���� ��,�� ���� ����� �ϴ����� ������ ��)
		//2. input�� ������ ������ �����Ѵ�.
		//3. output�� �������� �������� �����Ѵ�.
		//4. �����Ѵ�.
		
		//�޼ҵ带 ����ϴ� ��
		int x = 30;
		int y = 50;
		int result = sum(x,y); //�������ڰ�, argument
		System.out.println("�հ� : "+ result);
		
		printHelloWorld(); //�Լ��� ����Ѵ�. �Լ��� �θ���. �Լ��� call�Ѵ�.
	}
	
	//�޼ҵ� ����� ��
	public static int sum(int a,int b) { //�Ű�����(parameter)
		int result = a+b;
		return result; //return�� ������ �޼ҵ尡 ����ȴ�.
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello world"); //��Ʈ�� ��Ʈ ����Ű�� ����
		System.out.println("Hello world");
		return;//��������
	}
}
