package map.quiz;

import java.util.Scanner;

public class ����2 {
	
	static double[][] score = new double[4][2];
	
	public static void printScore(int grade) {
		for(int i=0; i<score[grade-1].length; i++) {
			System.out.println(grade+"�г� 1�б� "+score[grade-1][i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.print("������ �Է��ϼ��� : ");
				double num = sc.nextDouble();
				score[i][j] = num;
			}
		}
		
		int grade;
		
		System.out.println("�г���?");
		grade = sc.nextInt();
		
		printScore(grade);
		
		
		
	}

}
