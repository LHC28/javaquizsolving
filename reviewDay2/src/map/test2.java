package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test2 {

	public static void main(String[] args) {
		
		Map<String, String> names = new HashMap<>();
		
		names.put("������", "X");
		names.put("������", "X");
		names.put("���缮", "X");
		names.put("�̱���", "X");
		names.put("�ڳ���", "X");
		
		Iterator<String> iter = names.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			if(key.startsWith("��")) {
				names.put(key, "O");
			}
		}
		System.out.println(names);
	}
}
