package class2;

public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("���� "+width+"cm, ���� "+height+"cm �簢���� ����������ϴ�.");
	}
	
	public int getArea() {
		return width*height;
	}
	
	public int getRound() {
		return width*2 + height*2;
	}
	
	
}
