package 추가;

import java.util.Random;

public class CardGame {
	
	String[] card = {"사과","사과","바나나","바나나","수박","수박"};
	boolean flag = false;
	
	public void shuffle() {
		Random ran = new Random();
		for(int i=0; i<1000; i++) {
			int num = ran.nextInt(6);
			String temp = card[0];
			card[0] = card[num];
			card[num] = temp;
		}
		System.out.println("카드 섞기 완료");
	}
	
	public void flag() {
		int count = 0;
		for(int i=0; i<this.card.length; i++) {
			if(card[i].equals("완료")) {
				count+=1;
			}
		}
		if(count==this.card.length) {
			flag = true;
		}
	}
}
