package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test2 {

	public static void main(String[] args) {
		
		Map<String, String> names = new HashMap<>();
		
		names.put("이지은", "X");
		names.put("서장훈", "X");
		names.put("유재석", "X");
		names.put("이광수", "X");
		names.put("박나래", "X");
		
		Iterator<String> iter = names.keySet().iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			if(key.startsWith("이")) {
				names.put(key, "O");
			}
		}
		System.out.println(names);
	}
}
