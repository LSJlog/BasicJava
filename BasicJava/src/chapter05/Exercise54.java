package chapter05;
//주사위를 던져서 각 면이 나오는 횟수를 출력하는 프로그램을 만들어 보자. 
//주사위를 던지는 동작은 1부터 6까지의 임의로 만들어내는 난수 발생기(Random 객체)가 대신한다. 
//난수 발생기를 10,000번 호출하여 각 면이 나타나는 횟수를 계산하여 배열에 저장한다. 
//확률 이론에 의하면 주사위의 각각의 면들이 거의 동일한 횟수로 나와야 한다.
//아래 그림과 똑같은 값이 나오지 않고 컴퓨터마다 값이 다르게 나오는 것이 정상이다.
import java.util.Random;

public class Exercise54 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] dice = new int [10000];
		// 
		int side1 = 0;
		int side2 = 0;
		int side3 = 0;
		int side4 = 0;
		int side5 = 0;
		int side6 = 0;
		
		for (int i = 0; i < dice.length; i++) {
			dice[i] = random.nextInt(6) + 1;
			
			switch(dice[i]) {
			case 1:
				side1++;
				break;
			case 2:
				side2++;
				break;
			case 3:
				side3++;
				break;
			case 4:
				side4++;
				break;
			case 5:
				side5++;
				break;
			case 6:
				side6++;
				break;
			}
		}

		System.out.println("----------");
		System.out.println("면    빈도");
		System.out.println("----------");
		System.out.println("1    " + side1);
		System.out.println("2    " + side2);
		System.out.println("3    " + side3);
		System.out.println("4    " + side4);
		System.out.println("5    " + side5);
		System.out.println("6    " + side6);
		

	}
}
