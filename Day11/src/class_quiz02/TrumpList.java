package class_quiz02;

import java.util.Random;

public class TrumpList {

	String[] cardList = new String[52];
	
	TrumpList() {
		String[] shape = {"¢À","¢¼","¢¾","¡ß"};
		
		int count = 0;
		for(int i=0; i<shape.length; i++) {
			for(int j=1; j<14; j++) {
				Trump t = new Trump();
				t.card = shape[i]+j;
				this.cardList[count] = t.card;
				count+=1;
			}
		}
	}
	
	public void printTrump() {
		
		for(int i=0; i<cardList.length; i++) {
			if(i!=0 && i==12 || i==25 || i==38 || i==51) {
				System.out.println(cardList[i]+" ");
			}else if(i==0) {
				System.out.print(cardList[i]+" ");
			}else {
				System.out.print(cardList[i]+" ");
			}
		}
		System.out.println();
		System.out.println();
	}
	
	public void shuffle() {
		Random ran = new Random();
		for(int i=0; i<1000; i++) {
			int num = ran.nextInt(51)+1;
			String temp = cardList[0];
			cardList[0] = cardList[num];
			cardList[num] = temp;
		}
	}
}
