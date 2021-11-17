package thread;

public class ThreadImplements implements Runnable {

	//Thread�� ��ӹް� �ȴٸ� ���ÿ� �ٸ� ���� ��ӹ��� �� ���� ������ ������ ����.
//	implements�� ����ϰ� �Ǹ� �ٸ� �͵� ��ӹ��� �� �ִ�.
//	��Ȳ�� �°� Ȱ���ϸ� �ȴ�.
	
	private String resource;
	
	public ThreadImplements(String resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		// ���⼭ �����ϴ� ������ �����忡�� ����ȴ�.
		for(int i=0; i<10; i++) {
			System.out.println(this.resource);
			try {
				Thread.sleep(500); //0.5��
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}

}
