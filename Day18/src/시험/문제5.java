package ����;

import java.util.Scanner;

public class ����5 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] scores = new int[3][3];
		
		int max = 0;
		
		for(int i=0; i<scores.length; i++) {
			System.out.println((i+1)+"��° �л� ������?");
			for(int j=0; j<scores[i].length; j++) {
				int score = scan.nextInt();
				if(score>100) {
					System.out.println("�߸��� ��");
					j-=1;
				}else {
					scores[i][j] = score;
					if(score>max) {
						max = score;
					}
				}
				
			}
		}
		
		System.out.println("�ְ����� "+max);
		
	}

}
