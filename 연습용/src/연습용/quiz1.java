package ������;

import java.util.Arrays;
import java.util.Random;

public class quiz1 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		String[] nameSpell = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
		
		int participants = ran.nextInt(100000)+1;
		String[] participant = new String[participants];
		String[] completion = new String[participants-1];
		
		int count = 0;
		
		// ������ �̸� �����
		while(count<participants) {
			if(count == participants) {
				break;
			}
			else {
				int nameNum = ran.nextInt(20)+1; //1~20�� �̸� ����
				String name = "";
				for(int i=0; i<nameNum; i++) {
					int spellNum = ran.nextInt(nameSpell.length);
					name+=nameSpell[spellNum];
				}
				participant[count] = name;
				count+=1;
			}
		}
		
		//�������� ���� �ι� ���ϱ�
		int failNum = ran.nextInt(participants)+1;
		int completionNum = 0;
		for(int i=0; i<participant.length; i++) {
			if(i!=failNum-1) {
				completion[completionNum] = participant[i];
				completionNum+=1;
			}
		}
		
		
//		���� #1
//		"leo"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//
//		���� #2
//		"vinko"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.
//
//		���� #3
//		"mislav"�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.
		//Arrays.asList(completion).contains(participant[i]
		String answer = ""; // �亯 �����
		int count1 = 0;
		String failName = "";
		for(int i=0; i<participant.length; i++) {
			if(Arrays.asList(completion).contains(participant[i])==false) {
				failName = participant[i];
				for(int j=0; j<participant.length; j++) {
					if(participant[i]==participant[j]) {
						count1+=1;
					}
				}
			}
		}
		answer =  failName+"�� ������ ��ܿ��� ������,"; 
		if(count1==1) {
			answer +="������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.";
		}else {
			answer += "������ ��ܿ��� ������"+count1+"�� �ۿ� ���� ������ �� ���� �������� ���߽��ϴ�.";
		}
		System.out.println(answer);
		
		
	}

}
