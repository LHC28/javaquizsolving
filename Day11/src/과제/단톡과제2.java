package 과제;

import java.util.Scanner;

public class 단톡과제2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				int num = (int)(Math.random()*10-1)+1;
				arr[i][j] = num;
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.print("숫자를 입력하시오. ");
		int num = sc.nextInt();
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(arr[i][j]<num) {
					System.out.print("X ");
				}else {
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
