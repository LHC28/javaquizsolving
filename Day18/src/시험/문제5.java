package 시험;

import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] scores = new int[3][3];
		
		int max = 0;
		
		for(int i=0; i<scores.length; i++) {
			System.out.println((i+1)+"번째 학생 점수는?");
			for(int j=0; j<scores[i].length; j++) {
				int score = scan.nextInt();
				if(score>100) {
					System.out.println("잘못된 값");
					j-=1;
				}else {
					scores[i][j] = score;
					if(score>max) {
						max = score;
					}
				}
				
			}
		}
		
		System.out.println("최고점은 "+max);
		
	}

}
