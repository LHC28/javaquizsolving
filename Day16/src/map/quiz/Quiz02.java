package map.quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz02 {

	public static void main(String[] args) {

		Map<String, Character> names = new HashMap<>();
//		���缮, �ڳ���, ������, ������, �̱���
		names.put("���缮", 'X');
		names.put("�ڳ���", 'X');
		names.put("������", 'X');
		names.put("������", 'X');
		names.put("�̱���", 'X');
		
		Set<String> name = new HashSet<>();
		name = names.keySet();
		Iterator<String> getName = name.iterator();
		
		//.startWith�� Ȱ���ϴ� ����� �ִ�.
		while(getName.hasNext()) {
			String name1 = getName.next();
			char lastName = name1.charAt(0);
			if(lastName=='��') {
				names.put(name1, 'O');
			}
		}
		System.out.println(names);
	}

}
