package Thread.quiz;

public class Animal implements Runnable {

	private String bark;
	
	Animal(String bark){
		this.bark = bark;
	}

	@Override
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println(bark);
			try {
				Thread.sleep(1000); //이 메소드 자체가 C언어로 되어있기 때문에 자바가 컨트롤 할 수 없어 try catch로 할 수밖에 없다.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
