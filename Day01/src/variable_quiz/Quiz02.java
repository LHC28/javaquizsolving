package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
//		시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
//		시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		double a = 4.0;
		double b = 3.0;
		System.out.println("시험 성적이 90점 이상이면 'A'학점이고 평점은 "+a+"입니다.");
		System.out.println("시험 성적이 90점 이상이면 'B'학점이고 평점은 "+b+"입니다.");
		
//		아래 정수와 실수를 곱해서 출력하세요
		int number1 = 33;
		double number2 = 35.325;
		double sum = number1*number2;
		System.out.println("두 수의 곱 : "+sum);
		
//		3. 날짜 구하기
//		943 시간은 몇일 몇시간 인지 구하여 출력하세요.
//		출력 예시
//		943시간은 39일 7시간 입니다.
		
		int day = 943/24;
		int hour = (943%24);
		
		System.out.println("943시간은 "+day+"일 "+hour+"시간입니다.");
		
//		4. 도형 넓이 구하기
//		가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
//		넓이는 직접 계산하지 말고, 컴퓨터에게 양보하세요.

//		출력 예시
//		사각형의 넓이: 72
//		삼각형의 넓이: 36
		int garo = 8;
		int sero = 9;
		int tri = (garo*sero)/2;
		int rec = garo*sero;
		System.out.println("사각형의 넓이 : "+rec);
		System.out.println("삼각형의 넓이 : "+tri);
		
	}

}
