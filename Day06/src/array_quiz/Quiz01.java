package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {

		// 1
		int[] numbers = { 3, 8, 9, 4, 2, 1, 7, 5 };
		numbers[3] = 6;

		// 2
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		// 3
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();

		// 4
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 == 1) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();

		// 5
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2�� ����ִ� index�� " + i);
			}
		}

		// 6
		int max = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("���� ū ���� " + max);

		int min = 10;
		for (int i = 0; i < numbers.length; i++) {
			if (min > numbers[i]) {
				min = numbers[i];
			}
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == min) {
				System.out.println("�ּҰ��� �ε����� " + i);
			}
		}

		// 7
		double sum = 0;
		double avg = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		avg = (sum / numbers.length);
		System.out.println("����� " + avg);
	}

}
