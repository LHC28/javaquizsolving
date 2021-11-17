package map.quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Quiz02 {

	public static void main(String[] args) {

		Map<String, Character> names = new HashMap<>();
//		유재석, 박나래, 이지은, 서장훈, 이광수
		names.put("유재석", 'X');
		names.put("박나래", 'X');
		names.put("이지은", 'X');
		names.put("서장훈", 'X');
		names.put("이광수", 'X');
		
		Set<String> name = new HashSet<>();
		name = names.keySet();
		Iterator<String> getName = name.iterator();
		
		//.startWith를 활용하는 방법도 있다.
		while(getName.hasNext()) {
			String name1 = getName.next();
			char lastName = name1.charAt(0);
			if(lastName=='이') {
				names.put(name1, 'O');
			}
		}
		System.out.println(names);
	}

}
