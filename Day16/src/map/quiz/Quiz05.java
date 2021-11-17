package map.quiz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Quiz05 {

	public static void main(String[] args) {

		Map<String, String> myCharacter = new HashMap<>();
        myCharacter.put("�г���", "���κ�Ƴ�");
        myCharacter.put("����", "������");
        myCharacter.put("����", "B");
        myCharacter.put("����", "38");

        // ����Ʈ �ȿ� ���� �ִ�???
        List<Map<String, String>> characters = new ArrayList<>();
        Map<String, String> character1 = new HashMap<>();
        character1.put("�г���", "���ڰ����");
        character1.put("����", "����");
        character1.put("����", "A");
        character1.put("����", "11");
        characters.add(character1);

        Map<String, String> character2 = new HashMap<>();
        character2.put("�г���", "�ϱ���");
        character2.put("����", "������");
        character2.put("����", "B");
        character2.put("����", "46");
        characters.add(character2);

        Map<String, String> character3 = new HashMap<>();
        character3.put("�г���", "�ٴ�");
        character3.put("����", "����");
        character3.put("����", "B");
        character3.put("����", "23");
        characters.add(character3);

        Map<String, String> character4 = new HashMap<>();
        character4.put("�г���", "�ʺ�");
        character4.put("����", "����");
        character4.put("����", "A");
        character4.put("����", "4");
        characters.add(character4);

        Map<String, String> character5 = new HashMap<>();
        character5.put("�г���", "����G");
        character5.put("����", "����");
        character5.put("����", "B");
        character5.put("����", "84");
        characters.add(character5);
        
//        1
//        for(int i=0; i<charaters.size(); i++) {
//        	if (charaters.get(i).get("����").equals("����") && charaters.get(i).get("����").equals(myCharacter.get("����"))){
//        		System.out.println(charaters.get(i).get("�г���"));
//        	}
//        }
        
//       2
//        int max = 0;
//        int count = 0;
//        for(int i=0; i<characters.size(); i++) {
//        	if (characters.get(i).get("����").equals("����") && characters.get(i).get("����").equals(myCharacter.get("����"))){
//        		int level = Integer.parseInt(characters.get(i).get("����"));
//        		if(max<level) {
//        			max = level;
//        			count = i;
//        		}
//        	}
//        }
//        System.out.println(characters.get(count).get("�г���"));
        
        
//        Iterator<Map<String,String>> iter = characters.iterator();
//        while(iter.hasNext()) {
//        	Map<String, String> character = iter.next();
//        	String server = character.get("����");
//        	String job = character.get("����");
//        	
//        	if(job.equals("����") && server.equals(myCharacter.get("����"))) {
//        		System.out.println(character);
//        	}
//        }
        
        Map<String, String> maxLevelCharacter = null; //���� ������ ���� ���.
    	Integer maxLevel = 0;

        Iterator<Map<String,String>> iter = characters.iterator();
        while(iter.hasNext()) {
        	Map<String, String> character = iter.next();
        	String server = character.get("����");
        	String job = character.get("����");
        	
        	if(job.equals("����") && server.equals(myCharacter.get("����"))) {
        		if (maxLevelCharacter==null) {
        			maxLevelCharacter = character;
        			maxLevel = Integer.parseInt(character.get("����"));
        		}else {
//        			Integer level = Integer.parseInt(character.get("����"));
//        			if(maxLevel < level) {
//        				maxLevelCharacter = character;
//        				maxLevel = level;
        			//compareTo
        			//String.compareTo(String); - ���� ���ذ�
        			//���ذ��� �� ũ�� : 1, �Ķ���� ���� �� ũ�� : -1, ������ : 0
        			if(maxLevelCharacter.get("����").compareTo(character.get("����"))<0) {
        				maxLevelCharacter = character;
        			}
//        			}
        		}
        	}
        }
        
        System.out.println(maxLevelCharacter);
        //������ �� �ؼ� ��� ���� Ȱ���غ���
	}

}
