package map.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<String> fruits = new ArrayList<>();

		
		//CRUD - create, read, update, delete
		while (true) {
			System.out.print("1:�Է� 2:��� 3:���� 4:����");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.print("���� �̸��� �Է��ϼ��� : ");
				String name = scan.next();
				if(fruits.contains(name)) {
					System.out.println("�̹� �ֽ��ϴ�.");
				}else {
					fruits.add(name);
					System.out.println("�Է� ����");
				}
				
				//�� ���̴� �͵� �����ϴ�.
//				boolean isSuccess = fruits.add(fruit);
//				System.out.println(isSuccess ? "�����߽��ϴ�" : "�����߽��ϴ�.");
				
			} else if (sel == 2) {
				if(fruits.isEmpty()) {
					System.out.println("����ֽ��ϴ�.");
					continue;
				}
				//iterator�� Ȱ���� ���� ����
				for(int i=0; i<fruits.size(); i++) {
					System.out.println(fruits.get(i));
				}
			} else if (sel == 3) {
				System.out.print("������ ���� �̸��� �Է��ϼ��� : ");
				String name = scan.next();
				if(fruits.contains(name)) {
					for(int i=0; i<fruits.size(); i++) {
						if(fruits.get(i).equals(name)) {
							fruits.remove(i);
							System.out.println("�����Ǿ����ϴ�.");
						}
					}
				}else {
					System.out.println("�ش� ���� �̸��� �����ϴ�.");
				}
			} else if (sel == 4) {
				System.out.println("����Ǿ����ϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}

}
