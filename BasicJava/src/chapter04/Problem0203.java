package chapter04;

import java.util.Random;

public class Problem0203 {
	public static void main(String[] args) {
		// 주사위의 눈의 합이 5가 되면 실행을 멈추는 코드
		Random random = new Random();

		while (true) {
			int num1 = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");

			if ((num1 + num2) == 5) {
				break;
			}
		}

	}
}
