package 문자열;

import java.util.Scanner;

public class 알파뱃찾기 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();
		for(int i=97; i<123; i++) {
			int location = -1;
			for(int j=0; j<S.length(); j++) {
				int num = (int)S.charAt(j);
				if(i==num) {
					if(location==-1) {
						location=j;
					}
				}
			}
			System.out.print(location+" ");
		}
	}
}
