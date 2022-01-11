package 문자열;

import java.util.Scanner;

public class 숫자의합 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		String nums = scan.next();
		
		int sum = 0;
		for(int i=0; i<nums.length(); i++) {
			int num = Integer.parseInt(nums.substring(i,i+1));
			sum+=num;
		}
		System.out.println(sum);
	}
}
