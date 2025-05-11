package chapter06;

public class Calculator {
	void powerOn() {
		System.out.println("전원을 켭니다.");
//		int result =  plus(10,20);
		powerOff();
		divide(20,10);
//		retrun; 생략가능
	}
	int plus(int x, int y) {// int x = 10, int y = 20;
		return x + y;
	}
	double divide(int x, int y) {
		return (double) x / y;
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
