package class_ex02;

public class Person {
//	�Ӽ� : field(�ʵ�)
//	private : ����ȭ

	private String name;
	private String birth;
	private String sex;
	
	//������(Constructor) : ��ü�� ������ �� �ҷ����� Ư���� �޼ҵ�
//	 - ����Ÿ���� ����.
//	 - Ŭ������� �����ϴ�.
	public Person() {
		System.out.println("���ƾƾƾƾƾƾ�");
	}
	
	//�����ε�(overloading) : �Ķ������ Ÿ���� �ٸ��ų�, ������ �ٸ��ų� �ҷ����� ������ ���õȴ�.
	public Person(String name, String birth, String gender) {
		this.name = name;
		this.birth = birth;
		this.sex = sex;
		System.out.println("�Ķ���Ͱ� �ִ� ������");
	}
	
	//getter, setter : ĸ��ȭ
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
