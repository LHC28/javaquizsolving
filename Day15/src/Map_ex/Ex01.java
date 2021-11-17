package Map_ex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Map
		// 1. key와 value의 쌍으로 이루어져있다.
		// 2. key는 중복되지 않지만 value는 중복이 가능하다. (주민번호 - 이름)
		// 3. key를 통해서 value를 아주 빠르게 찾을 수 있다.
		// 4. value로는 key를 찾기 어렵다.
		
		Map<String, Integer> map1 = new HashMap<>(); //HashMap만 쓴다고 생각하면 된다.
		map1.put("a", 1);
		map1.put("b", 2);
		map1.put("c", 3);
		map1.put("d", 4);
		System.out.println(map1);
		
		// key로 값 얻어오기
		System.out.println(map1.get("a"));
		System.out.println(map1.get("b"));
		System.out.println(map1.get("c"));
		System.out.println(map1.get("d"));
		
		// 수정
		map1.put("b", 20);
		System.out.println(map1);
		
		// "c"라는 키가 존재하는가?
		System.out.println(map1.containsKey("c"));
		// 값에 5가 있는가?
		System.out.println(map1.containsValue(5));
		
		//map의 크기
		System.out.println(map1.size());
		
		// key만 가져오기
		Set<String> keys = map1.keySet(); //형식은 set, 중복이 되지 않기 때문에 set이다라고 생각하자
		System.out.println("keys : "+keys);
		
		// value만 가져오기
		Collection<Integer> values = map1.values(); //collection 타입
		System.out.println("values : "+values);
		
		// 키로 값 요소 삭제하기
		Integer deletedValue = map1.remove("c");
		System.out.println(deletedValue);
		System.out.println(map1);
		
		//키와 요소로 삭제하기
		System.out.println(map1.remove("d", 4)); //삭제시 키와 value가 반드시 일치해야하는 경우 활용
		System.out.println(map1);
		
		// map에 map 전체 추가하기
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("z", 100);
		map2.putAll(map1);
		System.out.println(map2);
	}

}
