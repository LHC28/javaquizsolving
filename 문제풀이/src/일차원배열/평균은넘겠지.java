package 일차원배열;

import java.util.Scanner;

public class 평균은넘겠지 {
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
			System.out.printf("%.3f", count1 / count * 100); //소수점 세 자리까지 출력
			System.out.println("%");
		}
	}
}
