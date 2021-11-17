package function_quiz;

import java.util.Scanner;

public class Quiz02 {
	
	public static int getSum(int num) {
		int sum = 0;
		if(num>100) {
			num=100;
		}
		for(int i=1; i<=num; i++) {
			sum+=i;
		}
		return sum;
	}
	
	public static void getMin(int num1, int num2, int num3, int num4, int num5) {
		int min = 1000;
		if(min>num1) {
			min=num1;
		}
		if(min>num2) {
			min=num2;
		}
		if(min>num3) {
			min=num3;
		}
		if(min>num4) {
			min=num4;
		}
		if(min>num5) {
			min=num5;
		}
		System.out.println(min);
		
	}
	
	public static void getPrime(int num) {
		if(num>=2) {
			int count = 0;
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					count+=1;
				}
			}
			if(count==2) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			System.out.println("잘못 입력");
		}
		
			
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		1
//		System.out.print("수를 입력하세요 : ");
//		int num = scan.nextInt();
//		int sum = getSum(num);
//		System.out.println(sum);
		
//		2
//		System.out.println("수를 입력하시오 : ");
//		int num1 = scan.nextInt();
//		int num2 = scan.nextInt();
//		int num3 = scan.nextInt();
//		int num4 = scan.nextInt();
//		int num5 = scan.nextInt();
//		getMin(num1,num2,num3,num4,num5);
		
//		3
//		System.out.println("수 입력 : ");
//		int num = scan.nextInt();
//		getPrime(num);
		
		
	}

}
