package chapter03;

public class Problem0206 {
	public static void main(String[] args) {
		int value = 365;
		System.out.println(value-=value%300);	// value = value - value%300
		System.out.println(value / 100 * 100);
	}
}
