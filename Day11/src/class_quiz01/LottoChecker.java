package class_quiz01;

import java.util.Random;

public class LottoChecker {

	private int[] winningNumbers = new int[6]; //��÷��ȣ
	
	//������
	public LottoChecker() {
		Random ran = new Random();
		
		for(int i=0; i<this.winningNumbers.length; i++) {
			int randNum = ran.nextInt(45)+1;
			//�ߺ�Ȯ��
			boolean isDuplication = false;
			for(int j=0; j<this.winningNumbers.length; j++) {
				if(randNum==winningNumbers[i]) {
					i--; //i�� �� �� �� ������ ����
					isDuplication = true;
					break;
				}
			}
			if(isDuplication==false) {
				this.winningNumbers[i] = randNum;
			}
		}
	}
	
	//üũ
	public String check(Lotto lotto) {
		int[] numbers = lotto.getLottoNumbers();
		
		int count = 0; //�� ���� �¾Ҵ���
		
		for(int i=0; i<this.winningNumbers.length; i++) {
			for(int j=0; j<numbers.length; j++) {
				if(this.winningNumbers[i]==numbers[j]) {
					count++;
					break;
				}
			}
		}
		if(count==6) {
			return "1��";
		}else if(count==5) {
			return "2��";
		}else if(count==4) {
			return "3��";
		}else if(count==3) {
			return "4��";
		}else {
			return "��";
		}
	}
}
