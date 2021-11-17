package List_quiz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Quiz01 {

	public static void main(String[] args) {

		int[] nums = {3, 8, 9, 4, 2, 1, 7, 5};
		List<Integer> num = new ArrayList<>();
		for(int i=0; i<nums.length; i++) {
			num.add(nums[i]);
		}
		Iterator<Integer> iter = num.iterator();
		while(iter.hasNext()) {
			System.out.print(iter.next()+" ");
		}
		
	}

}
