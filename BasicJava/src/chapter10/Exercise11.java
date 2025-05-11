package chapter10;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("어떤 수를 나누시겠습니까?>> ");
				//nextInt의 경우 프로그램에서 엔터를 인식하지 못함 >> 무한루프
				//scannner는 nextLine으로 전부 받고 변환하는 것이 좋음
				int num1 = Integer.parseInt(scanner.nextLine());
				System.out.print("어떤 수로 나누시겠습니다?>> ");
				int num2 = Integer.parseInt(scanner.nextLine());
				int result = num1 / num2;
				System.out.println(num1 + " / " + num2 + " = " + result);
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			}
		}
		scanner.close();
	}
}
