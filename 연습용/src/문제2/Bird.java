package 문제2;

public class Bird extends Animal {

	private int size;
	
	Bird(int weight, int size){
		super(weight);
		this.size = size;
	}
	
	public void twitter() {
		System.out.println("지저귑니다.");
	}
	
	public void getSize() {
		return this.size;
	}
}
