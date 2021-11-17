package Thread.quiz;

import java.util.Scanner;

public class StopWatchMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		StopWatch sw = new StopWatch();
		
		System.out.println("시작을 쓰면 스톱워치가 수행되고, 그만을 쓰면 스톱워치가 중단됩니다.");
		String word1 = scan.next();
		if(word1.equals("시작")) {
			sw.run();
		}else {
			System.out.println("잘못 입력");
		}
		
		String word2 = scan.next();
		if(word2.equals("그만")) {
			sw.setStop(false);
		}
		
		
	}

}
