package �ݺ���1;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// �ձ��ϱ�
//		System.out.print("���� �Է��ϼ��� : ");
//		int num = scan.nextInt();
//		int i = 1;
//		int sum = 0;
//		while(i<=num) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
		// ���丮��
		System.out.print("���� �Է��ϼ��� : ");
		int num = scan.nextInt();
		int i = 1;
		int sum = 1;
		if(num>10) {
			System.out.println("�ٽ� �Է��ϼ���.");
		}else {
			while(i<=num) {
				sum*=i;
				i++;
			}
			System.out.println(sum);
		}
	}
}
