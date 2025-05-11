package chapter02;

import java.util.Scanner;

public class Problem0403 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1. 이름: ");
		String name = scanner.nextLine();
		
		System.out.print("2. 주민번호 앞 6자리: ");
		String number = scanner.nextLine();
		
		// 입력 값: 010-123-1234
		System.out.print("3. 전화번호: ");
		String phoneNumber = scanner.nextLine();
		
		System.out.println(name);
		System.out.println(number);
		System.out.println(phoneNumber);
		scanner.close();
	}

}
