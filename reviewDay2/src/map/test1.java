package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> test = new HashMap<>();
		test.put("����", 90);
		test.put("��ȸ", 80);
		test.put("����", 100);
		test.put("����", 85);
		test.put("����", 90);
		
		System.out.println(test);
		
		test.put("��ȸ", 85);
		System.out.println(test);
		
//		System.out.print("��ȸ�� ������� �Է��ϼ��� : ");
//		String subject = scan.next();
//		
//		if(test.containsKey(subject)) {
//			System.out.println(subject+" : "+test.get(subject));
//		}else {
//			System.out.println("�ڷ� ����");
//		}
		
		if(test.containsValue(100)) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� �Ұ���");
		}
		
	}
}
