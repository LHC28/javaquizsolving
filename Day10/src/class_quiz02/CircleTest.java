package class_quiz02;

public class CircleTest {

	public static void main(String[] args) {

		Circle c = new Circle(8);
		System.out.println("���� ���� : "+c.getArea());
		System.out.println("���� �ѷ� : "+c.getRound());
		int amount = 25;
		System.out.println("�� "+amount+"�� ���� : "+c.getAreas(amount));
		
		
	}

}
