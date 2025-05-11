package chapter03;

public class Problem0205 {
	public static void main(String[] args) {
		int var1 = 5;
		int var2 = 2;
		double var3 = var1 / var2;
		// 1. 1.0을 곱하여 실수 타입으로 만든 후 연산
		// double var3 = (var1*1.0) / var2;
		// 2. 하나의 변수를 double 타입으로 강제로 변환 후 연산
		// double var3 = (double) var1 / var2;
		// double var3 = var1 / (double) var2;
		int var4 = (int) (var3 * var2);
		System.out.println(var3);
		System.out.println(var4);
	}
}
