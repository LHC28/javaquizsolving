package 실험;

import java.util.Scanner;

public class 실험7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("알파뱃 입력 : ");
		String cha = scan.next();
		char ch = cha.charAt(0);
		int num = (int)ch;
		if(num>=65 && num<=90) {
			num+=32;
			
		}else if(num>=97 && num<=122) {
			num-=32;
		}
		ch = (char)num;
		System.out.println(ch);
		
		//65~90
		//97~122
		
		
	}

}
