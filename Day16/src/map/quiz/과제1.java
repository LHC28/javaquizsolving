package map.quiz;

import java.util.Scanner;

public class ����1 {
	
	public static void sumWord(String word1, String word2) {
		String sum = word1+word2;
		System.out.println("��� : "+sum);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���ڿ�?");
		String word1 = sc.next();
		System.out.print("�ι�° ���ڿ�?");
		String word2 = sc.next();
		
		sumWord(word1, word2);
	}

}
