package class_quiz;

public class Student {
	
	String name;
	String className;
	int age;
	String phone;
	
	public void isAdult() {
		if(this.age>=20) {
			System.out.println(this.name+"은 성인입니다.");
		}else {
			System.out.println(this.name+"은 미성년자입니다.");
		}
	}
}
