package String_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
//		1
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int num = 0;
		for(int i=0; i<files.length; i++) {
			if(files[i].contains(".jpg")) {
				num+=1;
			}
		}
		System.out.println("jpg 파일 개수 : "+num);
		
//		2
		String[] han = {"승리","사랑","컴퓨터","노트북"};
		String[] ans = {"victory","love","computer","notebook"};
		int score = 0;
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(han[i]+"를 영어로 입력하세요 : ");
			String eng = scan.next();
			if(ans[i].equals(eng)) {
				score+=25;
			}
		}
		System.out.println("점수는 "+score+"점 입니다.");
		
//		3
		String memberStr = "김혜수:송강호:정우성:이민정:송강호:이민정:이민정:이정재:이병헌:이정재";
		String[] memberArr = memberStr.split(":");
		int sameName = 0;
		
		for(int i=0; i<memberArr.length-1; i++) {
			boolean check = false;
			if(!memberArr[i].equals("")) {
				for(int j=i+1; j<memberArr.length; j++) {
					if(memberArr[i].equals(memberArr[j])) {
						check = true;
						break;
					}
				}
				if(check == true) {
					sameName+=1;
					for(int j=i+1; j<memberArr.length; j++) {
						if(memberArr[i].equals(memberArr[j])) {
							memberArr[j] = "";
						}
					}
				}

			}
		}
		System.out.println("동명이인 종류 수 : "+sameName);

	}

}
