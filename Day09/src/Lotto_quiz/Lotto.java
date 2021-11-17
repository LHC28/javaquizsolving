package Lotto_quiz;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	int[] lotto = new int[6];
	
	public void manual(int num1, int num2, int num3, int num4, int num5, int num6) {
		Scanner scan = new Scanner(System.in);

		lotto[0] = num1;
		lotto[1] = num2;
		lotto[2] = num3;
		lotto[3] = num4;
		lotto[4] = num5;
		lotto[5] = num6;
		
		boolean check = false;
		for(int i=0; i<6; i++) {
			if(lotto[i]<0 || lotto[i]>45) {
				check = true;
			}
		}
		if(check==true) {
			System.out.println("번호 잘못 입력");
			lotto = null;
		}
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
	}
	
	public void auto() {
		Random ran = new Random();
		int count = 0;
		while(count<6) {
			int num = ran.nextInt(45)+1;
			boolean check = false;
			for(int i=0; i<count; i++) {
				if(lotto[i]==num) {
					check = true;
				}
			}
			if(check==false) {
				lotto[count] = num;
				count+=1;
			}
		}
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println();
	}
}
