package chapter06.package2;	// 다른 패키지
// 필드와 메소드의 접근 제한(3)
import chapter06.package1.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
//		a.field2 = 1;	// default 필드 접근 불가
//		a.field3 = 1;	// private 필드 접근 불가
		
		a.method1();
//		a.method2();	// default 필드 접근 불가
		
//		a.method3();	// private 필드 접근 불가
	}
}
