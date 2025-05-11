package chapter02;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		double radius = scanner.nextDouble();
		
		System.out.print("원기둥의 높이를 입력하시오.(단위: cm): ");
		double height = scanner.nextDouble();
		
		double area = Math.PI*(radius*radius);
		double volume = area*height;
		
		System.out.printf("원기둥 밑변의 넚이는 %-16.14fcm^2이고, 원기둥의 부피는 %-16.13fcm^2이다.", area, volume);
		scanner.close();
	}
}
