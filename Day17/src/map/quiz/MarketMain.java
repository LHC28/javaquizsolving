package map.quiz;

import java.util.Scanner;

public class MarketMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Market market = new Market();
		
		while(true) {
			System.out.println("1.�߰� 2.Ȯ�� 3.���� 4.���� 0.����");
			int sel = scan.nextInt();
			
			if(sel==1) {
				market.c();
			}
			else if(sel==2) {
				market.r();
			}
			else if(sel==3) {
				System.out.println("������ ��ǰ �̸��� �Է��ϼ��� : ");
				String name = scan.next();
				market.u(name);
			}
			else if(sel==4) {
				System.out.println("������ ��ǰ �̸��� �Է��ϼ��� : ");
				String name = scan.next();
				market.d(name);
			}
			else if(sel==0) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}

}
