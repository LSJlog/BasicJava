package chapter04;

import java.util.Scanner;

public class Exercise41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요: ");
		int a = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요: ");
		int b = scanner.nextInt();
		System.out.print("삼각형의 세번째 변의 길이를 입력하세요: ");
		int c = scanner.nextInt();
		
		int sum = 0;
		int max = a;
		
		if (b > max) {
			max = b;
			sum = a + c;
		}
		if (c > max) {
			max = c;
			sum = a + b;
		}
		
		if (max < sum) {
			System.out.println("삼각형을 만들 수  있습니다.");
		} else {
			System.out.println("삼각형을 만들 수 없습니다.");
		} 
		scanner.close();
		
//		if (a+b>c && b+c>a && a+c>b) {
//			System.out.println("삼각형을 만들 수  있습니다.");
//		} else {
//			System.out.println("삼각형을 만들 수 없습니다.");
//		} 
		
	}
}
