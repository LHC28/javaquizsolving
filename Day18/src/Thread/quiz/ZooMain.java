package Thread.quiz;

public class ZooMain {

	public static void main(String[] args) throws InterruptedException {

		Animal a1 = new Animal("����");
		Animal a2 = new Animal("����~");
		Animal a3 = new Animal("����");
		
		Thread th1 = new Thread(a1);
		Thread th2 = new Thread(a2);
		Thread th3 = new Thread(a3);
		
		th1.start();
		th2.start();
		th1.join();
		th2.join(); //���� �ٿ������� �� �� ����Ǽ� ���� ����Ǵµ�
		th3.start();
	}

}
