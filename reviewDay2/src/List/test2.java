package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class test2 {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(Arrays.asList(20,3,5,84,17));
		
		int minimum = 100;
		for(int i=0; i<list.size(); i++) {
			if(minimum>list.get(i)) {
				minimum = list.get(i);
			}
		}
		System.out.println(minimum);
		
		Iterator<Integer> iter = list.iterator();
		
		int sum = 0;
		while(iter.hasNext()) {
			Integer num = iter.next();
			sum+=num;
		}
		System.out.println(sum);
	}
}
