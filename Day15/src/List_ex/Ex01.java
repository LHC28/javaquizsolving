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
		
		// List에 숫자 5가 들어있는가?
		boolean containValue = list.contains(5); //반복문을 돌려 하나씩 확인할 필요가 없어짐
		System.out.println(containValue);
		System.out.println(list.contains(7));
		
		// 오름차순 정렬하기
		list.sort(Comparator.naturalOrder()); //리턴받지 않아도 정렬되어 저장된다.
		System.out.println(list);
		
		// 내림차순 정렬하기
		list.sort(Comparator.reverseOrder()); //static 메소드이기 때문에 가능한 것이다.
		System.out.println(list);
		
		// 리스트에 값이 비어있는지 확인
		
		System.out.println("리스트가 비어있는가?" + list.isEmpty()); //비어있으면 true, 많이 활용하는 메소드
		
		list.clear();
		System.out.println("리스트가 비어있는가?"+ list.isEmpty());
		System.out.println(list);
		
		
	}

}
