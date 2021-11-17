package map.quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {

		Map<String, Integer> scores = new HashMap<>();
		//���� �ѹ��� �ִ� ����� ���� ������ �ϳ��� put���� �־�� �Ѵ�.
		scores.put("����", 90);
		scores.put("����", 85);
		scores.put("����", 90);
		scores.put("��ȸ", 80);
		scores.put("����", 100);
		System.out.println(scores);
		
		scores.put("��ȸ", 85);
		System.out.println(scores);
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("��ȸ�� ������� �Է��ϼ��� : ");
//		String subject = scan.next();
//		if(scores.containsKey(subject)) {
//			System.out.println(subject+" : "+scores.get(subject));
//		}else {
//			System.out.println("����");
//		}
		
		Set<String> subjects = new HashSet<>();
		subjects = scores.keySet();
		Iterator<String> iter = subjects.iterator();
		//�ѹ��� iterator�� �Ѱܵ� �����ϴ�.
//		while(iter.hasNext()) {
//			String subject = iter.next();
//			if(scores.get(subject)>=90) {
//				System.out.print(subject+" ");
//			}
//		}
//		System.out.println();
		
		boolean check = false;
		while(iter.hasNext()) {
			String subject = iter.next();
			if(scores.get(subject)==100) {
				check = true;
				System.out.println(check);
				break;
			}
		}
		if(check==true) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� �Ұ���");
		}
		//containsValue�� Ȱ���ϸ� �����ϰ� �����ϴ�.
		
		
		
	}

}
