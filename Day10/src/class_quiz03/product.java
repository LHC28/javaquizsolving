package class_quiz03;

public class Product {
	private String name;
	private int price;
	private String deadLine;
	
	Product(String name, int price, String deadLine){
		this.name = name;
		this.price = price;
		this.deadLine = deadLine;
		System.out.println("이름 : "+this.name);
		System.out.println("가격 : "+this.price);
		System.out.println("유통기한 : "+this.deadLine);
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
//		boolean check = false; //그냥 매번 return을 활용하는 방법도 있다.
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
//			System.out.println("판매 불가능한 상품");
//		}else {
//			System.out.println("판매가능한 상품");
//		}
		
//		compareTo - c언어에서 따온 것이라고 한다.
//		기준값이 더 크면 1
//		기준값이 작으면 -1
//		값이 같으면 0
		if(this.deadLine.compareTo("2021-04-28")==1) {
			System.out.println("판매가능한 상품");
		}else {
			System.out.println("판매불가능 상품");
		}
		
	}
}
