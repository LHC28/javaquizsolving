package class_ex;

public class Ex01 {

	public static void main(String[] args) {
		
//		��ü�� �����. �ν��Ͻ�ȭ�Ѵ�.
		ScoreData sd1 = new ScoreData();
		
		//�ʵ忡 �� �ֱ�
		sd1.score = 85;
		sd1.subject = "����";
		sd1.ranking = 7;
		
		// �ʵ尪 ����ϱ�
		System.out.println(sd1.score);
		System.out.println(sd1.subject);
		System.out.println(sd1.ranking);
		
		sd1.printScoreInfo();
		
	}

}
