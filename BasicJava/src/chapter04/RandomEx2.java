package chapter04;

import java.util.Random;

public class RandomEx2 {
	public static void main(String[] args) {
		Random random = new Random();
		for (int i =1; i<=10; i++) {
			System.out.println(i + "번째 값: " + (random.nextInt(6) + 1));
		}
	}
}
