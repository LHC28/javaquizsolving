package Thread.quiz;

import java.util.Scanner;

public class StopWatchMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		StopWatch sw = new StopWatch();
		
		System.out.println("������ ���� �����ġ�� ����ǰ�, �׸��� ���� �����ġ�� �ߴܵ˴ϴ�.");
		String word1 = scan.next();
		if(word1.equals("����")) {
			sw.run();
		}else {
			System.out.println("�߸� �Է�");
		}
		
		String word2 = scan.next();
		if(word2.equals("�׸�")) {
			sw.setStop(false);
		}
		
		
	}

}
