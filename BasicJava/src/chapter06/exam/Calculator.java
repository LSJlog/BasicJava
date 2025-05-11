package chapter06.exam;

public class Calculator {
	int value;
	static double pi = 3.141592;

	void run() {
		Calculator.pi=2.12;
		System.out.println("계산기 실행 완료");
	}
	
	
	static int plus(int x,int y) {
		Calculator.pi=2.14;
		return x + y;
	}
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		calculator.value = 100;
	}
	
	
	
}
