package ����;

import java.util.Scanner;

public class ����8 {

	public static String check(String num) {
		char gender = num.charAt(6);
		if(gender=='1' || gender=='3') {
			return "����";
		}else if(gender=='2' || gender=='4') {
			return "����";
		}
		return "�߸� �Է�";
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			String num = scan.next();
			
			
			if(num.equals("0")) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println(check(num));
			}
		}
		
		
	}

}
