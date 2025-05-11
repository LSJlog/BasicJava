package chapter03;

import java.util.Scanner;

public class Problem0209 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double inputValue1;
		double inputValue2;
		
		System.out.print("첫 번째 수: ");
		inputValue1 = scanner.nextDouble();
		System.out.print("두 번째 수: ");
		inputValue2 = scanner.nextDouble();
		System.out.println("-----------------");
		
		double result = inputValue1 / inputValue2;
		
		if (inputValue2 == 0) {
			System.out.println("결과:무한대");
		} else if (inputValue2 == 0.0) {
			System.out.println("결과:무한대");
		} else {
			System.out.print("결과:" + result);
		}
		scanner.close();
		// String result = (inputValue2 == 0 || inputValue2 == 0.0) ? "무한대" : inputValue1;
		// System.out.println("결과:무한대");
	}

}
