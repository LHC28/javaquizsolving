package 과제;

import java.util.Scanner;

public class 단톡과제1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char[] name = {'J','u','n','g','a','h'};
		
		System.out.println("몇번째 알파뱃을 프린트할까요? ");
		int num = sc.nextInt();
		num-=1;
		if(num>=0 && num<=5) {
			System.out.println(name[num]);
		}
		else {
			System.out.println("범위에 벗어났습니다.");
		}
		
	}

}
