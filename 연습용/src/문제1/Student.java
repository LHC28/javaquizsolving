package 문제1;

public class Student extends Human {

	String std_no;
	
	public Student() {
		super();
		this.std_no = "60200000";
	}
	
	public Student(String name, int age, int weight, String std_no) {
		super(name, age, weight);
		this.std_no = std_no;
	}
	
	public void study(int h) {
		System.out.println(this.getName()+"님이 "+h+"시간동안 공부했습니다.");
	}
	
}
