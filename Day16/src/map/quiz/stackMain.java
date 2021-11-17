package map.quiz;

public class stackMain {

	public static void main(String[] args) {

		Stack s = new Stack();
		
		s.push("빨");
		s.push("주");
		s.push("노");
		s.push("초");
		s.push("파");
		s.push("남");
		s.push("보");
		
		System.out.println(s.peek());
		System.out.println();
		System.out.println(s.pop());
		
	}

}
