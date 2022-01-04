package String;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("ID를 입력 하세요 : ");
//		String id = scan.next();
//		
//		System.out.println("Welcome! "+id);
		
		System.out.println("단어를 입력하세요 : ");
		String word = scan.next();
		
		int count = 0;
		for(int i=0; i<word.length(); i++) {
			char spell = word.charAt(i);
			if(spell=='e') {
				count+=1;
			}
		}
		System.out.println(count);
	}
}
