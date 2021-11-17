package 시험;

import java.util.Scanner;

public class 문제8 {

	public static String check(String num) {
		char gender = num.charAt(6);
		if(gender=='1' || gender=='3') {
			return "남자";
		}else if(gender=='2' || gender=='4') {
			return "여자";
		}
		return "잘못 입력";
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String num = scan.next();
			
			
			if(num.equals("0")) {
				System.out.println("종료");
				break;
			}
			else {
				System.out.println(check(num));
			}
		}
		
		
	}

}
