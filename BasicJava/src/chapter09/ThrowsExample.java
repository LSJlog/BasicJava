package chapter09;

public class ThrowsExample {
	public static void main(String[] args) throws Exception {
		method();
		// 예외를 발생시키기 >> 예외를 만든다.
		// throw를 사용함
		throw new Exception();
	}
	public static void method() throws ClassNotFoundException {		
		Class.forName("java.lang.String");
	}
}
