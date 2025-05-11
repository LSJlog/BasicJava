package chapter02;

public class ComtinueKeyCodeReadExample {
	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode: " + keyCode);
		}
	}
}
