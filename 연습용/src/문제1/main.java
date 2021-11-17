package ¹®Á¦1;

public class main {

	public static void main(String[] args) {

		Human h1 = new Human("È«±æµ¿",20,88);
		Human h2 = new Human();
		h1.show_info();
		h2.show_info();
		h1.gain_weight(20);
		
		System.out.println("=======================");
		
		Student s1 = new Student("È«±æµ¿",20,88,"60191234");
		Student s2 = new Student();
		s1.show_info();
		s2.show_info();
		s1.study(3);

	}

}
