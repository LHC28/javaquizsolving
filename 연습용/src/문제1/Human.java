package 문제1;

public class Human {

	private String name;
	private int age;
	private int weight;
	
	public Human() {
		this.name = "noname";
		this.age = 0;
		this.weight = 0;
	}
	
	public Human(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public void show_info() {
		System.out.println("이름 : "+this.name+" 나이 : "+this.age+" 몸무게 : "+this.weight);
	}
	
	public void gain_weight(int w) {
		this.weight+=w;
		System.out.println(this.name+" 의 몸무게가 "+this.weight+"kg이 되었습니다.");
		if(this.weight>=100) {
			System.out.println("위험합니다. 체중을 줄이세요.");
		}
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
