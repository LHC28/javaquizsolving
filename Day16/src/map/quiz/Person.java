package map.quiz;

public class Person {
	
	private String name;
	private int birth;
	
	Person(String name, int birth){
		this.name = name;
		this.birth = birth;
	}
	
	public void printPerson() {
		System.out.println(this.name+" : "+this.birth);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		//이름 : OOO, 생년월일 : OOO
		return "이름 : "+this.name+" 생년월일 : "+this.birth;
	}

}
