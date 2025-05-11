package chapter02;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputDate = scanner.nextLine();
		System.out.println("입력된 데이터: " + inputDate);
		scanner.close();
	}
}
