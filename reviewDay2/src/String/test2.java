package String;

public class test2 {

	public static void main(String[] args) {
		
		String gradeStr = "My grade is A";
		gradeStr = gradeStr.replace("A", "B");
		System.out.println(gradeStr);
		
		String birth = "19950721";
		String birthYear = birth.substring(0, 4);
		int age = 2022 - Integer.valueOf(birthYear) + 1;
		System.out.println(age);
		
		String sentence = "To be, or Not to Be. That Is The Question";
		String[] word = sentence.split(" ");
		System.out.println(word.length);
	}
}
