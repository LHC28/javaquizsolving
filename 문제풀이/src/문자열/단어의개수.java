package ���ڿ�;

import java.util.Scanner;

public class �ܾ��ǰ��� {
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
