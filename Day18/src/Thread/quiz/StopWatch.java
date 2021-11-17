package Thread.quiz;

import java.util.Scanner;

public class StopWatch extends Thread{

	private boolean stop; //stop flag
	private int sec = 0;
	
	public void run() {
		while(!stop) {
			//무한실행
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sec+=1;
			
		}
		//실행종료
		System.out.println("걸린시간 : "+sec+"초");
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
