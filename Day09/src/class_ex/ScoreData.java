package class_ex;

//���赵(�ؾ Ʋ)
public class ScoreData {
	// �Ӽ� : �������, �ʵ�(field)
	int score;
	String subject;
	int ranking;
	
	//���� : �޼ҵ�(method)
	public void printScoreInfo() {
		System.out.println("����� : "+this.subject);
		System.out.println("�� ���� : "+this.score);
		System.out.println("��� : "+ this.ranking);
		
		
	}
}
