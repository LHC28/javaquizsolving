package class_quiz01;

public class Rectangle {
	
	//�Ӽ� : �ʵ�
	private int width; //����
	private int height; //����
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("���� "+width+"cm, ���� "+width+"cm �簢���� ����������ϴ�.");
	}
	
	public int getArea() {
		return this.width*this.height;
	}
	
	public int getRound() {
		return (this.width+this.height)*2;
	}
	
}
