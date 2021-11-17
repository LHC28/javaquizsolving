package 시험;

import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[][] nums1 = new int[2][3];
		int[][] nums2 = new int[2][3];
		int[][] sum = new int[2][3];
		
		System.out.println("첫 번째 배열 원소를 입력하시오");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				int num = scan.nextInt();
				nums1[i][j] = num;
			}
		}
		
		System.out.println("두 번째 배열 원소를 입력하시오");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				int num = scan.nextInt();
				nums2[i][j] = num;
			}
		}
		
		System.out.println();
		System.out.println("배열1");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(nums1[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("배열2");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(nums2[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("배열 합");
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				sum[i][j] = nums1[i][j]+nums2[i][j];
				System.out.print(sum[i][j]);
			}
			System.out.println();
		}
		
	}

}
