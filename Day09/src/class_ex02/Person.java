package class_ex02;

public class Person {
//	속성 : field(필드)
//	private : 은닉화

	private String name;
	private String birth;
	private String sex;
	
	//생성자(Constructor) : 객체가 생성될 때 불려지는 특수한 메소드
//	 - 리턴타입이 없다.
//	 - 클래스명과 동일하다.
	public Person() {
		System.out.println("으아아아아아아악");
	}
	
	//오버로딩(overloading) : 파라미터의 타입이 다르거나, 개수가 다르거나 불려지는 시점에 선택된다.
	public Person(String name, String birth, String gender) {
		this.name = name;
		this.birth = birth;
		this.sex = sex;
		System.out.println("파라미터가 있는 생성자");
	}
	
	//getter, setter : 캡슐화
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	public void setGender(String sex) {
		this.sex = sex;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getBirth() {
		return this.birth;
	}
	
	public String getSex() {
		return this.sex;
	}
	
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
