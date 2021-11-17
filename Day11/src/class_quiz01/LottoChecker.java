package class_quiz01;

import java.util.Random;

public class LottoChecker {

	private int[] winningNumbers = new int[6]; //당첨번호
	
	//생성자
	public LottoChecker() {
		Random ran = new Random();
		
		for(int i=0; i<this.winningNumbers.length; i++) {
			int randNum = ran.nextInt(45)+1;
			//중복확인
			boolean isDuplication = false;
			for(int j=0; j<this.winningNumbers.length; j++) {
				if(randNum==winningNumbers[i]) {
					i--; //i를 한 번 더 돌리기 위해
					isDuplication = true;
					break;
				}
			}
			if(isDuplication==false) {
				this.winningNumbers[i] = randNum;
			}
		}
	}
	
	//체크
	public String check(Lotto lotto) {
		int[] numbers = lotto.getLottoNumbers();
		
		int count = 0; //몇 개가 맞았는지
		
		for(int i=0; i<this.winningNumbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				if(this.winningNumbers[i]==numbers[j]) {
					count++;
					break;
				}
			}
		}
		if(count==6) {
			return "1등";
		}else if(count==5) {
			return "2등";
		}else if(count==4) {
			return "3등";
		}else if(count==3) {
			return "4등";
		}else {
			return "꽝";
		}
	}
}
