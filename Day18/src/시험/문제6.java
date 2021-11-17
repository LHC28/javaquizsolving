package 시험;

import java.util.Random;
import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		String[][] box = new String[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				int num = ran.nextInt(3);
				if(num==0) {
					box[i][j] = "A";
				}else if(num==1) {
					box[i][j] = "B";
				}else if(num==2) {
					box[i][j] = "C";
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(box[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.print("문자를 입력하시오 : ");
		String word = scan.next();
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(box[i][j].equals(word)) {
					System.out.print(box[i][j]+" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
