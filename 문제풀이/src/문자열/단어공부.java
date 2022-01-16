package 문자열;

import java.util.Scanner;

public class 단어공부 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String T = scan.next();
		String word = T.toUpperCase();
		int num=0; int count=0;
		for(int i=65; i<91; i++) {
			int count1 = 0;
			for(int j=0; j<word.length(); j++) {
				int c = (int)word.charAt(j);
				if(c==i) {
					count1+=1;
				}
			}
			if(count1>count) {
				count=count1;
				num = i;
			}else if(count1==count && count!=0) {
				count = -1;
				break;
			}
		}
		//확인  
		if(count==-1) {
			System.out.println("?");
		}else {
			System.out.println((char)num);
		}
	}
}
