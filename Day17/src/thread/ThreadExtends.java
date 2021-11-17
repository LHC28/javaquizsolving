package thread;

public class ThreadExtends extends Thread{ //jdk가 있어 사용가능

	private String resource;
	
	public ThreadExtends(String resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() { //쓰레드가 가지고 있는 것을 오버라이드(재정의) 하는 것
		//여기서 구현하는 내용이 쓰레드에서 수행되는 내용
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(500);
				//너무 빨리 찍히는 것을 방지하기 위해 0.5초씩 쉬면서 찍는다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.resource);
		}
	}
}
