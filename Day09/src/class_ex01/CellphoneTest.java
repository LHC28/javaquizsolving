package class_ex01;

public class CellphoneTest {

	public static void main(String[] args) {
		//의식의 흐름
		Cellphone c1 = new Cellphone();
		c1.maker = "삼성";
		c1.model = "갤럭시노트20";
		c1.price = 1500000;
		c1.color = "몰라";
		
		System.out.println(c1.maker);
		System.out.println(c1.model);
		System.out.println(c1.price);
		System.out.println(c1.color);
		
		c1.call();
		c1.camera();
		
		//그냥 100개를 만들어보자.
		Cellphone[] cellphones = new Cellphone[100];
		for(int i=0; i<cellphones.length; i++) {
			cellphones[i] = new Cellphone();
		}
	}
}
