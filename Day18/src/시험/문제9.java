package ����;

import java.util.Scanner;

public class ����9 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] nums1 = new int[5];
		int[] nums2 = new int[5];
		int[] nums = new int[10];
		
		System.out.println("1��° �迭 ���Ҹ� �Է��Ͻÿ�.");
		for(int i=0; i<5; i++) {
			int num = scan.nextInt();
			nums1[i] = num;
		}
		
		System.out.println("2��° �迭 ���Ҹ� �Է��Ͻÿ�.");
		for(int i=0; i<5; i++) {
			int num = scan.nextInt();
			nums2[i] = num;
		}
		
		for(int i=0; i<10; i++) {
			if(i<5) {
				nums[i] = nums1[i];
			}else {
				nums[i] = nums2[i-5];
			}
		}
		for(int i=0; i<9; i++) {
			for(int j=i+1; j<10; j++) {
				if(nums[i]>nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println("���İ��");
		for(int i=0; i<10; i++) {
			System.out.print(nums[i]+" ");
		}
		
	}

}
