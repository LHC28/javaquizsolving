package 문제2;

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
		this.name = "멍멍이";
		this.sex = 'm';
		this.color = "흰색";
		this.phone = "000-0000-0000";
	}
	
	public void show_info() {
		System.out.println("이름 : "+this.name+" 성별 : "+this.sex+" 색상 : "+this.color +" 주인 핸드폰 : "+this.phone +"성별 : 암컷");
		
	}
	
	public void show_name() {
		System.out.println("이름 : "+ this.name);
	}
	
	public void change_phone(String phone) {
		this.phone = phone;
	}
	
	
}
