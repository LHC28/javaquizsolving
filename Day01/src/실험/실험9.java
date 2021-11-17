package 실험;

public class 실험9 {

	public static void main(String[] args) {

		int arr[][] = new int[5][5];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				int num = (int) (Math.random()*10);
				arr[i][j] = num;
				System.out.print(num+" ");
			}
			System.out.println();
		}

	}

}
