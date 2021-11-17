package thread;

public class ThreadImplements implements Runnable {

	//Thread를 상속받게 된다면 동시에 다른 것을 상속받을 수 없기 때문에 제한이 생김.
//	implements를 사용하게 되면 다른 것도 상속받을 수 있다.
//	상황에 맞게 활용하면 된다.
	
	private String resource;
	
	public ThreadImplements(String resource) {
		this.resource = resource;
	}
	
	@Override
	public void run() {
		// 여기서 구현하는 내용이 쓰레드에서 수행된다.
		for(int i=0; i<10; i++) {
			System.out.println(this.resource);
			try {
				Thread.sleep(500); //0.5초
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
	}

}
