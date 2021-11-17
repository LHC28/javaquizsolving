package ����;

public class Lion extends Animal {

	private String bark;
	
	public Lion(String name, int age, int height){
		super(name, age, height);
	}
	
	public Lion(String name, int age, int height, String bark){
		super(name, age, height);
		this.bark = bark;
	}
	
	public void bite() {
		System.out.println("�������ϴ�.");
	}
	
	public void fight() {
		System.out.println("��θӸ��� �Ǳ� ���� �ο��� �մϴ�.");
	}
}
