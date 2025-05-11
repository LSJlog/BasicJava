package chapter03;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);
		System.out.println("result1=" + result1);
		System.out.println("result2=" + result2);
		System.out.println("result3=" + result3);
		
		char char1 = 'A';	// 값
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		
		String str1 = "가";	// 값이 아닌 메모리 주소 저장
		String str2 = "나";
		System.out.println(str1.equals(str2));
		System.out.println("result4=" + result4);
		
	}
}
