package inheritance_ex01;

//부모 클래스 (super class)
public class Person {

	protected String name;
	
	//생성자
	public Person() {
		System.out.println("으아아아아아아악");
	}
	
	public Person(String name) {
		this.name = name;
	}
	
	public void introduce() {
		//내 이름은 00입니다.
		System.out.println("내 이름은 "+this.name+"입니다.");
	}
	
}
