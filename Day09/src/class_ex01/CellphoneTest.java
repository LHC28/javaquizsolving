package class_ex01;

public class CellphoneTest {

	public static void main(String[] args) {
		//�ǽ��� �帧
		Cellphone c1 = new Cellphone();
		c1.maker = "�Ｚ";
		c1.model = "�����ó�Ʈ20";
		c1.price = 1500000;
		c1.color = "����";
		
		System.out.println(c1.maker);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.color);
		
		c1.call();
		c1.camera();
		
		//�׳� 100���� ������.
		Cellphone[] cellphones = new Cellphone[100];
		for(int i=0; i<cellphones.length; i++) {
			cellphones[i] = new Cellphone();
		}
	}
}
