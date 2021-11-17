package variable_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		//정수형 변수(Integer)
		int number = 10; // 맨 처음 변수에 값을 넣는 것 : '초기화' initialize, 변수에 값을 넣는 것 : 할당한다. assign
		System.out.println(number);
		
		number = 5; //변수이므로 값을 변경할 수 있다. 재사용할 때는 자료형은 생략
		System.out.println(number);
		
		int number2 = 100;
		int sum = number+number2;
		System.out.println(sum);
		
		//실수형 변수(float) : 권장 안 함. 오차가 있을 수 있다. 오차가 중요하지 않고 메모리를 아껴야 하는 경우에 사용
		float f = 1.5f;
		System.out.println(f);
		
		//실수형 변수(double)
		double d = 3.88888888888888888;
		System.out.println(d);
		
		//문자 변수(charactor) : 문자 한 개. 작은 따옴표로 감싼다.
		char c = 'z';
		System.out.println(c);
		
		//boolean 변수 : 참(true) 또는 거짓(false)
		boolean isReal = true; //camel case(낙타)  - java      is_real : snake case(뱀) - 파이썬
		boolean isFalse = false;
		System.out.println("참 : "+ isReal);
		System.out.println("거짓 : "+isFalse);
		
		
	}

}
