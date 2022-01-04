package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test4 {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>(Arrays.asList("우솝","루피","상디","나미","로빈"));
		List<String> names1 = new ArrayList<>(Arrays.asList("보람","루피","쵸파","로빈","루피"));
		
		for(int i=0; i<names1.size(); i++) {
			int count = 0;
			for(int j=0; j<names.size(); j++) {
				if(names1.get(i).equals(names.get(j).substring(0,2))) {
					count+=1;
				}
			}
			if(count==0) {
				names.add(names1.get(i));
			}else {
				names.add(names1.get(i)+count);
			}
		}
		System.out.println(names);
	}
}
