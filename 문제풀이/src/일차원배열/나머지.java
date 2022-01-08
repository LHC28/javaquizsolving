package 일차원배열;

import java.util.Scanner;

public class 나머지 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[10];
		for(int i=0; i<nums.length; i++) {
			int num = scan.nextInt();
			nums[i] = num%42;
		}
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]==nums[j]) {
					nums[i]=-1;
				}
			}
		}
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i]!=-1) {
				count+=1;
			}
		}
		System.out.println(count);
	}
}
