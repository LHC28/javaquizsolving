package ����;

public class Main {

	public static void main(String[] args) {

		Lion lion = new Lion("����",10,200, "������");
		
		lion.eat();
		lion.sleep();
		
		lion.bite();
		lion.fight();
		
		System.out.println("======================");
		
		Monkey monkey = new Monkey("������",5,100,"�쳢��");
		
		monkey.eat();
		monkey.sleep();
		
		monkey.climb();
		monkey.whisk();
		
		System.out.println("======================");

		Elephant elephant = new Elephant("�ڳ���",7,300,"������");
		
		elephant.eat();
		elephant.sleep();
		
		elephant.nose();
		elephant.mud();
		
	}

}
