package chapter09;

public class TryCatchExample {
	public static void main(String[] args) {
		try {
			System.out.println("실행 시작");
			Class.forName("java.Iang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("패키지명이나 클래스 이름이 올바르지 않습니다. 다시 입력하세요.");
		} finally {
			System.out.println("실행 끝");
		}
		
	}
}
