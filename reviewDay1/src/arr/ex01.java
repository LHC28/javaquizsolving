package arr;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1
//		int[] numbers = {3,5,2,10,39};
//		
//		System.out.print("변경할 index와 값을 입력하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		numbers[num1] = num2;
//		
//		for(int i=0; i<numbers.length; i++) {
//			System.out.print(numbers[i]+" ");
//		}
		
		//2
//		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		int sum = 0;
//		for(int i=0; i<scores.length; i++) {
//			if(scores[i]=='O') {
//				sum+=10;
//			}
//		}
//		System.out.println(sum+"점");
		
		//3
//		int[] works = {3, 5, 5, 3, 5, 3, 5};
//		int sum = 0;
//		for(int i=0; i<works.length; i++) {
//			if(i<5) {
//				sum+=(8500*works[i]);
//			}else {
//				sum+=(9500*works[i]);
//			}
//		}
//		System.out.println("일주일간 총 임금은 "+sum+"원");
		
		//4
		int[] nums = new int[5];
		int i = 0;
		while(i<5) {
			System.out.print("수를 입력하세요 : ");
			int num = scan.nextInt();
			if(num%2==0) {
				nums[i] = num;
				i++;
			}
		}
		for(int j=0; j<nums.length; j++) {
			System.out.print(nums[j]+" ");
		}
	}
}
