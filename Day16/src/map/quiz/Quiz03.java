package map.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Quiz03 {
	//final keyword : 정적, 한번만 초기화 되도록 하는 것
	//1. 변수 : 변수에 붙이면 한 번 초기화 된 변수에 값을 재할당 불가
	//2. 메소드 : 메소드에 붙이면 오버라이드 불가
	//3. 클래스 : 상속 불가
	public static final Map<String, String> capitalMap = new HashMap<String, String>() {
		//new를 만들어 객체를 만들 수 없다는 의미. 내부 요소는 변경이 가능하다.
        {
            put("대한민국", "서울");
            put("덴마크", "코펜하겐");
            put("독일", "베를린");
            put("러시아", "모스크바");
            put("벨기에", "브뤼셀");
            put("브라질", "브라질리아");
            put("스웨덴", "스톡홀름");
            put("스위스", "베른");
            put("스페인", "마드리드");
            put("아르헨티나", "부에노스아이레스");
            put("이집트", "카이로");
            put("이란", "테헤란");
            put("이탈리아", "로마");
            put("일본", "도쿄");
            put("필리핀", "마닐라");
            put("핀란드", "헬싱키");
            put("프랑스", "파리");
            put("터키", "앙카라");
            put("캐나다", "오타와");
            put("콜롬비아", "보고타");
        }
    };

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		
		
		Set<String> keys = new HashSet<>();
		keys = capitalMap.keySet();
		List<String> capitals = new ArrayList<>(keys);
		
		int[] nums = {-1,-1,-1,-1,-1};
		boolean check = false;
		
		//중복체크용
		//리스트로 하는 것이 더 간단하다.
		int score = 0;
		int count = 0;
		while(count<5) {
			int num = ran.nextInt(20);
			for(int i=0; i<nums.length; i++) {
				if(num==nums[i]) {
					check = true;
				}
			}
			if(check==false) {
				nums[count]=num;
				count+=1;
			}
		}
		
		//문제
		for(int i=0; i<nums.length; i++) {
			System.out.print(capitals.get(nums[i])+"의 수도 이름은?");
			String answer = scan.next();
			if(capitalMap.get(capitals.get(nums[i])).equals(answer)) {
				System.out.println("정답");
				score+=100/nums.length;
			}else {
				System.out.println("틀렸습니다...");
			}
		}
		System.out.println("총 점수는 "+score);
		
		
		
	}

}
