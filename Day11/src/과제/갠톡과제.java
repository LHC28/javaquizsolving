package ����;

import java.util.Scanner;

public class ������� {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] scores = new int[8][2];
		for(int i=0; i<8; i++) {
			for(int j=0; j<2; j++) {
				if(j==0) {
					scores[i][j] = i/2;
				}else {
					System.out.print("������ �Է����ּ���. ");
					int score = sc.nextInt();
					scores[i][j] = score;
				}
			}
		}
		System.out.print("�г��� �Է��Ͻÿ�. ");
		int grade = sc.nextInt();
		grade-=1;
		for(int i=0; i<8; i++) {
			if(scores[i][0]==grade) {
				System.out.println((i+1)+"�г� 1�б� : "+scores[i][1]);
				System.out.println((i+1)+"�г� 2�б� : "+scores[i+1][1]);
				break;
			}
		}
	}

}
