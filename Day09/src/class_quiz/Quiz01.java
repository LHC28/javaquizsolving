package class_quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.name = "유재석";
		st1.age = 21;
		st1.className = "java";
		st1.phone = "01023453223";
		System.out.println(st1.name);
	    System.out.println(st1.age);
	    System.out.println(st1.className);
	    System.out.println(st1.phone);
	    st1.isAdult();
		
		Student st2 = new Student();
		st2.name = "이효리";
		st2.age = 17;
		st2.className = "java";
		st2.phone = "01096482736";
		System.out.println(st2.name);
	    System.out.println(st2.age);
	    System.out.println(st2.className);
	    System.out.println(st2.phone);
		st2.isAdult();

	}

}
