package map.quiz;

import java.util.Scanner;

public class MarketMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Market market = new Market();
		
		while(true) {
			System.out.println("1.추가 2.확인 3.수정 4.삭제 0.종료");
			int sel = scan.nextInt();
			
			if(sel==1) {
				market.c();
			}
			else if(sel==2) {
				market.r();
			}
			else if(sel==3) {
				System.out.println("수정할 상품 이름을 입력하세요 : ");
				String name = scan.next();
				market.u(name);
			}
			else if(sel==4) {
				System.out.println("삭제할 상품 이름을 입력하세요 : ");
				String name = scan.next();
				market.d(name);
			}
			else if(sel==0) {
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

}
