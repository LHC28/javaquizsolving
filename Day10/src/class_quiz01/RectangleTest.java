package class_quiz01;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle rect1 = new Rectangle(30,50);
		System.out.println(rect1.getArea());
		System.out.println(rect1.getRound());
		
		Rectangle rect2 = new Rectangle(10,10);
		System.out.println(rect2.getArea());
		System.out.println(rect2.getRound());
	}

}
