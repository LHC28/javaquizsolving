package �簢��_quiz;

public class Rectangle {

	private int garo;
	private int sero;
	
	public Rectangle(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		System.out.println("���� "+garo+"cm, ����  "+sero+"cm �簢���� ����������ϴ�.");
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
