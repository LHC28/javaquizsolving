package class_quiz01;

public class Rectangle {
	
	//속성 : 필드
	private int width; //가로
	private int height; //세로
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		System.out.println("가로 "+width+"cm, 세로 "+width+"cm 사각형이 만들어졌습니다.");
	}
	
	public int getArea() {
		return this.width*this.height;
	}
	
	public int getRound() {
		return (this.width+this.height)*2;
	}
	
}
