package ����2;

public class Bird extends Animal {

	private int size;
	
	Bird(int weight, int size){
		super(weight);
		this.size = size;
	}
	
	public void twitter() {
		System.out.println("�����Ҵϴ�.");
	}
	
	public void getSize() {
		return this.size;
	}
}
