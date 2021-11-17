package thread;

public class Thread_ex01 {

	public static void main(String[] args) throws InterruptedException {

		ThreadExtends te1 = new ThreadExtends("●");
		ThreadExtends te2 = new ThreadExtends("○");
		
		// Single Thread : 순차적 수행
//		te1.run();
//		te2.run();
		
		//Multi Thread : 동시에 수행
//		te1.start(); //start()를 써야 스케쥴링을 해준다
//		te2.start();
		
		ThreadImplements ti1 = new ThreadImplements("■");
		ThreadImplements ti2 = new ThreadImplements("□");
		//위 2개와 메인까지 3개가 한번에 진행되는 것.
		
//		Single Thread : 순차적으로 수행
//		ti1.run();
//		ti2.run(); //멀티쓰레드가 아님.
		
		Thread th1 = new Thread(ti1); //직접 상속하지 않으면 클래스를 생성해서 만드는 방식.
		Thread th2 = new Thread(ti2);
		
		//Multi Thread
		th1.start();
		//th1이 끝나고 th2를 수행하고 싶을 때는 lock을 걸어야 한다. 이 때 lock은 메인에 거는 것이다.
		th1.join(); //th1쓰레드가 끝날 때까지 메인쓰레드가 기다린다.
		th2.start();
		th2.join();
		
		System.out.println("### 수행완료 ###"); //메인쓰레드에서 찍히는 것
		//수행속도가 너무 빨라서 메소드가 빠르게 끝나고 시행됨.
		
	}

}
