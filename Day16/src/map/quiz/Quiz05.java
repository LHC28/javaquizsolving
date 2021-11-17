package map.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Quiz05 {

	public static void main(String[] args) {

		Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("닉네임", "마로비아나");
        myCharacter.put("직업", "마법사");
        myCharacter.put("서버", "B");
        myCharacter.put("레벨", "38");

        // 리스트 안에 맵이 있다???
        List<Map<String, String>> characters = new ArrayList<>();
        Map<String, String> character1 = new HashMap<>();
        character1.put("닉네임", "사자고양이");
        character1.put("직업", "전사");
        character1.put("서버", "A");
        character1.put("레벨", "11");
        characters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("닉네임", "하구루");
        character2.put("직업", "마법사");
        character2.put("서버", "B");
        character2.put("레벨", "46");
        characters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("닉네임", "바다");
        character3.put("직업", "힐러");
        character3.put("서버", "B");
        character3.put("레벨", "23");
        characters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("닉네임", "초보");
        character4.put("직업", "힐러");
        character4.put("서버", "A");
        character4.put("레벨", "4");
        characters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("닉네임", "린다G");
        character5.put("직업", "힐러");
        character5.put("서버", "B");
        character5.put("레벨", "84");
        characters.add(character5);
        
//        1
//        for(int i=0; i<charaters.size(); i++) {
//        	if (charaters.get(i).get("직업").equals("힐러") && charaters.get(i).get("서버").equals(myCharacter.get("서버"))){
//        		System.out.println(charaters.get(i).get("닉네임"));
//        	}
//        }
        
//       2
//        int max = 0;
//        int count = 0;
//        for(int i=0; i<characters.size(); i++) {
//        	if (characters.get(i).get("직업").equals("힐러") && characters.get(i).get("서버").equals(myCharacter.get("서버"))){
//        		int level = Integer.parseInt(characters.get(i).get("레벨"));
//        		if(max<level) {
//        			max = level;
//        			count = i;
//        		}
//        	}
//        }
//        System.out.println(characters.get(count).get("닉네임"));
        
        
//        Iterator<Map<String,String>> iter = characters.iterator();
//        while(iter.hasNext()) {
//        	Map<String, String> character = iter.next();
//        	String server = character.get("서버");
//        	String job = character.get("직업");
//        	
//        	if(job.equals("힐러") && server.equals(myCharacter.get("서버"))) {
//        		System.out.println(character);
//        	}
//        }
        
        Map<String, String> maxLevelCharacter = null; //제일 레벨이 높은 사람.
    	Integer maxLevel = 0;

        Iterator<Map<String,String>> iter = characters.iterator();
        while(iter.hasNext()) {
        	Map<String, String> character = iter.next();
        	String server = character.get("서버");
        	String job = character.get("직업");
        	
        	if(job.equals("힐러") && server.equals(myCharacter.get("서버"))) {
        		if (maxLevelCharacter==null) {
        			maxLevelCharacter = character;
        			maxLevel = Integer.parseInt(character.get("레벨"));
        		}else {
//        			Integer level = Integer.parseInt(character.get("레벨"));
//        			if(maxLevel < level) {
//        				maxLevelCharacter = character;
//        				maxLevel = level;
        			//compareTo
        			//String.compareTo(String); - 앞이 기준값
        			//기준값이 더 크면 : 1, 파라미터 값이 더 크면 : -1, 같으면 : 0
        			if(maxLevelCharacter.get("레벨").compareTo(character.get("레벨"))<0) {
        				maxLevelCharacter = character;
        			}
//        			}
        		}
        	}
        }
        
        System.out.println(maxLevelCharacter);
        //정리를 잘 해서 배운 것을 활용해보자
	}

}
