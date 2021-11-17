package map.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Person> people = new ArrayList<>();

		while (true) {
			System.out.println("1.입력 2.출력 3.삭제 4.종료");
			int sel = scan.nextInt();

			if (sel == 1) {
				System.out.print("이름을 입력하세요 : ");
				String name = scan.next();
				System.out.print("생년월일을 입력하세요(000000) : ");
				int birth = scan.nextInt();
				Person p = new Person(name, birth);
				people.add(p);
				System.out.println("입력되었습니다.");
//				System.out.println(people.add(p) ? "입력성공" : "입력실패");

			} else if (sel == 2) {
				if (people.size() == 0) {
					System.out.println("비어있습니다.");
				} else {
					for (int i = 0; i < people.size(); i++) {
						people.get(i).printPerson();
					}
				}

			} else if (sel == 3) {
				System.out.print("삭제할 이름을 입력하세요 : ");
				String name = scan.next();
				boolean check = false;
				for (int i = 0; i < people.size(); i++) {
					if (people.get(i).getName().equals(name)) {
						check = true;
						people.remove(i);
						System.out.println("삭제되었습니다.");
					}
				}
				if (check = false) {
					System.out.println("해당 이름은 없습니다.");
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
