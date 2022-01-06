package 달팽이는올라가고싶다;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt(); int B = scan.nextInt(); int V = scan.nextInt();
		int h = 0;
		int day=0;
		if(A-B==2) {
			day = (V/(A-B))-1;
		}else {
			if(V%(A-B+1)!=0) {
				day = V/(A-B+1)+1;
			}else {
				day = V/(A-B+1);
			}
			
		}
		System.out.println(day);
	}
}
