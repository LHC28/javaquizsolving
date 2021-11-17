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
//	메소드 오버로딩(Overloading) : 메소드 이름은 같은데 파라미터의 개수가 다르거나
//	파라미터의 타입이 다른 경우 다른 메소드로 인지하고 이리하는 메소드로 자동 호출 된다.
}
