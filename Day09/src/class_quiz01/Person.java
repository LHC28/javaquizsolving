package class_quiz01;

public class Person {

	String name;
	String birth;
	String sex;
	
	public void greet() {
		System.out.println("�ȳ�");
	}
	
	public void walk() {
		System.out.println("�ȴ�.");
	}
	
	public void introduce() {
		System.out.println("�� �̸��� "+this.name+"�̰� ������ "+sex+"�̴�.");
	}
	
	public void age() {
		int getAge = 2021-Integer.valueOf(this.birth.substring(0,4))+1;
		System.out.println("���̴� "+getAge+"���̴�.");
	}
}
