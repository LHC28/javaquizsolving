package ����2;

public class Dog {

	private String name;
	private char sex;
	private String color;
	private String phone;
	
	Dog(String name, char sex, String color, String phone){
		this.name = name;
		this.sex = sex;
		this.color = color;
		this.phone = phone;
	}
	Dog(){
		this.name = "�۸���";
		this.sex = 'm';
		this.color = "���";
		this.phone = "000-0000-0000";
	}
	
	public void show_info() {
		System.out.println("�̸� : "+this.name+" ���� : "+this.sex+" ���� : "+this.color +" ���� �ڵ��� : "+this.phone +"���� : ����");
		
	}
	
	public void show_name() {
		System.out.println("�̸� : "+ this.name);
	}
	
	public void change_phone(String phone) {
		this.phone = phone;
	}
	
	
}
