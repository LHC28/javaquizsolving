package variable_ex;

public class Ex02 {

	public static void main(String[] args) {

		int noodleCup = 850;
		System.out.println("������ ���� : "+noodleCup);
		
		//3�� ���� ���
		//������ ���� : 850, 3���� ���� : OO
		int noodleCup3 = noodleCup*3;
		System.out.println("������ ���� : "+noodleCup+", 3���� ���� : "+noodleCup3);
		
		//10,000���� ������ 3�� �� �� �Ž����� ���ϱ�
		int money = 10000;
		int change = money-noodleCup3;
		System.out.println(change);
		
		//5,000���� �������� � �� �� �ְ� �Ž������� �󸶳� ���°�.
		money = 5000;
		int buyNoodleCup = money/noodleCup; //5.88...
		System.out.println(buyNoodleCup);
		change = money%noodleCup;
		System.out.println(change);
		
	}

}
