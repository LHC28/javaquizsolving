package String_quiz;

public class Quiz01 {

	public static void main(String[] args) {

//		1
		String gradeStr = "My grade is A";
		gradeStr = gradeStr.replace("A", "B");
		System.out.println(gradeStr);
		
//		2
		String birth = "19950721";
		int year = Integer.parseInt(birth.substring(0,4)); //valueOf
		int age = 2021-year+1;
		System.out.println(age+"세");
		
//		3
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] word = sentence.split(" ");
		System.out.println("단어 개수 : "+word.length);
		
		

	}

}
