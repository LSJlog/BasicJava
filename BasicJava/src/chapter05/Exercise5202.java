package chapter05;

import java.util.Random;

public class Exercise5202 {
	public static void main(String[] args) {
//		방 번호 랜덤 추출 -> 방번호 현재 값과 체인지 
//		0으로 초기화 후 랜덤 추출 값(1~45) 저장
		int[] lotto = new int[45];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		}
		Random random = new Random();
		
		for (int i = 0; i < lotto.length; i++) {
//			방번호 -> 0 ~ 44까지
			int ranNum = random.nextInt(45);
			int temp = lotto[0];
			lotto[0] = lotto[ranNum];
			lotto[ranNum] = temp;			
		}
		
		for (int i = 0; i < 6; i++) {
			if (i != 0) {
				System.out.print(", ");			
			}
			System.out.print(lotto[i]);
		}	
	}	
}
