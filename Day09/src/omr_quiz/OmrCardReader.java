package omr_quiz;

import java.util.Random;

public class OmrCardReader {

	Random ran = new Random();
	int[] ans = new int[5];
	int score = 0;

	OmrCardReader(){
		for(int i=0; i<5; i++) {
			int num = ran.nextInt(5)+1;
			ans[i] = num;
			System.out.print(num+" ");
		}
		System.out.println();
	}
	
	public void com(OmrCard o) {
		for(int i=0; i<5; i++) {
			if(this.ans[i] == o.ans[i]) {
				score+=20;
			}
		}
		System.out.println("이름 : "+o.name);
		System.out.println("학번 : "+o.hakbun);
		System.out.println("점수 : "+score+"점");
	}
}
