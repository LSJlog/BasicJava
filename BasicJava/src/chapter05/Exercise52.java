package chapter05;
//로또번호를 생성하는 프로그램을 작성하시오.
//(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
import java.util.Random;

public class Exercise52 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			
			// 중복 값이 나오면 횟수를 줄여서 다시 출력
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		// 위에서 출력할 경우 중복값도 출력
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}	
}

