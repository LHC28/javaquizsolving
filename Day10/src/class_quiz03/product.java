package class_quiz03;

public class Product {
	private String name;
	private int price;
	private String deadLine;
	
	Product(String name, int price, String deadLine){
		this.name = name;
		this.price = price;
		this.deadLine = deadLine;
		System.out.println("�̸� : "+this.name);
		System.out.println("���� : "+this.price);
		System.out.println("������� : "+this.deadLine);
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return this.price;
	}
	public int setPrice(int price) {
		return this.price = price;
	}
	
	public int checkPrice(int amount) {
		return this.price*amount;
	}
	
	public void checkDeadLine() {
//		int year = Integer.valueOf(this.deadLine.substring(0,4));
//		int month = Integer.valueOf(this.deadLine.substring(5,7));
//		int day = Integer.valueOf(this.deadLine.substring(9));
//		boolean check = false; //�׳� �Ź� return�� Ȱ���ϴ� ����� �ִ�.
//		if(year<2021) {
//			check = true;
//		}
//		if(year>=2021 && month>4) {
//			check = true;
//		}
//		if(year>=2021&& month<=4 && day>28) {
//			check = true;
//		}
//		if(check==true) {
//			System.out.println("�Ǹ� �Ұ����� ��ǰ");
//		}else {
//			System.out.println("�ǸŰ����� ��ǰ");
//		}
		
//		compareTo - c���� ���� ���̶�� �Ѵ�.
//		���ذ��� �� ũ�� 1
//		���ذ��� ������ -1
//		���� ������ 0
		if(this.deadLine.compareTo("2021-04-28")==1) {
			System.out.println("�ǸŰ����� ��ǰ");
		}else {
			System.out.println("�ǸźҰ��� ��ǰ");
		}
		
	}
}
