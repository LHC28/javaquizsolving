package �������迭;

import java.util.Scanner;

public class ������Ѱ��� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int i=0; i<T; i++) {
			int count = scan.nextInt();
			int[] scores = new int[count];
			int sum = 0;
			for(int j=0; j<count; j++) {
				scores[j] = scan.nextInt();
				sum+=scores[j];
			}
			double avg = sum/scores.length;
			double count1 = 0;
			for(int j=0; j<count; j++) {
				if(scores[j]<avg) {
					count1+=1;
				}
			}
			System.out.printf("%.3f", count1 / count * 100); //�Ҽ��� �� �ڸ����� ���
			System.out.println("%");
		}
	}
}
