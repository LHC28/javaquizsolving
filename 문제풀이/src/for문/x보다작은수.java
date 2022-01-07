package for문;

import java.util.Scanner;

public class x보다작은수 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int[] nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = scan.nextInt();
		}
		for(int i=0; i<nums.length; i++) {
			if(nums[i]<X) {
				System.out.print(nums[i]+" ");
			}
		}
	}
}
