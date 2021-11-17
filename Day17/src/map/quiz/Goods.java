package map.quiz;

public class Goods {

	private String name;
	private int price;
	private String state; //�Ǹ���(sale - s), �ǸſϷ�(saleCompleted - c), ������(reservation - r)
	
	
	
	//������
	Goods(String name, int price, String state){
		this.name = name;
		this.price = price;
		this.state = state;
	}
	
	//���
	public void printGoods() {
		System.out.print("�̸� : "+this.name+" ���� : "+this.price);
		if(this.state=="s") {
			System.out.println(" �ǸŻ��� : �Ǹ���");
		}else if(this.state=="c") {
			System.out.println(" �ǸŻ��� : �ǸſϷ�");
		}else if(this.state=="r") {
			System.out.println(" �ǸŻ��� : ������");
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
