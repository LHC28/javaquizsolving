package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ex01 {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		System.out.println(map1);
		
		System.out.println(map1.get("a"));
		map1.put("b", 20);
		System.out.println(map1);
		System.out.println(map1.containsKey("c"));
		System.out.println(map1.containsValue(5));
		System.out.println(map1.containsValue(4));
		
		System.out.println(map1.size());
		
		Set<String> keys = map1.keySet();
		System.out.println(keys);
		
		Collection<Integer> values = map1.values();
		System.out.println(values);
		
		map1.remove("c");
		System.out.println(map1);
		
		map1.remove("d",4);
		System.out.println(map1);
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("z", 100);
		
		map2.putAll(map1);
		System.out.println(map2);
	}
}
