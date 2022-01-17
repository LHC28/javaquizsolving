package 문자열;

import java.util.Scanner;

public class 단어의개수 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String sentence = scan.nextLine().trim();
		String[] words = sentence.split(" ");
		int count = 0;
		if(sentence.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(words.length);
		}
		
	}
}
