package �簢��_quiz;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(30,50);
		System.out.println("����:" + rect1.getArea() + "cm^2");
		System.out.println("�ѷ�:" + rect1.getRound() + "cm");
		
		Rectangle rect2 = new Rectangle(10,10);
		System.out.println("����:" + rect2.getArea() + "cm^2");
		System.out.println("�ѷ�:" + rect2.getRound() + "cm");
	}

}
