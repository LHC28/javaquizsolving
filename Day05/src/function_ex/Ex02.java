package function_ex;

public class Ex02 {

	public static void main(String[] args) {//메모리를 올린다고 생각

		//메소드 만들기
		//1. 어떤 함수를 만들지 메소드명을 짓는다.(동사로 많이 짓는 편,길어도 무슨 기능을 하는지만 적으면 됨)
		//2. input을 무엇을 받을지 생각한다.
		//3. output을 무엇으로 돌려줄지 생각한다.
		//4. 구현한다.
		
		//메소드를 사용하는 곳
		int x = 30;
		int y = 50;
		int result = sum(x,y); //전달인자값, argument
		System.out.println("합계 : "+ result);
		
		printHelloWorld(); //함수를 사용한다. 함수를 부른다. 함수를 call한다.
	}
	
	//메소드 만드는 곳
	public static int sum(int a,int b) { //매개변수(parameter)
		int result = a+b;
		return result; //return을 만나면 메소드가 종료된다.
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello world"); //컨트롤 알트 방향키는 복사
		System.out.println("Hello world");
		return;//생략가능
	}
}
