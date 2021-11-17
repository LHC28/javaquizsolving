package 과제;

public class Lion extends Animal {

	private String bark;
	
	public Lion(String name, int age, int height){
		super(name, age, height);
	}
	
	public Lion(String name, int age, int height, String bark){
		super(name, age, height);
		this.bark = bark;
	}
	
	public void bite() {
		System.out.println("물어뜯습니다.");
	}
	
	public void fight() {
		System.out.println("우두머리가 되기 위한 싸움을 합니다.");
	}
}
