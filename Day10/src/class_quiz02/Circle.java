package class_quiz02;

public class Circle {
	private int rad;
	
	Circle(int rad){
		this.rad = rad;
	}
	
	public double getArea() {
		return Math.round((Math.pow(rad, 2)*Math.PI)*100)/100.0;
	}
	
	public double getRound() {
		return Math.round((2*this.rad)*Math.PI*100)/100.0;
	}
	
	public double getAreas(int amount) {
		return getArea()*amount;
	}
//	�޼ҵ� �����ε�(Overloading) : �޼ҵ� �̸��� ������ �Ķ������ ������ �ٸ��ų�
//	�Ķ������ Ÿ���� �ٸ� ��� �ٸ� �޼ҵ�� �����ϰ� �̸��ϴ� �޼ҵ�� �ڵ� ȣ�� �ȴ�.
}
