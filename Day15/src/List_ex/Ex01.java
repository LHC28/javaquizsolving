package List_ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(9);
		list.add(1);
		
		// List�� ���� 5�� ����ִ°�?
		boolean containValue = list.contains(5); //�ݺ����� ���� �ϳ��� Ȯ���� �ʿ䰡 ������
		System.out.println(containValue);
		System.out.println(list.contains(7));
		
		// �������� �����ϱ�
		list.sort(Comparator.naturalOrder()); //���Ϲ��� �ʾƵ� ���ĵǾ� ����ȴ�.
		System.out.println(list);
		
		// �������� �����ϱ�
		list.sort(Comparator.reverseOrder()); //static �޼ҵ��̱� ������ ������ ���̴�.
		System.out.println(list);
		
		// ����Ʈ�� ���� ����ִ��� Ȯ��
		
		System.out.println("����Ʈ�� ����ִ°�?" + list.isEmpty()); //��������� true, ���� Ȱ���ϴ� �޼ҵ�
		
		list.clear();
		System.out.println("����Ʈ�� ����ִ°�?"+ list.isEmpty());
		System.out.println(list);
		
		
	}

}
