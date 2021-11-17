package Lotto_quiz;

public class LottoTest {

	public static void main(String[] args) {

		Lotto l1 = new Lotto();
		LottoChecker lc = new LottoChecker();
		
		l1.manual(7,15,22,28,30,45);
		lc.check(l1);

		
		l1.auto();
		lc.check(l1);
		
	}

}
