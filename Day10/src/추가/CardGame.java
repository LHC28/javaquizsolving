package �߰�;

import java.util.Random;

public class CardGame {
	
	String[] card = {"���","���","�ٳ���","�ٳ���","����","����"};
	boolean flag = false;
	
	public void shuffle() {
		Random ran = new Random();
		for(int i=0; i<1000; i++) {
			int num = ran.nextInt(6);
			String temp = card[0];
			card[0] = card[num];
			card[num] = temp;
		}
		System.out.println("ī�� ���� �Ϸ�");
	}
	
	public void flag() {
		int count = 0;
		for(int i=0; i<this.card.length; i++) {
			if(card[i].equals("�Ϸ�")) {
				count+=1;
			}
		}
		if(count==this.card.length) {
			flag = true;
		}
	}
}
