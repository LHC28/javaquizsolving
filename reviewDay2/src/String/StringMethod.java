package String;

public class StringMethod {

	public static void main(String[] args) {

		String word = "abcdefg";
		
		System.out.println(word.charAt(3));
		System.out.println(word.contains("a"));
		System.out.println(word.contains("j"));
		System.out.println(word.startsWith("a"));
		System.out.println(word.startsWith("b"));
		System.out.println(word.endsWith("g"));
		System.out.println(word.endsWith("a"));
		System.out.println(word.length());
		System.out.println(word.replace("a", "j"));
		String[] words = word.split("d");
		for(int i=0; i<words.length; i++) {
			System.out.println(words[i]);
		}
		System.out.println(word.substring(3));
		System.out.println(word.substring(3,5));
		
	}

}
