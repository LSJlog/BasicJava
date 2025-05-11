package chapter06;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.powerOff();
		int result1 = calculator.plus(5, 6);
		System.out.println("result1 = " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = calculator.divide(x, y);
		System.out.println("result2 = " + result2);
	}
}
