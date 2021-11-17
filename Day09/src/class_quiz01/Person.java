package class_quiz01;

public class Person {

	String name;
	String birth;
	String sex;
	
	public void greet() {
		System.out.println("안녕");
	}
	
	public void walk() {
		System.out.println("걷다.");
	}
	
	public void introduce() {
		System.out.println("내 이름은 "+this.name+"이고 성별은 "+sex+"이다.");
	}
	
	public void age() {
		int getAge = 2021-Integer.valueOf(this.birth.substring(0,4))+1;
		System.out.println("나이는 "+getAge+"세이다.");
	}
}
