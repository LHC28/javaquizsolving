package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test3 {

	public static void main(String[] args) {
		List<Integer> scores = new ArrayList<>(Arrays.asList(8,7,6,10,9,4));
		int max = scores.get(0);
		int min = max;
		double sum = 0;
		for(int i=0; i<scores.size(); i++) {
			if(max<scores.get(i)) {
				max = scores.get(i);
			}else if(min > scores.get(i)) {
				min = scores.get(i);
			}
		}
		
		for(int i=0; i<scores.size(); i++) {
			if(scores.get(i)==max || scores.get(i)==min) {
				continue;
			}else {
				sum+=scores.get(i);
			}
		}
		double avg = sum/(scores.size()-2);
		System.out.println(avg);
	}
}
