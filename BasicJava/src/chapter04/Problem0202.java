package chapter04;

public class Problem0202 {
	public static void main(String[] args) {
		// 1부터 100 사이의 정수 중 3의 배수의 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}
		}
		System.out.println("3의 배수의 합: " + sum);
	}
}
