package string_Quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		//1
//		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
//		int count = 0;
//		for(int i=0; i<files.length; i++) {
//			if(files[i].endsWith("jpg")==true) { //true 안 써도 됨, 이름에 jpg가 들어가 있는 경우엔 혼란 가능하기 때문.
//				count++;
//			}
//		}
//		System.out.println("jpg 파일의 개수 : " + count);
		
//		2
//		Scanner scan = new Scanner(System.in);
//		
//		String[] quizWord = {"승리","사랑","컴퓨터","노트북"};
//		String[] answerWord = {"victory","love","computer","notebook"};
//		int score = 0;
//		
//		for(int i=0; i<quizWord.length; i++) {
//			System.out.print(quizWord[i]+"를 영어로 입력하세요 : ");
//			String answer = scan.next();
//			if(answer.equals(answerWord[i])) {
//				score+=100/quizWord.length;
//			}
//		}
//		System.out.println(score);
		
//		3
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] names = memberStr.split(":");
		int count = 0;
		boolean isSame = false;
		
		for(int i=0; i<names.length-1; i++) {
			String name = names[i]; //검사할 기준이 되는 이름
			
			if(names.equals("")) { //동명이인으로 체크되서 빈칸인 경우 skip
				continue; //아래 조건 무시하고 다음으로 넘어갈 때 활용
			}
			
			for(int j=i+1; j<names.length; j++) {
				if(name.equals(names[j])) {
					names[j] = "";
					isSame = true;
				}
			}
			if(isSame = true) {
				count++;
			}
		}
		System.out.println("동명이인 종류 수 : " + count);
		
	}

}
