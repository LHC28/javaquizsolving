package stage1;

import java.util.Scanner;

public class 더하기사이클 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int num = N;
		int count = 0;
		
		while(true) {
			int num1 = num/10;
			int num2 = num%10;
			
			int num3 = num1 + num2;
			num = (num2*10) + (num3%10);
			count+=1;
			if(num==N) {
				System.out.println(count);
				break;
			}
		}
		
	}

}
