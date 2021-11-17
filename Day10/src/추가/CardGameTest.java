package 추가;

import java.util.Scanner;

public class CardGameTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		CardGame cg = new CardGame();
		cg.shuffle();
		while(true) {
			for(int i=0; i<cg.card.length; i++) {
				System.out.print(cg.card[i]+" ");
			}
			System.out.println();
			System.out.println("번호1 입력 : ");
			int num1 = scan.nextInt();
			System.out.println("번호2 입력 : ");
			int num2 = scan.nextInt();
			if(cg.card[num1].equals(cg.card[num2]) && !cg.card[num1].equals("완료") && !cg.card[num2].equals("완료")) {
				System.out.println("성공");
				cg.card[num1]="완료";
				cg.card[num2]="완료";
			}
			cg.flag();
			if(cg.flag==true) {
				System.out.println("게임 종료");
				break;
			}
		}
	}

}
