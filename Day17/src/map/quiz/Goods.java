package map.quiz;

public class Goods {

	private String name;
	private int price;
	private String state; //판매중(sale - s), 판매완료(saleCompleted - c), 예약중(reservation - r)
	
	
	
	//생성자
	Goods(String name, int price, String state){
		this.name = name;
		this.price = price;
		this.state = state;
	}
	
	//출력
	public void printGoods() {
		System.out.print("이름 : "+this.name+" 가격 : "+this.price);
		if(this.state=="s") {
			System.out.println(" 판매상태 : 판매중");
		}else if(this.state=="c") {
			System.out.println(" 판매상태 : 판매완료");
		}else if(this.state=="r") {
			System.out.println(" 판매상태 : 예약중");
		}
	}
	
	//setter, getter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return this.price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
