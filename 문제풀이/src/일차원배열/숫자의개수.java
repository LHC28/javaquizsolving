package 일차원배열;

import java.util.Scanner;

public class 숫자의개수 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int[] nums = new int[10];
		int count = 0;
		String D = String.valueOf(A*B*C);
		for(int i=0; i<D.length(); i++) {
			int a = Character.getNumericValue(D.charAt(i));
			if(a==0) {
				count+=1;
			}
			for(int j=1; j<nums.length; j++) {
				if(a==j) {
					nums[j]+=1;
				}
			}
		}
		System.out.println(count);
		for(int i=1; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
	}
}
