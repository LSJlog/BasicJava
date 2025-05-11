package chapter03;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요:");
		int inputValue1 = scanner.nextInt();
		System.out.print("두 번째 숫자를 입력하세요.");
		int inputValue2 = scanner.nextInt();
		
		int largeValue = ((inputValue1 + inputValue2) + Math.abs(inputValue1-inputValue2))/2;
		int smallValue = ((inputValue1 + inputValue2) - Math.abs(inputValue1-inputValue2))/2;
		
		int share = largeValue/smallValue;
		int remainder = largeValue%smallValue;
				
		System.out.println("큰 수를 작은 수로 나눈 몫은 " + share +"이고, 나머지는 " + remainder + "이다." );
		scanner.close();
	}
}
