package thread;

public class Thread_ex01 {

	public static void main(String[] args) throws InterruptedException {

		ThreadExtends te1 = new ThreadExtends("��");
		ThreadExtends te2 = new ThreadExtends("��");
		
		// Single Thread : ������ ����
//		te1.run();
//		te2.run();
		
		//Multi Thread : ���ÿ� ����
//		te1.start(); //start()�� ��� �����층�� ���ش�
//		te2.start();
		
		ThreadImplements ti1 = new ThreadImplements("��");
		ThreadImplements ti2 = new ThreadImplements("��");
		//�� 2���� ���α��� 3���� �ѹ��� ����Ǵ� ��.
		
//		Single Thread : ���������� ����
//		ti1.run();
//		ti2.run(); //��Ƽ�����尡 �ƴ�.
		
		Thread th1 = new Thread(ti1); //���� ������� ������ Ŭ������ �����ؼ� ����� ���.
		Thread th2 = new Thread(ti2);
		
		//Multi Thread
		th1.start();
		//th1�� ������ th2�� �����ϰ� ���� ���� lock�� �ɾ�� �Ѵ�. �� �� lock�� ���ο� �Ŵ� ���̴�.
		th1.join(); //th1�����尡 ���� ������ ���ξ����尡 ��ٸ���.
		th2.start();
		th2.join();
		
		System.out.println("### ����Ϸ� ###"); //���ξ����忡�� ������ ��
		//����ӵ��� �ʹ� ���� �޼ҵ尡 ������ ������ �����.
		
	}

}
