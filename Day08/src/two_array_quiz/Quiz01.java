package two_array_quiz;

public class Quiz01 {
	
	public static void printArray(int[][] arr) { //parameter
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) {

//		1
//		int[][] array = new int[2][3];
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				array[i][j] = 10;
//			}
//		}
//		for(int i=0; i<2; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		2
//		int[][] array = new int[3][4];
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++) {
//				array[i][j] = j+1;
//			}
//		}
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<4; j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		3
//		int[][] array = new int[3][3];
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				array[i][j] = i+1;
//			}
//		}
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		4
//		int[][] array = new int[5][5];
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				if(j==2 && i!=2) {
//					array[i][j]=3;
//				}else if(j!=2 && i==2) {
//					array[i][j] = 3;
//				}else if(i==2 && j==2) {
//					array[i][j]=3;
//				}else {
//					array[i][j] = 0;
//				}
//			}
//		}
//		
//		for(int i=0; i<5; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		5
//		int[][] array = new int[3][3];
//		int num = 1;
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				array[i][j] = num;
//				num+=1;
//			}
//		}
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
		
//		6
//		int[][] array = new int[3][3];
//		for(int i=0; i<3; i++) {
//			int num = i+1;
//			for(int j=0; j<3; j++) {
//				array[i][j] = num;
//				num+=3;
//			}
//		}
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<3; j++) {
//				System.out.print(array[i][j]+" ");
//			}
//			System.out.println();
//		}
		
	}

}
