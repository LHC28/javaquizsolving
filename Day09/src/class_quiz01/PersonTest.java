package class_quiz01;

public class PersonTest {

	public static void main(String[] args) {

		Person p1 = new Person();
		p1.name = "������";
		p1.sex = "��";
		p1.birth = "19950111";
		
		p1.greet();
		p1.walk();
		p1.introduce();
		p1.age();
	}
	
}
