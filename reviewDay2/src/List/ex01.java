package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ex01 {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(5);
		list1.add(3);
		boolean isSuccess = list1.add(8);
		System.out.println(isSuccess);
		System.out.println("list1 : "+list1);
		System.out.println("list1 toString() : "+list1.toString());
		
		List<String> strList = new ArrayList<>();
		strList.add("apple");
		strList.add("banana");
		strList.add("grape");
		
//		for(int i=0; i<strList.size(); i++) {
//			System.out.println(strList.get(i));
//			
//			String fruit = strList.get(i);
//			if(fruit.startsWith("b")) {
//				strList.remove(i);
//				i--;
//			}
//		}
		
//		Iterator<String> iter = strList.iterator();
//		while(iter.hasNext()) {
//			String fruit = iter.next();
//			System.out.println(fruit);
//			
//			if(fruit.startsWith("b")) {
//				iter.remove();
//			}
//		}
//		System.out.println(strList);
		
		for(String fruit : strList) {
			System.out.println(fruit);
			
			if(fruit.startsWith("b")) {
				strList.remove(fruit);
			}
		}
		System.out.println(strList);
	}
}
