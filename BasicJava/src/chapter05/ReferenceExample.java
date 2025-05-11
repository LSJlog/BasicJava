package chapter05;

public class ReferenceExample {
	public static void main(String[] args) {
		// String fool?
		// 왼쪽 : 참조변수, 스택
		// 오른쪽 : 힙
		String c = "홍길동";
		String d = "홍길동";
		// 힙 -> 메모리 사용량 많음, 비효율적
		String a = new String("홍길동");
		String b = new String("홍길동");
		
		System.out.println(c == d);
		System.out.println(a == b);
		System.out.println(c.equals(d));
		System.out.println(a.equals(b));		
	}
}
