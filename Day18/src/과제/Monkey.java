package 과제;

public class Monkey extends Animal {
	
	private String bark;
	
	public Monkey(String name, int age, int height){
		super(name, age, height);
	}
	
	public Monkey(String name, int age, int height, String bark){
		super(name, age, height);
		this.bark = bark;
	}
	
	public void climb() {
		System.out.println("원숭이가 나무를 타기 시작합니다.");
	}
	
	public void whisk() {
		System.out.println("털고르기를 시작합니다.");
	}
	
}
