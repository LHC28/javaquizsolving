package loop_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("3<=n<=99������ ���ڸ� �Է� : ");
		int num = scan.nextInt();
		if(num<3 || num>99) {
			System.out.println("���� �߸� �Է�");
		}else {
			for(int i=1; i<=num; i++) {
				int sum = i;
				System.out.print(sum+" ");
				
				for(int j=0; j<i-1; j++) {
					sum+=num-1-j;
					System.out.print(sum+" ");
				}
				System.out.println();
			}
		}
	}

}
