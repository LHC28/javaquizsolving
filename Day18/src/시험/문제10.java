package 시험;

import java.util.Random;
import java.util.Scanner;

public class 문제10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] lotto = new int[4];
		int[] me = new int[4];
		int check = 0;
		
		for(int i=0; i<4; i++) {
			int num = ran.nextInt(20)+1;
			lotto[i] = num;
		}
		
		System.out.println("네 숫자를 입력하시오.");
		for(int i=0; i<4; i++) {
			int num = scan.nextInt();
			me[i] = num;
		}
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(lotto[i]==me[j]) {
					check+=1;
				}
			}
		}
		
		System.out.print("당첨 번호는 ");
		for(int i=0; i<4; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
		
		if(check==4) {
			System.out.println("1등");
		}else if(check==3) {
			System.out.println("2등");
		}else if(check==2) {
			System.out.println("3등");
		}else {
			System.out.println("꽝");
		}
		
	}

}
