package 트럼프_quiz;

import java.util.Random;

public class Trump {

	String[] cards = new String[52];
	
	public Trump() {
		
		int count = 0;
		String card;
		for(int i=0; i<13; i++) {
			card = "♣"+(i+1);
			cards[count] = card;
			count+=1;
		}
		for(int i=0; i<13; i++) {
			card = "♠"+(i+1);
			cards[count] = card;
			count+=1;
		}
		for(int i=0; i<13; i++) {
			card = "♥"+(i+1);
			cards[count] = card;
			count+=1;
		}
		for(int i=0; i<13; i++) {
			card = "◆"+(i+1);
			cards[count] = card;
			count+=1;
		}
		
		for(int i=0; i<52; i++) {
			if(i%13==0 && i!=0) {
				System.out.println(cards[i]+" ");
			}else if(i==0) {
				System.out.print(cards[i]+" ");
			}
			else {
				System.out.print(cards[i]+" ");
			}
		}
		System.out.println();
	}
	public void shuffle() {//섞기
		Random ran = new Random();
		for(int i=0; i<1000; i++) {
			int num = ran.nextInt(52);
			String temp = cards[0];
			cards[0] = cards[num];
			cards[num] = temp;
		}
		
		
	}
	
	public void printTrump() {
		for(int i=0; i<52; i++) { //출력
			if(i%13==0 && i!=0) {
				System.out.println(cards[i]+" ");
			}else if(i==0) {
				System.out.print(cards[i]+" ");
			}
			else {
				System.out.print(cards[i]+" ");
			}
		}
	}
}
