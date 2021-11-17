package 연습용;

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
		
		// 참가자 이름 만들기
		while(count<participants) {
			if(count == participants) {
				break;
			}
			else {
				int nameNum = ran.nextInt(20)+1; //1~20자 이름 설정
				String name = "";
				for(int i=0; i<nameNum; i++) {
					int spellNum = ran.nextInt(nameSpell.length);
					name+=nameSpell[spellNum];
				}
				participant[count] = name;
				count+=1;
			}
		}
		
		//완주하지 못한 인물 구하기
		int failNum = ran.nextInt(participants)+1;
		int completionNum = 0;
		for(int i=0; i<participant.length; i++) {
			if(i!=failNum-1) {
				completion[completionNum] = participant[i];
				completionNum+=1;
			}
		}
		
		
//		예제 #1
//		"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
//
//		예제 #2
//		"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.
//
//		예제 #3
//		"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
		//Arrays.asList(completion).contains(participant[i]
		String answer = ""; // 답변 만들기
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
		answer =  failName+"는 참여자 명단에는 있지만,"; 
		if(count1==1) {
			answer +="완주자 명단에는 없기 때문에 완주하지 못했습니다.";
		}else {
			answer += "완주자 명단에는 있지만"+count1+"명 밖에 없기 때문에 한 명은 완주하지 못했습니다.";
		}
		System.out.println(answer);
		
		
	}

}
