package Inheritance_quiz01;

public class BallPen extends Pen{

	private String color;
	
	public BallPen(int amount, String color) {
		super(amount);
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
