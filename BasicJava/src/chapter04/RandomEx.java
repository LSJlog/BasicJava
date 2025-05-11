package chapter04;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {
		Random random = new Random();
		
		int num1 = random.nextInt(6) + 1;
		int num2 = random.nextInt(6) + 1;
		int num3 = random.nextInt(6) + 1;
		int num4 = random.nextInt(6) + 1;
		int num5 = random.nextInt(6) + 1;
		int num6 = random.nextInt(6) + 1;
		int num7 = random.nextInt(6) + 1;
		                       
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
	}                          

}
