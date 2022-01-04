package class1;

public class Student {

	String name;
	String subject;
	int age;
	String phoneNumber;
	
	public void adult() {
		if(this.age>=20) {
			System.out.println(this.name+"은 성인입니다.");
		}else if(this.age<20) {
			System.out.println(this.name+"은 미성년자입니다.");
		}
	}
	
}
