package ����;

import java.util.Scanner;

public class ����4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		int re = 0;
		while(true) {
			System.out.print("���� �Է� : ");
			int num = sc.nextInt();
			if(num>=0) {
				array[re] = num;
				re+=1;
				if(re==10) {
					System.out.println("����");
					break;
				}
			}else {
				for(int i=0; i<10; i++) {
					for(int j=i; j<10; j++) {
						if(array[j]>array[i]) {
							int temp = array[i];
							array[i] = array[j];
							array[j] = temp;
						}
					}
				}
				System.out.println("���� ū�� : "+array[0]+" �ι�° : "+array[1]);
			}
		}
		sc.close();
	}

}
