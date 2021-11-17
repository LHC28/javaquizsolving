package 과제;

import java.util.Scanner;

public class 갠톡과제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] scores = new int[8][2];
		for(int i=0; i<8; i++) {
			for(int j=0; j<2; j++) {
				if(j==0) {
					scores[i][j] = i/2;
				}else {
					System.out.print("성적을 입력해주세요. ");
					int score = sc.nextInt();
					scores[i][j] = score;
				}
			}
		}
		System.out.print("학년을 입력하시오. ");
		int grade = sc.nextInt();
		grade-=1;
		for(int i=0; i<8; i++) {
			if(scores[i][0]==grade) {
				System.out.println((i+1)+"학년 1학기 : "+scores[i][1]);
				System.out.println((i+1)+"학년 2학기 : "+scores[i+1][1]);
				break;
			}
		}
	}

}
