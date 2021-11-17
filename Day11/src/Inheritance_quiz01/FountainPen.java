package Inheritance_quiz01;

public class FountainPen extends BallPen{

	public FountainPen(int amount, String color) {
		super(amount, color);
	}
	
	public void refill(int n) {
		super.setAmount(n);
	}
}
