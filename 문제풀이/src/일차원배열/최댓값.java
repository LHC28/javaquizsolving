package �������迭;

import java.util.Scanner;

public class �ִ� {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[9];
		for(int i=0; i<nums.length; i++) {
			nums[i] = scan.nextInt();
		}
		int max = 0;
		int num = 0;
		for(int i=0; i<nums.length; i++) {
			if(max<nums[i]) {
				max = nums[i];
				num = i;
			}
		}
		System.out.println(max);
		System.out.println(num+1);
	}
}
