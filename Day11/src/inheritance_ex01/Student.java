package inheritance_ex01;

//자식 클래스
public class Student extends Person{

	private String major;
	
	//생성자
	public Student() {
		System.out.println("학생입니다.");
	}
	
	public Student(String name, String major) {
		super(name); //부모 생성자에 해당하는 것이 먼저 와야 에러가 뜨지 않는다. / 없을시엔 기본생성자로 진행.
//		super.name = name;
//		this.name = name;
		this.major = major;
	}
	
	//오버라이드 : 부모클래스에 있는 메소드를 자식 클래스에서 재정의 하는 것
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("내 전공은 "+this.major+"입니다.");
	}
}
