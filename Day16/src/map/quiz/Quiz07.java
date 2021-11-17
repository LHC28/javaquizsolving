package map.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Person> people = new ArrayList<>();

		while (true) {
			System.out.println("1.�Է� 2.��� 3.���� 4.����");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.print("�̸��� �Է��ϼ��� : ");
				String name = scan.next();
				System.out.print("��������� �Է��ϼ���(000000) : ");
				int birth = scan.nextInt();
				Person p = new Person(name, birth);
				people.add(p);
				System.out.println("�ԷµǾ����ϴ�.");
//				System.out.println(people.add(p) ? "�Է¼���" : "�Է½���");

			} else if (sel == 2) {
				if (people.size() == 0) {
					System.out.println("����ֽ��ϴ�.");
				} else {
					for (int i = 0; i < people.size(); i++) {
						people.get(i).printPerson();
					}
				}

			} else if (sel == 3) {
				System.out.print("������ �̸��� �Է��ϼ��� : ");
				String name = scan.next();
				boolean check = false;
				for (int i = 0; i < people.size(); i++) {
					if (people.get(i).getName().equals(name)) {
						check = true;
						people.remove(i);
						System.out.println("�����Ǿ����ϴ�.");
					}
				}
				if (check = false) {
					System.out.println("�ش� �̸��� �����ϴ�.");
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
