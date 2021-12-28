package arr;

import java.util.Random;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//1
//		int[] numbers = {3, 5, 2, 10, 39};
//		
//		System.out.println("두 개의 index를 입력하세요 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		
//		int temp = numbers[num1];
//		numbers[num1] = numbers[num2];
//		numbers[num2] = temp;
//		
//		for(int i=0; i<numbers.length; i++) {
//			System.out.print(numbers[i]+" ");
//		}
		
		//2
//		int[] nums = {1,2,3,4,5,6,7,8,9,10};
//		Random ran = new Random();
//		for(int i=0; i<100; i++) {
//			int randomIndex = ran.nextInt(10);
//			int temp = nums[0];
//			nums[0] = nums[randomIndex];
//			nums[randomIndex] = temp;
//		}
//		for(int i=0; i<nums.length; i++) {
//			System.out.print(nums[i]+" ");
//		}
		
		//3
		int[] numbers3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		
		for(int i=1; i<=5; i++) {
			int count = 0;
			for(int j=0; j<numbers3.length; j++) {
				if(i==numbers3[j]) {
					count++;
				}
			}
			System.out.println(i+" : "+count+"개");
		}
	}
}
