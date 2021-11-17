package Set_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {

		//Set
		//1. �ߺ����� �ʴ´�.
		//2. index ����� �ƴϴ�.
		
		Set<Integer> set1 = new HashSet<>();
		set1.add(3);
		set1.add(2);
		set1.add(1); //boolean�ε� �����ϸ� true
		System.out.println(set1.add(1));
		System.out.println("set1 : "+set1);
		
		Set<Integer> set2 = new HashSet<>();
		set2.add(10);
		set2.add(11);
		set2.addAll(set1);
		System.out.println("set2 : "+set2);
		
		//set2�� 10�� �ִ°�?
		System.out.println(set2.contains(10));
		//set2�� 100�� �ִ°�?
		System.out.println(set2.contains(100));
		
		//set2 - set1 ������ (����Ʈ������ ����)
		set2.removeAll(set1);
		System.out.println("set2 - set1�� �������� ��� : " + set2);
		
		//TreeSet
		Set<String> set3 = new TreeSet<>();
		set3.add("c");
		set3.add("b");
		set3.add("a");
		System.out.println("set3 : "+set3);
		
//		1. Iterator
		Iterator<String> iter = set3.iterator();
		while(iter.hasNext()) {
			String element = iter.next();
			System.out.println("element : "+ element);
		}
		
//		2. ���� for��
		for(Integer element : set2) {
			System.out.println("set2 element : "+element);
		}
	}

}
