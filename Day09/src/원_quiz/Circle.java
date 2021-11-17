package ��_quiz;

public class Circle {

	private int rad;
	
	public Circle(int rad, int n) {
		this.rad = rad;
		area(1);
		round();
		area(n);
	}
	
	public void area(int n) {
		double area = (Math.round((rad*rad)*Math.PI*n*100)/100.0);
		System.out.println("���� ���� : "+area);
	}
	public void round() {
		double round = (Math.round((2*rad)*Math.PI*100)/100.0);
		System.out.println("���� �ѷ� : "+round);
	}

	
	public int getArea() {
		return rad;
	}
	public void setArea(int rad) {
		this.rad = rad;
	}
}
