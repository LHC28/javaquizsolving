package omr_quiz;

import java.util.Scanner;

public class OmrCardTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		OmrCard o = new OmrCard("������",123456);
		OmrCardReader oc = new OmrCardReader();
		
		for(int i=0; i<o.ans.length; i++) {
			System.out.print("���� �Է� : ");
			int sel = scan.nextInt();
			o.ans[i] = sel;
		}
		
		oc.com(o);
	}

}
