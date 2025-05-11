package chapter05;
//인공지능 컴퓨터와 게이머(사람)가 가위바위보 게임을 할 수 있도록 프로그램을 작성하시오.
//배열로 지정해서 풀이
//열거로 계산
import java.util.Random;
import java.util.Scanner;

public class Exercise53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
//		랜덤은 0부터 시작
		String[] computer = {"가위", "바위", "보"};
		
		System.out.print("가위 바위 보를 입력하세요: ");
		String input = scanner.nextLine();
		System.out.println("게이머: " + input);
		int num = random.nextInt(3);
		System.out.println("인공지능 컴퓨터: " + computer[num]);
		String result = "";
		
		if (input.equals(computer[num])) {
			result = "비겼습니다.";
		} else if (input.equals("가위") && computer[num].equals("바위") 
				|| input.equals("보") &&  computer[num].equals("가위") 
				|| input.equals("바위") &&  computer[num].equals("보")){
			result = "인공지능 컴퓨터 승리!";
		} else {
			result = "게이머 승리!";
		}
		System.out.println("결과 : " + result);
		
		scanner.close();
	}
}
