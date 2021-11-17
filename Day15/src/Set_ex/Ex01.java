package Set_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {

		//Set
		//1. 중복되지 않는다.
		//2. index 기반이 아니다.
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(1); //boolean인데 성공하면 true
		System.out.println(set1.add(1));
		System.out.println("set1 : "+set1);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(11);
		set2.addAll(set1);
		System.out.println("set2 : "+set2);
		
		//set2에 10이 있는가?
		System.out.println(set2.contains(10));
		//set2에 100이 있는가?
		System.out.println(set2.contains(100));
		
		//set2 - set1 차집합 (리스트에서도 동일)
		set2.removeAll(set1);
		System.out.println("set2 - set1을 차집합한 결과 : " + set2);
		
		//TreeSet
		Set<String> set3 = new TreeSet<>();
		set3.add("c");
		set3.add("b");
		set3.add("a");
		System.out.println("set3 : "+set3);
		
//		1. Iterator
		Iterator<String> iter = set3.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println("element : "+ element);
		}
		
//		2. 향상된 for문
		for(Integer element : set2) {
			System.out.println("set2 element : "+element);
		}
	}

}
