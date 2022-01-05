package ¹úÁı;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = 1;
		int number = 1;
		
		int answer = scan.nextInt();
		
		while(true) {
			if(num>=answer) {
				break;
			}else {
				num+=(6*number);
				number+=1;
			}
		}
		System.out.println(number);
	}
}
