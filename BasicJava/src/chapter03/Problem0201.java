package chapter03;

public class Problem0201 {
	public static void main(String[] args) {
		byte b = 5;
		// b = -b; -> b -= b;
		b -= b;
		int result = 10 / b;
		System.out.println(result);
	}
}
