package map.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<String> fruits = new ArrayList<>();

		
		//CRUD - create, read, update, delete
		while (true) {
			System.out.print("1:입력 2:출력 3:삭제 4:종료");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.print("과일 이름을 입력하세요 : ");
				String name = scan.next();
				if(fruits.contains(name)) {
					System.out.println("이미 있습니다.");
				}else {
					fruits.add(name);
					System.out.println("입력 성공");
				}
				
				//더 줄이는 것도 가능하다.
//				boolean isSuccess = fruits.add(fruit);
//				System.out.println(isSuccess ? "성공했습니다" : "실패했습니다.");
				
			} else if (sel == 2) {
				if(fruits.isEmpty()) {
					System.out.println("비어있습니다.");
					continue;
				}
				//iterator를 활용할 수도 있음
				for(int i=0; i<fruits.size(); i++) {
					System.out.println(fruits.get(i));
				}
			} else if (sel == 3) {
				System.out.print("삭제할 과일 이름을 입력하세요 : ");
				String name = scan.next();
				if(fruits.contains(name)) {
					for(int i=0; i<fruits.size(); i++) {
						if(fruits.get(i).equals(name)) {
							fruits.remove(i);
							System.out.println("삭제되었습니다.");
						}
					}
				}else {
					System.out.println("해당 과일 이름은 없습니다.");
				}
			} else if (sel == 4) {
				System.out.println("종료되었습니다.");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

}
