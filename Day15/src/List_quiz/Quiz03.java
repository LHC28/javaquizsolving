package List_quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Quiz03 {

	public static void main(String[] args) {

		List<Integer> scores = new ArrayList<>(Arrays.asList(8, 7, 6, 10, 9, 4));
		//���� ���� �ؾ� ������ �����ϴ�.
		scores.sort(Comparator.naturalOrder());
		double sum = 0;
		double avg = 0;
		for(int i=1; i<scores.size()-1; i++) {
			sum+=scores.get(i);
		}
//		scores.remove(0); //ù��° �� ����
//		scores.remove(scores.size()-1); //������ �� ���� 
		
		avg = sum/(scores.size()-2);
		System.out.println("�ְ����� �������� ������ ��� ������ "+avg+"��");
		
		
		List<String> names = new ArrayList<>(Arrays.asList("���","����","���","����","�κ�"));
		List<String> addNames = new ArrayList<>(Arrays.asList("����","����","����","�κ�","����"));
		
		names.addAll(addNames);
		
		//���ο� ����Ʈ�� ����� �� ������ ���� �� �ִ�. ���� �̸��� ���ڸ� ���� ���� ���ϴ� ���
//		for(int i=0; i<names.size(); i++) {
//			int count = 0;
//			for(int j=0; j<newNames.size(); j++) {
//				if(names.get(i).equals.newNames.get(j)) {
//					count++
//					newNames.set(j, newNames.get(j)+count);
//				}
//			}
//		}
		
		//contains�� Ȱ���ϴ� ����� �ִ�.
		//���ڸ� ���� ��쿡�� �ߺ��� ���� ���� �� �ֱ� ������ i--�� ���� Ȯ���ؾ��� �ʿ伺�� �ִ�.
		
		
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
