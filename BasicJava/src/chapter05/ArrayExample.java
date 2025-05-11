package chapter05;

public class ArrayExample {
	public static void main(String[] args) {
		
		// for Ctrl + Space
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "]" + args[i]);
		}
		// foreach :은 in과 같은 의미
		// 향상된 for문 (enhanced loop)
		// jdk 1.5 이상부터 사용가능
		
		for (String string : args) {
			System.out.println(string);
		}
	}
}
