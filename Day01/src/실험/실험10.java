package 실험;

import java.util.Random;
import java.util.Scanner;

public class 실험10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int arr[] = {65,66,67};
		int num = ran.nextInt(3);
		int com = arr[num];
		
		while(true) {
			System.out.println(com);
			System.out.println("A,B,C 중 맞춰보시오");
			String ans = scan.next();
			char me = ans.charAt(0);
			int me1 = (int)me;
			if(com==me1) {
				System.out.println("맞았습니다.");
				break;
			}else {
				System.out.println("틀렸습니다.");
			}
		}
		
	}

}
