package String_ex;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); //사용하게 되면 String이 열리고 가상공간이 사용하게 됨.
//		엔터값은 무시하고 단어만 가져가기 때문에 엔터는 남아있는 상태가 됨. 남아있는 엔터로 인해 바로 저장되면서 종료하게 되는 것임.
//		이를 해결하기 위해 nextLine()을 사용해주는 것으로 엔터값을 날릴 수 있다.
		
		String word = scan.next(); //단어
		System.out.println(word);
		
		scan.nextLine(); //불필요한 엔터를 날려버린다.
		
		String text = scan.nextLine(); //문장(스페이스바 포함)
		System.out.println(text);
		
		System.out.println("끝");
		
		scan.close();
	}

}
