package function_ex;

public class Ex01 {

	public static void main(String[] args) {
		
		//Method 사용하기
		
		// 반올림
		double d = 3.68;
		
		//long은 int보다 더 큰 자료형을 넣는
		long roundNumber = Math.round(d);
		System.out.println(roundNumber);
		
		System.out.println(Math.round(d));
		
		//큰 값 구하기
		int max = Math.max(10, 90);
		System.out.println(max);
		System.out.println(Math.max(10, 90));
		
		//절대값 구하기
		double abs = Math.abs(-5.5); //input : 전달 인자값, 인수, argument
		System.out.println(abs); //output : 결과값, return 값
		
		
	}

}
