package chapter03;

public class CompareOperatorExample2 {
	public static void main(String[] args) {
		int v2 = 1;	// 1.0 + 1.0 => 2.0
		double v3 = 1.0;
		System.out.println(v2 == v3);	// true, 1.00 == 1.0
		
		double v4 = 0.1;	// 0.1000000000000012 double -> folat로 바꾸는 것은 숫자를 버리기 때문에 쉬움
		float v5 = 0.1f;	// 0.0999999998		folat -> double로 바꾸는 것은 없는 수를 만들어야 되기 때문에 어려움
		System.out.println(v4 == v5);	// false
		System.out.println((float)v4 == v5);	// true
	}
}
