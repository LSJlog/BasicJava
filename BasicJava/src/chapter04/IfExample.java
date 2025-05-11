package chapter04;

public class IfExample {
	public static void main(String[] args) {
		int score = 93;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}

		if (score < 90)
			System.out.println("점수가 90보다 작습니다.");
		System.out.println("등급은 B입니다.");
		// Ctrl + Shift + F : 자동 정렬
		// 중괄호를 사용하여 조건문 경계 확실히 하기
		
	}
	
}
