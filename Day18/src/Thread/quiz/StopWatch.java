package Thread.quiz;

import java.util.Scanner;

public class StopWatch extends Thread{

	private boolean stop; //stop flag
	private int sec = 0;
	
	public void run() {
		while(!stop) {
			//���ѽ���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sec+=1;
			
		}
		//��������
		System.out.println("�ɸ��ð� : "+sec+"��");
	}
	
	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
