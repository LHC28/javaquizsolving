package function;

public class ex01 {
	
	public static int sum(int a, int b) {
		return a+b;
	}

	public static void printHelloWorld() {
		System.out.println("Hello World");
		return;
	}
	
	public static void main(String[] args) {
		double d = 3.68;
		long roundNumber = Math.round(d);
		System.out.println(roundNumber);
		
		int x = 30;
		int y = 50;
		int result = sum(x,y);
		System.out.println(result);
		System.out.println(sum(x,y));
		
		printHelloWorld();
	}
}
