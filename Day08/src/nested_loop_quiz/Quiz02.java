package nested_loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("크기를 입력하세요 : ");
		int row = scan.nextInt();
		
		for(int i=1; i<=row; i++) {
			int num = i;
			for(int j=0; j<i; j++) {
				System.out.print(num+" "); // 첫번째 열은 i(num)값을 그대로 출력한다.
				num = num + (row - 1 - j); // 그 다음 열의 값은 row-1 더한 값으로 시작하고, 그 다음 열로 계속 추가될수록 -1씩 감소해야하므로
//				1씩 증가하고 있는 j를 뺀다.
				
			}
			System.out.println( ); //행 바뀔 때 줄바꿈
			
		}
		
	}

}
