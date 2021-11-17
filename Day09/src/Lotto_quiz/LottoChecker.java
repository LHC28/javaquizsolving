package Lotto_quiz;

import java.util.Random;

public class LottoChecker {

	int[] lotto = new int[6];
	
	public LottoChecker() {
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
				lotto[count]=num;
				count+=1;
			}
		}
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i]+" ");
		}
		System.out.println("��÷��ȣ");
	}
	
	public void check(Lotto l) {
		int count = 0;
		for(int i=0; i<6; i++) {
			if(l.lotto[i]==this.lotto[i]) {
				count+=1;
			}
		}
		if(count==6) {
			System.out.println("1��");
		}
		else if(count==5) {
			System.out.println("2��");
		}
		else if(count==4) {
			System.out.println("3��");
		}
		else if(count==3) {
			System.out.println("4��");
		}
		else {
			System.out.println("��");
		}
		System.out.println(count);
	}
}
