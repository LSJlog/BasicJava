package chapter09;

public class ExceptionWExample {
	public static void main(String[] args) {
		// 일반 예외
//		Class.forName("java.lang.String");
		
		// 실행 예외(Runtime Exception)
		method(null);
	}
	private static void method(String name) {
//		if (name != null) {
			System.out.println(name.contains("홍"));				
//		}
	}
	
}
