package 사각형_quiz;

public class Rectangle {

	private int garo;
	private int sero;
	
	public Rectangle(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		System.out.println("가로 "+garo+"cm, 세로  "+sero+"cm 사각형이 만들어졌습니다.");
	}
	
	public void setGaro(int garo) {
		this.garo = garo;
	}
	
	public int getGaro() {
		return garo;
	}
	
	public void setSero(int sero) {
		this.sero = sero;
	}
	
	public int getSero() {
		return sero;
	}
	
	public int getArea() {
		int area = sero*garo;
		return area;
	}
	
	public int getRound() {
		int round = (garo+sero)*2;
		return round;
	}
}
