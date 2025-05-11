package chapter02;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("가로의 길이는?(단위: m): ");
		double x = scanner.nextDouble();
		
		System.out.print("세로의 길이는?(단위: m): ");
		double y = scanner.nextDouble();
				
		double area = x*y;
		double len = 2*(x+y);
		
		System.out.println("직사각형의 넓이:" + area);
		System.out.println("직사각형의 둘레:" + len);
		scanner.close();
	}
}
