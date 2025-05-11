package chapter04;

public class Problem0204 {
	public static void main(String[] args) {	
		// 4x + 5y = 60의 해를 구하여 (x, y)형태로 출력
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <=10; y++) {
				if ((4 * x + 5 * y) == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	}
}
