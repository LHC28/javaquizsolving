package 일차원배열;

import java.util.Scanner;

public class OX퀴즈 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		String[] scores = new String[T];
		for(int i=0; i<T; i++) {
			scores[i] = scan.next();
		}
		for(int i=0; i<scores.length; i++) {
			int count=0;
			int score = 0;
			for(int j=0; j<scores[i].length(); j++) {
				if(scores[i].charAt(j)=='O') {
					count+=1;
					if(count>=1) {
						score+=count;
					}else if(count==0) {
						score+=1;
					}
				}else if(scores[i].charAt(j)=='X') {
					count=0;
				}
			}
			System.out.println(score);
		}
	}
}
