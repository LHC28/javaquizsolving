package 과제;

public class Elephant extends Animal {

	private String bark;
	
	public Elephant(String name, int age, int height) {
		super(name, age, height);
	}
	
	public Elephant(String name, int age, int height, String bark) {
		super(name, age, height);
		this.bark = bark;
	}
	
	public void nose() {
		System.out.println("코끼리가 코를 사용하여 물건을 잡습니다.");
	}
	
	public void mud() {
		System.out.println("몸에 진흙을 바릅니다.");
	}
}
