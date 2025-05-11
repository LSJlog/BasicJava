package chapter09;

import java.util.Scanner;

public class TryWithResourcExample {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("첫번째 수를 입력하세요.");
			int firstNum = scanner.nextInt();
			System.out.println("두번째 수를 입력하세요.");
			int secondNum = scanner.nextInt();
			int result = firstNum + secondNum;
			System.out.println(result);
			
		}
	}
}
