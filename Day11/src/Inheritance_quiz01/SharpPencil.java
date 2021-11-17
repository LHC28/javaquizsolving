package Inheritance_quiz01;

public class SharpPencil extends Pen {

	private int width;
	
	public SharpPencil(int amount, int width) {
		super(amount);
		this.width = width;
	}
	
	public int getWidth() {
		return this.width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
