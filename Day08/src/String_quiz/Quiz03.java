package String_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
//		1
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int num = 0;
		for(int i=0; i<files.length; i++) {
			if(files[i].contains(".jpg")) {
				num+=1;
			}
		}
		System.out.println("jpg ���� ���� : "+num);
		
//		2
		String[] han = {"�¸�","���","��ǻ��","��Ʈ��"};
		String[] ans = {"victory","love","computer","notebook"};
		int score = 0;
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(han[i]+"�� ����� �Է��ϼ��� : ");
			String eng = scan.next();
			if(ans[i].equals(eng)) {
				score+=25;
			}
		}
		System.out.println("������ "+score+"�� �Դϴ�.");
		
//		3
		String memberStr = "������:�۰�ȣ:���켺:�̹���:�۰�ȣ:�̹���:�̹���:������:�̺���:������";
		String[] memberArr = memberStr.split(":");
		int sameName = 0;
		
		for(int i=0; i<memberArr.length-1; i++) {
			boolean check = false;
			if(!memberArr[i].equals("")) {
				for(int j=i+1; j<memberArr.length; j++) {
					if(memberArr[i].equals(memberArr[j])) {
						check = true;
						break;
					}
				}
				if(check == true) {
					sameName+=1;
					for(int j=i+1; j<memberArr.length; j++) {
						if(memberArr[i].equals(memberArr[j])) {
							memberArr[j] = "";
						}
					}
				}

			}
		}
		System.out.println("�������� ���� �� : "+sameName);

	}

}
