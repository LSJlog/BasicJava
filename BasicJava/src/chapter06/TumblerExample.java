package chapter06;

public class TumblerExample {
	public static void main(String[] args) {
		//stack area      heap area
		Tumbler tumbler1 = new Tumbler();
		Tumbler tumbler2 = new Tumbler();
		Tumbler tumbler3 = new Tumbler();
		Tumbler tumbler4 = new Tumbler();
		
		System.out.println(tumbler1);
		System.out.println(tumbler2);
		System.out.println(tumbler3);
		System.out.println(tumbler4);
		
	}
}
