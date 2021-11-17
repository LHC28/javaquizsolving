package 과제;

public class Animal {

	private String name;
	private int age;
	private int height;
	
	public Animal(String name, int age, int height) {
		this.name = name;
		this.age = age;
		this.height = height;
		System.out.println("이름 : "+name+" 나이 : "+age+" 키 : "+height);
	}
	
	public void eat() {
		System.out.println("밥을 먹기 시작한다.");
	}
	
	public void sleep() {
		System.out.println("잠을 자기 시작한다.");
	}
}
