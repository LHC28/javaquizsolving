package 문제2;

import java.util.Scanner;

public class 커피 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("남은 커피의 잔수를 적어주세요");
		int c = scan.nextInt();
		System.out.println("커피의 가격을 적어주세요");
		int Cprice = scan.nextInt();
		
		int price = 0;
		
		while(true) {
			System.out.println("구매하려는 커피의 잔 수를 적어주세요.");
			int count = scan.nextInt();
			if(c-count>=0) {
				System.out.println("가격은 "+(count*Cprice)+"입니다.");
				price+=(count*Cprice);
				if(c-count==0) {
					System.out.println("금일 영업은 종료합니다.");
					break;
				}
				c-=count;
			}else if(c-count<0) {
				System.out.println("남은 잔 수가 없습니다. 구매가능한 잔수는 "+c+"입니다.");
			}
		}

	}

}
