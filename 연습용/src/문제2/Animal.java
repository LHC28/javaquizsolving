package 문제2;

public class Animal {

	private int weight;
	
	Animal(int weight){
		this.weight = weight;
	}
	
	public void move() {
		System.out.println("움직입니다.");
	}
	
	public int getWeight() {
		return this.weight;
	}
}
