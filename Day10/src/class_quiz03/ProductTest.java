package class_quiz03;

public class ProductTest {

	public static void main(String[] args) {
		Product p = new Product("»õ¿ì±ø",1300,"2021-03-02");
		System.out.println(p.checkPrice(5));
		System.out.println(p.checkPrice(13));
		p.checkDeadLine();
	}

}
