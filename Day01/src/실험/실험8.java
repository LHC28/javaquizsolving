package 실험;

import java.util.Scanner;

public class 실험8 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		
		while(true) {
			System.out.print("정수 입력 : ");
			int num = scan.nextInt();
			
			if(num!=0) {
				sum+=num;
				count+=1;
			}else if(num==0){
				double avg = sum/count+sum%count;
				System.out.println("평균은 "+avg);
			}
			
			
			
		}
	}

}
