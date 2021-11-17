package List_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz02 {

	public static void main(String[] args) {

		int[] num = {20, 3, 5, 84, 17};
		List<Integer> nums = new ArrayList<>();
		for(int i=0; i<num.length; i++) {
			nums.add(num[i]);
		}
//		List<Integer> list = Arrays.asList(20,3,5,84,17); 도 가능
//		List<Integer> nums = new ArrayList<>( Arrays.asList(20,3,5,84,17)); 이것도 가능

		int min = 100; //첫번째 값을 넣는 것도 방법임
		for(int i=0; i<nums.size(); i++) {
			if(nums.get(i)<min) {
				min = nums.get(i);
			}
		}
		System.out.println(min);
		
		Iterator iter = nums.iterator();
		int sum = 0;
		while(iter.hasNext()) {
			Integer value = (Integer) iter.next();
			sum+=value;
		}
		System.out.println(sum);
	}

}
