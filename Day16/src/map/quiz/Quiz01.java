package map.quiz;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Quiz01 {

	public static void main(String[] args) {

		Map<String, Integer> scores = new HashMap<>();
		//맵은 한번에 넣는 방법이 없기 때문에 하나씩 put으로 넣어야 한다.
		scores.put("국어", 90);
		scores.put("수학", 85);
		scores.put("영어", 90);
		scores.put("사회", 80);
		scores.put("과학", 100);
		System.out.println(scores);
		
		scores.put("사회", 85);
		System.out.println(scores);
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("조회할 과목명을 입력하세요 : ");
//		String subject = scan.next();
//		if(scores.containsKey(subject)) {
//			System.out.println(subject+" : "+scores.get(subject));
//		}else {
//			System.out.println("없음");
//		}
		
		Set<String> subjects = new HashSet<>();
		subjects = scores.keySet();
		Iterator<String> iter = subjects.iterator();
		//한번에 iterator로 넘겨도 가능하다.
//		while(iter.hasNext()) {
//			String subject = iter.next();
//			if(scores.get(subject)>=90) {
//				System.out.print(subject+" ");
//			}
//		}
//		System.out.println();
		
		boolean check = false;
		while(iter.hasNext()) {
			String subject = iter.next();
			if(scores.get(subject)==100) {
				check = true;
				System.out.println(check);
				break;
			}
		}
		if(check==true) {
			System.out.println("수상 가능");
		}else {
			System.out.println("수상 불가능");
		}
		//containsValue를 활용하면 간단하게 가능하다.
		
		
		
	}

}
