package Map_ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Map
		// 1. key�� value�� ������ �̷�����ִ�.
		// 2. key�� �ߺ����� ������ value�� �ߺ��� �����ϴ�. (�ֹι�ȣ - �̸�)
		// 3. key�� ���ؼ� value�� ���� ������ ã�� �� �ִ�.
		// 4. value�δ� key�� ã�� ��ƴ�.
		
		Map<String, Integer> map1 = new HashMap<>(); //HashMap�� ���ٰ� �����ϸ� �ȴ�.
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		System.out.println(map1);
		
		// key�� �� ������
		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println(map1.get("d"));
		
		// ����
		map1.put("b", 20);
		System.out.println(map1);
		
		// "c"��� Ű�� �����ϴ°�?
		System.out.println(map1.containsKey("c"));
		// ���� 5�� �ִ°�?
		System.out.println(map1.containsValue(5));
		
		//map�� ũ��
		System.out.println(map1.size());
		
		// key�� ��������
		Set<String> keys = map1.keySet(); //������ set, �ߺ��� ���� �ʱ� ������ set�̴ٶ�� ��������
		System.out.println("keys : "+keys);
		
		// value�� ��������
		Collection<Integer> values = map1.values(); //collection Ÿ��
		System.out.println("values : "+values);
		
		// Ű�� �� ��� �����ϱ�
		Integer deletedValue = map1.remove("c");
		System.out.println(deletedValue);
		System.out.println(map1);
		
		//Ű�� ��ҷ� �����ϱ�
		System.out.println(map1.remove("d", 4)); //������ Ű�� value�� �ݵ�� ��ġ�ؾ��ϴ� ��� Ȱ��
		System.out.println(map1);
		
		// map�� map ��ü �߰��ϱ�
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("z", 100);
		map2.putAll(map1);
		System.out.println(map2);
	}

}
