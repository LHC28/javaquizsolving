package inheritance_ex01;

//�ڽ� Ŭ����
public class Student extends Person{

	private String major;
	
	//������
	public Student() {
		System.out.println("�л��Դϴ�.");
	}
	
	public Student(String name, String major) {
		super(name); //�θ� �����ڿ� �ش��ϴ� ���� ���� �;� ������ ���� �ʴ´�. / �����ÿ� �⺻�����ڷ� ����.
//		super.name = name;
//		this.name = name;
		this.major = major;
	}
	
	//�������̵� : �θ�Ŭ������ �ִ� �޼ҵ带 �ڽ� Ŭ�������� ������ �ϴ� ��
	@Override
	public void introduce() {
		super.introduce();
		System.out.println("�� ������ "+this.major+"�Դϴ�.");
	}
}
