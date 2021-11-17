package nested_loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1.모래시계
		
		//(1) 행을 반으로 나눈다.
		//(2) 열을 구성하는 요소를 분리한다.
		//    2-1. - 를 출력하는 규칙을 찾는다. => 삼각형
		//    2-2. *+를 출력하는 규칙을 찾는다. => row / 2 몫에서부터 행마다 하나씩 감소
		//    2-3. *를 출력하는 규칙을 찾는다. => 무조건 하나씩 출력
		//    2-4. -를 출력하는 규칙을 찾는다. => 삼각형(2-1과 같음)
		Scanner scan = new Scanner(System.in);
		System.out.println("크기를 입력하세요 : ");
		int row = scan.nextInt();
		
		for(int i=0; i<=row/2; i++) { //가운데 행 포함
			//2-1. - 출력
			for(int j=0; j<i; j++) {
				System.out.print("-");
			}
			//2-2 *+ 출력
			for(int j=0; j<(row/2)-i; j++) {
				System.out.print("*+");
			}
			
			//2-3. * 출력
			System.out.print("*");
			
			//2-4
			for(int j=0; j<i; j++) {
				System.out.print("-");
			}
			
			
			System.out.println(); //줄바꿈
		}

	}

}
