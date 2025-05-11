package chapter04;

import java.util.Scanner;

public class Exercise44 {
	public static void main(String[] args) {
		System.out.println("가위 바위 보 게임");
		Scanner scanner = new Scanner(System.in);

		System.out.print("철수: ");
		String cheol = scanner.nextLine();
		System.out.print("영희: ");
		String young = scanner.nextLine();
		String result = "";
		
		if (cheol.equals(young)) {
			result = "영희 승리!";
		} else if (cheol.equals("가위") && young.equals("바위") 
				|| cheol.equals("보") && young.equals("가위") 
				|| cheol.equals("바위") && young.equals("보")) {
			result = "영희 승리!";
		} else {
			result = "철수 승리!";
		}
		System.out.println("결과 : " + result);
		scanner.close();
	}
}
