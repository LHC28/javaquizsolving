package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(3,8,9,4,2,1,7,5));

		List<Integer> list1 = Arrays.asList(3,8,9,4,2,1,7,5);
		System.out.println(list1);
		
		list1.set(3, 6);
		System.out.println(list1);
		
		list.remove(2);
		list.set(3, 6);
		System.out.println(list);
	}
}
