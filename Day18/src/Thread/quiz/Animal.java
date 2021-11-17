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
				Thread.sleep(1000); //�� �޼ҵ� ��ü�� C���� �Ǿ��ֱ� ������ �ڹٰ� ��Ʈ�� �� �� ���� try catch�� �� ���ۿ� ����.
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
