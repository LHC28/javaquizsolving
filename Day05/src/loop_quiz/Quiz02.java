package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("È¦¼ö ÀÔ·Â : ");
		int num = scan.nextInt();
		
		int count = 0;
		
		for(int i=0; i<num; i++) {
			if(i<=num/2) {
				for(int j=0; j<i; j++) {
					System.out.print("-");
				}
				for(int j=0; j<num-2*i; j++) {
					if(j%2==0) {
						System.out.print("*");
					}else if(j%2==1) {
						System.out.print("+");
					}
				}
				for(int j=0; j<i; j++) {
					System.out.print("-");
				}
				System.out.println();			
			}

			else if(i>num/2) {
				count+=1;
				for(int j=i+1; j<num; j++) {
					System.out.print("-");
				}
				for(int j=0; j<((count*2)+1); j++) {
					if(j%2==0) {
						System.out.print("*");
					}else if(j%2==1) {
						System.out.print("+");
					}
				}
				for(int j=i+1; j<num; j++) {
					System.out.print("-");
				}
				System.out.println();
			}
			
		}
	}

}
