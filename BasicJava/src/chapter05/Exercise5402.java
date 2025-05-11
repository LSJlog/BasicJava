package chapter05;

import java.util.Random;

public class Exercise5402 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] array = new int[6];
		for (int i = 0; i <= 10000; i++) {
			int j = random.nextInt(6);
			array[j]++;
		}
		
		System.out.println("----------");
		System.out.println("면    빈도");
		System.out.println("----------");
		
		for (int k = 0; k < array.length; k++) {
			System.out.println((k + 1) + "    " + array[k]);
		}
	}
}
