package ����;

public class Elephant extends Animal {

	private String bark;
	
	public Elephant(String name, int age, int height) {
		super(name, age, height);
	}
	
	public Elephant(String name, int age, int height, String bark) {
		super(name, age, height);
		this.bark = bark;
	}
	
	public void nose() {
		System.out.println("�ڳ����� �ڸ� ����Ͽ� ������ ����ϴ�.");
	}
	
	public void mud() {
		System.out.println("���� ������ �ٸ��ϴ�.");
	}
}
