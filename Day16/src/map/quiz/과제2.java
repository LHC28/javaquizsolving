package map.quiz;

import java.util.Scanner;

public class 과제2 {
	
	static double[][] score = new double[4][2];
	
	public static void printScore(int grade) {
		for(int i=0; i<score[grade-1].length; i++) {
			System.out.println(grade+"학년 1학기 "+score[grade-1][i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print("성적을 입력하세요 : ");
				double num = sc.nextDouble();
				score[i][j] = num;
			}
		}
		
		int grade;
		
		System.out.println("학년은?");
		grade = sc.nextInt();
		
		printScore(grade);
		
		
		
	}

}
