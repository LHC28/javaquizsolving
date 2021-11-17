package 실험;

import java.util.Scanner;

public class 실험4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] array = new int[10];
		int re = 0;
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if(num>=0) {
				array[re] = num;
				re+=1;
				if(re==10) {
					System.out.println("가득");
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
				System.out.println("가장 큰수 : "+array[0]+" 두번째 : "+array[1]);
			}
		}
		sc.close();
	}

}
