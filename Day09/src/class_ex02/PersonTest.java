package class_ex02;

public class PersonTest {

	public static void main(String[] args) {
		
		Person p1 = new Person();
//		p1.name = "가나다";
//		p1.sex = "남";
//		p1.birth = "19950111";
//		p1.setName("가나다");
//		p1.setGender("남");
//		p1.setBirth("19950111");
		
		
		System.out.println(p1.getName());
		System.out.println(p1.getSex());
		System.out.println(p1.getBirth());
	
		Person p2 = new Person("라마바","남","1995");

		System.out.println(p2.getName());
		System.out.println(p2.getSex());
		System.out.println(p2.getBirth());
		
//		p1.greet();
//		p1.walk();
//		p1.introduce();
//		p1.age();
	}

}
