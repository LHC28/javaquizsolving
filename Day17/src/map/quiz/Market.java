package map.quiz;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Market {

	private Set<Goods> market = new HashSet<>();
	
	//����
	public void c() {
		Scanner scan = new Scanner(System.in);
		
		//�Ǹ���(sale - s), �ǸſϷ�(saleCompleted - c), ������(reservation - r)
		System.out.println("��ǰ�� �Է� : ");
		String name = scan.next();
		if(checkMarket(name)==false) {
			System.out.println("���� �Է� : ");
			int price = scan.nextInt();
			System.out.println("�ǸŻ��� �Է� : ");
			String state = scan.next();
			if(state.equals("s") || state.equals("c") || state.equals("r")) {
				Goods goods = new Goods(name, price, state);
				market.add(goods);
				System.out.println("�߰��Ǿ����ϴ�.");
			}else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}else {
			System.out.println("��ϵ� ��ǰ�� �����մϴ�.");
		}
	}
	
	//���
	public void r() {
		if(market.size()<1) {
			System.out.println("����ֽ��ϴ�.");
		}else {
			printMarket();
		}
	}
	
	//��ǰ����
	public void u(String name) {
		Scanner scan = new Scanner(System.in);
		if(checkMarket(name)==true) {
			System.out.println("1.��ǰ���ݼ��� 2.�ǸŻ��¼���");
			int sel = scan.nextInt();
			if(sel==1) {
				System.out.println("������ ������ �Է��ϼ��� : ");
				int price = scan.nextInt();
				u(name, price);
			}
			else if(sel==2) {
				System.out.println("���¸� �Է��ϼ��� : ");
				String state = scan.next();
				if(state=="s" || state=="c" || state=="r") {
					u(name, state);
				}else {
					System.out.println("�߸��Է��Ͽ����ϴ�.");
				}
			}
		}else {
			System.out.println("������ ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}
	
	//��ǰ ����
	public void d(String name) {
		if(checkMarket(name)==true) {
			Iterator<Goods> iter = market.iterator();
			while(iter.hasNext()) {
				Goods product = iter.next();
				if(product.getName().equals(name)) {
					market.remove(product);
					System.out.println("���� �Ϸ�");
					break;
				}
			}
		}else {
			System.out.println("������ ��ǰ�� �������� �ʽ��ϴ�.");
		}
	}
	
	//����(1.��ǰ������ ���ݼ���)
	public void u(String name, int price) {
		Iterator<Goods> iter = market.iterator();
		while(iter.hasNext()) {
			Goods product = iter.next();
			if(product.getName().equals(name)) {
				Goods temp = new Goods(product.getName(), price, product.getState());
				market.remove(product);
				market.add(temp);
				System.out.println("���� �Ϸ�");
			}
		}
	}
	//����(2.��ǰ������ �ǸŻ��� ����)
	public void u(String name, String state) {
		Iterator<Goods> iter = market.iterator();
		while(iter.hasNext()) {
			Goods product = iter.next();
			if(product.getName().equals(name)) {
				Goods temp = new Goods(product.getName(), product.getPrice(), state);
				market.remove(product);
				market.add(temp);
				System.out.println("���� �Ϸ�");
			}
		}
	}

	
	//��¿�
	public void printMarket() {
		Iterator<Goods> iter = market.iterator();
		while(iter.hasNext()) {
			Goods product = iter.next();
			product.printGoods();
		}
		System.out.println();
	}
	

	
	//üũ�� - iterator���� ������...
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
