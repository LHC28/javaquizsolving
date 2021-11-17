package map.quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz04 {

	public static void main(String[] args) {

		Map<String, Map<String, String>> bookMap = new HashMap<>();

		Map<String, String> map1 = new HashMap<>();
		map1.put("�� �غ�", "�̼���,ȫ�ֿ�");
		map1.put("�� �׸�", "������");
		map1.put("�޸��� ����", "������ ����");

		Map<String, String> map2 = new HashMap<>();
		map2.put("�����", "�������丮");
		map2.put("�Ƹ��", "�տ���");
		map2.put("���̾� ��ȭ���� ����", "�����ó� ���̰�");
		map2.put("�غ��� ī��ī", "����ī�� �Ϸ�Ű");

		Map<String, String> map3 = new HashMap<>();
		map3.put("�ð��� �帣�� �ʴ´�", "ī���� �κ���");
		map3.put("�ڽ���", "Į ���̰�");
		map3.put("�������", "��ġ�� ī��");

		bookMap.put("�ڱ���", map1);
		bookMap.put("�Ҽ�", map2);
		bookMap.put("����", map3);
		System.out.println(bookMap);

		Set<String> kind = new HashSet<>();
		kind = bookMap.keySet();
		Iterator<String> kinds = kind.iterator();

		// å �̸� �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("å�̸��� �Է����ּ���: ");
		String searchBook = scan.nextLine();

		
		while (kinds.hasNext()) {
			String kind1 = kinds.next();
			Set<String> title = new HashSet<>();
			title = bookMap.get(kind1).keySet();
			Iterator<String> title1 = title.iterator();
			while (title1.hasNext()) {
				String bookTitle = title1.next();
				if (bookTitle.equals(searchBook)) {
					System.out.println(bookTitle + "�� �۰����� " + bookMap.get(kind1).get(bookTitle));
					break;
				}
			}
		}
		//.contains�� Ȱ���ϴ� ���
//		Iterator<String> iter = bookMap.keySet().iterator();
//		while(iter.hasNext()) {
//			String genre = iter.next();
//			Map<String, String> book = bookMap.get(genre).get(searchBook);
//			if(book.containsKey(searchBook)) {
//				String author = bookMap.get(genre).get(searchBook)
//			}
//		}
		
		//�ٷ� get�� �Ͽ� �ִ��� ������ ���θ� ���ؼ� Ȯ��
		
	}

}
