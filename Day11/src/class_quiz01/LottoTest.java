package class_quiz01;

public class LottoTest {

	public static void main(String[] args) {

		Lotto lotto1 = new Lotto();
		LottoChecker lottoChecker = new LottoChecker();
		//수동
		lotto1.manual(6,10,21,23,29,44);
		lotto1.printLottoNumbers();
		
		String lottoResult1 = lottoChecker.check(lotto1);
		
		//자동
		Lotto lotto2 = new Lotto();
		lotto2.auto();
		lotto2.printLottoNumbers();
	}

}
