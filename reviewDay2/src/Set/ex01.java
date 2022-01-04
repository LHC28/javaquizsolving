package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ex01 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(1);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(100);
		
		System.out.println(set1.add(1));
		System.out.println(set1);
		System.out.println(set1.contains(10));
		
		set2.removeAll(set1);
		System.out.println(set2);
		
		Iterator<Integer> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		for(Integer num : set1) {
			System.out.println(num);
		}
	}
}
