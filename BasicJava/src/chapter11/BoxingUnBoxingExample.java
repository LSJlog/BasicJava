package chapter11;

public class BoxingUnBoxingExample {
	public static void main(String[] args) {
//		int a = 10;
//		Integer b = new Integer(10);	// boxing
//		int bb = b.intValue();	// unboxing
//		Boolean c = new Boolean(false);
		
		// 자동 박싱, 자동 언박싱
//		Integer d = 10; // auto boxing
//		int e = new Integer(10); // auto unboxing
		
		Integer obj = new Integer(200);
		Integer obj2 = new Integer(200);
		int value1 = obj;	// 객체 타입
		int value2 = obj + 100;	//
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(obj == obj2);

		Integer sum = 0;
		for (int i = 1; i <= 10000; i++) {
			sum += i;
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
