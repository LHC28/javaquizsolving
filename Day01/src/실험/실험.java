package 실험;

public class 실험 {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(j==i) {
					System.out.print(i+1+" ");
					
				}else if(j==4-i) {
					System.out.print(i+1+" ");
				}
				else if(j!=i){
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
