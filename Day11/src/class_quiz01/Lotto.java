package class_quiz01;

import java.util.Random;

public class Lotto {
	private int[] lottoNumbers = new int[6];
	
	//수동 : 직접 마킹한 번호를 넣는다.
	public void manual(int n1, int n2, int n3, int n4, int n5, int n6) {
		lottoNumbers[0] = n1;
		lottoNumbers[1] = n2;
		lottoNumbers[2] = n3;
		lottoNumbers[3] = n4;
		lottoNumbers[4] = n5;
		lottoNumbers[5] = n6;
	}
	
	//자동 : 알아서 랜덤으로 6개의 번호를 세팅한다.
	public void auto() {
		Random ran = new Random();
		
		for(int i=0; i<this.lottoNumbers.length; i++) {
			int randNum = ran.nextInt(45)+1;
			//중복확인
			boolean isDuplication = false;
			for(int j=0; j<this.lottoNumbers.length; j++) {
				if(randNum==lottoNumbers[i]) {
					i--; //i를 한 번 더 돌리기 위해
					isDuplication = true;
					break;
				}
			}
			if(isDuplication==false) {
				this.lottoNumbers[i] = randNum;
			}
		}
	}
	
	public int[] getLottoNumbers() {
		return this.lottoNumbers;
	}
	
	public void printLottoNumbers() {
		for(int i=0; i<this.lottoNumbers.length; i++) {
			System.out.print(this.lottoNumbers[i]+" ");
		}
		System.out.println();
	}
}
