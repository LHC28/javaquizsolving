package Thread.quiz;

public class ZooMain {

	public static void main(String[] args) throws InterruptedException {

		Animal a1 = new Animal("어흥");
		Animal a2 = new Animal("음메~");
		Animal a3 = new Animal("히잉");
		
		Thread th1 = new Thread(a1);
		Thread th2 = new Thread(a2);
		Thread th3 = new Thread(a3);
		
		th1.start();
		th2.start();
		th1.join();
		th2.join(); //같이 붙여놓으면 둘 다 적용되서 같이 실행되는듯
		th3.start();
	}

}
