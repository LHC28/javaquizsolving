package class1;

public class Student {

	String name;
	String subject;
	int age;
	String phoneNumber;
	
	public void adult() {
		if(this.age>=20) {
			System.out.println(this.name+"�� �����Դϴ�.");
		}else if(this.age<20) {
			System.out.println(this.name+"�� �̼������Դϴ�.");
		}
	}
	
}
