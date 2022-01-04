package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> test = new HashMap<>();
		test.put("국어", 90);
		test.put("사회", 80);
		test.put("과학", 100);
		test.put("수학", 85);
		test.put("영어", 90);
		
		System.out.println(test);
		
		test.put("사회", 85);
		System.out.println(test);
		
//		System.out.print("조회할 과목명을 입력하세요 : ");
//		String subject = scan.next();
//		
//		if(test.containsKey(subject)) {
//			System.out.println(subject+" : "+test.get(subject));
//		}else {
//			System.out.println("자료 없음");
//		}
		
		if(test.containsValue(100)) {
			System.out.println("수상 가능");
		}else {
			System.out.println("수상 불가능");
		}
		
	}
}
