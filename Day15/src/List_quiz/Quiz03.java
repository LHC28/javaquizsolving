package List_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {

		List<Integer> scores = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
		//위와 같이 해야 수정이 가능하다.
		scores.sort(Comparator.naturalOrder());
		double sum = 0;
		double avg = 0;
		for(int i=1; i<scores.size()-1; i++) {
			sum+=scores.get(i);
		}
//		scores.remove(0); //첫번째 값 삭제
//		scores.remove(scores.size()-1); //마지막 값 삭제 
		
		avg = sum/(scores.size()-2);
		System.out.println("최고점과 최저점을 제외한 평균 점수는 "+avg+"점");
		
		
		List<String> names = new ArrayList<>(Arrays.asList("우솝","루피","상디","나미","로빈"));
		List<String> addNames = new ArrayList<>(Arrays.asList("보람","루피","쵸파","로빈","루피"));
		
		names.addAll(addNames);
		
		//새로운 리스트를 만들어 두 가지를 합할 수 있다. 더할 이름에 숫자를 붙인 이후 더하는 방법
//		for(int i=0; i<names.size(); i++) {
//			int count = 0;
//			for(int j=0; j<newNames.size(); j++) {
//				if(names.get(i).equals.newNames.get(j)) {
//					count++
//					newNames.set(j, newNames.get(j)+count);
//				}
//			}
//		}
		
		//contains를 활용하는 방법도 있다.
		//숫자를 붙인 경우에도 중복된 것이 있을 수 있기 때문에 i--를 통해 확인해야할 필요성이 있다.
		
		
		for(int i=0; i<names.size(); i++) {
			if(i<names.size()-addNames.size()) {
				System.out.print(names.get(i)+", ");
			}
			else {
				int count = 0;
				for(int j=0; j<i; j++) {
					if(names.get(i).equals(names.get(j))) {
						count+=1;
					}
				}
				if(count==0) {
					System.out.print(names.get(i));
				}else {
					System.out.print(names.get(i)+count);
				}
				if(i!=names.size()-1) {
					System.out.print(", ");
				}
			}
		}
		
	}

}
