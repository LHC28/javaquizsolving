package thread;

public class ThreadExtends extends Thread{ //jdk�� �־� ��밡��

	private String resource;
	
	public ThreadExtends(String resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() { //�����尡 ������ �ִ� ���� �������̵�(������) �ϴ� ��
		//���⼭ �����ϴ� ������ �����忡�� ����Ǵ� ����
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
				//�ʹ� ���� ������ ���� �����ϱ� ���� 0.5�ʾ� ���鼭 ��´�.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.resource);
		}
	}
}
