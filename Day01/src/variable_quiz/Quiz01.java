package variable_quiz;

public class Quiz01 {

	public static void main(String[] args) {
//		이름: 신보람 나이: 25
//
//		3 + 5 = 8
//		3 - 5 = -2
//
//		7 X 1 = 7
//		7 X 2 = 14
//		7 X 3 = 21
		
		String name = "가나다";
		int age = 150;
	
		System.out.println("이름 : "+name+" 나이 : "+age);
		
		int no1 = 3;
		int no2 = 5;
		System.out.println(no1+" + "+no2+" = "+(no1+no2));
		System.out.println(no1+" - "+no2+" = "+(no1-no2));
		
		int no3 = 7;
		System.out.println(no3+" X 1 = "+(no3*1));
		System.out.println(no3+" X 2 = "+(no3*2));
		System.out.println(no3+" X 3 = "+(no3*3));
		
	}

}
