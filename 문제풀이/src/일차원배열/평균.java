package 일차원배열;

import java.util.Scanner;

public class 평균 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		double[] scores = new double[N];
		double max = 0;
		for(int i=0; i<scores.length; i++) {
			scores[i] = scan.nextInt();
			if(scores[i]>max) {
				max = scores[i];
			}
		}
		double sum = 0;
		for(int i=0; i<scores.length; i++) {
			scores[i] = (scores[i]/max)*100;
			sum+=scores[i];
		}
		double avg = sum/scores.length;
		System.out.println(Math.round((sum/scores.length)*1000000)/1000000.0);
		
	}
}
