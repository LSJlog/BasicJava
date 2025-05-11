package chapter03;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("윤년인지를 확인할 연도를 입력하세요: ");
		int year = scanner.nextInt();
	
		System.out.println((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? year + "은 윤년입니다." : year + "은 윤년이 아닙니다.");
		scanner.close();
	}
}
