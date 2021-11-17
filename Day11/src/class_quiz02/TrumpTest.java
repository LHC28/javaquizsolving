package class_quiz02;

public class TrumpTest {

	public static void main(String[] args) {

		TrumpList tl = new TrumpList();
		tl.printTrump();
		
		tl.shuffle();
		tl.printTrump();
	}

}
