package 일차원배열;

import java.util.Scanner;

public class 최소최대 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] nums = new int[N];
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		int max = nums[0];
		int min = nums[0];
		for(int i=0; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
			}else if(min>nums[i]) {
				min = nums[i];
			}
		}
		System.out.println(min+" "+max);
	}
}
