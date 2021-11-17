package map.quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Market {

	private Set<Goods> market = new HashSet<>();
	
	//생성
	public void c() {
		Scanner scan = new Scanner(System.in);
		
		//판매중(sale - s), 판매완료(saleCompleted - c), 예약중(reservation - r)
		System.out.println("상품명 입력 : ");
		String name = scan.next();
		if(checkMarket(name)==false) {
			System.out.println("가격 입력 : ");
			int price = scan.nextInt();
			System.out.println("판매상태 입력 : ");
			String state = scan.next();
			if(state.equals("s") || state.equals("c") || state.equals("r")) {
				Goods goods = new Goods(name, price, state);
				market.add(goods);
				System.out.println("추가되었습니다.");
			}else {
				System.out.println("잘못입력하셨습니다.");
			}
		}else {
			System.out.println("등록된 상품이 존재합니다.");
		}
	}
	
	//출력
	public void r() {
		if(market.size()<1) {
			System.out.println("비어있습니다.");
		}else {
			printMarket();
		}
	}
	
	//상품수정
	public void u(String name) {
		Scanner scan = new Scanner(System.in);
		if(checkMarket(name)==true) {
			System.out.println("1.물품가격수정 2.판매상태수정");
			int sel = scan.nextInt();
			if(sel==1) {
				System.out.println("수정할 가격을 입력하세요 : ");
				int price = scan.nextInt();
				u(name, price);
			}
			else if(sel==2) {
				System.out.println("상태를 입력하세요 : ");
				String state = scan.next();
				if(state=="s" || state=="c" || state=="r") {
					u(name, state);
				}else {
					System.out.println("잘못입력하였습니다.");
				}
			}
		}else {
			System.out.println("수정할 상품이 존재하지 않습니다.");
		}
	}
	
	//상품 삭제
	public void d(String name) {
		if(checkMarket(name)==true) {
			Iterator<Goods> iter = market.iterator();
			while(iter.hasNext()) {
				Goods product = iter.next();
				if(product.getName().equals(name)) {
					market.remove(product);
					System.out.println("삭제 완료");
					break;
				}
			}
		}else {
			System.out.println("삭제할 상품이 존재하지 않습니다.");
		}
	}
	
	//수정(1.상품명으로 가격수정)
	public void u(String name, int price) {
		Iterator<Goods> iter = market.iterator();
		while(iter.hasNext()) {
			Goods product = iter.next();
			if(product.getName().equals(name)) {
				Goods temp = new Goods(product.getName(), price, product.getState());
				market.remove(product);
				market.add(temp);
				System.out.println("수정 완료");
			}
		}
	}
	//수정(2.상품명으로 판매상태 수정)
	public void u(String name, String state) {
		Iterator<Goods> iter = market.iterator();
		while(iter.hasNext()) {
			Goods product = iter.next();
			if(product.getName().equals(name)) {
				Goods temp = new Goods(product.getName(), product.getPrice(), state);
				market.remove(product);
				market.add(temp);
				System.out.println("수정 완료");
			}
		}
	}

	
	//출력용
	public void printMarket() {
		Iterator<Goods> iter = market.iterator();
		while(iter.hasNext()) {
			Goods product = iter.next();
			product.printGoods();
		}
		System.out.println();
	}
	

	
	//체크용 - iterator따로 만들지...
	public boolean checkMarket(String name) {
		Iterator<Goods> iter = market.iterator();
		while(iter.hasNext()) {
			Goods product = iter.next();
			String productName = product.getName();
			if(productName.equals(name)) {
				return true;
			}
		}
		return false;
	}
}
