package ����;

import java.util.Scanner;

public class ����8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		
		while(true) {
			System.out.print("���� �Է� : ");
			int num = scan.nextInt();
			
			if(num!=0) {
				sum+=num;
				count+=1;
			}else if(num==0){
				double avg = sum/count+sum%count;
				System.out.println("����� "+avg);
			}
			
			
			
		}
	}

}
