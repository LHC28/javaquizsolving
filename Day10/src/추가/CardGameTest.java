package �߰�;

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
			System.out.println("��ȣ1 �Է� : ");
			int num1 = scan.nextInt();
			System.out.println("��ȣ2 �Է� : ");
			int num2 = scan.nextInt();
			if(cg.card[num1].equals(cg.card[num2]) && !cg.card[num1].equals("�Ϸ�") && !cg.card[num2].equals("�Ϸ�")) {
				System.out.println("����");
				cg.card[num1]="�Ϸ�";
				cg.card[num2]="�Ϸ�";
			}
			cg.flag();
			if(cg.flag==true) {
				System.out.println("���� ����");
				break;
			}
		}
	}

}
