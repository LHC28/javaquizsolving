package string_Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1
//		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		int count = 0;
//		for(int i=0; i<files.length; i++) {
//			if(files[i].endsWith("jpg")==true) { //true �� �ᵵ ��, �̸��� jpg�� �� �ִ� ��쿣 ȥ�� �����ϱ� ����.
//				count++;
//			}
//		}
//		System.out.println("jpg ������ ���� : " + count);
		
//		2
//		Scanner scan = new Scanner(System.in);
//		
//		String[] quizWord = {"�¸�","���","��ǻ��","��Ʈ��"};
//		String[] answerWord = {"victory","love","computer","notebook"};
//		int score = 0;
//		
//		for(int i=0; i<quizWord.length; i++) {
//			System.out.print(quizWord[i]+"�� ����� �Է��ϼ��� : ");
//			String answer = scan.next();
//			if(answer.equals(answerWord[i])) {
//				score+=100/quizWord.length;
//			}
//		}
//		System.out.println(score);
		
//		3
		String memberStr = "������:�۰�ȣ:���켺:�̹���:�۰�ȣ:�̹���:�̹���:������:�̺���:������";
		String[] names = memberStr.split(":");
		int count = 0;
		boolean isSame = false;
		
		for(int i=0; i<names.length-1; i++) {
			String name = names[i]; //�˻��� ������ �Ǵ� �̸�
			
			if(names.equals("")) { //������������ üũ�Ǽ� ��ĭ�� ��� skip
				continue; //�Ʒ� ���� �����ϰ� �������� �Ѿ �� Ȱ��
			}
			
			for(int j=i+1; j<names.length; j++) {
				if(name.equals(names[j])) {
					names[j] = "";
					isSame = true;
				}
			}
			if(isSame = true) {
				count++;
			}
		}
		System.out.println("�������� ���� �� : " + count);
		
	}

}
