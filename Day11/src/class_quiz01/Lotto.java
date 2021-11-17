package class_quiz01;

import java.util.Random;

public class Lotto {
	private int[] lottoNumbers = new int[6];
	
	//���� : ���� ��ŷ�� ��ȣ�� �ִ´�.
	public void manual(int n1, int n2, int n3, int n4, int n5, int n6) {
		lottoNumbers[0] = n1;
		lottoNumbers[1] = n2;
		lottoNumbers[2] = n3;
		lottoNumbers[3] = n4;
		lottoNumbers[4] = n5;
		lottoNumbers[5] = n6;
	}
	
	//�ڵ� : �˾Ƽ� �������� 6���� ��ȣ�� �����Ѵ�.
	public void auto() {
		Random ran = new Random();
		
		for(int i=0; i<this.lottoNumbers.length; i++) {
			int randNum = ran.nextInt(45)+1;
			//�ߺ�Ȯ��
			boolean isDuplication = false;
			for(int j=0; j<this.lottoNumbers.length; j++) {
				if(randNum==lottoNumbers[i]) {
					i--; //i�� �� �� �� ������ ����
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
