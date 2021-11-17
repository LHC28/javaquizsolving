package map.quiz;

import java.util.Scanner;

public class 과제1 {
	
	public static void sumWord(String word1, String word2) {
		String sum = word1+word2;
		System.out.println("결과 : "+sum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 문자열?");
		String word1 = sc.next();
		System.out.print("두번째 문자열?");
		String word2 = sc.next();
		
		sumWord(word1, word2);
	}

}
