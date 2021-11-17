package class_quiz02;

public class CircleTest {

	public static void main(String[] args) {

		Circle c = new Circle(8);
		System.out.println("원의 넓이 : "+c.getArea());
		System.out.println("원의 둘레 : "+c.getRound());
		int amount = 25;
		System.out.println("원 "+amount+"개 넓이 : "+c.getAreas(amount));
		
		
	}

}
