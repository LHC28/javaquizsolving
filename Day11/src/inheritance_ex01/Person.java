package inheritance_ex01;

//�θ� Ŭ���� (super class)
public class Person {

	protected String name;
	
	//������
	public Person() {
		System.out.println("���ƾƾƾƾƾƾ�");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void introduce() {
		//�� �̸��� 00�Դϴ�.
		System.out.println("�� �̸��� "+this.name+"�Դϴ�.");
	}
	
}
